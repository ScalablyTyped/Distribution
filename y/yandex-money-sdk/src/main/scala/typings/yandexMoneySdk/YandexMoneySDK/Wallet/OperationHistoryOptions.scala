package typings.yandexMoneySdk.YandexMoneySDK.Wallet

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationHistoryOptions extends js.Object {
  var details: js.UndefOr[Boolean] = js.undefined
  var from: js.UndefOr[String | Date] = js.undefined
  var label: String
  var records: js.UndefOr[Double] = js.undefined
  var start_record: js.UndefOr[String] = js.undefined
  var till: js.UndefOr[String | Date] = js.undefined
  var `type`: String
}

object OperationHistoryOptions {
  @scala.inline
  def apply(
    label: String,
    `type`: String,
    details: js.UndefOr[Boolean] = js.undefined,
    from: String | Date = null,
    records: Int | Double = null,
    start_record: String = null,
    till: String | Date = null
  ): OperationHistoryOptions = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(details)) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (records != null) __obj.updateDynamic("records")(records.asInstanceOf[js.Any])
    if (start_record != null) __obj.updateDynamic("start_record")(start_record.asInstanceOf[js.Any])
    if (till != null) __obj.updateDynamic("till")(till.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationHistoryOptions]
  }
}

