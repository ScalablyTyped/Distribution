package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactsDownloadInput extends js.Object {
  var downloadInputs: js.Array[ArtifactDownloadInputBase]
}

object ArtifactsDownloadInput {
  @scala.inline
  def apply(downloadInputs: js.Array[ArtifactDownloadInputBase]): ArtifactsDownloadInput = {
    val __obj = js.Dynamic.literal(downloadInputs = downloadInputs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArtifactsDownloadInput]
  }
}

