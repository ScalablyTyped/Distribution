package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bank extends js.Object {
  var bank: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Bank {
  @scala.inline
  def apply(bank: java.lang.String = null): Anon_Bank = {
    val __obj = js.Dynamic.literal()
    if (bank != null) __obj.updateDynamic("bank")(bank)
    __obj.asInstanceOf[Anon_Bank]
  }
}

