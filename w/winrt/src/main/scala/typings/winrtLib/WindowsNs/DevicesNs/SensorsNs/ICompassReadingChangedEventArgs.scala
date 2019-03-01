package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompassReadingChangedEventArgs extends js.Object {
  var reading: CompassReading
}

object ICompassReadingChangedEventArgs {
  @scala.inline
  def apply(reading: CompassReading): ICompassReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reading")(reading)
    __obj.asInstanceOf[ICompassReadingChangedEventArgs]
  }
}

