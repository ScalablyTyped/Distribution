package typings.yandexMoneySdk.YandexMoneySDK.Wallet

import typings.yandexMoneySdk.AnonAmount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationHistoryResult extends js.Object {
  var error: js.UndefOr[String] = js.undefined
  var next_record: js.UndefOr[String] = js.undefined
  var operations: js.UndefOr[js.Array[AnonAmount]] = js.undefined
}

object OperationHistoryResult {
  @scala.inline
  def apply(error: String = null, next_record: String = null, operations: js.Array[AnonAmount] = null): OperationHistoryResult = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (next_record != null) __obj.updateDynamic("next_record")(next_record.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationHistoryResult]
  }
}

