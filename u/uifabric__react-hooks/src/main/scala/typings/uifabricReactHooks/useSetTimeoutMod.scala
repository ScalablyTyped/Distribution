package typings.uifabricReactHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSetTimeoutMod {
  
  @JSImport("@uifabric/react-hooks/lib/useSetTimeout", "useSetTimeout")
  @js.native
  def useSetTimeout(): UseSetTimeoutReturnType = js.native
  
  @js.native
  trait UseSetTimeoutReturnType extends StObject {
    
    def clearTimeout(id: Double): Unit = js.native
    
    def setTimeout(callback: js.Function0[Unit], duration: Double): Double = js.native
  }
  object UseSetTimeoutReturnType {
    
    @scala.inline
    def apply(clearTimeout: Double => Unit, setTimeout: (js.Function0[Unit], Double) => Double): UseSetTimeoutReturnType = {
      val __obj = js.Dynamic.literal(clearTimeout = js.Any.fromFunction1(clearTimeout), setTimeout = js.Any.fromFunction2(setTimeout))
      __obj.asInstanceOf[UseSetTimeoutReturnType]
    }
    
    @scala.inline
    implicit class UseSetTimeoutReturnTypeMutableBuilder[Self <: UseSetTimeoutReturnType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearTimeout(value: Double => Unit): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTimeout(value: (js.Function0[Unit], Double) => Double): Self = StObject.set(x, "setTimeout", js.Any.fromFunction2(value))
    }
  }
}
