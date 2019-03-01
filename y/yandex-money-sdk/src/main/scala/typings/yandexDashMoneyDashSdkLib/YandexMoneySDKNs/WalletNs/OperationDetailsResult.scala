package typings
package yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationDetailsResult extends js.Object {
  var amount: js.UndefOr[scala.Double] = js.undefined
  var amount_due: js.UndefOr[scala.Double] = js.undefined
  var answer_datetime: js.UndefOr[java.lang.String] = js.undefined
  var codepro: js.UndefOr[scala.Boolean] = js.undefined
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var datetime: js.UndefOr[java.lang.String] = js.undefined
  var details: js.UndefOr[java.lang.String] = js.undefined
  var digital_goods: js.UndefOr[yandexDashMoneyDashSdkLib.Anon_Article] = js.undefined
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[java.lang.String] = js.undefined
  var expires: js.UndefOr[java.lang.String] = js.undefined
  var fee: js.UndefOr[scala.Double] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var operation_id: js.UndefOr[java.lang.String] = js.undefined
  var pattern_id: js.UndefOr[java.lang.String] = js.undefined
  var protection_code: js.UndefOr[java.lang.String] = js.undefined
  var recipient: js.UndefOr[java.lang.String] = js.undefined
  var recipient_type: js.UndefOr[java.lang.String] = js.undefined
  var sender: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object OperationDetailsResult {
  @scala.inline
  def apply(
    amount: scala.Int | scala.Double = null,
    amount_due: scala.Int | scala.Double = null,
    answer_datetime: java.lang.String = null,
    codepro: js.UndefOr[scala.Boolean] = js.undefined,
    comment: java.lang.String = null,
    datetime: java.lang.String = null,
    details: java.lang.String = null,
    digital_goods: yandexDashMoneyDashSdkLib.Anon_Article = null,
    direction: java.lang.String = null,
    error: java.lang.String = null,
    expires: java.lang.String = null,
    fee: scala.Int | scala.Double = null,
    label: java.lang.String = null,
    message: java.lang.String = null,
    operation_id: java.lang.String = null,
    pattern_id: java.lang.String = null,
    protection_code: java.lang.String = null,
    recipient: java.lang.String = null,
    recipient_type: java.lang.String = null,
    sender: java.lang.String = null,
    status: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null
  ): OperationDetailsResult = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (amount_due != null) __obj.updateDynamic("amount_due")(amount_due.asInstanceOf[js.Any])
    if (answer_datetime != null) __obj.updateDynamic("answer_datetime")(answer_datetime)
    if (!js.isUndefined(codepro)) __obj.updateDynamic("codepro")(codepro)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (datetime != null) __obj.updateDynamic("datetime")(datetime)
    if (details != null) __obj.updateDynamic("details")(details)
    if (digital_goods != null) __obj.updateDynamic("digital_goods")(digital_goods)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (error != null) __obj.updateDynamic("error")(error)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (fee != null) __obj.updateDynamic("fee")(fee.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (message != null) __obj.updateDynamic("message")(message)
    if (operation_id != null) __obj.updateDynamic("operation_id")(operation_id)
    if (pattern_id != null) __obj.updateDynamic("pattern_id")(pattern_id)
    if (protection_code != null) __obj.updateDynamic("protection_code")(protection_code)
    if (recipient != null) __obj.updateDynamic("recipient")(recipient)
    if (recipient_type != null) __obj.updateDynamic("recipient_type")(recipient_type)
    if (sender != null) __obj.updateDynamic("sender")(sender)
    if (status != null) __obj.updateDynamic("status")(status)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OperationDetailsResult]
  }
}

