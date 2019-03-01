package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactFilter extends BaseSubscriptionFilter {
  var artifactId: java.lang.String
  var artifactType: java.lang.String
  var artifactUri: java.lang.String
}

object ArtifactFilter {
  @scala.inline
  def apply(
    artifactId: java.lang.String,
    artifactType: java.lang.String,
    artifactUri: java.lang.String,
    eventType: java.lang.String,
    `type`: java.lang.String
  ): ArtifactFilter = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("artifactId")(artifactId)
    __obj.updateDynamic("artifactType")(artifactType)
    __obj.updateDynamic("artifactUri")(artifactUri)
    __obj.updateDynamic("eventType")(eventType)
    __obj.asInstanceOf[ArtifactFilter]
  }
}

