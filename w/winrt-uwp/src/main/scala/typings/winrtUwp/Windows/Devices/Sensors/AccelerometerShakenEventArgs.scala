package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the accelerometer-shaken event. */
trait AccelerometerShakenEventArgs extends StObject {
  
  /** Gets the time at which the sensor reported the shaken event. */
  var timestamp: Date
}
object AccelerometerShakenEventArgs {
  
  @scala.inline
  def apply(timestamp: Date): AccelerometerShakenEventArgs = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerShakenEventArgs]
  }
  
  @scala.inline
  implicit class AccelerometerShakenEventArgsMutableBuilder[Self <: AccelerometerShakenEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
