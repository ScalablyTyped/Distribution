package typings.stripe.mod.cards

import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICardUpdateOptions extends IDataOptionsWithMetadata {
  
  var address_city: js.UndefOr[String] = js.native
  
  var address_country: js.UndefOr[String] = js.native
  
  var address_line1: js.UndefOr[String] = js.native
  
  var address_line2: js.UndefOr[String] = js.native
  
  var address_state: js.UndefOr[String] = js.native
  
  var address_zip: js.UndefOr[String] = js.native
  
  /**
    * Only applicable on accounts (not customers or recipients).
    * If set to true, this card will become the default external
    * account for its currency.
    *
    * Managed accounts only
    */
  var default_for_currency: js.UndefOr[Boolean] = js.native
  
  var exp_month: js.UndefOr[Double] = js.native
  
  var exp_year: js.UndefOr[Double] = js.native
  
  /**
    * Cardholder name
    */
  var name: js.UndefOr[String] = js.native
}
object ICardUpdateOptions {
  
  @scala.inline
  def apply(): ICardUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICardUpdateOptions]
  }
  
  @scala.inline
  implicit class ICardUpdateOptionsOps[Self <: ICardUpdateOptions] (val x: Self) extends AnyVal {
    
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
    def setDefault_for_currency(value: Boolean): Self = this.set("default_for_currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_for_currency: Self = this.set("default_for_currency", js.undefined)
    
    @scala.inline
    def setExp_month(value: Double): Self = this.set("exp_month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExp_month: Self = this.set("exp_month", js.undefined)
    
    @scala.inline
    def setExp_year(value: Double): Self = this.set("exp_year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExp_year: Self = this.set("exp_year", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
