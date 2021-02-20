package typings.winrtUwp.Windows.ApplicationModel.Store.Preview

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an in-app product, including details about available SKUs. */
@js.native
trait StorePreviewProductInfo extends StObject {
  
  /** Gets the description of the in-app product. */
  var description: String = js.native
  
  /** Gets the ID of the in-app product. */
  var productId: String = js.native
  
  /** Gets the type of the in-app product. */
  var productType: String = js.native
  
  /** Gets information about the available SKUs for the in-app product. */
  var skuInfoList: IVectorView[StorePreviewSkuInfo] = js.native
  
  /** Gets the name of the in-app product that is displayed to customers. */
  var title: String = js.native
}
object StorePreviewProductInfo {
  
  @scala.inline
  def apply(
    description: String,
    productId: String,
    productType: String,
    skuInfoList: IVectorView[StorePreviewSkuInfo],
    title: String
  ): StorePreviewProductInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], productType = productType.asInstanceOf[js.Any], skuInfoList = skuInfoList.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePreviewProductInfo]
  }
  
  @scala.inline
  implicit class StorePreviewProductInfoMutableBuilder[Self <: StorePreviewProductInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductType(value: String): Self = StObject.set(x, "productType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkuInfoList(value: IVectorView[StorePreviewSkuInfo]): Self = StObject.set(x, "skuInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
