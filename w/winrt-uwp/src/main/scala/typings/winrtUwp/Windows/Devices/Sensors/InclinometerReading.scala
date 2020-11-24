package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an inclinometer reading. */
@js.native
trait InclinometerReading extends js.Object {
  
  /** Gets the rotation in degrees around the x-axis. */
  var pitchDegrees: Double = js.native
  
  /** Gets the rotation in degrees around the y-axis. */
  var rollDegrees: Double = js.native
  
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date = js.native
  
  /** Gets the inclinometer's z-axis accuracy. */
  var yawAccuracy: MagnetometerAccuracy = js.native
  
  /** Gets the rotation in degrees around the z-axis. */
  var yawDegrees: Double = js.native
}
object InclinometerReading {
  
  @scala.inline
  def apply(
    pitchDegrees: Double,
    rollDegrees: Double,
    timestamp: Date,
    yawAccuracy: MagnetometerAccuracy,
    yawDegrees: Double
  ): InclinometerReading = {
    val __obj = js.Dynamic.literal(pitchDegrees = pitchDegrees.asInstanceOf[js.Any], rollDegrees = rollDegrees.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], yawAccuracy = yawAccuracy.asInstanceOf[js.Any], yawDegrees = yawDegrees.asInstanceOf[js.Any])
    __obj.asInstanceOf[InclinometerReading]
  }
  
  @scala.inline
  implicit class InclinometerReadingOps[Self <: InclinometerReading] (val x: Self) extends AnyVal {
    
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
    def setYawAccuracy(value: MagnetometerAccuracy): Self = this.set("yawAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYawDegrees(value: Double): Self = this.set("yawDegrees", value.asInstanceOf[js.Any])
  }
}
