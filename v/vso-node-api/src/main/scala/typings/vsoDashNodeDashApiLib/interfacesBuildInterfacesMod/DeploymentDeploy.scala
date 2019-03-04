package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentDeploy extends Deployment {
  var message: java.lang.String
}

object DeploymentDeploy {
  @scala.inline
  def apply(message: java.lang.String, `type`: java.lang.String): DeploymentDeploy = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DeploymentDeploy]
  }
}

