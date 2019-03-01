package typings
package yandexDashMoneyDashSdkLib.YandexMoneySDKNs.ExternalPaymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestResult extends js.Object {
  var contract_amount: js.UndefOr[scala.Double] = js.undefined
  var error: js.UndefOr[java.lang.String] = js.undefined
  var request_id: js.UndefOr[java.lang.String] = js.undefined
  var status: java.lang.String
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object RequestResult {
  @scala.inline
  def apply(
    status: java.lang.String,
    contract_amount: scala.Int | scala.Double = null,
    error: java.lang.String = null,
    request_id: java.lang.String = null,
    title: java.lang.String = null
  ): RequestResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("status")(status)
    if (contract_amount != null) __obj.updateDynamic("contract_amount")(contract_amount.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (request_id != null) __obj.updateDynamic("request_id")(request_id)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[RequestResult]
  }
}

