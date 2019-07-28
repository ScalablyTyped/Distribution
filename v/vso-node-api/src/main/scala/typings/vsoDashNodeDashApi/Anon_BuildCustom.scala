package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BuildCustom extends js.Object {
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

object Anon_BuildCustom {
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
  ): Anon_BuildCustom = {
    val __obj = js.Dynamic.literal(build = build, custom = custom, externalTfsBuild = externalTfsBuild, fileShare = fileShare, gitHub = gitHub, jenkins = jenkins, nuget = nuget, tFGit = tFGit, tfsOnPrem = tfsOnPrem, tfvc = tfvc, xamlBuild = xamlBuild)
  
    __obj.asInstanceOf[Anon_BuildCustom]
  }
}

