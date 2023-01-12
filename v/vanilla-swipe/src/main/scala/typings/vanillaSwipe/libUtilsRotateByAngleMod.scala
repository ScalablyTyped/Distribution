package typings.vanillaSwipe

import typings.vanillaSwipe.anon.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsRotateByAngleMod {
  
  @JSImport("vanilla-swipe/lib/utils/rotateByAngle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rotateByAngle(position: Y): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("rotateByAngle")(position.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def rotateByAngle(position: Y, angle: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateByAngle")(position.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  trait Value extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Value {
    
    inline def apply(x: Double, y: Double): Value = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
