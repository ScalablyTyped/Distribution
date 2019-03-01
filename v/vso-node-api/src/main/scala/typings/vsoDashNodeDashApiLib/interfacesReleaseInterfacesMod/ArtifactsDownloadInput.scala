package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactsDownloadInput extends js.Object {
  var downloadInputs: js.Array[ArtifactDownloadInputBase]
}

object ArtifactsDownloadInput {
  @scala.inline
  def apply(downloadInputs: js.Array[ArtifactDownloadInputBase]): ArtifactsDownloadInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("downloadInputs")(downloadInputs)
    __obj.asInstanceOf[ArtifactsDownloadInput]
  }
}

