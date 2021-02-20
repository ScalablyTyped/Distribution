package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the device is shaken.
  */
@js.native
trait GestureShakeEvent extends GestureBaseEvent {
  
  /**
    * Time interval since previous shake event. On iOS, this value is 0 for the first shake
    * event in a series.
    */
  var timestamp: Double = js.native
  
  /**
    * Acceleration along the X axis, in Gs.
    */
  var x: Double = js.native
  
  /**
    * Acceleration along the Y axis, in Gs.
    */
  var y: Double = js.native
  
  /**
    * Acceleration along the Z axis, in Gs.
    */
  var z: Double = js.native
}
object GestureShakeEvent {
  
  @scala.inline
  def apply(source: Gesture, timestamp: Double, x: Double, y: Double, z: Double): GestureShakeEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureShakeEvent]
  }
  
  @scala.inline
  implicit class GestureShakeEventMutableBuilder[Self <: GestureShakeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
