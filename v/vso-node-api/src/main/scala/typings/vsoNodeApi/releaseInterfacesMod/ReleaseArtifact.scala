package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseArtifact extends js.Object {
  var artifactProvider: ArtifactProvider = js.native
  var artifactType: String = js.native
  var definitionData: String = js.native
  var definitionId: Double = js.native
  var description: String = js.native
  var id: Double = js.native
  var name: String = js.native
  var releaseId: Double = js.native
}

object ReleaseArtifact {
  @scala.inline
  def apply(
    artifactProvider: ArtifactProvider,
    artifactType: String,
    definitionData: String,
    definitionId: Double,
    description: String,
    id: Double,
    name: String,
    releaseId: Double
  ): ReleaseArtifact = {
    val __obj = js.Dynamic.literal(artifactProvider = artifactProvider.asInstanceOf[js.Any], artifactType = artifactType.asInstanceOf[js.Any], definitionData = definitionData.asInstanceOf[js.Any], definitionId = definitionId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseArtifact]
  }
  @scala.inline
  implicit class ReleaseArtifactOps[Self <: ReleaseArtifact] (val x: Self) extends AnyVal {
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
    def setArtifactProvider(value: ArtifactProvider): Self = this.set("artifactProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setArtifactType(value: String): Self = this.set("artifactType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefinitionData(value: String): Self = this.set("definitionData", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefinitionId(value: Double): Self = this.set("definitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseId(value: Double): Self = this.set("releaseId", value.asInstanceOf[js.Any])
  }
  
}

