package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderSnakeCase
  extends StObject
     with Order {
  
  var account: Any
  
  var account_credit_amount: Any
  
  var account_credit_applied: Any
  
  var account_id: String
  
  var account_info_saved: Any
  
  var account_logged_in: Any
  
  var billing: Billing
  
  var comments: Any
  
  var coupon: Any
  
  var coupon_code: Any
  
  var currency: String
  
  var date_created: String
  
  var delivered: Boolean
  
  var discount_total: Double
  
  var discounts: Any
  
  var gift: Any
  
  var gift_message: Any
  
  var giftcard_total: Double
  
  var giftcards: Any
  
  var grand_total: Double
  
  var guest: Boolean
  
  var id: String
  
  var item_discount: Double
  
  var item_quantity: Double
  
  var item_quantity_cancelable: Double
  
  var item_quantity_canceled: Double
  
  var item_quantity_deliverable: Double
  
  var item_quantity_delivered: Double
  
  var item_quantity_returnable: Double
  
  var item_quantity_returned: Double
  
  var item_shipment_weight: Double
  
  var item_tax: Double
  
  var item_tax_included: Any
  
  var items: js.Array[CartItem]
  
  var metadata: Any
  
  var number: String
  
  var paid: Boolean
  
  var promotion_ids: Any
  
  var promotions: Any
  
  var shipment_delivery: Boolean
  
  var shipment_discount: Double
  
  var shipment_price: Double
  
  var shipment_rating: Any
  
  var shipment_tax: Any
  
  var shipment_tax_included: Any
  
  var shipment_total: Double
  
  var shipping: Shipping
  
  var status: String
  
  var sub_total: Double
  
  var tax_included_total: Double
  
  var tax_total: Double
  
  var taxes: Any
}
object OrderSnakeCase {
  
