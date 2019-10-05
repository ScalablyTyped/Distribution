package typings.yandexDashMoneyDashSdk.YandexMoneySDK.ExternalPayment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestResult extends js.Object {
  var contract_amount: js.UndefOr[Double] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var request_id: js.UndefOr[String] = js.undefined
  var status: String
  var title: js.UndefOr[String] = js.undefined
}

object RequestResult {
  @scala.inline
  def apply(
    status: String,
    contract_amount: Int | Double = null,
    error: String = null,
    request_id: String = null,
    title: String = null
  ): RequestResult = {
    val __obj = js.Dynamic.literal(status = status)
    if (contract_amount != null) __obj.updateDynamic("contract_amount")(contract_amount.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (request_id != null) __obj.updateDynamic("request_id")(request_id)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[RequestResult]
  }
}

