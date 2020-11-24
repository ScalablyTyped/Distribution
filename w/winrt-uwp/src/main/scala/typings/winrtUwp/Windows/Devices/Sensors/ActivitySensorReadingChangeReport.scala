package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents data for the sensor trigger. */
@js.native
trait ActivitySensorReadingChangeReport extends js.Object {
  
  /** Gets the reading of the sensor when it's triggered. */
  var reading: ActivitySensorReading = js.native
}
object ActivitySensorReadingChangeReport {
  
  @scala.inline
  def apply(reading: ActivitySensorReading): ActivitySensorReadingChangeReport = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitySensorReadingChangeReport]
  }
  
  @scala.inline
  implicit class ActivitySensorReadingChangeReportOps[Self <: ActivitySensorReadingChangeReport] (val x: Self) extends AnyVal {
    
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
    def setReading(value: ActivitySensorReading): Self = this.set("reading", value.asInstanceOf[js.Any])
  }
}
