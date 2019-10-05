package typings.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet

import typings.yandexDashMoneyDashSdk.Anon_Article
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationDetailsResult extends js.Object {
  var amount: js.UndefOr[Double] = js.undefined
  var amount_due: js.UndefOr[Double] = js.undefined
  var answer_datetime: js.UndefOr[String] = js.undefined
  var codepro: js.UndefOr[Boolean] = js.undefined
  var comment: js.UndefOr[String] = js.undefined
  var datetime: js.UndefOr[String] = js.undefined
  var details: js.UndefOr[String] = js.undefined
  var digital_goods: js.UndefOr[Anon_Article] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var expires: js.UndefOr[String] = js.undefined
  var fee: js.UndefOr[Double] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var operation_id: js.UndefOr[String] = js.undefined
  var pattern_id: js.UndefOr[String] = js.undefined
  var protection_code: js.UndefOr[String] = js.undefined
  var recipient: js.UndefOr[String] = js.undefined
  var recipient_type: js.UndefOr[String] = js.undefined
  var sender: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object OperationDetailsResult {
  @scala.inline
  def apply(
    amount: Int | Double = null,
    amount_due: Int | Double = null,
    answer_datetime: String = null,
    codepro: js.UndefOr[Boolean] = js.undefined,
    comment: String = null,
    datetime: String = null,
    details: String = null,
    digital_goods: Anon_Article = null,
    direction: String = null,
    error: String = null,
    expires: String = null,
    fee: Int | Double = null,
    label: String = null,
    message: String = null,
    operation_id: String = null,
    pattern_id: String = null,
    protection_code: String = null,
    recipient: String = null,
    recipient_type: String = null,
    sender: String = null,
    status: String = null,
    title: String = null,
    `type`: String = null
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

