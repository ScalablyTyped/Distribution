package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventRegistrationToken extends js.Object {
  var value: scala.Double
}

object EventRegistrationToken {
  @scala.inline
  def apply(value: scala.Double): EventRegistrationToken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[EventRegistrationToken]
  }
}

