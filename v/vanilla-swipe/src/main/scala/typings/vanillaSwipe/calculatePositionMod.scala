package typings.vanillaSwipe

import typings.vanillaSwipe.typesMod.EventData
import typings.vanillaSwipe.typesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calculatePositionMod {
  
  @JSImport("vanilla-swipe/lib/utils/calculatePosition", "calculatePosition")
  @js.native
  def calculatePosition(state: State, nextPos: nextPosition): EventData = js.native
  
  @js.native
  trait nextPosition extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object nextPosition {
    
    @scala.inline
    def apply(x: Double, y: Double): nextPosition = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[nextPosition]
    }
    
    @scala.inline
    implicit class nextPositionMutableBuilder[Self <: nextPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
