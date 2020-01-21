package typings.vsoNodeApi.notificationInterfacesMod

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
    val __obj = js.Dynamic.literal(criteria = criteria.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], exclusions = exclusions.asInstanceOf[js.Any], inclusions = inclusions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleBasedFilter]
  }
}

