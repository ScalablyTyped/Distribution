package typings.typeorm

import typings.typeorm.anon.InstantiableT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerMod {
  
  @JSImport("typeorm/browser/container", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFromContainer[T](someClass: ContainedType[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getFromContainer")(someClass.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def useContainer(iocContainer: ContainerInterface): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useContainer")(iocContainer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useContainer(iocContainer: ContainerInterface, options: UseContainerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useContainer")(iocContainer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ContainedType[T] = InstantiableT[T] | js.Function
  
  trait ContainerInterface extends StObject {
    
    def get[T](someClass: ContainedType[T]): T
  }
  object ContainerInterface {
    
    inline def apply(get: ContainedType[js.Any] => js.Any): ContainerInterface = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
      __obj.asInstanceOf[ContainerInterface]
    }
    
    extension [Self <: ContainerInterface](x: Self) {
      
      inline def setGet(value: ContainedType[js.Any] => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
  
  trait UseContainerOptions extends StObject {
    
    /**
      * If set to true, then default container will be used in the case if given container haven't returned anything.
      */
    var fallback: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true, then default container will be used in the case if given container thrown an exception.
      */
    var fallbackOnErrors: js.UndefOr[Boolean] = js.undefined
  }
  object UseContainerOptions {
    
    inline def apply(): UseContainerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseContainerOptions]
    }
    
    extension [Self <: UseContainerOptions](x: Self) {
      
      inline def setFallback(value: Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackOnErrors(value: Boolean): Self = StObject.set(x, "fallbackOnErrors", value.asInstanceOf[js.Any])
      
      inline def setFallbackOnErrorsUndefined: Self = StObject.set(x, "fallbackOnErrors", js.undefined)
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
}
