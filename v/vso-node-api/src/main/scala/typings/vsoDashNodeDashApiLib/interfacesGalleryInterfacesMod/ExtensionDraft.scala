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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assets")(assets)
    __obj.updateDynamic("createdDate")(createdDate)
    __obj.updateDynamic("draftState")(draftState)
    __obj.updateDynamic("extensionName")(extensionName)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("lastUpdated")(lastUpdated)
    __obj.updateDynamic("payload")(payload)
    __obj.updateDynamic("product")(product)
    __obj.updateDynamic("publisherName")(publisherName)
    __obj.updateDynamic("validationErrors")(validationErrors)
    __obj.updateDynamic("validationWarnings")(validationWarnings)
    __obj.asInstanceOf[ExtensionDraft]
  }
}

