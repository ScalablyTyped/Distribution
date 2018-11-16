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

