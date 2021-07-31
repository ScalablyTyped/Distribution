package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.anon.KeyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionDraft extends StObject {
  
  var assets: js.Array[ExtensionDraftAsset]
  
  var createdDate: Date
  
  var draftState: DraftStateType
  
  var extensionName: String
  
  var id: String
  
  var lastUpdated: Date
  
  var payload: ExtensionPayload
  
  var product: String
  
  var publisherName: String
  
  var validationErrors: js.Array[KeyValue]
  
  var validationWarnings: js.Array[KeyValue]
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
  implicit class ExtensionDraftMutableBuilder[Self <: ExtensionDraft] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssets(value: js.Array[ExtensionDraftAsset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetsVarargs(value: ExtensionDraftAsset*): Self = StObject.set(x, "assets", js.Array(value :_*))
    
    @scala.inline
    def setCreatedDate(value: Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraftState(value: DraftStateType): Self = StObject.set(x, "draftState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionName(value: String): Self = StObject.set(x, "extensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdated(value: Date): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: ExtensionPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationErrors(value: js.Array[KeyValue]): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationErrorsVarargs(value: KeyValue*): Self = StObject.set(x, "validationErrors", js.Array(value :_*))
    
    @scala.inline
    def setValidationWarnings(value: js.Array[KeyValue]): Self = StObject.set(x, "validationWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationWarningsVarargs(value: KeyValue*): Self = StObject.set(x, "validationWarnings", js.Array(value :_*))
  }
}
