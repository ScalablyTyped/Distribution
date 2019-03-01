package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactSourceIdsQueryResult extends js.Object {
  var artifactSourceIds: js.Array[ArtifactSourceId]
}

object ArtifactSourceIdsQueryResult {
  @scala.inline
  def apply(artifactSourceIds: js.Array[ArtifactSourceId]): ArtifactSourceIdsQueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("artifactSourceIds")(artifactSourceIds)
    __obj.asInstanceOf[ArtifactSourceIdsQueryResult]
  }
}

