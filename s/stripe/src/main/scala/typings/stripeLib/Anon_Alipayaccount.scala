package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alipayaccount extends js.Object {
  var alipay_account: js.UndefOr[scala.Double] = js.undefined
  var bitcoin_receiver: js.UndefOr[scala.Double] = js.undefined
  var card: scala.Double
  var customer_bank_account: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Alipayaccount {
  @scala.inline
  def apply(
    card: scala.Double,
    alipay_account: scala.Int | scala.Double = null,
    bitcoin_receiver: scala.Int | scala.Double = null,
    customer_bank_account: scala.Int | scala.Double = null
  ): Anon_Alipayaccount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("card")(card)
    if (alipay_account != null) __obj.updateDynamic("alipay_account")(alipay_account.asInstanceOf[js.Any])
    if (bitcoin_receiver != null) __obj.updateDynamic("bitcoin_receiver")(bitcoin_receiver.asInstanceOf[js.Any])
    if (customer_bank_account != null) __obj.updateDynamic("customer_bank_account")(customer_bank_account.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Alipayaccount]
  }
}

