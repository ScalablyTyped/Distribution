package typings.stripe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAddress extends js.Object {
  
  /**
    * City/Suburb/Town/Village
    */
  var city: js.UndefOr[String | Null] = js.native
  
  /**
    * 2-letter country code
    */
  var country: js.UndefOr[String | Null] = js.native
  
  /**
    * Address line 1 (Street address/PO Box/Company name)
    */
  var line1: String = js.native
  
  /**
    * Address line 2 (Apartment/Suite/Unit/Building)
    */
  var line2: js.UndefOr[String | Null] = js.native
  
  /**
    * Zip/Postal Code
    */
  var postal_code: js.UndefOr[String | Null] = js.native
  
  /**
    * State/Province/County
    */
  var state: js.UndefOr[String | Null] = js.native
}
object IAddress {
  
  @scala.inline
  def apply(line1: String): IAddress = {
    val __obj = js.Dynamic.literal(line1 = line1.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddress]
  }
  
  @scala.inline
  implicit class IAddressOps[Self <: IAddress] (val x: Self) extends AnyVal {
    
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
    def setLine1(value: String): Self = this.set("line1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    
    @scala.inline
    def setCityNull: Self = this.set("city", null)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setCountryNull: Self = this.set("country", null)
    
    @scala.inline
    def setLine2(value: String): Self = this.set("line2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine2: Self = this.set("line2", js.undefined)
    
    @scala.inline
    def setLine2Null: Self = this.set("line2", null)
    
    @scala.inline
    def setPostal_code(value: String): Self = this.set("postal_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostal_code: Self = this.set("postal_code", js.undefined)
    
    @scala.inline
    def setPostal_codeNull: Self = this.set("postal_code", null)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStateNull: Self = this.set("state", null)
  }
}
