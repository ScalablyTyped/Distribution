package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the orientation-sensor reading-changed event. */
@js.native
trait OrientationSensorReadingChangedEventArgs extends js.Object {
  
  /** Gets the current reading which includes a Quaternion, a RotationMatrix, and a timestamp. */
  var reading: OrientationSensorReading = js.native
}
object OrientationSensorReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: OrientationSensorReading): OrientationSensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrientationSensorReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit class OrientationSensorReadingChangedEventArgsOps[Self <: OrientationSensorReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReading(value: OrientationSensorReading): Self = this.set("reading", value.asInstanceOf[js.Any])
  }
}
