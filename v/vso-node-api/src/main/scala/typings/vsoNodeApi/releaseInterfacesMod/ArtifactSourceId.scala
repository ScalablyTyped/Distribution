package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactSourceId extends js.Object {
  var artifactTypeId: String = js.native
  var sourceIdInputs: js.Array[SourceIdInput] = js.native
}

object ArtifactSourceId {
  @scala.inline
  def apply(artifactTypeId: String, sourceIdInputs: js.Array[SourceIdInput]): ArtifactSourceId = {
    val __obj = js.Dynamic.literal(artifactTypeId = artifactTypeId.asInstanceOf[js.Any], sourceIdInputs = sourceIdInputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactSourceId]
  }
  @scala.inline
  implicit class ArtifactSourceIdOps[Self <: ArtifactSourceId] (val x: Self) extends AnyVal {
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
    def setArtifactTypeId(value: String): Self = this.set("artifactTypeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceIdInputsVarargs(value: SourceIdInput*): Self = this.set("sourceIdInputs", js.Array(value :_*))
    @scala.inline
    def setSourceIdInputs(value: js.Array[SourceIdInput]): Self = this.set("sourceIdInputs", value.asInstanceOf[js.Any])
  }
  
}

