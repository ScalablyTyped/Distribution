package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactVersionQueryResult extends js.Object {
  var artifactVersions: js.Array[ArtifactVersion]
}

object ArtifactVersionQueryResult {
  @scala.inline
  def apply(artifactVersions: js.Array[ArtifactVersion]): ArtifactVersionQueryResult = {
    val __obj = js.Dynamic.literal(artifactVersions = artifactVersions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArtifactVersionQueryResult]
  }
}

