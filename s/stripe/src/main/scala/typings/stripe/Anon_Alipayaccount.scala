package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alipayaccount extends js.Object {
  var alipay_account: js.UndefOr[Double] = js.undefined
  var bitcoin_receiver: js.UndefOr[Double] = js.undefined
  var card: Double
  var customer_bank_account: js.UndefOr[Double] = js.undefined
}

object Anon_Alipayaccount {
  @scala.inline
  def apply(
    card: Double,
    alipay_account: Int | Double = null,
    bitcoin_receiver: Int | Double = null,
    customer_bank_account: Int | Double = null
  ): Anon_Alipayaccount = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    if (alipay_account != null) __obj.updateDynamic("alipay_account")(alipay_account.asInstanceOf[js.Any])
    if (bitcoin_receiver != null) __obj.updateDynamic("bitcoin_receiver")(bitcoin_receiver.asInstanceOf[js.Any])
    if (customer_bank_account != null) __obj.updateDynamic("customer_bank_account")(customer_bank_account.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Alipayaccount]
  }
}

