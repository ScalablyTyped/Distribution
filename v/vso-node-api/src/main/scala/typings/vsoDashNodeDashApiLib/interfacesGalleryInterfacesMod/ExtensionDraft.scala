package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionDraft extends js.Object {
  var assets: js.Array[ExtensionDraftAsset]
  var createdDate: stdLib.Date
  var draftState: DraftStateType
  var extensionName: java.lang.String
  var id: java.lang.String
  var lastUpdated: stdLib.Date
  var payload: ExtensionPayload
  var product: java.lang.String
  var publisherName: java.lang.String
  var validationErrors: js.Array[vsoDashNodeDashApiLib.Anon_KeyValueString]
  var validationWarnings: js.Array[vsoDashNodeDashApiLib.Anon_KeyValueString]
}

object ExtensionDraft {
  @scala.inline
  def apply(
    assets: js.Array[ExtensionDraftAsset],
    createdDate: stdLib.Date,
    draftState: DraftStateType,
    extensionName: java.lang.String,
    id: java.lang.String,
    lastUpdated: stdLib.Date,
    payload: ExtensionPayload,
    product: java.lang.String,
    publisherName: java.lang.String,
    validationErrors: js.Array[vsoDashNodeDashApiLib.Anon_KeyValueString],
    validationWarnings: js.Array[vsoDashNodeDashApiLib.Anon_KeyValueString]
  ): ExtensionDraft = {
    val __obj = js.Dynamic.literal(assets = assets, createdDate = createdDate, draftState = draftState, extensionName = extensionName, id = id, lastUpdated = lastUpdated, payload = payload, product = product, publisherName = publisherName, validationErrors = validationErrors, validationWarnings = validationWarnings)
  
    __obj.asInstanceOf[ExtensionDraft]
  }
}

