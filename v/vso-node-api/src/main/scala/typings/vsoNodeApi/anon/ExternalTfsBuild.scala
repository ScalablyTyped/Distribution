package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalTfsBuild extends js.Object {
  var build: scala.Double
  var custom: scala.Double
  var externalTfsBuild: scala.Double
  var fileShare: scala.Double
  var gitHub: scala.Double
  var jenkins: scala.Double
  var nuget: scala.Double
  var tFGit: scala.Double
  var tfsOnPrem: scala.Double
  var tfvc: scala.Double
  var xamlBuild: scala.Double
}

object ExternalTfsBuild {
  @scala.inline
  def apply(
    build: scala.Double,
    custom: scala.Double,
    externalTfsBuild: scala.Double,
    fileShare: scala.Double,
    gitHub: scala.Double,
    jenkins: scala.Double,
    nuget: scala.Double,
    tFGit: scala.Double,
    tfsOnPrem: scala.Double,
    tfvc: scala.Double,
    xamlBuild: scala.Double
  ): ExternalTfsBuild = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], externalTfsBuild = externalTfsBuild.asInstanceOf[js.Any], fileShare = fileShare.asInstanceOf[js.Any], gitHub = gitHub.asInstanceOf[js.Any], jenkins = jenkins.asInstanceOf[js.Any], nuget = nuget.asInstanceOf[js.Any], tFGit = tFGit.asInstanceOf[js.Any], tfsOnPrem = tfsOnPrem.asInstanceOf[js.Any], tfvc = tfvc.asInstanceOf[js.Any], xamlBuild = xamlBuild.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalTfsBuild]
  }
}

