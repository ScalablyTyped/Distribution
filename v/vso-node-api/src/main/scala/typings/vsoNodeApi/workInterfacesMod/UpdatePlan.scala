package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePlan extends js.Object {
  /**
    * Description of the plan
    */
  var description: String
  /**
    * Name of the plan to create.
    */
  var name: String
  /**
    * Plan properties.
    */
  var properties: js.Any
  /**
    * Revision of the plan that was updated - the value used here should match the one the server gave the client in the Plan.
    */
  var revision: Double
  /**
    * Type of the plan
    */
  var `type`: PlanType
}

object UpdatePlan {
  @scala.inline
  def apply(description: String, name: String, properties: js.Any, revision: Double, `type`: PlanType): UpdatePlan = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePlan]
  }
}

