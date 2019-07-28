package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactDownloadInputBase extends js.Object {
  var alias: String
  var artifactDownloadMode: String
  var artifactType: String
}

object ArtifactDownloadInputBase {
  @scala.inline
  def apply(alias: String, artifactDownloadMode: String, artifactType: String): ArtifactDownloadInputBase = {
    val __obj = js.Dynamic.literal(alias = alias, artifactDownloadMode = artifactDownloadMode, artifactType = artifactType)
  
    __obj.asInstanceOf[ArtifactDownloadInputBase]
  }
}

