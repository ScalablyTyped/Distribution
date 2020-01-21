package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIban extends js.Object {
  var iban: js.UndefOr[String] = js.undefined
  var ideal: js.UndefOr[String] = js.undefined
}

object AnonIban {
  @scala.inline
  def apply(iban: String = null, ideal: String = null): AnonIban = {
    val __obj = js.Dynamic.literal()
    if (iban != null) __obj.updateDynamic("iban")(iban.asInstanceOf[js.Any])
    if (ideal != null) __obj.updateDynamic("ideal")(ideal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIban]
  }
}

