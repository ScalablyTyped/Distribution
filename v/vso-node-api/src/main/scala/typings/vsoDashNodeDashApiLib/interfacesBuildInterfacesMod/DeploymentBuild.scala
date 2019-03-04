package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentBuild extends Deployment {
  var buildId: scala.Double
}

object DeploymentBuild {
  @scala.inline
  def apply(buildId: scala.Double, `type`: java.lang.String): DeploymentBuild = {
    val __obj = js.Dynamic.literal(buildId = buildId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DeploymentBuild]
  }
}

