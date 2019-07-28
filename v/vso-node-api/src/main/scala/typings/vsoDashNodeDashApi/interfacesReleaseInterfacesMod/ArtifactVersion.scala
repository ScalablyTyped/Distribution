package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactVersion extends js.Object {
  var alias: String
  var defaultVersion: BuildVersion
  var errorMessage: String
  var sourceId: String
  var versions: js.Array[BuildVersion]
}

object ArtifactVersion {
  @scala.inline
  def apply(
    alias: String,
    defaultVersion: BuildVersion,
    errorMessage: String,
    sourceId: String,
    versions: js.Array[BuildVersion]
  ): ArtifactVersion = {
    val __obj = js.Dynamic.literal(alias = alias, defaultVersion = defaultVersion, errorMessage = errorMessage, sourceId = sourceId, versions = versions)
  
    __obj.asInstanceOf[ArtifactVersion]
  }
}

