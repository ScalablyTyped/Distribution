package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentDeploy extends Deployment {
  var message: String
}

object DeploymentDeploy {
  @scala.inline
  def apply(message: String, `type`: String): DeploymentDeploy = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DeploymentDeploy]
  }
}

