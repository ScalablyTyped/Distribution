package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseStartMetadata extends js.Object {
  /**
    * Sets list of artifact to create a release.
    */
  var artifacts: js.Array[ArtifactMetadata] = js.native
  /**
    * Sets definition Id to create a release.
    */
  var definitionId: Double = js.native
  /**
    * Sets description to create a release.
    */
  var description: String = js.native
  /**
    * Sets 'true' to create release in draft mode, 'false' otherwise.
    */
  var isDraft: Boolean = js.native
  /**
    * Sets list of environments to manual as condition.
    */
  var manualEnvironments: js.Array[String] = js.native
  var properties: js.Any = js.native
  /**
    * Sets reason to create a release.
    */
  var reason: ReleaseReason = js.native
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
  @scala.inline
  implicit class ReleaseStartMetadataOps[Self <: ReleaseStartMetadata] (val x: Self) extends AnyVal {
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
    def setArtifactsVarargs(value: ArtifactMetadata*): Self = this.set("artifacts", js.Array(value :_*))
    @scala.inline
    def setArtifacts(value: js.Array[ArtifactMetadata]): Self = this.set("artifacts", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefinitionId(value: Double): Self = this.set("definitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDraft(value: Boolean): Self = this.set("isDraft", value.asInstanceOf[js.Any])
    @scala.inline
    def setManualEnvironmentsVarargs(value: String*): Self = this.set("manualEnvironments", js.Array(value :_*))
    @scala.inline
    def setManualEnvironments(value: js.Array[String]): Self = this.set("manualEnvironments", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: ReleaseReason): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

