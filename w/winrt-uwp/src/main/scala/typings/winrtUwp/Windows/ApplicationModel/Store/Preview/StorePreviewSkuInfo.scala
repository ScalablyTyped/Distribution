package typings.winrtUwp.Windows.ApplicationModel.Store.Preview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the available SKUs for an in-app product. */
@js.native
trait StorePreviewSkuInfo extends js.Object {
  
  /** Gets the currency code for the current market. */
  var currencyCode: String = js.native
  
  /** Gets custom developer data for the current SKU. */
  var customDeveloperData: String = js.native
  
  /** Gets the description for the current SKU. */
  var description: String = js.native
  
  /** Gets extended data for the current SKU. */
  var extendedData: String = js.native
  
  /** Gets the current SKU's purchase price with the appropriate formatting for the current market. */
  var formattedListPrice: String = js.native
  
  /** Gets the ID of the product that this SKU is associated with. */
  var productId: String = js.native
  
  /** Gets the ID of this SKU. */
  var skuId: String = js.native
  
  /** Gets a string that specifies the type of the in-app product SKU. */
  var skuType: String = js.native
  
  /** Gets the name of the in-app product SKU that is displayed to customers. */
  var title: String = js.native
}
object StorePreviewSkuInfo {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class StorePreviewSkuInfoOps[Self <: StorePreviewSkuInfo] (val x: Self) extends AnyVal {
    
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
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDeveloperData(value: String): Self = this.set("customDeveloperData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedData(value: String): Self = this.set("extendedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedListPrice(value: String): Self = this.set("formattedListPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkuId(value: String): Self = this.set("skuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkuType(value: String): Self = this.set("skuType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
