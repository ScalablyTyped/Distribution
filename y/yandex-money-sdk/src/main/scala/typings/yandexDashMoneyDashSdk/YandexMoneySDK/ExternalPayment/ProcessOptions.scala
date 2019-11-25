package typings.yandexDashMoneyDashSdk.YandexMoneySDK.ExternalPayment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessOptions extends js.Object {
  var csc: js.UndefOr[String] = js.undefined
  var ext_auth_fail_uri: String
  // instance_id: string; // the method always overwrites this value
  var ext_auth_success_uri: String
  var money_source_token: js.UndefOr[String] = js.undefined
  var request_id: String
  var request_token: js.UndefOr[Boolean] = js.undefined
}

object ProcessOptions {
  @scala.inline
  def apply(
    ext_auth_fail_uri: String,
    ext_auth_success_uri: String,
    request_id: String,
    csc: String = null,
    money_source_token: String = null,
    request_token: js.UndefOr[Boolean] = js.undefined
  ): ProcessOptions = {
    val __obj = js.Dynamic.literal(ext_auth_fail_uri = ext_auth_fail_uri.asInstanceOf[js.Any], ext_auth_success_uri = ext_auth_success_uri.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any])
    if (csc != null) __obj.updateDynamic("csc")(csc.asInstanceOf[js.Any])
    if (money_source_token != null) __obj.updateDynamic("money_source_token")(money_source_token.asInstanceOf[js.Any])
    if (!js.isUndefined(request_token)) __obj.updateDynamic("request_token")(request_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessOptions]
  }
}

