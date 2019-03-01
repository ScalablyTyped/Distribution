package typings
package yandexDashMoneyDashSdkLib.YandexMoneySDKNs.ExternalPaymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessOptions extends js.Object {
  var csc: js.UndefOr[java.lang.String] = js.undefined
  var ext_auth_fail_uri: java.lang.String
  // instance_id: string; // the method always overwrites this value
  var ext_auth_success_uri: java.lang.String
  var money_source_token: js.UndefOr[java.lang.String] = js.undefined
  var request_id: java.lang.String
  var request_token: js.UndefOr[scala.Boolean] = js.undefined
}

object ProcessOptions {
  @scala.inline
  def apply(
    ext_auth_fail_uri: java.lang.String,
    ext_auth_success_uri: java.lang.String,
    request_id: java.lang.String,
    csc: java.lang.String = null,
    money_source_token: java.lang.String = null,
    request_token: js.UndefOr[scala.Boolean] = js.undefined
  ): ProcessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ext_auth_fail_uri")(ext_auth_fail_uri)
    __obj.updateDynamic("ext_auth_success_uri")(ext_auth_success_uri)
    __obj.updateDynamic("request_id")(request_id)
    if (csc != null) __obj.updateDynamic("csc")(csc)
    if (money_source_token != null) __obj.updateDynamic("money_source_token")(money_source_token)
    if (!js.isUndefined(request_token)) __obj.updateDynamic("request_token")(request_token)
    __obj.asInstanceOf[ProcessOptions]
  }
}

