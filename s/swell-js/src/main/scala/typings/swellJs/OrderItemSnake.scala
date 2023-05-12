package typings.swellJs

import typings.swellJs.mod.BaseModel
import typings.swellJs.mod.Discount
import typings.swellJs.mod.Tax
import typings.swellJs.swellJsStrings.giftcard
import typings.swellJs.swellJsStrings.shipment
import typings.swellJs.swellJsStrings.subscription
import typings.swellJs.typesOrderMod.OrderOption
import typings.swellJs.typesProductMod.Product
import typings.swellJs.typesProductMod.Variant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderItemSnake
  extends StObject
     with BaseModel {
  
  var bundle_items: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var delivery: js.UndefOr[shipment | subscription | giftcard | Null] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var discount_each: js.UndefOr[Double] = js.undefined
  
  var discount_total: js.UndefOr[Double] = js.undefined
  
  var discounts: js.UndefOr[js.Array[Discount]] = js.undefined
  
  var metadata: js.UndefOr[js.Object] = js.undefined
  
  var options: js.UndefOr[js.Array[OrderOption]] = js.undefined
  
  var orig_price: js.UndefOr[Double] = js.undefined
  
  var price: js.UndefOr[Double] = js.undefined
  
  var price_total: js.UndefOr[Double] = js.undefined
  
  var product: js.UndefOr[Product] = js.undefined
  
  var product_id: js.UndefOr[String] = js.undefined
  
  var product_name: js.UndefOr[String] = js.undefined
  
  var quantity: js.UndefOr[Double] = js.undefined
  
  var shipment_location: js.UndefOr[String] = js.undefined
  
  var shipment_weight: js.UndefOr[Double] = js.undefined
  
  var subscription_interval: js.UndefOr[String] = js.undefined
  
  var subscription_interval_count: js.UndefOr[Double] = js.undefined
  
  var subscription_paid: js.UndefOr[Boolean] = js.undefined
  
  var subscription_trial_days: js.UndefOr[Double] = js.undefined
  
  var tax_each: js.UndefOr[Double] = js.undefined
  
  var tax_total: js.UndefOr[Double] = js.undefined
  
  var taxes: js.UndefOr[js.Array[Tax]] = js.undefined
  
  var trial_price_total: js.UndefOr[Double] = js.undefined
  
  var variant: js.UndefOr[Variant] = js.undefined
  
  var variant_id: js.UndefOr[String] = js.undefined
}
object OrderItemSnake {
  
