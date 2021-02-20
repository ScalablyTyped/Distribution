package typings.uifabricReactHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSetIntervalMod {
  
  @JSImport("@uifabric/react-hooks/lib/useSetInterval", "useSetInterval")
  @js.native
  def useSetInterval(): UseSetIntervalReturnType = js.native
  
  @js.native
  trait UseSetIntervalReturnType extends StObject {
    
    def clearInterval(id: Double): Unit = js.native
    
    def setInterval(callback: js.Function0[Unit], duration: Double): Double = js.native
  }
  object UseSetIntervalReturnType {
    
    @scala.inline
    def apply(clearInterval: Double => Unit, setInterval: (js.Function0[Unit], Double) => Double): UseSetIntervalReturnType = {
      val __obj = js.Dynamic.literal(clearInterval = js.Any.fromFunction1(clearInterval), setInterval = js.Any.fromFunction2(setInterval))
      __obj.asInstanceOf[UseSetIntervalReturnType]
    }
    
    @scala.inline
    implicit class UseSetIntervalReturnTypeMutableBuilder[Self <: UseSetIntervalReturnType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearInterval(value: Double => Unit): Self = StObject.set(x, "clearInterval", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetInterval(value: (js.Function0[Unit], Double) => Double): Self = StObject.set(x, "setInterval", js.Any.fromFunction2(value))
    }
  }
}
