package typings.uifabricReactHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseSetIntervalMod {
  
  @JSImport("@uifabric/react-hooks/lib/useSetInterval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSetInterval(): UseSetIntervalReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useSetInterval")().asInstanceOf[UseSetIntervalReturnType]
  
  trait UseSetIntervalReturnType extends StObject {
    
    def clearInterval(id: Double): Unit
    
    def setInterval(callback: js.Function0[Unit], duration: Double): Double
  }
  object UseSetIntervalReturnType {
    
    inline def apply(clearInterval: Double => Unit, setInterval: (js.Function0[Unit], Double) => Double): UseSetIntervalReturnType = {
      val __obj = js.Dynamic.literal(clearInterval = js.Any.fromFunction1(clearInterval), setInterval = js.Any.fromFunction2(setInterval))
      __obj.asInstanceOf[UseSetIntervalReturnType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseSetIntervalReturnType] (val x: Self) extends AnyVal {
      
      inline def setClearInterval(value: Double => Unit): Self = StObject.set(x, "clearInterval", js.Any.fromFunction1(value))
      
      inline def setSetInterval(value: (js.Function0[Unit], Double) => Double): Self = StObject.set(x, "setInterval", js.Any.fromFunction2(value))
    }
  }
}
