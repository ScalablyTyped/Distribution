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
    val __obj = js.Dynamic.literal(headingMagneticNorth = headingMagneticNorth, headingTrueNorth = headingTrueNorth, timestamp = timestamp)
  
    __obj.asInstanceOf[ICompassReading]
  }
}

