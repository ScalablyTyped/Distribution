package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompassReading extends js.Object {
  var headingMagneticNorth: scala.Double
  var headingTrueNorth: scala.Double
  var timestamp: stdLib.Date
}

object ICompassReading {
  @scala.inline
  def apply(headingMagneticNorth: scala.Double, headingTrueNorth: scala.Double, timestamp: stdLib.Date): ICompassReading = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headingMagneticNorth")(headingMagneticNorth)
    __obj.updateDynamic("headingTrueNorth")(headingTrueNorth)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[ICompassReading]
  }
}

