package typings.wxJsSdkDt.wx

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
  implicit class OpenProductSpecificViewConfigOps[Self <: OpenProductSpecificViewConfig] (val x: Self) extends AnyVal {
    
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
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewType(value: Double): Self = this.set("viewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewType: Self = this.set("viewType", js.undefined)
  }
}
