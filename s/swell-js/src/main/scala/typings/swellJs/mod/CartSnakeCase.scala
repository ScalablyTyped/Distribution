package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartSnakeCase
  extends StObject
     with Cart_ {
  
  var account_logged_in: Any
  
  var auth_total: Double
  
  var billing: Any
  
  var capture_total: Double
  
  var checkout_id: String
  
  var checkout_url: String
  
  var coupon: Any
  
  var currency: String
  
  var date_abandoned: String
  
  var date_created: String
  
  var discount_total: Double
  
  var discounts: Any
  
  var giftcard_total: Double
  
  var grand_total: Double
  
  var guest: Boolean
  
  var id: String
  
  var item_discount: Double
  
  var item_quantity: Double
  
  var item_shipment_weight: Double
  
  var item_tax: Double
  
  var items: js.Array[CartItem]
  
  var promotion_ids: Any
  
  var promotions: Any
  
  var recovered: Boolean
  
  var shipment_delivery: Boolean
  
  var shipment_discount: Double
  
  var shipment_price: Double
  
  var shipment_total: Double
  
  var shipping: Any
  
  var sub_total: Double
  
  var tax_included_total: Double
  
  var tax_total: Double
  
  var taxes: Any
}
object CartSnakeCase {
  
  inline def apply(
    account_logged_in: Any,
    auth_total: Double,
    billing: Any,
    capture_total: Double,
    checkout_id: String,
    checkout_url: String,
    coupon: Any,
    currency: String,
    date_abandoned: String,
    date_created: String,
    discount_total: Double,
    discounts: Any,
    giftcard_total: Double,
    grand_total: Double,
    guest: Boolean,
    id: String,
    item_discount: Double,
    item_quantity: Double,
    item_shipment_weight: Double,
    item_tax: Double,
    items: js.Array[CartItem],
    promotion_ids: Any,
    promotions: Any,
    recovered: Boolean,
    shipment_delivery: Boolean,
    shipment_discount: Double,
    shipment_price: Double,
    shipment_total: Double,
    shipping: Any,
    sub_total: Double,
    tax_included_total: Double,
    tax_total: Double,
    taxes: Any
  ): CartSnakeCase = {
    val __obj = js.Dynamic.literal(account_logged_in = account_logged_in.asInstanceOf[js.Any], auth_total = auth_total.asInstanceOf[js.Any], billing = billing.asInstanceOf[js.Any], capture_total = capture_total.asInstanceOf[js.Any], checkout_id = checkout_id.asInstanceOf[js.Any], checkout_url = checkout_url.asInstanceOf[js.Any], coupon = coupon.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], date_abandoned = date_abandoned.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], discount_total = discount_total.asInstanceOf[js.Any], discounts = discounts.asInstanceOf[js.Any], giftcard_total = giftcard_total.asInstanceOf[js.Any], grand_total = grand_total.asInstanceOf[js.Any], guest = guest.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], item_discount = item_discount.asInstanceOf[js.Any], item_quantity = item_quantity.asInstanceOf[js.Any], item_shipment_weight = item_shipment_weight.asInstanceOf[js.Any], item_tax = item_tax.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], promotion_ids = promotion_ids.asInstanceOf[js.Any], promotions = promotions.asInstanceOf[js.Any], recovered = recovered.asInstanceOf[js.Any], shipment_delivery = shipment_delivery.asInstanceOf[js.Any], shipment_discount = shipment_discount.asInstanceOf[js.Any], shipment_price = shipment_price.asInstanceOf[js.Any], shipment_total = shipment_total.asInstanceOf[js.Any], shipping = shipping.asInstanceOf[js.Any], sub_total = sub_total.asInstanceOf[js.Any], tax_included_total = tax_included_total.asInstanceOf[js.Any], tax_total = tax_total.asInstanceOf[js.Any], taxes = taxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartSnakeCase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartSnakeCase] (val x: Self) extends AnyVal {
    
    inline def setAccount_logged_in(value: Any): Self = StObject.set(x, "account_logged_in", value.asInstanceOf[js.Any])
    
    inline def setAuth_total(value: Double): Self = StObject.set(x, "auth_total", value.asInstanceOf[js.Any])
    
    inline def setBilling(value: Any): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    inline def setCapture_total(value: Double): Self = StObject.set(x, "capture_total", value.asInstanceOf[js.Any])
    
    inline def setCheckout_id(value: String): Self = StObject.set(x, "checkout_id", value.asInstanceOf[js.Any])
    
    inline def setCheckout_url(value: String): Self = StObject.set(x, "checkout_url", value.asInstanceOf[js.Any])
    
    inline def setCoupon(value: Any): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDate_abandoned(value: String): Self = StObject.set(x, "date_abandoned", value.asInstanceOf[js.Any])
    
    inline def setDate_created(value: String): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
    
    inline def setDiscount_total(value: Double): Self = StObject.set(x, "discount_total", value.asInstanceOf[js.Any])
    
    inline def setDiscounts(value: Any): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setGiftcard_total(value: Double): Self = StObject.set(x, "giftcard_total", value.asInstanceOf[js.Any])
    
    inline def setGrand_total(value: Double): Self = StObject.set(x, "grand_total", value.asInstanceOf[js.Any])
    
    inline def setGuest(value: Boolean): Self = StObject.set(x, "guest", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setItem_discount(value: Double): Self = StObject.set(x, "item_discount", value.asInstanceOf[js.Any])
    
    inline def setItem_quantity(value: Double): Self = StObject.set(x, "item_quantity", value.asInstanceOf[js.Any])
    
    inline def setItem_shipment_weight(value: Double): Self = StObject.set(x, "item_shipment_weight", value.asInstanceOf[js.Any])
    
    inline def setItem_tax(value: Double): Self = StObject.set(x, "item_tax", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[CartItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: CartItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPromotion_ids(value: Any): Self = StObject.set(x, "promotion_ids", value.asInstanceOf[js.Any])
    
    inline def setPromotions(value: Any): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
    
    inline def setRecovered(value: Boolean): Self = StObject.set(x, "recovered", value.asInstanceOf[js.Any])
    
    inline def setShipment_delivery(value: Boolean): Self = StObject.set(x, "shipment_delivery", value.asInstanceOf[js.Any])
    
    inline def setShipment_discount(value: Double): Self = StObject.set(x, "shipment_discount", value.asInstanceOf[js.Any])
    
    inline def setShipment_price(value: Double): Self = StObject.set(x, "shipment_price", value.asInstanceOf[js.Any])
    
    inline def setShipment_total(value: Double): Self = StObject.set(x, "shipment_total", value.asInstanceOf[js.Any])
    
    inline def setShipping(value: Any): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    inline def setSub_total(value: Double): Self = StObject.set(x, "sub_total", value.asInstanceOf[js.Any])
    
    inline def setTax_included_total(value: Double): Self = StObject.set(x, "tax_included_total", value.asInstanceOf[js.Any])
    
    inline def setTax_total(value: Double): Self = StObject.set(x, "tax_total", value.asInstanceOf[js.Any])
    
    inline def setTaxes(value: Any): Self = StObject.set(x, "taxes", value.asInstanceOf[js.Any])
  }
}