  inline def apply(
    account: Any,
    account_credit_amount: Any,
    account_credit_applied: Any,
    account_id: String,
    account_info_saved: Any,
    account_logged_in: Any,
    billing: Billing,
    comments: Any,
    coupon: Any,
    coupon_code: Any,
    currency: String,
    date_created: String,
    delivered: Boolean,
    discount_total: Double,
    discounts: Any,
    gift: Any,
    gift_message: Any,
    giftcard_total: Double,
    giftcards: Any,
    grand_total: Double,
    guest: Boolean,
    id: String,
    item_discount: Double,
    item_quantity: Double,
    item_quantity_cancelable: Double,
    item_quantity_canceled: Double,
    item_quantity_deliverable: Double,
    item_quantity_delivered: Double,
    item_quantity_returnable: Double,
    item_quantity_returned: Double,
    item_shipment_weight: Double,
    item_tax: Double,
    item_tax_included: Any,
    items: js.Array[CartItem],
    metadata: Any,
    number: String,
    paid: Boolean,
    promotion_ids: Any,
    promotions: Any,
    shipment_delivery: Boolean,
    shipment_discount: Double,
    shipment_price: Double,
    shipment_rating: Any,
    shipment_tax: Any,
    shipment_tax_included: Any,
    shipment_total: Double,
    shipping: Shipping,
    status: String,
    sub_total: Double,
    tax_included_total: Double,
    tax_total: Double,
    taxes: Any
  ): OrderSnakeCase = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], account_credit_amount = account_credit_amount.asInstanceOf[js.Any], account_credit_applied = account_credit_applied.asInstanceOf[js.Any], account_id = account_id.asInstanceOf[js.Any], account_info_saved = account_info_saved.asInstanceOf[js.Any], account_logged_in = account_logged_in.asInstanceOf[js.Any], billing = billing.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], coupon = coupon.asInstanceOf[js.Any], coupon_code = coupon_code.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], delivered = delivered.asInstanceOf[js.Any], discount_total = discount_total.asInstanceOf[js.Any], discounts = discounts.asInstanceOf[js.Any], gift = gift.asInstanceOf[js.Any], gift_message = gift_message.asInstanceOf[js.Any], giftcard_total = giftcard_total.asInstanceOf[js.Any], giftcards = giftcards.asInstanceOf[js.Any], grand_total = grand_total.asInstanceOf[js.Any], guest = guest.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], item_discount = item_discount.asInstanceOf[js.Any], item_quantity = item_quantity.asInstanceOf[js.Any], item_quantity_cancelable = item_quantity_cancelable.asInstanceOf[js.Any], item_quantity_canceled = item_quantity_canceled.asInstanceOf[js.Any], item_quantity_deliverable = item_quantity_deliverable.asInstanceOf[js.Any], item_quantity_delivered = item_quantity_delivered.asInstanceOf[js.Any], item_quantity_returnable = item_quantity_returnable.asInstanceOf[js.Any], item_quantity_returned = item_quantity_returned.asInstanceOf[js.Any], item_shipment_weight = item_shipment_weight.asInstanceOf[js.Any], item_tax = item_tax.asInstanceOf[js.Any], item_tax_included = item_tax_included.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], promotion_ids = promotion_ids.asInstanceOf[js.Any], promotions = promotions.asInstanceOf[js.Any], shipment_delivery = shipment_delivery.asInstanceOf[js.Any], shipment_discount = shipment_discount.asInstanceOf[js.Any], shipment_price = shipment_price.asInstanceOf[js.Any], shipment_rating = shipment_rating.asInstanceOf[js.Any], shipment_tax = shipment_tax.asInstanceOf[js.Any], shipment_tax_included = shipment_tax_included.asInstanceOf[js.Any], shipment_total = shipment_total.asInstanceOf[js.Any], shipping = shipping.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], sub_total = sub_total.asInstanceOf[js.Any], tax_included_total = tax_included_total.asInstanceOf[js.Any], tax_total = tax_total.asInstanceOf[js.Any], taxes = taxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderSnakeCase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderSnakeCase] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: Any): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccount_credit_amount(value: Any): Self = StObject.set(x, "account_credit_amount", value.asInstanceOf[js.Any])
    
    inline def setAccount_credit_applied(value: Any): Self = StObject.set(x, "account_credit_applied", value.asInstanceOf[js.Any])
    
    inline def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setAccount_info_saved(value: Any): Self = StObject.set(x, "account_info_saved", value.asInstanceOf[js.Any])
    
    inline def setAccount_logged_in(value: Any): Self = StObject.set(x, "account_logged_in", value.asInstanceOf[js.Any])
    
    inline def setBilling(value: Billing): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    inline def setComments(value: Any): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCoupon(value: Any): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
    
    inline def setCoupon_code(value: Any): Self = StObject.set(x, "coupon_code", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDate_created(value: String): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
    
    inline def setDelivered(value: Boolean): Self = StObject.set(x, "delivered", value.asInstanceOf[js.Any])
    
    inline def setDiscount_total(value: Double): Self = StObject.set(x, "discount_total", value.asInstanceOf[js.Any])
    
    inline def setDiscounts(value: Any): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setGift(value: Any): Self = StObject.set(x, "gift", value.asInstanceOf[js.Any])
    
    inline def setGift_message(value: Any): Self = StObject.set(x, "gift_message", value.asInstanceOf[js.Any])
    
    inline def setGiftcard_total(value: Double): Self = StObject.set(x, "giftcard_total", value.asInstanceOf[js.Any])
    
    inline def setGiftcards(value: Any): Self = StObject.set(x, "giftcards", value.asInstanceOf[js.Any])
    
    inline def setGrand_total(value: Double): Self = StObject.set(x, "grand_total", value.asInstanceOf[js.Any])
    
    inline def setGuest(value: Boolean): Self = StObject.set(x, "guest", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setItem_discount(value: Double): Self = StObject.set(x, "item_discount", value.asInstanceOf[js.Any])
    
    inline def setItem_quantity(value: Double): Self = StObject.set(x, "item_quantity", value.asInstanceOf[js.Any])
    
    inline def setItem_quantity_cancelable(value: Double): Self = StObject.set(x, "item_quantity_cancelable", value.asInstanceOf[js.Any])
    
    inline def setItem_quantity_canceled(value: Double): Self = StObject.set(x, "item_quantity_canceled", value.asInstanceOf[js.Any])
    
    inline def setItem_quantity_deliverable(value: Double): Self = StObject.set(x, "item_quantity_deliverable", value.asInstanceOf[js.Any])
    
    inline def setItem_quantity_delivered(value: Double): Self = StObject.set(x, "item_quantity_delivered", value.asInstanceOf[js.Any])
    
    inline def setItem_quantity_returnable(value: Double): Self = StObject.set(x, "item_quantity_returnable", value.asInstanceOf[js.Any])
    
    inline def setItem_quantity_returned(value: Double): Self = StObject.set(x, "item_quantity_returned", value.asInstanceOf[js.Any])
    
    inline def setItem_shipment_weight(value: Double): Self = StObject.set(x, "item_shipment_weight", value.asInstanceOf[js.Any])
    
    inline def setItem_tax(value: Double): Self = StObject.set(x, "item_tax", value.asInstanceOf[js.Any])
    
    inline def setItem_tax_included(value: Any): Self = StObject.set(x, "item_tax_included", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[CartItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: CartItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setPaid(value: Boolean): Self = StObject.set(x, "paid", value.asInstanceOf[js.Any])
    
    inline def setPromotion_ids(value: Any): Self = StObject.set(x, "promotion_ids", value.asInstanceOf[js.Any])
    
    inline def setPromotions(value: Any): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
    
    inline def setShipment_delivery(value: Boolean): Self = StObject.set(x, "shipment_delivery", value.asInstanceOf[js.Any])
    
    inline def setShipment_discount(value: Double): Self = StObject.set(x, "shipment_discount", value.asInstanceOf[js.Any])
    
    inline def setShipment_price(value: Double): Self = StObject.set(x, "shipment_price", value.asInstanceOf[js.Any])
    
    inline def setShipment_rating(value: Any): Self = StObject.set(x, "shipment_rating", value.asInstanceOf[js.Any])
    
    inline def setShipment_tax(value: Any): Self = StObject.set(x, "shipment_tax", value.asInstanceOf[js.Any])
    
    inline def setShipment_tax_included(value: Any): Self = StObject.set(x, "shipment_tax_included", value.asInstanceOf[js.Any])
    
    inline def setShipment_total(value: Double): Self = StObject.set(x, "shipment_total", value.asInstanceOf[js.Any])
    
    inline def setShipping(value: Shipping): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSub_total(value: Double): Self = StObject.set(x, "sub_total", value.asInstanceOf[js.Any])
    
    inline def setTax_included_total(value: Double): Self = StObject.set(x, "tax_included_total", value.asInstanceOf[js.Any])
    
    inline def setTax_total(value: Double): Self = StObject.set(x, "tax_total", value.asInstanceOf[js.Any])
    
    inline def setTaxes(value: Any): Self = StObject.set(x, "taxes", value.asInstanceOf[js.Any])
  }
}
