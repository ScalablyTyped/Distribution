package typings.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Amount extends js.Object {
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

object Amount {
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
  ): Amount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], operation_id = operation_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (pattern_id != null) __obj.updateDynamic("pattern_id")(pattern_id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
}

