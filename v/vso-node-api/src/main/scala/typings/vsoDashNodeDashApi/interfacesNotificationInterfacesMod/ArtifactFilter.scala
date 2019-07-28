package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

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
    val __obj = js.Dynamic.literal(artifactId = artifactId, artifactType = artifactType, artifactUri = artifactUri, eventType = eventType)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ArtifactFilter]
  }
}

