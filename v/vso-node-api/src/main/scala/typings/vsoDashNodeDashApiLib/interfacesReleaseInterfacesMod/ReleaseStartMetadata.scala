package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseStartMetadata extends js.Object {
  /**
    * Sets list of artifact to create a release.
    */
  var artifacts: js.Array[ArtifactMetadata]
  /**
    * Sets definition Id to create a release.
    */
  var definitionId: scala.Double
  /**
    * Sets description to create a release.
    */
  var description: java.lang.String
  /**
    * Sets 'true' to create release in draft mode, 'false' otherwise.
    */
  var isDraft: scala.Boolean
  /**
    * Sets list of environments to manual as condition.
    */
  var manualEnvironments: js.Array[java.lang.String]
  var properties: js.Any
  /**
    * Sets reason to create a release.
    */
  var reason: ReleaseReason
}

object ReleaseStartMetadata {
  @scala.inline
  def apply(
    artifacts: js.Array[ArtifactMetadata],
    definitionId: scala.Double,
    description: java.lang.String,
    isDraft: scala.Boolean,
    manualEnvironments: js.Array[java.lang.String],
    properties: js.Any,
    reason: ReleaseReason
  ): ReleaseStartMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("artifacts")(artifacts)
    __obj.updateDynamic("definitionId")(definitionId)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("isDraft")(isDraft)
    __obj.updateDynamic("manualEnvironments")(manualEnvironments)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[ReleaseStartMetadata]
  }
}

