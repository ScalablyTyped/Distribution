package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactFilter extends BaseSubscriptionFilter {
  var artifactId: String = js.native
  var artifactType: String = js.native
  var artifactUri: String = js.native
}

object ArtifactFilter {
  @scala.inline
  def apply(artifactId: String, artifactType: String, artifactUri: String, eventType: String, `type`: String): ArtifactFilter = {
    val __obj = js.Dynamic.literal(artifactId = artifactId.asInstanceOf[js.Any], artifactType = artifactType.asInstanceOf[js.Any], artifactUri = artifactUri.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactFilter]
  }
  @scala.inline
  implicit class ArtifactFilterOps[Self <: ArtifactFilter] (val x: Self) extends AnyVal {
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
    def setArtifactId(value: String): Self = this.set("artifactId", value.asInstanceOf[js.Any])
    @scala.inline
    def setArtifactType(value: String): Self = this.set("artifactType", value.asInstanceOf[js.Any])
    @scala.inline
    def setArtifactUri(value: String): Self = this.set("artifactUri", value.asInstanceOf[js.Any])
  }
  
}

