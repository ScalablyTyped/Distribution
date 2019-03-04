package typings
package yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingTransferRejectResult extends js.Object {
  var error: js.UndefOr[java.lang.String] = js.undefined
  var status: java.lang.String
}

object IncomingTransferRejectResult {
  @scala.inline
  def apply(status: java.lang.String, error: java.lang.String = null): IncomingTransferRejectResult = {
    val __obj = js.Dynamic.literal(status = status)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[IncomingTransferRejectResult]
  }
}

