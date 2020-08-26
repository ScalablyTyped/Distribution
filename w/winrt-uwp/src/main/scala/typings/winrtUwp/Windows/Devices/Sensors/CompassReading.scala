package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a compass reading. */
@js.native
trait CompassReading extends js.Object {
  /** Gets the compass's heading accuracy. */
  var headingAccuracy: MagnetometerAccuracy = js.native
  /** Gets the heading in degrees relative to magnetic-north. */
  var headingMagneticNorth: Double = js.native
  /** Gets the heading in degrees relative to geographic true-north. */
  var headingTrueNorth: Double = js.native
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date = js.native
}

object CompassReading {
  @scala.inline
  def apply(
    headingAccuracy: MagnetometerAccuracy,
    headingMagneticNorth: Double,
    headingTrueNorth: Double,
    timestamp: Date
  ): CompassReading = {
    val __obj = js.Dynamic.literal(headingAccuracy = headingAccuracy.asInstanceOf[js.Any], headingMagneticNorth = headingMagneticNorth.asInstanceOf[js.Any], headingTrueNorth = headingTrueNorth.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassReading]
  }
  @scala.inline
  implicit class CompassReadingOps[Self <: CompassReading] (val x: Self) extends AnyVal {
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
    def setHeadingAccuracy(value: MagnetometerAccuracy): Self = this.set("headingAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadingMagneticNorth(value: Double): Self = this.set("headingMagneticNorth", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadingTrueNorth(value: Double): Self = this.set("headingTrueNorth", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

