package typings
package yandexDashMoneyDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amount extends js.Object {
  var amount: scala.Double
  var datetime: java.lang.String
  var direction: java.lang.String
  var label: js.UndefOr[java.lang.String] = js.undefined
  var operation_id: java.lang.String
  var pattern_id: js.UndefOr[java.lang.String] = js.undefined
  var status: java.lang.String
  var title: java.lang.String
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Amount {
  @scala.inline
  def apply(
    amount: scala.Double,
    datetime: java.lang.String,
    direction: java.lang.String,
    operation_id: java.lang.String,
    status: java.lang.String,
    title: java.lang.String,
    label: java.lang.String = null,
    pattern_id: java.lang.String = null,
    `type`: java.lang.String = null
  ): Anon_Amount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("datetime")(datetime)
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("operation_id")(operation_id)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("title")(title)
    if (label != null) __obj.updateDynamic("label")(label)
    if (pattern_id != null) __obj.updateDynamic("pattern_id")(pattern_id)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Amount]
  }
}

