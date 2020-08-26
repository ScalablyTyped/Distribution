package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.anon.KeyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionDraft extends js.Object {
  var assets: js.Array[ExtensionDraftAsset] = js.native
  var createdDate: Date = js.native
  var draftState: DraftStateType = js.native
  var extensionName: String = js.native
  var id: String = js.native
  var lastUpdated: Date = js.native
  var payload: ExtensionPayload = js.native
  var product: String = js.native
  var publisherName: String = js.native
  var validationErrors: js.Array[KeyValue] = js.native
  var validationWarnings: js.Array[KeyValue] = js.native
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
    validationErrors: js.Array[KeyValue],
    validationWarnings: js.Array[KeyValue]
  ): ExtensionDraft = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], draftState = draftState.asInstanceOf[js.Any], extensionName = extensionName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], validationErrors = validationErrors.asInstanceOf[js.Any], validationWarnings = validationWarnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDraft]
  }
  @scala.inline
  implicit class ExtensionDraftOps[Self <: ExtensionDraft] (val x: Self) extends AnyVal {
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
    def setAssetsVarargs(value: ExtensionDraftAsset*): Self = this.set("assets", js.Array(value :_*))
    @scala.inline
    def setAssets(value: js.Array[ExtensionDraftAsset]): Self = this.set("assets", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedDate(value: Date): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDraftState(value: DraftStateType): Self = this.set("draftState", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensionName(value: String): Self = this.set("extensionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastUpdated(value: Date): Self = this.set("lastUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: ExtensionPayload): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublisherName(value: String): Self = this.set("publisherName", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidationErrorsVarargs(value: KeyValue*): Self = this.set("validationErrors", js.Array(value :_*))
    @scala.inline
    def setValidationErrors(value: js.Array[KeyValue]): Self = this.set("validationErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidationWarningsVarargs(value: KeyValue*): Self = this.set("validationWarnings", js.Array(value :_*))
    @scala.inline
    def setValidationWarnings(value: js.Array[KeyValue]): Self = this.set("validationWarnings", value.asInstanceOf[js.Any])
  }
  
}

