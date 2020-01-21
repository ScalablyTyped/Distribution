package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuildCustom extends js.Object {
  var build: Double
  var custom: Double
  var externalTfsBuild: Double
  var fileShare: Double
  var gitHub: Double
  var jenkins: Double
  var nuget: Double
  var tFGit: Double
  var tfsOnPrem: Double
  var tfvc: Double
  var xamlBuild: Double
}

object AnonBuildCustom {
  @scala.inline
  def apply(
    build: Double,
    custom: Double,
    externalTfsBuild: Double,
    fileShare: Double,
    gitHub: Double,
    jenkins: Double,
    nuget: Double,
    tFGit: Double,
    tfsOnPrem: Double,
    tfvc: Double,
    xamlBuild: Double
  ): AnonBuildCustom = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], externalTfsBuild = externalTfsBuild.asInstanceOf[js.Any], fileShare = fileShare.asInstanceOf[js.Any], gitHub = gitHub.asInstanceOf[js.Any], jenkins = jenkins.asInstanceOf[js.Any], nuget = nuget.asInstanceOf[js.Any], tFGit = tFGit.asInstanceOf[js.Any], tfsOnPrem = tfsOnPrem.asInstanceOf[js.Any], tfvc = tfvc.asInstanceOf[js.Any], xamlBuild = xamlBuild.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBuildCustom]
  }
}

