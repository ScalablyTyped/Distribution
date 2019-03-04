package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionDraftPatch extends js.Object {
  var extensionData: UnpackagedExtensionData
  var operation: DraftPatchOperation
}

object ExtensionDraftPatch {
  @scala.inline
  def apply(extensionData: UnpackagedExtensionData, operation: DraftPatchOperation): ExtensionDraftPatch = {
    val __obj = js.Dynamic.literal(extensionData = extensionData, operation = operation)
  
    __obj.asInstanceOf[ExtensionDraftPatch]
  }
}

