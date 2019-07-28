package typings.yandexDashMoneyDashSdk.YandexMoneySDKNs.WalletNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessPaymentOptions extends js.Object {
  var csc: js.UndefOr[String] = js.undefined
  var ext_auth_fail_uri: js.UndefOr[String] = js.undefined
  var ext_auth_success_uri: js.UndefOr[String] = js.undefined
  var money_source: js.UndefOr[String] = js.undefined
  var request_id: String
  var test_card: js.UndefOr[String] = js.undefined
  var test_payment: js.UndefOr[Boolean] = js.undefined
  var test_result: js.UndefOr[String] = js.undefined
}

object ProcessPaymentOptions {
  @scala.inline
  def apply(
    request_id: String,
    csc: String = null,
    ext_auth_fail_uri: String = null,
    ext_auth_success_uri: String = null,
    money_source: String = null,
    test_card: String = null,
    test_payment: js.UndefOr[Boolean] = js.undefined,
    test_result: String = null
  ): ProcessPaymentOptions = {
    val __obj = js.Dynamic.literal(request_id = request_id)
    if (csc != null) __obj.updateDynamic("csc")(csc)
    if (ext_auth_fail_uri != null) __obj.updateDynamic("ext_auth_fail_uri")(ext_auth_fail_uri)
    if (ext_auth_success_uri != null) __obj.updateDynamic("ext_auth_success_uri")(ext_auth_success_uri)
    if (money_source != null) __obj.updateDynamic("money_source")(money_source)
    if (test_card != null) __obj.updateDynamic("test_card")(test_card)
    if (!js.isUndefined(test_payment)) __obj.updateDynamic("test_payment")(test_payment)
    if (test_result != null) __obj.updateDynamic("test_result")(test_result)
    __obj.asInstanceOf[ProcessPaymentOptions]
  }
}

