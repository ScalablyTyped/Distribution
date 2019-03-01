package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactSourceId extends js.Object {
  var artifactTypeId: java.lang.String
  var sourceIdInputs: js.Array[SourceIdInput]
}

object ArtifactSourceId {
  @scala.inline
  def apply(artifactTypeId: java.lang.String, sourceIdInputs: js.Array[SourceIdInput]): ArtifactSourceId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("artifactTypeId")(artifactTypeId)
    __obj.updateDynamic("sourceIdInputs")(sourceIdInputs)
    __obj.asInstanceOf[ArtifactSourceId]
  }
}

