package typings.winrtUwp.Windows.Services.Store

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides license info for an add-on that is associated with the current app. */
trait StoreLicense extends StObject {
  
  /** Gets the expiration date and time for the add-on license. */
  var expirationDate: js.Date
  
  /** Gets complete license data in JSON format. */
  var extendedJsonData: String
  
  /** Gets in the product ID for the add-on. */
  var inAppOfferToken: String
  
  /** Gets a value that indicates whether the add-on license is active. */
  var isActive: Boolean
  
  /** Gets the Store ID of the licensed add-on SKU from the Windows Store catalog. */
  var skuStoreId: String
}
object StoreLicense {
  
  inline def apply(
    expirationDate: js.Date,
    extendedJsonData: String,
    inAppOfferToken: String,
    isActive: Boolean,
    skuStoreId: String
  ): StoreLicense = {
    val __obj = js.Dynamic.literal(expirationDate = expirationDate.asInstanceOf[js.Any], extendedJsonData = extendedJsonData.asInstanceOf[js.Any], inAppOfferToken = inAppOfferToken.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], skuStoreId = skuStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreLicense]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoreLicense] (val x: Self) extends AnyVal {
    
    inline def setExpirationDate(value: js.Date): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExtendedJsonData(value: String): Self = StObject.set(x, "extendedJsonData", value.asInstanceOf[js.Any])
    
    inline def setInAppOfferToken(value: String): Self = StObject.set(x, "inAppOfferToken", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setSkuStoreId(value: String): Self = StObject.set(x, "skuStoreId", value.asInstanceOf[js.Any])
  }
}
