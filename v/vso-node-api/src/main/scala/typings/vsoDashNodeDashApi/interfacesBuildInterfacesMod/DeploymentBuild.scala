package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentBuild extends Deployment {
  var buildId: Double
}

object DeploymentBuild {
  @scala.inline
  def apply(buildId: Double, `type`: String): DeploymentBuild = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentBuild]
  }
}