  inline def apply(): OrderItemSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderItemSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderItemSnake] (val x: Self) extends AnyVal {
    
    inline def setBundle_items(value: js.Array[js.Object]): Self = StObject.set(x, "bundle_items", value.asInstanceOf[js.Any])
    
    inline def setBundle_itemsUndefined: Self = StObject.set(x, "bundle_items", js.undefined)
    
    inline def setBundle_itemsVarargs(value: js.Object*): Self = StObject.set(x, "bundle_items", js.Array(value*))
    
    inline def setDelivery(value: shipment | subscription | giftcard): Self = StObject.set(x, "delivery", value.asInstanceOf[js.Any])
    
    inline def setDeliveryNull: Self = StObject.set(x, "delivery", null)
    
    inline def setDeliveryUndefined: Self = StObject.set(x, "delivery", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiscount_each(value: Double): Self = StObject.set(x, "discount_each", value.asInstanceOf[js.Any])
    
    inline def setDiscount_eachUndefined: Self = StObject.set(x, "discount_each", js.undefined)
    
    inline def setDiscount_total(value: Double): Self = StObject.set(x, "discount_total", value.asInstanceOf[js.Any])
    
    inline def setDiscount_totalUndefined: Self = StObject.set(x, "discount_total", js.undefined)
    
    inline def setDiscounts(value: js.Array[Discount]): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setDiscountsUndefined: Self = StObject.set(x, "discounts", js.undefined)
    
    inline def setDiscountsVarargs(value: Discount*): Self = StObject.set(x, "discounts", js.Array(value*))
    
    inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOptions(value: js.Array[OrderOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: OrderOption*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setOrig_price(value: Double): Self = StObject.set(x, "orig_price", value.asInstanceOf[js.Any])
    
    inline def setOrig_priceUndefined: Self = StObject.set(x, "orig_price", js.undefined)
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setPrice_total(value: Double): Self = StObject.set(x, "price_total", value.asInstanceOf[js.Any])
    
    inline def setPrice_totalUndefined: Self = StObject.set(x, "price_total", js.undefined)
    
    inline def setProduct(value: Product): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
    
    inline def setProduct_idUndefined: Self = StObject.set(x, "product_id", js.undefined)
    
    inline def setProduct_name(value: String): Self = StObject.set(x, "product_name", value.asInstanceOf[js.Any])
    
    inline def setProduct_nameUndefined: Self = StObject.set(x, "product_name", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setShipment_location(value: String): Self = StObject.set(x, "shipment_location", value.asInstanceOf[js.Any])
    
    inline def setShipment_locationUndefined: Self = StObject.set(x, "shipment_location", js.undefined)
    
    inline def setShipment_weight(value: Double): Self = StObject.set(x, "shipment_weight", value.asInstanceOf[js.Any])
    
    inline def setShipment_weightUndefined: Self = StObject.set(x, "shipment_weight", js.undefined)
    
    inline def setSubscription_interval(value: String): Self = StObject.set(x, "subscription_interval", value.asInstanceOf[js.Any])
    
    inline def setSubscription_intervalUndefined: Self = StObject.set(x, "subscription_interval", js.undefined)
    
    inline def setSubscription_interval_count(value: Double): Self = StObject.set(x, "subscription_interval_count", value.asInstanceOf[js.Any])
    
    inline def setSubscription_interval_countUndefined: Self = StObject.set(x, "subscription_interval_count", js.undefined)
    
    inline def setSubscription_paid(value: Boolean): Self = StObject.set(x, "subscription_paid", value.asInstanceOf[js.Any])
    
    inline def setSubscription_paidUndefined: Self = StObject.set(x, "subscription_paid", js.undefined)
    
    inline def setSubscription_trial_days(value: Double): Self = StObject.set(x, "subscription_trial_days", value.asInstanceOf[js.Any])
    
    inline def setSubscription_trial_daysUndefined: Self = StObject.set(x, "subscription_trial_days", js.undefined)
    
    inline def setTax_each(value: Double): Self = StObject.set(x, "tax_each", value.asInstanceOf[js.Any])
    
    inline def setTax_eachUndefined: Self = StObject.set(x, "tax_each", js.undefined)
    
    inline def setTax_total(value: Double): Self = StObject.set(x, "tax_total", value.asInstanceOf[js.Any])
    
    inline def setTax_totalUndefined: Self = StObject.set(x, "tax_total", js.undefined)
    
    inline def setTaxes(value: js.Array[Tax]): Self = StObject.set(x, "taxes", value.asInstanceOf[js.Any])
    
    inline def setTaxesUndefined: Self = StObject.set(x, "taxes", js.undefined)
    
    inline def setTaxesVarargs(value: Tax*): Self = StObject.set(x, "taxes", js.Array(value*))
    
    inline def setTrial_price_total(value: Double): Self = StObject.set(x, "trial_price_total", value.asInstanceOf[js.Any])
    
    inline def setTrial_price_totalUndefined: Self = StObject.set(x, "trial_price_total", js.undefined)
    
    inline def setVariant(value: Variant): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    
    inline def setVariant_id(value: String): Self = StObject.set(x, "variant_id", value.asInstanceOf[js.Any])
    
    inline def setVariant_idUndefined: Self = StObject.set(x, "variant_id", js.undefined)
  }
}
