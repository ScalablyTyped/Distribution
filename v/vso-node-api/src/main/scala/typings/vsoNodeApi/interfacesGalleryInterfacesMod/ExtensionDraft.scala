package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import typings.vsoNodeApi.anon.KeyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionDraft extends StObject {
  
  var assets: js.Array[ExtensionDraftAsset]
  
  var createdDate: js.Date
  
  var draftState: DraftStateType
  
  var extensionName: String
  
  var id: String
  
  var lastUpdated: js.Date
  
  var payload: ExtensionPayload
  
  var product: String
  
  var publisherName: String
  
  var validationErrors: js.Array[KeyValue]
  
  var validationWarnings: js.Array[KeyValue]
}
object ExtensionDraft {
  
  inline def apply(
    assets: js.Array[ExtensionDraftAsset],
    createdDate: js.Date,
    draftState: DraftStateType,
    extensionName: String,
    id: String,
    lastUpdated: js.Date,
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
  implicit open class MutableBuilder[Self <: ExtensionDraft] (val x: Self) extends AnyVal {
    
    inline def setAssets(value: js.Array[ExtensionDraftAsset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsVarargs(value: ExtensionDraftAsset*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setDraftState(value: DraftStateType): Self = StObject.set(x, "draftState", value.asInstanceOf[js.Any])
    
    inline def setExtensionName(value: String): Self = StObject.set(x, "extensionName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: ExtensionPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    inline def setValidationErrors(value: js.Array[KeyValue]): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorsVarargs(value: KeyValue*): Self = StObject.set(x, "validationErrors", js.Array(value*))
    
    inline def setValidationWarnings(value: js.Array[KeyValue]): Self = StObject.set(x, "validationWarnings", value.asInstanceOf[js.Any])
    
    inline def setValidationWarningsVarargs(value: KeyValue*): Self = StObject.set(x, "validationWarnings", js.Array(value*))
  }
}
