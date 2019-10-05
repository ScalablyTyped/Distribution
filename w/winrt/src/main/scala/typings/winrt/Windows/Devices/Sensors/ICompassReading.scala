package typings.winrt.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompassReading extends js.Object {
  var headingMagneticNorth: Double
  var headingTrueNorth: Double
  var timestamp: Date
}

object ICompassReading {
  @scala.inline
  def apply(headingMagneticNorth: Double, headingTrueNorth: Double, timestamp: Date): ICompassReading = {
    val __obj = js.Dynamic.literal(headingMagneticNorth = headingMagneticNorth, headingTrueNorth = headingTrueNorth, timestamp = timestamp)
  
    __obj.asInstanceOf[ICompassReading]
  }
}

