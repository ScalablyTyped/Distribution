package typings.typeorm

import typings.typeorm.anon.InstantiableT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerMod {
  
  @JSImport("typeorm/browser/container", "getFromContainer")
  @js.native
  def getFromContainer[T](someClass: ContainedType[T]): T = js.native
  
  @JSImport("typeorm/browser/container", "useContainer")
  @js.native
  def useContainer(iocContainer: ContainerInterface): Unit = js.native
  @JSImport("typeorm/browser/container", "useContainer")
  @js.native
  def useContainer(iocContainer: ContainerInterface, options: UseContainerOptions): Unit = js.native
  
  type ContainedType[T] = InstantiableT[T] | js.Function
  
  @js.native
  trait ContainerInterface extends StObject {
    
    def get[T](someClass: ContainedType[T]): T = js.native
  }
  object ContainerInterface {
    
    @scala.inline
    def apply(get: ContainedType[js.Any] => js.Any): ContainerInterface = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
      __obj.asInstanceOf[ContainerInterface]
    }
    
    @scala.inline
    implicit class ContainerInterfaceMutableBuilder[Self <: ContainerInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: ContainedType[js.Any] => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait UseContainerOptions extends StObject {
    
    /**
      * If set to true, then default container will be used in the case if given container haven't returned anything.
      */
    var fallback: js.UndefOr[Boolean] = js.native
    
    /**
      * If set to true, then default container will be used in the case if given container thrown an exception.
      */
    var fallbackOnErrors: js.UndefOr[Boolean] = js.native
  }
  object UseContainerOptions {
    
    @scala.inline
    def apply(): UseContainerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseContainerOptions]
    }
    
    @scala.inline
    implicit class UseContainerOptionsMutableBuilder[Self <: UseContainerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallback(value: Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackOnErrors(value: Boolean): Self = StObject.set(x, "fallbackOnErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackOnErrorsUndefined: Self = StObject.set(x, "fallbackOnErrors", js.undefined)
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
}
