package typings
package yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationHistoryOptions extends js.Object {
  var details: js.UndefOr[scala.Boolean] = js.undefined
  var from: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  var label: java.lang.String
  var records: js.UndefOr[scala.Double] = js.undefined
  var start_record: js.UndefOr[java.lang.String] = js.undefined
  var till: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  var `type`: java.lang.String
}

object OperationHistoryOptions {
  @scala.inline
  def apply(
    label: java.lang.String,
    `type`: java.lang.String,
    details: js.UndefOr[scala.Boolean] = js.undefined,
    from: java.lang.String | stdLib.Date = null,
    records: scala.Int | scala.Double = null,
    start_record: java.lang.String = null,
    till: java.lang.String | stdLib.Date = null
  ): OperationHistoryOptions = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("label")(label)
    if (!js.isUndefined(details)) __obj.updateDynamic("details")(details)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (records != null) __obj.updateDynamic("records")(records.asInstanceOf[js.Any])
    if (start_record != null) __obj.updateDynamic("start_record")(start_record)
    if (till != null) __obj.updateDynamic("till")(till.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationHistoryOptions]
  }
}

