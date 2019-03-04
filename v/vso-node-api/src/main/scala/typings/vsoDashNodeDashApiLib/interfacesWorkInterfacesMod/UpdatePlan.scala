package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePlan extends js.Object {
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
    * Revision of the plan that was updated - the value used here should match the one the server gave the client in the Plan.
    */
  var revision: scala.Double
  /**
    * Type of the plan
    */
  var `type`: PlanType
}

object UpdatePlan {
  @scala.inline
  def apply(
    description: java.lang.String,
    name: java.lang.String,
    properties: js.Any,
    revision: scala.Double,
    `type`: PlanType
  ): UpdatePlan = {
    val __obj = js.Dynamic.literal(description = description, name = name, properties = properties, revision = revision)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UpdatePlan]
  }
}

