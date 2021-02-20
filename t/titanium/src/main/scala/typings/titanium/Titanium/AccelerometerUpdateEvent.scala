package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the accelerometer changes.
  */
@js.native
trait AccelerometerUpdateEvent extends AccelerometerBaseEvent {
  
  /**
    * Reference timestamp since the previous change. This is not a valid timestamp and should
    * simply be used to determine the number of milliseconds between events.
    */
  var timestamp: Double = js.native
  
  /**
    * Current `x` axis of the device.
    */
  var x: Double = js.native
  
  /**
    * Current `y` axis of the device.
    */
  var y: Double = js.native
  
  /**
    * Current `z` axis of the device.
    */
  var z: Double = js.native
}
object AccelerometerUpdateEvent {
  
  @scala.inline
  def apply(source: Accelerometer, timestamp: Double, x: Double, y: Double, z: Double): AccelerometerUpdateEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerUpdateEvent]
  }
  
  @scala.inline
  implicit class AccelerometerUpdateEventMutableBuilder[Self <: AccelerometerUpdateEvent] (val x: Self) extends AnyVal {
    
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
