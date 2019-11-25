package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

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
  var definitionId: Double
  /**
    * Sets description to create a release.
    */
  var description: String
  /**
    * Sets 'true' to create release in draft mode, 'false' otherwise.
    */
  var isDraft: Boolean
  /**
    * Sets list of environments to manual as condition.
    */
  var manualEnvironments: js.Array[String]
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
    definitionId: Double,
    description: String,
    isDraft: Boolean,
    manualEnvironments: js.Array[String],
    properties: js.Any,
    reason: ReleaseReason
  ): ReleaseStartMetadata = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], definitionId = definitionId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isDraft = isDraft.asInstanceOf[js.Any], manualEnvironments = manualEnvironments.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReleaseStartMetadata]
  }
}

