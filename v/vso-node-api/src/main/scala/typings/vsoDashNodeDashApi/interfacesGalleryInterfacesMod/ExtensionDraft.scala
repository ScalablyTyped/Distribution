package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.Anon_KeyValueString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionDraft extends js.Object {
  var assets: js.Array[ExtensionDraftAsset]
  var createdDate: Date
  var draftState: DraftStateType
  var extensionName: String
  var id: String
  var lastUpdated: Date
  var payload: ExtensionPayload
  var product: String
  var publisherName: String
  var validationErrors: js.Array[Anon_KeyValueString]
  var validationWarnings: js.Array[Anon_KeyValueString]
}

object ExtensionDraft {
  @scala.inline
  def apply(
    assets: js.Array[ExtensionDraftAsset],
    createdDate: Date,
    draftState: DraftStateType,
    extensionName: String,
    id: String,
    lastUpdated: Date,
    payload: ExtensionPayload,
    product: String,
    publisherName: String,
    validationErrors: js.Array[Anon_KeyValueString],
    validationWarnings: js.Array[Anon_KeyValueString]
  ): ExtensionDraft = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], draftState = draftState.asInstanceOf[js.Any], extensionName = extensionName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], validationErrors = validationErrors.asInstanceOf[js.Any], validationWarnings = validationWarnings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionDraft]
  }
}

