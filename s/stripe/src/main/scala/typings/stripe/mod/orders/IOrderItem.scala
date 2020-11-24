package typings.stripe.mod.orders

import typings.stripe.mod.IObject
import typings.stripe.mod.skus.ISku
import typings.stripe.stripeStrings.discount
import typings.stripe.stripeStrings.order_item
import typings.stripe.stripeStrings.shipping
import typings.stripe.stripeStrings.sku
import typings.stripe.stripeStrings.tax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOrderItem extends IObject {
  
  /**
    * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a 0-decimal currency)
    * representing the total amount for the line item.
    */
  var amount: Double = js.native
  
  /**
    * 3-letter ISO code representing the currency of the line item.
    */
  var currency: String = js.native
  
  /**
    * Description of the line item, meant to be displayable to the user (e.g., "Express shipping").
    */
  var description: String = js.native
  
  /**
    * value is "order_item"
    */
  @JSName("object")
  var object_IOrderItem: order_item = js.native
  
  /**
    * The ID of the associated object for this line item. Expandable if not null (e.g., expandable to a SKU). [Expandable]
    */
  var parent: String | ISku = js.native
  
  /**
    * A positive integer representing the number of instances of parent that are included in this order item.
    * Applicable/present only if type is sku.
    */
  var quantity: Double = js.native
  
  /**
    * The type of line item. One of "sku", "tax", "shipping", or "discount".
    */
  var `type`: sku | tax | shipping | discount = js.native
}
object IOrderItem {
  
  @scala.inline
  def apply(
    amount: Double,
    currency: String,
    description: String,
    `object`: order_item,
    parent: String | ISku,
    quantity: Double,
    `type`: sku | tax | shipping | discount
  ): IOrderItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrderItem]
  }
  
  @scala.inline
  implicit class IOrderItemOps[Self <: IOrderItem] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: order_item): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: String | ISku): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: sku | tax | shipping | discount): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
