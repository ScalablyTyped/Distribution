package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDeployment extends js.Object {
  var deployment: BuildSummary
  var sourceBuild: XamlBuildReference
}

object BuildDeployment {
  @scala.inline
  def apply(deployment: BuildSummary, sourceBuild: XamlBuildReference): BuildDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deployment")(deployment)
    __obj.updateDynamic("sourceBuild")(sourceBuild)
    __obj.asInstanceOf[BuildDeployment]
  }
}

