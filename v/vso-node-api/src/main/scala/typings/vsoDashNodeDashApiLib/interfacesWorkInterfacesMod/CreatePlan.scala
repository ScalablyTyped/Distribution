package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePlan extends js.Object {
  /**
    * Description of the plan
    */
  var description: java.lang.String
  /**
    * Name of the plan to create.
    */
  var name: java.lang.String
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
  def apply(description: java.lang.String, name: java.lang.String, properties: js.Any, `type`: PlanType): CreatePlan = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[CreatePlan]
  }
}

