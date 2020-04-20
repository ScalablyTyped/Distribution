package typings.vsoNodeApi.galleryInterfacesMod

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
    val __obj = js.Dynamic.literal(extensionData = extensionData.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDraftPatch]
  }
}

