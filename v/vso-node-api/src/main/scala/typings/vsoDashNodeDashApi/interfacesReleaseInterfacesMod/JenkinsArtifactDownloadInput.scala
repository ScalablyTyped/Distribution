package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JenkinsArtifactDownloadInput extends ArtifactDownloadInputBase {
  var artifactItems: js.Array[String]
}

object JenkinsArtifactDownloadInput {
  @scala.inline
  def apply(alias: String, artifactDownloadMode: String, artifactItems: js.Array[String], artifactType: String): JenkinsArtifactDownloadInput = {
    val __obj = js.Dynamic.literal(alias = alias, artifactDownloadMode = artifactDownloadMode, artifactItems = artifactItems, artifactType = artifactType)
  
    __obj.asInstanceOf[JenkinsArtifactDownloadInput]
  }
}

