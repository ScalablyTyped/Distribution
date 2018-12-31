package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactSourceTrigger extends ReleaseTriggerBase {
  /**
    * Artifact source alias for Artifact Source trigger type
    */
  var artifactAlias: java.lang.String
  var triggerConditions: js.Array[ArtifactFilter]
}

