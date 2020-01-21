package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentDeploy extends Deployment {
  var message: String
}

object DeploymentDeploy {
  @scala.inline
  def apply(message: String, `type`: String): DeploymentDeploy = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentDeploy]
  }
}

