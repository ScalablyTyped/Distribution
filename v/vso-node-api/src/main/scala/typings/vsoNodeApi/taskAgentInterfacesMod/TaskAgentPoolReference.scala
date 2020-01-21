package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentPoolReference extends js.Object {
  var id: Double
  /**
    * Gets or sets a value indicating whether or not this pool is managed by the service.
    */
  var isHosted: Boolean
  var name: String
  /**
    * Gets or sets the type of the pool
    */
  var poolType: TaskAgentPoolType
  var scope: String
}

object TaskAgentPoolReference {
  @scala.inline
  def apply(id: Double, isHosted: Boolean, name: String, poolType: TaskAgentPoolType, scope: String): TaskAgentPoolReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isHosted = isHosted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], poolType = poolType.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskAgentPoolReference]
  }
}

