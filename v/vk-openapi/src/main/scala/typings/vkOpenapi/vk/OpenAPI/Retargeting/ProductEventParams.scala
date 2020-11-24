package typings.vkOpenapi.vk.OpenAPI.Retargeting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductEventParams extends js.Object {
  
  var business_value: js.UndefOr[Double] = js.native
  
  var category_ids: js.UndefOr[String] = js.native
  
  var currency_code: js.UndefOr[String] = js.native
  
  var products: js.UndefOr[js.Array[Product]] = js.native
  
  var products_recommended_ids: js.UndefOr[String] = js.native
  
  var search_string: js.UndefOr[String] = js.native
  
  var total_price: js.UndefOr[Double] = js.native
}
object ProductEventParams {
  
  @scala.inline
  def apply(): ProductEventParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductEventParams]
  }
  
  @scala.inline
  implicit class ProductEventParamsOps[Self <: ProductEventParams] (val x: Self) extends AnyVal {
    
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
    def setBusiness_value(value: Double): Self = this.set("business_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusiness_value: Self = this.set("business_value", js.undefined)
    
    @scala.inline
    def setCategory_ids(value: String): Self = this.set("category_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory_ids: Self = this.set("category_ids", js.undefined)
    
    @scala.inline
    def setCurrency_code(value: String): Self = this.set("currency_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency_code: Self = this.set("currency_code", js.undefined)
    
    @scala.inline
    def setProductsVarargs(value: Product*): Self = this.set("products", js.Array(value :_*))
    
    @scala.inline
    def setProducts(value: js.Array[Product]): Self = this.set("products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducts: Self = this.set("products", js.undefined)
    
    @scala.inline
    def setProducts_recommended_ids(value: String): Self = this.set("products_recommended_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducts_recommended_ids: Self = this.set("products_recommended_ids", js.undefined)
    
    @scala.inline
    def setSearch_string(value: String): Self = this.set("search_string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch_string: Self = this.set("search_string", js.undefined)
    
    @scala.inline
    def setTotal_price(value: Double): Self = this.set("total_price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal_price: Self = this.set("total_price", js.undefined)
  }
}
