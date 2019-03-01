package typings
package yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationHistoryResult extends js.Object {
  var error: js.UndefOr[java.lang.String] = js.undefined
  var next_record: js.UndefOr[java.lang.String] = js.undefined
  var operations: js.UndefOr[js.Array[yandexDashMoneyDashSdkLib.Anon_Amount]] = js.undefined
}

object OperationHistoryResult {
  @scala.inline
  def apply(
    error: java.lang.String = null,
    next_record: java.lang.String = null,
    operations: js.Array[yandexDashMoneyDashSdkLib.Anon_Amount] = null
  ): OperationHistoryResult = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (next_record != null) __obj.updateDynamic("next_record")(next_record)
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[OperationHistoryResult]
  }
}

