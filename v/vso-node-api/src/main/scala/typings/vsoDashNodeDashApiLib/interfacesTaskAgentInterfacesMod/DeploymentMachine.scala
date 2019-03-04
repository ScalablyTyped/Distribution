package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentMachine extends js.Object {
  var agent: TaskAgentReference
  var tags: js.Array[java.lang.String]
}

object DeploymentMachine {
  @scala.inline
  def apply(agent: TaskAgentReference, tags: js.Array[java.lang.String]): DeploymentMachine = {
    val __obj = js.Dynamic.literal(agent = agent, tags = tags)
  
    __obj.asInstanceOf[DeploymentMachine]
  }
}

