package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactSourceId extends js.Object {
  var artifactTypeId: String
  var sourceIdInputs: js.Array[SourceIdInput]
}

object ArtifactSourceId {
  @scala.inline
  def apply(artifactTypeId: String, sourceIdInputs: js.Array[SourceIdInput]): ArtifactSourceId = {
    val __obj = js.Dynamic.literal(artifactTypeId = artifactTypeId.asInstanceOf[js.Any], sourceIdInputs = sourceIdInputs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArtifactSourceId]
  }
}

