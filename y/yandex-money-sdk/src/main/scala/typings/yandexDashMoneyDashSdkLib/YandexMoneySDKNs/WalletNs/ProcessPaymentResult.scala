package typings
package yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessPaymentResult extends js.Object {
  var account_unblock_uri: js.UndefOr[java.lang.String] = js.undefined
  var acs_params: js.UndefOr[yandexDashMoneyDashSdkLib.Anon_Key] = js.undefined
  var acs_uri: js.UndefOr[java.lang.String] = js.undefined
  var balance: js.UndefOr[scala.Double] = js.undefined
  var credit_amount: js.UndefOr[scala.Double] = js.undefined
  var digital_goods: js.UndefOr[yandexDashMoneyDashSdkLib.Anon_Article] = js.undefined
  var error: js.UndefOr[java.lang.String] = js.undefined
  var hold_for_pickup_link: js.UndefOr[java.lang.String] = js.undefined
  var invoice_id: js.UndefOr[java.lang.String] = js.undefined
  var next_retry: js.UndefOr[scala.Double] = js.undefined
  var payee: js.UndefOr[java.lang.String] = js.undefined
  var payer: js.UndefOr[java.lang.String] = js.undefined
  var payment_id: js.UndefOr[java.lang.String] = js.undefined
  var status: java.lang.String
}

object ProcessPaymentResult {
  @scala.inline
  def apply(
    status: java.lang.String,
    account_unblock_uri: java.lang.String = null,
    acs_params: yandexDashMoneyDashSdkLib.Anon_Key = null,
    acs_uri: java.lang.String = null,
    balance: scala.Int | scala.Double = null,
    credit_amount: scala.Int | scala.Double = null,
    digital_goods: yandexDashMoneyDashSdkLib.Anon_Article = null,
    error: java.lang.String = null,
    hold_for_pickup_link: java.lang.String = null,
    invoice_id: java.lang.String = null,
    next_retry: scala.Int | scala.Double = null,
    payee: java.lang.String = null,
    payer: java.lang.String = null,
    payment_id: java.lang.String = null
  ): ProcessPaymentResult = {
    val __obj = js.Dynamic.literal(status = status)
    if (account_unblock_uri != null) __obj.updateDynamic("account_unblock_uri")(account_unblock_uri)
    if (acs_params != null) __obj.updateDynamic("acs_params")(acs_params)
    if (acs_uri != null) __obj.updateDynamic("acs_uri")(acs_uri)
    if (balance != null) __obj.updateDynamic("balance")(balance.asInstanceOf[js.Any])
    if (credit_amount != null) __obj.updateDynamic("credit_amount")(credit_amount.asInstanceOf[js.Any])
    if (digital_goods != null) __obj.updateDynamic("digital_goods")(digital_goods)
    if (error != null) __obj.updateDynamic("error")(error)
    if (hold_for_pickup_link != null) __obj.updateDynamic("hold_for_pickup_link")(hold_for_pickup_link)
    if (invoice_id != null) __obj.updateDynamic("invoice_id")(invoice_id)
    if (next_retry != null) __obj.updateDynamic("next_retry")(next_retry.asInstanceOf[js.Any])
    if (payee != null) __obj.updateDynamic("payee")(payee)
    if (payer != null) __obj.updateDynamic("payer")(payer)
    if (payment_id != null) __obj.updateDynamic("payment_id")(payment_id)
    __obj.asInstanceOf[ProcessPaymentResult]
  }
}

