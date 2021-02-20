package typings.vanillaSwipe

import typings.vanillaSwipe.anon.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotateByAngleMod {
  
  @JSImport("vanilla-swipe/lib/utils/rotateByAngle", "rotateByAngle")
  @js.native
  def rotateByAngle(position: Y): Value = js.native
  @JSImport("vanilla-swipe/lib/utils/rotateByAngle", "rotateByAngle")
  @js.native
  def rotateByAngle(position: Y, angle: Double): Value = js.native
  
  @js.native
  trait Value extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Value {
    
    @scala.inline
    def apply(x: Double, y: Double): Value = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
