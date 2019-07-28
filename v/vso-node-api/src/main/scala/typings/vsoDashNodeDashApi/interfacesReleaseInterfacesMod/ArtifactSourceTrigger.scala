package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactSourceTrigger extends ReleaseTriggerBase {
  /**
    * Artifact source alias for Artifact Source trigger type
    */
  var artifactAlias: String
  var triggerConditions: js.Array[ArtifactFilter]
}

object ArtifactSourceTrigger {
  @scala.inline
  def apply(
    artifactAlias: String,
    triggerConditions: js.Array[ArtifactFilter],
    triggerType: ReleaseTriggerType
  ): ArtifactSourceTrigger = {
    val __obj = js.Dynamic.literal(artifactAlias = artifactAlias, triggerConditions = triggerConditions, triggerType = triggerType)
  
    __obj.asInstanceOf[ArtifactSourceTrigger]
  }
}

