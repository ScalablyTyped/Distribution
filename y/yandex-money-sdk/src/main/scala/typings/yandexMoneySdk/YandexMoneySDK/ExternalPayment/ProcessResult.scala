package typings.yandexMoneySdk.YandexMoneySDK.ExternalPayment

import typings.yandexMoneySdk.anon.Dictkey
import typings.yandexMoneySdk.anon.Moneysourcetoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessResult extends js.Object {
  var acs_params: js.UndefOr[Dictkey] = js.undefined
  var acs_uri: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var invoice_id: js.UndefOr[String] = js.undefined
  var money_source: js.UndefOr[Moneysourcetoken] = js.undefined
  var next_retry: js.UndefOr[Double] = js.undefined
  var status: String
}

object ProcessResult {
  @scala.inline
  def apply(
    status: String,
    acs_params: Dictkey = null,
    acs_uri: String = null,
    error: String = null,
    invoice_id: String = null,
    money_source: Moneysourcetoken = null,
    next_retry: js.UndefOr[Double] = js.undefined
  ): ProcessResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (acs_params != null) __obj.updateDynamic("acs_params")(acs_params.asInstanceOf[js.Any])
    if (acs_uri != null) __obj.updateDynamic("acs_uri")(acs_uri.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (invoice_id != null) __obj.updateDynamic("invoice_id")(invoice_id.asInstanceOf[js.Any])
    if (money_source != null) __obj.updateDynamic("money_source")(money_source.asInstanceOf[js.Any])
    if (!js.isUndefined(next_retry)) __obj.updateDynamic("next_retry")(next_retry.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessResult]
  }
}

