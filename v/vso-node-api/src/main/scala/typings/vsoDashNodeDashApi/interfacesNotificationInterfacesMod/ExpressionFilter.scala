package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionFilter extends BaseSubscriptionFilter {
  var criteria: ExpressionFilterModel
}

object ExpressionFilter {
  @scala.inline
  def apply(criteria: ExpressionFilterModel, eventType: String, `type`: String): ExpressionFilter = {
    val __obj = js.Dynamic.literal(criteria = criteria, eventType = eventType)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ExpressionFilter]
  }
}

