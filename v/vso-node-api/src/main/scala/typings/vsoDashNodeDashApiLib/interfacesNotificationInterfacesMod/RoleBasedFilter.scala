package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleBasedFilter extends ExpressionFilter {
  var exclusions: js.Array[java.lang.String]
  var inclusions: js.Array[java.lang.String]
}

object RoleBasedFilter {
  @scala.inline
  def apply(
    criteria: ExpressionFilterModel,
    eventType: java.lang.String,
    exclusions: js.Array[java.lang.String],
    inclusions: js.Array[java.lang.String],
    `type`: java.lang.String
  ): RoleBasedFilter = {
    val __obj = js.Dynamic.literal(criteria = criteria, eventType = eventType, exclusions = exclusions, inclusions = inclusions)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RoleBasedFilter]
  }
}

