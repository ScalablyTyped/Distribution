package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(agent = agent, tags = tags)
  
    __obj.asInstanceOf[DeploymentMachine]
  }
}

