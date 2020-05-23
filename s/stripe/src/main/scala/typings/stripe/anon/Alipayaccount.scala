package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alipayaccount extends js.Object {
  var alipay_account: js.UndefOr[Double] = js.undefined
  var bitcoin_receiver: js.UndefOr[Double] = js.undefined
  var card: Double
  var customer_bank_account: js.UndefOr[Double] = js.undefined
}

object Alipayaccount {
  @scala.inline
  def apply(
    card: Double,
    alipay_account: js.UndefOr[Double] = js.undefined,
    bitcoin_receiver: js.UndefOr[Double] = js.undefined,
    customer_bank_account: js.UndefOr[Double] = js.undefined
  ): Alipayaccount = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    if (!js.isUndefined(alipay_account)) __obj.updateDynamic("alipay_account")(alipay_account.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bitcoin_receiver)) __obj.updateDynamic("bitcoin_receiver")(bitcoin_receiver.get.asInstanceOf[js.Any])
    if (!js.isUndefined(customer_bank_account)) __obj.updateDynamic("customer_bank_account")(customer_bank_account.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alipayaccount]
  }
}

