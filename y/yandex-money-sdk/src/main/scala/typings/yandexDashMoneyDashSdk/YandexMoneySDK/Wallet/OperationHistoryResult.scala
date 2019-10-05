package typings.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet

import typings.yandexDashMoneyDashSdk.Anon_Amount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationHistoryResult extends js.Object {
  var error: js.UndefOr[String] = js.undefined
  var next_record: js.UndefOr[String] = js.undefined
  var operations: js.UndefOr[js.Array[Anon_Amount]] = js.undefined
}

object OperationHistoryResult {
  @scala.inline
  def apply(error: String = null, next_record: String = null, operations: js.Array[Anon_Amount] = null): OperationHistoryResult = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (next_record != null) __obj.updateDynamic("next_record")(next_record)
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[OperationHistoryResult]
  }
}

