package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the ambient-light sensor reading-changed event. */
@js.native
trait LightSensorReadingChangedEventArgs extends js.Object {
  
  /** Gets the current ambient light-sensor reading. */
  var reading: LightSensorReading = js.native
}
object LightSensorReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: LightSensorReading): LightSensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightSensorReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit class LightSensorReadingChangedEventArgsOps[Self <: LightSensorReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setReading(value: LightSensorReading): Self = this.set("reading", value.asInstanceOf[js.Any])
  }
}
