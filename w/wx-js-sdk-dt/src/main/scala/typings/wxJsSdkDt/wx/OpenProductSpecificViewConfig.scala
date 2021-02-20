package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenProductSpecificViewConfig extends WxBaseRequestConfig {
  
  /**
    * 商品id
    */
  var productId: String = js.native
  
  /**
    * 0.默认值，普通商品详情页; 1.扫一扫商品详情页; 2.小店商品详情页
    */
  var viewType: js.UndefOr[Double] = js.native
}
object OpenProductSpecificViewConfig {
  
  @scala.inline
  def apply(productId: String): OpenProductSpecificViewConfig = {
    val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenProductSpecificViewConfig]
  }
  
  @scala.inline
  implicit class OpenProductSpecificViewConfigMutableBuilder[Self <: OpenProductSpecificViewConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewType(value: Double): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
  }
}
