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
  
  inline def calculatePosition(state: State, options: Options): EventData = (^.asInstanceOf[js.Dynamic].applyDynamic("calculatePosition")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EventData]
  
  trait Options extends StObject {
    
    var directionDelta: Double
    
    var rotatePosition: nextPosition
  }
  object Options {
    
    inline def apply(directionDelta: Double, rotatePosition: nextPosition): Options = {
      val __obj = js.Dynamic.literal(directionDelta = directionDelta.asInstanceOf[js.Any], rotatePosition = rotatePosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDirectionDelta(value: Double): Self = StObject.set(x, "directionDelta", value.asInstanceOf[js.Any])
      
      inline def setRotatePosition(value: nextPosition): Self = StObject.set(x, "rotatePosition", value.asInstanceOf[js.Any])
    }
  }
  
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
