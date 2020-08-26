package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactDownloadInputBase extends js.Object {
  var alias: String = js.native
  var artifactDownloadMode: String = js.native
  var artifactType: String = js.native
}

object ArtifactDownloadInputBase {
  @scala.inline
  def apply(alias: String, artifactDownloadMode: String, artifactType: String): ArtifactDownloadInputBase = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], artifactDownloadMode = artifactDownloadMode.asInstanceOf[js.Any], artifactType = artifactType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactDownloadInputBase]
  }
  @scala.inline
  implicit class ArtifactDownloadInputBaseOps[Self <: ArtifactDownloadInputBase] (val x: Self) extends AnyVal {
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setArtifactDownloadMode(value: String): Self = this.set("artifactDownloadMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setArtifactType(value: String): Self = this.set("artifactType", value.asInstanceOf[js.Any])
  }
  
}

