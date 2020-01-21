package typings.yandexMoneySdk.YandexMoneySDK.Wallet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingTransferRejectResult extends js.Object {
  var error: js.UndefOr[String] = js.undefined
  var status: String
}

object IncomingTransferRejectResult {
  @scala.inline
  def apply(status: String, error: String = null): IncomingTransferRejectResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingTransferRejectResult]
  }
}

