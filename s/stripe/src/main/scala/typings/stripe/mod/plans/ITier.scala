package typings.stripe.mod.plans

import typings.stripe.stripeStrings.inf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITier extends js.Object {
  
  /**
    * Price for the entire tier.
    */
  var flat_amount: js.UndefOr[Double | Null] = js.native
  
  /**
    * Same as `flat_amount`, but contains a decimal value with at most 12 decimal places.
    */
  var flat_amount_decimal: js.UndefOr[Double | Null] = js.native
  
  /**
    * Per unit price for units relevant to the tier.
    */
  var unit_amount: js.UndefOr[Double | Null] = js.native
  
  /**
    * Same as `unit_amount`, but contains a decimal value with at most 12 decimal places.
    */
  var unit_amount_decimal: js.UndefOr[Double | Null] = js.native
  
  /**
    * Up to and including to this quantity will be contained in the tier.
    */
  var up_to: Double | Null | inf = js.native
}
object ITier {
  
  @scala.inline
  def apply(): ITier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITier]
  }
  
  @scala.inline
  implicit class ITierOps[Self <: ITier] (val x: Self) extends AnyVal {
    
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
    def setFlat_amount(value: Double): Self = this.set("flat_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlat_amount: Self = this.set("flat_amount", js.undefined)
    
    @scala.inline
    def setFlat_amountNull: Self = this.set("flat_amount", null)
    
    @scala.inline
    def setFlat_amount_decimal(value: Double): Self = this.set("flat_amount_decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlat_amount_decimal: Self = this.set("flat_amount_decimal", js.undefined)
    
    @scala.inline
    def setFlat_amount_decimalNull: Self = this.set("flat_amount_decimal", null)
    
    @scala.inline
    def setUnit_amount(value: Double): Self = this.set("unit_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit_amount: Self = this.set("unit_amount", js.undefined)
    
    @scala.inline
    def setUnit_amountNull: Self = this.set("unit_amount", null)
    
    @scala.inline
    def setUnit_amount_decimal(value: Double): Self = this.set("unit_amount_decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit_amount_decimal: Self = this.set("unit_amount_decimal", js.undefined)
    
    @scala.inline
    def setUnit_amount_decimalNull: Self = this.set("unit_amount_decimal", null)
    
    @scala.inline
    def setUp_to(value: Double | inf): Self = this.set("up_to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUp_toNull: Self = this.set("up_to", null)
  }
}
