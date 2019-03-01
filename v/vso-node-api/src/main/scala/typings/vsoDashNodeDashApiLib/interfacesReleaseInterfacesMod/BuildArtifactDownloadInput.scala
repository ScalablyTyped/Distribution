package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildArtifactDownloadInput extends ArtifactDownloadInputBase {
  var artifactItems: js.Array[java.lang.String]
}

object BuildArtifactDownloadInput {
  @scala.inline
  def apply(
    alias: java.lang.String,
    artifactDownloadMode: java.lang.String,
    artifactItems: js.Array[java.lang.String],
    artifactType: java.lang.String
  ): BuildArtifactDownloadInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alias")(alias)
    __obj.updateDynamic("artifactDownloadMode")(artifactDownloadMode)
    __obj.updateDynamic("artifactItems")(artifactItems)
    __obj.updateDynamic("artifactType")(artifactType)
    __obj.asInstanceOf[BuildArtifactDownloadInput]
  }
}

