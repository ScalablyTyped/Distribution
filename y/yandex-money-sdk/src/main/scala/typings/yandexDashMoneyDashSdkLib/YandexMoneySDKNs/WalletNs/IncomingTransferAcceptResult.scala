package typings
package yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingTransferAcceptResult extends js.Object {
  var error: js.UndefOr[java.lang.String] = js.undefined
  var ext_action_uri: js.UndefOr[java.lang.String] = js.undefined
  var protection_code_attempts_available: js.UndefOr[scala.Double] = js.undefined
  var status: java.lang.String
}

object IncomingTransferAcceptResult {
  @scala.inline
  def apply(
    status: java.lang.String,
    error: java.lang.String = null,
    ext_action_uri: java.lang.String = null,
    protection_code_attempts_available: scala.Int | scala.Double = null
  ): IncomingTransferAcceptResult = {
    val __obj = js.Dynamic.literal(status = status)
    if (error != null) __obj.updateDynamic("error")(error)
    if (ext_action_uri != null) __obj.updateDynamic("ext_action_uri")(ext_action_uri)
    if (protection_code_attempts_available != null) __obj.updateDynamic("protection_code_attempts_available")(protection_code_attempts_available.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingTransferAcceptResult]
  }
}

