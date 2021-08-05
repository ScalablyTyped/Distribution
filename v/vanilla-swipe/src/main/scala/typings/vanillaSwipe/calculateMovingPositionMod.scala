package typings.vanillaSwipe

import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.vanillaSwipe.anon.ClientX
import typings.vanillaSwipe.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calculateMovingPositionMod {
  
  @JSImport("vanilla-swipe/lib/utils/calculateMovingPosition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateMovingPosition[T /* <: E */](e: T): X = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateMovingPosition")(e.asInstanceOf[js.Any]).asInstanceOf[X]
  inline def calculateMovingPosition[T /* <: E */](e: MouseEvent): X = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateMovingPosition")(e.asInstanceOf[js.Any]).asInstanceOf[X]
  inline def calculateMovingPosition[T /* <: E */](e: TouchEvent): X = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateMovingPosition")(e.asInstanceOf[js.Any]).asInstanceOf[X]
  
  trait E extends StObject {
    
    var changedTouches: js.UndefOr[js.Array[ClientX]] = js.undefined
    
    var clientX: Double
    
    var clientY: Double
    
    var preventDefault: js.UndefOr[js.Function] = js.undefined
  }
  object E {
    
    inline def apply(clientX: Double, clientY: Double): E = {
      val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any])
      __obj.asInstanceOf[E]
    }
    
    extension [Self <: E](x: Self) {
      
      inline def setChangedTouches(value: js.Array[ClientX]): Self = StObject.set(x, "changedTouches", value.asInstanceOf[js.Any])
      
      inline def setChangedTouchesUndefined: Self = StObject.set(x, "changedTouches", js.undefined)
      
      inline def setChangedTouchesVarargs(value: ClientX*): Self = StObject.set(x, "changedTouches", js.Array(value :_*))
      
      inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    }
  }
}
