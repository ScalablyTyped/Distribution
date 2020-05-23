package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bank extends js.Object {
  var bank: js.UndefOr[String] = js.undefined
}

object Bank {
  @scala.inline
  def apply(bank: String = null): Bank = {
    val __obj = js.Dynamic.literal()
    if (bank != null) __obj.updateDynamic("bank")(bank.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bank]
  }
}

