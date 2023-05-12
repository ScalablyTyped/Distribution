package typings.swellJs

import typings.swellJs.mod.BaseModel
import typings.swellJs.mod.Discount
import typings.swellJs.typesProductMod.Product
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvoiceItems
  extends StObject
     with BaseModel {
  
  var delivery: js.UndefOr[String] = js.undefined
  
  var discount_each: js.UndefOr[Double] = js.undefined
  
  var discount_total: js.UndefOr[Double] = js.undefined
  
  var discounts: js.UndefOr[js.Array[Discount]] = js.undefined
  
  var price: js.UndefOr[Double] = js.undefined
  
  var price_total: js.UndefOr[Double] = js.undefined
  
  var product: js.UndefOr[Product] = js.undefined
  
  var product_id: js.UndefOr[String] = js.undefined
  
  var quantity: js.UndefOr[Double] = js.undefined
  
  var quantity_creditable: js.UndefOr[Double] = js.undefined
  
  var quantity_credited: js.UndefOr[Double] = js.undefined
  
  var tax_each: js.UndefOr[Double] = js.undefined
  
  var tax_total: js.UndefOr[Double] = js.undefined
}
object InvoiceItems {
  
  inline def apply(): InvoiceItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvoiceItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvoiceItems] (val x: Self) extends AnyVal {
    
    inline def setDelivery(value: String): Self = StObject.set(x, "delivery", value.asInstanceOf[js.Any])
    
    inline def setDeliveryUndefined: Self = StObject.set(x, "delivery", js.undefined)
    
    inline def setDiscount_each(value: Double): Self = StObject.set(x, "discount_each", value.asInstanceOf[js.Any])
    
    inline def setDiscount_eachUndefined: Self = StObject.set(x, "discount_each", js.undefined)
    
    inline def setDiscount_total(value: Double): Self = StObject.set(x, "discount_total", value.asInstanceOf[js.Any])
    
    inline def setDiscount_totalUndefined: Self = StObject.set(x, "discount_total", js.undefined)
    
    inline def setDiscounts(value: js.Array[Discount]): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setDiscountsUndefined: Self = StObject.set(x, "discounts", js.undefined)
    
    inline def setDiscountsVarargs(value: Discount*): Self = StObject.set(x, "discounts", js.Array(value*))
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setPrice_total(value: Double): Self = StObject.set(x, "price_total", value.asInstanceOf[js.Any])
    
    inline def setPrice_totalUndefined: Self = StObject.set(x, "price_total", js.undefined)
    
    inline def setProduct(value: Product): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
    
    inline def setProduct_idUndefined: Self = StObject.set(x, "product_id", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setQuantity_creditable(value: Double): Self = StObject.set(x, "quantity_creditable", value.asInstanceOf[js.Any])
    
    inline def setQuantity_creditableUndefined: Self = StObject.set(x, "quantity_creditable", js.undefined)
    
    inline def setQuantity_credited(value: Double): Self = StObject.set(x, "quantity_credited", value.asInstanceOf[js.Any])
    
    inline def setQuantity_creditedUndefined: Self = StObject.set(x, "quantity_credited", js.undefined)
    
    inline def setTax_each(value: Double): Self = StObject.set(x, "tax_each", value.asInstanceOf[js.Any])
    
    inline def setTax_eachUndefined: Self = StObject.set(x, "tax_each", js.undefined)
    
    inline def setTax_total(value: Double): Self = StObject.set(x, "tax_total", value.asInstanceOf[js.Any])
    
    inline def setTax_totalUndefined: Self = StObject.set(x, "tax_total", js.undefined)
  }
}
