package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactDownloadInputBase extends js.Object {
  var alias: java.lang.String
  var artifactDownloadMode: java.lang.String
  var artifactType: java.lang.String
}

object ArtifactDownloadInputBase {
  @scala.inline
  def apply(alias: java.lang.String, artifactDownloadMode: java.lang.String, artifactType: java.lang.String): ArtifactDownloadInputBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alias")(alias)
    __obj.updateDynamic("artifactDownloadMode")(artifactDownloadMode)
    __obj.updateDynamic("artifactType")(artifactType)
    __obj.asInstanceOf[ArtifactDownloadInputBase]
  }
}

