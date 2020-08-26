package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressionFilter extends BaseSubscriptionFilter {
  var criteria: ExpressionFilterModel = js.native
}

object ExpressionFilter {
  @scala.inline
  def apply(criteria: ExpressionFilterModel, eventType: String, `type`: String): ExpressionFilter = {
    val __obj = js.Dynamic.literal(criteria = criteria.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionFilter]
  }
  @scala.inline
  implicit class ExpressionFilterOps[Self <: ExpressionFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCriteria(value: ExpressionFilterModel): Self = this.set("criteria", value.asInstanceOf[js.Any])
  }
  
}

