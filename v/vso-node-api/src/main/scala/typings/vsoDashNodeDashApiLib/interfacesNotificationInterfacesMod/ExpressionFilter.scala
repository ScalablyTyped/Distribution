package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionFilter extends BaseSubscriptionFilter {
  var criteria: ExpressionFilterModel
}

object ExpressionFilter {
  @scala.inline
  def apply(criteria: ExpressionFilterModel, eventType: java.lang.String, `type`: java.lang.String): ExpressionFilter = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("criteria")(criteria)
    __obj.updateDynamic("eventType")(eventType)
    __obj.asInstanceOf[ExpressionFilter]
  }
}

