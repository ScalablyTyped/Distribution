package typings.vsoNodeApi.galleryInterfacesMod

import typings.vsoNodeApi.anon.KeyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionPayload extends js.Object {
  var description: String
  var displayName: String
  var fileName: String
  var installationTargets: js.Array[InstallationTarget]
  var isSignedByMicrosoft: Boolean
  var isValid: Boolean
  var metadata: js.Array[KeyValue]
  var `type`: ExtensionDeploymentTechnology
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
}

