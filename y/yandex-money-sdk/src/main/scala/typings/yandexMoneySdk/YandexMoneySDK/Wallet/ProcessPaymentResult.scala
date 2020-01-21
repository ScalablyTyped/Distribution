package typings.yandexMoneySdk.YandexMoneySDK.Wallet

import typings.yandexMoneySdk.AnonArticle
import typings.yandexMoneySdk.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessPaymentResult extends js.Object {
  var account_unblock_uri: js.UndefOr[String] = js.undefined
  var acs_params: js.UndefOr[AnonKey] = js.undefined
  var acs_uri: js.UndefOr[String] = js.undefined
  var balance: js.UndefOr[Double] = js.undefined
  var credit_amount: js.UndefOr[Double] = js.undefined
  var digital_goods: js.UndefOr[AnonArticle] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var hold_for_pickup_link: js.UndefOr[String] = js.undefined
  var invoice_id: js.UndefOr[String] = js.undefined
  var next_retry: js.UndefOr[Double] = js.undefined
  var payee: js.UndefOr[String] = js.undefined
  var payer: js.UndefOr[String] = js.undefined
  var payment_id: js.UndefOr[String] = js.undefined
  var status: String
}

object ProcessPaymentResult {
  @scala.inline
  def apply(
    status: String,
    account_unblock_uri: String = null,
    acs_params: AnonKey = null,
    acs_uri: String = null,
    balance: Int | Double = null,
    credit_amount: Int | Double = null,
    digital_goods: AnonArticle = null,
    error: String = null,
    hold_for_pickup_link: String = null,
    invoice_id: String = null,
    next_retry: Int | Double = null,
    payee: String = null,
    payer: String = null,
    payment_id: String = null
  ): ProcessPaymentResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (account_unblock_uri != null) __obj.updateDynamic("account_unblock_uri")(account_unblock_uri.asInstanceOf[js.Any])
    if (acs_params != null) __obj.updateDynamic("acs_params")(acs_params.asInstanceOf[js.Any])
    if (acs_uri != null) __obj.updateDynamic("acs_uri")(acs_uri.asInstanceOf[js.Any])
    if (balance != null) __obj.updateDynamic("balance")(balance.asInstanceOf[js.Any])
    if (credit_amount != null) __obj.updateDynamic("credit_amount")(credit_amount.asInstanceOf[js.Any])
    if (digital_goods != null) __obj.updateDynamic("digital_goods")(digital_goods.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (hold_for_pickup_link != null) __obj.updateDynamic("hold_for_pickup_link")(hold_for_pickup_link.asInstanceOf[js.Any])
    if (invoice_id != null) __obj.updateDynamic("invoice_id")(invoice_id.asInstanceOf[js.Any])
    if (next_retry != null) __obj.updateDynamic("next_retry")(next_retry.asInstanceOf[js.Any])
    if (payee != null) __obj.updateDynamic("payee")(payee.asInstanceOf[js.Any])
    if (payer != null) __obj.updateDynamic("payer")(payer.asInstanceOf[js.Any])
    if (payment_id != null) __obj.updateDynamic("payment_id")(payment_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessPaymentResult]
  }
}

