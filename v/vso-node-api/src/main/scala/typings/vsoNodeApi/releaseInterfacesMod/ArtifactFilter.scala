package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactFilter extends js.Object {
  var sourceBranch: String
  var tags: js.Array[String]
  var useBuildDefinitionBranch: Boolean
}

object ArtifactFilter {
  @scala.inline
  def apply(sourceBranch: String, tags: js.Array[String], useBuildDefinitionBranch: Boolean): ArtifactFilter = {
    val __obj = js.Dynamic.literal(sourceBranch = sourceBranch.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], useBuildDefinitionBranch = useBuildDefinitionBranch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactFilter]
  }
}

