package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BuildCustom extends js.Object {
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

object Anon_BuildCustom {
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
  ): Anon_BuildCustom = {
    val __obj = js.Dynamic.literal(build = build, custom = custom, externalTfsBuild = externalTfsBuild, fileShare = fileShare, gitHub = gitHub, jenkins = jenkins, nuget = nuget, tFGit = tFGit, tfsOnPrem = tfsOnPrem, tfvc = tfvc, xamlBuild = xamlBuild)
  
    __obj.asInstanceOf[Anon_BuildCustom]
  }
}

