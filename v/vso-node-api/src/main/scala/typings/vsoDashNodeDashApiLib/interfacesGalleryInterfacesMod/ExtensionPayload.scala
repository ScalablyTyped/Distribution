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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("installationTargets")(installationTargets)
    __obj.updateDynamic("isSignedByMicrosoft")(isSignedByMicrosoft)
    __obj.updateDynamic("isValid")(isValid)
    __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[ExtensionPayload]
  }
}

