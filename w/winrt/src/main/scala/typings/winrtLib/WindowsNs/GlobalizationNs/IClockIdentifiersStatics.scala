package typings
package winrtLib.WindowsNs.GlobalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClockIdentifiersStatics extends js.Object {
  var twelveHour: java.lang.String
  var twentyFourHour: java.lang.String
}

object IClockIdentifiersStatics {
  @scala.inline
  def apply(twelveHour: java.lang.String, twentyFourHour: java.lang.String): IClockIdentifiersStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("twelveHour")(twelveHour)
    __obj.updateDynamic("twentyFourHour")(twentyFourHour)
    __obj.asInstanceOf[IClockIdentifiersStatics]
  }
}

