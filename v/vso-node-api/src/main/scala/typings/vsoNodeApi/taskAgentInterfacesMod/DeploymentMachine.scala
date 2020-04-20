package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentMachine extends js.Object {
  var agent: TaskAgentReference
  var tags: js.Array[String]
}

object DeploymentMachine {
  @scala.inline
  def apply(agent: TaskAgentReference, tags: js.Array[String]): DeploymentMachine = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentMachine]
  }
}

