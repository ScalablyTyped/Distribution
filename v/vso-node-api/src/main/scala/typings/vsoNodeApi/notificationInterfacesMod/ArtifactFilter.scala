package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactFilter extends BaseSubscriptionFilter {
  var artifactId: String
  var artifactType: String
  var artifactUri: String
}

object ArtifactFilter {
  @scala.inline
  def apply(artifactId: String, artifactType: String, artifactUri: String, eventType: String, `type`: String): ArtifactFilter = {
    val __obj = js.Dynamic.literal(artifactId = artifactId.asInstanceOf[js.Any], artifactType = artifactType.asInstanceOf[js.Any], artifactUri = artifactUri.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactFilter]
  }
}

