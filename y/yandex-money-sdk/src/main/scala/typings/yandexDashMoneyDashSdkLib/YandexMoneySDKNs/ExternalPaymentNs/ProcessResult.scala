package typings
package yandexDashMoneyDashSdkLib.YandexMoneySDKNs.ExternalPaymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessResult extends js.Object {
  var acs_params: js.UndefOr[yandexDashMoneyDashSdkLib.Anon_Key] = js.undefined
  var acs_uri: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[java.lang.String] = js.undefined
  var invoice_id: js.UndefOr[java.lang.String] = js.undefined
  var money_source: js.UndefOr[yandexDashMoneyDashSdkLib.Anon_Moneysourcetoken] = js.undefined
  var next_retry: js.UndefOr[scala.Double] = js.undefined
  var status: java.lang.String
}

object ProcessResult {
  @scala.inline
  def apply(
    status: java.lang.String,
    acs_params: yandexDashMoneyDashSdkLib.Anon_Key = null,
    acs_uri: java.lang.String = null,
    error: java.lang.String = null,
    invoice_id: java.lang.String = null,
    money_source: yandexDashMoneyDashSdkLib.Anon_Moneysourcetoken = null,
    next_retry: scala.Int | scala.Double = null
  ): ProcessResult = {
    val __obj = js.Dynamic.literal(status = status)
    if (acs_params != null) __obj.updateDynamic("acs_params")(acs_params)
    if (acs_uri != null) __obj.updateDynamic("acs_uri")(acs_uri)
    if (error != null) __obj.updateDynamic("error")(error)
    if (invoice_id != null) __obj.updateDynamic("invoice_id")(invoice_id)
    if (money_source != null) __obj.updateDynamic("money_source")(money_source)
    if (next_retry != null) __obj.updateDynamic("next_retry")(next_retry.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessResult]
  }
}

