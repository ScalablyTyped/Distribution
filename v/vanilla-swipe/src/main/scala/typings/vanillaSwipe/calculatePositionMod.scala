package typings.vanillaSwipe

import typings.vanillaSwipe.typesMod.EventData
import typings.vanillaSwipe.typesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calculatePositionMod {
  
  @JSImport("vanilla-swipe/lib/utils/calculatePosition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculatePosition(state: State, nextPos: nextPosition): EventData = (^.asInstanceOf[js.Dynamic].applyDynamic("calculatePosition")(state.asInstanceOf[js.Any], nextPos.asInstanceOf[js.Any])).asInstanceOf[EventData]
  
  trait nextPosition extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object nextPosition {
    
    inline def apply(x: Double, y: Double): nextPosition = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[nextPosition]
    }
    
    extension [Self <: nextPosition](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
