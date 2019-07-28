package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleBasedFilter extends ExpressionFilter {
  var exclusions: js.Array[String]
  var inclusions: js.Array[String]
}

object RoleBasedFilter {
  @scala.inline
  def apply(
    criteria: ExpressionFilterModel,
    eventType: String,
    exclusions: js.Array[String],
    inclusions: js.Array[String],
    `type`: String
  ): RoleBasedFilter = {
    val __obj = js.Dynamic.literal(criteria = criteria, eventType = eventType, exclusions = exclusions, inclusions = inclusions)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RoleBasedFilter]
  }
}

