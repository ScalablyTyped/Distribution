package typings.yandexMoneySdk.YandexMoneySDK.Wallet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingTransferAcceptResult extends js.Object {
  var error: js.UndefOr[String] = js.undefined
  var ext_action_uri: js.UndefOr[String] = js.undefined
  var protection_code_attempts_available: js.UndefOr[Double] = js.undefined
  var status: String
}

object IncomingTransferAcceptResult {
  @scala.inline
  def apply(
    status: String,
    error: String = null,
    ext_action_uri: String = null,
    protection_code_attempts_available: Int | Double = null
  ): IncomingTransferAcceptResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (ext_action_uri != null) __obj.updateDynamic("ext_action_uri")(ext_action_uri.asInstanceOf[js.Any])
    if (protection_code_attempts_available != null) __obj.updateDynamic("protection_code_attempts_available")(protection_code_attempts_available.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingTransferAcceptResult]
  }
}

