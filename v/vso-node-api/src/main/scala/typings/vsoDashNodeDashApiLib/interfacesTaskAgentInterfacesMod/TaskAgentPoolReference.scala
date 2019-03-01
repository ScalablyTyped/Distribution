package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentPoolReference extends js.Object {
  var id: scala.Double
  /**
    * Gets or sets a value indicating whether or not this pool is managed by the service.
    */
  var isHosted: scala.Boolean
  var name: java.lang.String
  /**
    * Gets or sets the type of the pool
    */
  var poolType: TaskAgentPoolType
  var scope: java.lang.String
}

object TaskAgentPoolReference {
  @scala.inline
  def apply(
    id: scala.Double,
    isHosted: scala.Boolean,
    name: java.lang.String,
    poolType: TaskAgentPoolType,
    scope: java.lang.String
  ): TaskAgentPoolReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isHosted")(isHosted)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("poolType")(poolType)
    __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[TaskAgentPoolReference]
  }
}

