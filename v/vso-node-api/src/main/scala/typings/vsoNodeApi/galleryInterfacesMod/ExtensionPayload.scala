package typings.vsoNodeApi.galleryInterfacesMod

import typings.vsoNodeApi.anon.KeyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionPayload extends js.Object {
  var description: String = js.native
  var displayName: String = js.native
  var fileName: String = js.native
  var installationTargets: js.Array[InstallationTarget] = js.native
  var isSignedByMicrosoft: Boolean = js.native
  var isValid: Boolean = js.native
  var metadata: js.Array[KeyValue] = js.native
  var `type`: ExtensionDeploymentTechnology = js.native
}

object ExtensionPayload {
  @scala.inline
  def apply(
    description: String,
    displayName: String,
    fileName: String,
    installationTargets: js.Array[InstallationTarget],
    isSignedByMicrosoft: Boolean,
    isValid: Boolean,
    metadata: js.Array[KeyValue],
    `type`: ExtensionDeploymentTechnology
  ): ExtensionPayload = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], installationTargets = installationTargets.asInstanceOf[js.Any], isSignedByMicrosoft = isSignedByMicrosoft.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionPayload]
  }
  @scala.inline
  implicit class ExtensionPayloadOps[Self <: ExtensionPayload] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstallationTargetsVarargs(value: InstallationTarget*): Self = this.set("installationTargets", js.Array(value :_*))
    @scala.inline
    def setInstallationTargets(value: js.Array[InstallationTarget]): Self = this.set("installationTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSignedByMicrosoft(value: Boolean): Self = this.set("isSignedByMicrosoft", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadataVarargs(value: KeyValue*): Self = this.set("metadata", js.Array(value :_*))
    @scala.inline
    def setMetadata(value: js.Array[KeyValue]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ExtensionDeploymentTechnology): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

