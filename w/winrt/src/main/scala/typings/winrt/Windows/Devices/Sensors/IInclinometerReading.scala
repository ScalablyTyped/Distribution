package typings.winrt.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInclinometerReading extends js.Object {
  
  var pitchDegrees: Double = js.native
  
  var rollDegrees: Double = js.native
  
  var timestamp: Date = js.native
  
  var yawDegrees: Double = js.native
}
object IInclinometerReading {
  
  @scala.inline
  def apply(pitchDegrees: Double, rollDegrees: Double, timestamp: Date, yawDegrees: Double): IInclinometerReading = {
    val __obj = js.Dynamic.literal(pitchDegrees = pitchDegrees.asInstanceOf[js.Any], rollDegrees = rollDegrees.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], yawDegrees = yawDegrees.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInclinometerReading]
  }
  
  @scala.inline
  implicit class IInclinometerReadingOps[Self <: IInclinometerReading] (val x: Self) extends AnyVal {
    
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
    def setPitchDegrees(value: Double): Self = this.set("pitchDegrees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollDegrees(value: Double): Self = this.set("rollDegrees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYawDegrees(value: Double): Self = this.set("yawDegrees", value.asInstanceOf[js.Any])
  }
}
