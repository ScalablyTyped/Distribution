package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBank extends js.Object {
  var bank: js.UndefOr[String] = js.undefined
}

object AnonBank {
  @scala.inline
  def apply(bank: String = null): AnonBank = {
    val __obj = js.Dynamic.literal()
    if (bank != null) __obj.updateDynamic("bank")(bank.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBank]
  }
}

