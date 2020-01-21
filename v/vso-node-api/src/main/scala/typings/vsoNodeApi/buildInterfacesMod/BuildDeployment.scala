package typings.vsoNodeApi.buildInterfacesMod

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
    val __obj = js.Dynamic.literal(deployment = deployment.asInstanceOf[js.Any], sourceBuild = sourceBuild.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildDeployment]
  }
}

