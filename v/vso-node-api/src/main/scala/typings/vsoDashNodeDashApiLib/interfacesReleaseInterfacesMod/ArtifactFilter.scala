package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactFilter extends js.Object {
  var sourceBranch: java.lang.String
  var tags: js.Array[java.lang.String]
  var useBuildDefinitionBranch: scala.Boolean
}

object ArtifactFilter {
  @scala.inline
  def apply(
    sourceBranch: java.lang.String,
    tags: js.Array[java.lang.String],
    useBuildDefinitionBranch: scala.Boolean
  ): ArtifactFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sourceBranch")(sourceBranch)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("useBuildDefinitionBranch")(useBuildDefinitionBranch)
    __obj.asInstanceOf[ArtifactFilter]
  }
}

