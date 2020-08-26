package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactFilter extends js.Object {
  var sourceBranch: String = js.native
  var tags: js.Array[String] = js.native
  var useBuildDefinitionBranch: Boolean = js.native
}

object ArtifactFilter {
  @scala.inline
  def apply(sourceBranch: String, tags: js.Array[String], useBuildDefinitionBranch: Boolean): ArtifactFilter = {
    val __obj = js.Dynamic.literal(sourceBranch = sourceBranch.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], useBuildDefinitionBranch = useBuildDefinitionBranch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactFilter]
  }
  @scala.inline
  implicit class ArtifactFilterOps[Self <: ArtifactFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSourceBranch(value: String): Self = this.set("sourceBranch", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseBuildDefinitionBranch(value: Boolean): Self = this.set("useBuildDefinitionBranch", value.asInstanceOf[js.Any])
  }
  
}

