package typings.winrtUwp.Windows.ApplicationModel.Store.Preview

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the available SKUs for an in-app product. */
trait StorePreviewSkuInfo extends StObject {
  
  /** Gets the currency code for the current market. */
  var currencyCode: String
  
  /** Gets custom developer data for the current SKU. */
  var customDeveloperData: String
  
  /** Gets the description for the current SKU. */
  var description: String
  
  /** Gets extended data for the current SKU. */
  var extendedData: String
  
  /** Gets the current SKU's purchase price with the appropriate formatting for the current market. */
  var formattedListPrice: String
  
  /** Gets the ID of the product that this SKU is associated with. */
  var productId: String
  
  /** Gets the ID of this SKU. */
  var skuId: String
  
  /** Gets a string that specifies the type of the in-app product SKU. */
  var skuType: String
  
  /** Gets the name of the in-app product SKU that is displayed to customers. */
  var title: String
}
object StorePreviewSkuInfo {
  
  inline def apply(
    currencyCode: String,
    customDeveloperData: String,
    description: String,
    extendedData: String,
    formattedListPrice: String,
    productId: String,
    skuId: String,
    skuType: String,
    title: String
  ): StorePreviewSkuInfo = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode.asInstanceOf[js.Any], customDeveloperData = customDeveloperData.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], extendedData = extendedData.asInstanceOf[js.Any], formattedListPrice = formattedListPrice.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], skuId = skuId.asInstanceOf[js.Any], skuType = skuType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePreviewSkuInfo]
  }
  
  extension [Self <: StorePreviewSkuInfo](x: Self) {
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCustomDeveloperData(value: String): Self = StObject.set(x, "customDeveloperData", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setExtendedData(value: String): Self = StObject.set(x, "extendedData", value.asInstanceOf[js.Any])
    
    inline def setFormattedListPrice(value: String): Self = StObject.set(x, "formattedListPrice", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
    
    inline def setSkuType(value: String): Self = StObject.set(x, "skuType", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
