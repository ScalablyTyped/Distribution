package typings.stripe.mod.cards

import typings.stripe.mod.IOptionsMetadata
import typings.stripe.stripeStrings.card
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICardSourceCreationOptions extends js.Object {
  
  var address_city: js.UndefOr[String] = js.native
  
  var address_country: js.UndefOr[String] = js.native
  
  var address_line1: js.UndefOr[String] = js.native
  
  var address_line2: js.UndefOr[String] = js.native
  
  var address_state: js.UndefOr[String] = js.native
  
  var address_zip: js.UndefOr[String] = js.native
  
  /**
    * Card security code. Required unless your account is registered in
    * Australia, Canada, or the United States. Highly recommended to always
    * include this value.
    */
  var cvc: js.UndefOr[String] = js.native
  
  /**
    * Two digit number representing the card's expiration month.
    */
  var exp_month: Double = js.native
  
  /**
    * Two or four digit number representing the card's expiration year.
    */
  var exp_year: Double = js.native
  
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
  
  /**
    * Cardholder's full name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The card number, as a string without any separators.
    */
  var number: String = js.native
  
  /**
    * The type of payment source. Should be "card".
    */
  var `object`: card = js.native
}
object ICardSourceCreationOptions {
  
  @scala.inline
  def apply(exp_month: Double, exp_year: Double, number: String, `object`: card): ICardSourceCreationOptions = {
    val __obj = js.Dynamic.literal(exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardSourceCreationOptions]
  }
  
  @scala.inline
  implicit class ICardSourceCreationOptionsOps[Self <: ICardSourceCreationOptions] (val x: Self) extends AnyVal {
    
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
    def setExp_month(value: Double): Self = this.set("exp_month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExp_year(value: Double): Self = this.set("exp_year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: card): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_city(value: String): Self = this.set("address_city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress_city: Self = this.set("address_city", js.undefined)
    
    @scala.inline
    def setAddress_country(value: String): Self = this.set("address_country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress_country: Self = this.set("address_country", js.undefined)
    
    @scala.inline
    def setAddress_line1(value: String): Self = this.set("address_line1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress_line1: Self = this.set("address_line1", js.undefined)
    
    @scala.inline
    def setAddress_line2(value: String): Self = this.set("address_line2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress_line2: Self = this.set("address_line2", js.undefined)
    
    @scala.inline
    def setAddress_state(value: String): Self = this.set("address_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress_state: Self = this.set("address_state", js.undefined)
    
    @scala.inline
    def setAddress_zip(value: String): Self = this.set("address_zip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress_zip: Self = this.set("address_zip", js.undefined)
    
    @scala.inline
    def setCvc(value: String): Self = this.set("cvc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCvc: Self = this.set("cvc", js.undefined)
    
    @scala.inline
    def setMetadata(value: IOptionsMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
