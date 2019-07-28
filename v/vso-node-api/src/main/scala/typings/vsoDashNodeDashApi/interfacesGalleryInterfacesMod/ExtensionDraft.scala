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
    val __obj = js.Dynamic.literal(assets = assets, createdDate = createdDate, draftState = draftState, extensionName = extensionName, id = id, lastUpdated = lastUpdated, payload = payload, product = product, publisherName = publisherName, validationErrors = validationErrors, validationWarnings = validationWarnings)
  
    __obj.asInstanceOf[ExtensionDraft]
  }
}

