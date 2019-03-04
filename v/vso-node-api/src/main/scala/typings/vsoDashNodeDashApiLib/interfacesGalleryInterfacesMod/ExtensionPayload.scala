package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionPayload extends js.Object {
  var description: java.lang.String
  var displayName: java.lang.String
  var fileName: java.lang.String
  var installationTargets: js.Array[InstallationTarget]
  var isSignedByMicrosoft: scala.Boolean
  var isValid: scala.Boolean
  var metadata: js.Array[vsoDashNodeDashApiLib.Anon_KeyValueString]
  var `type`: ExtensionDeploymentTechnology
}

object ExtensionPayload {
  @scala.inline
  def apply(
    description: java.lang.String,
    displayName: java.lang.String,
    fileName: java.lang.String,
    installationTargets: js.Array[InstallationTarget],
    isSignedByMicrosoft: scala.Boolean,
    isValid: scala.Boolean,
    metadata: js.Array[vsoDashNodeDashApiLib.Anon_KeyValueString],
    `type`: ExtensionDeploymentTechnology
  ): ExtensionPayload = {
    val __obj = js.Dynamic.literal(description = description, displayName = displayName, fileName = fileName, installationTargets = installationTargets, isSignedByMicrosoft = isSignedByMicrosoft, isValid = isValid, metadata = metadata)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ExtensionPayload]
  }
}

