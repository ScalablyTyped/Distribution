package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTime extends js.Object {
  var universalTime: scala.Double
}

object DateTime {
  @scala.inline
  def apply(universalTime: scala.Double): DateTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("universalTime")(universalTime)
    __obj.asInstanceOf[DateTime]
  }
}

