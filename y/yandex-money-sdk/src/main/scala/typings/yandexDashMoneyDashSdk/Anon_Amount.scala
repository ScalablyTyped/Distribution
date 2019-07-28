package typings.yandexDashMoneyDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amount extends js.Object {
  var amount: Double
  var datetime: String
  var direction: String
  var label: js.UndefOr[String] = js.undefined
  var operation_id: String
  var pattern_id: js.UndefOr[String] = js.undefined
  var status: String
  var title: String
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_Amount {
  @scala.inline
  def apply(
    amount: Double,
    datetime: String,
    direction: String,
    operation_id: String,
    status: String,
    title: String,
    label: String = null,
    pattern_id: String = null,
    `type`: String = null
  ): Anon_Amount = {
    val __obj = js.Dynamic.literal(amount = amount, datetime = datetime, direction = direction, operation_id = operation_id, status = status, title = title)
    if (label != null) __obj.updateDynamic("label")(label)
    if (pattern_id != null) __obj.updateDynamic("pattern_id")(pattern_id)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Amount]
  }
}

