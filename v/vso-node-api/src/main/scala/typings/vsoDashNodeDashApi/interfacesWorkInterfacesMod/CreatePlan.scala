package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePlan extends js.Object {
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
    * Type of plan to create.
    */
  var `type`: PlanType
}

object CreatePlan {
  @scala.inline
  def apply(description: String, name: String, properties: js.Any, `type`: PlanType): CreatePlan = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlan]
  }
}

