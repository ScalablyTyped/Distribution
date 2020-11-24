package typings.stripe.mod.accounts

import typings.stripe.mod.IAddress
import typings.stripe.mod.IAddressKana
import typings.stripe.mod.IAddressKanji
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICompanyShared extends js.Object {
  
  /**
    * The company’s primary address.
    */
  var address: js.UndefOr[IAddress] = js.native
  
  /**
    * The Kana variation of the company’s primary address (Japan only).
    */
  var address_kana: js.UndefOr[IAddressKana] = js.native
  
  /**
    * The Kanji variation of the company’s primary address (Japan only).
    */
  var address_kanji: js.UndefOr[IAddressKanji] = js.native
  
  /**
    * Whether the company’s directors have been provided. Set this Boolean
    * to true after creating all the company’s directors with the Persons API
    * for accounts with a relationship.director requirement. This value is
    * not automatically set to true after creating directors, so it needs to
    * be updated to indicate all directors have been provided.
    */
  var directors_provided: js.UndefOr[Boolean] = js.native
  
  /**
    * The company’s legal name.
    * This can be unset by updating the value to null and then saving.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The Kana variation of the company’s legal name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var name_kana: js.UndefOr[String] = js.native
  
  /**
    * The Kanji variation of the company’s legal name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var name_kanji: js.UndefOr[String] = js.native
  
  /**
    * Whether the company’s owners have been provided. Set this Boolean
    * to true after creating all the company’s owners with the Persons API
    * for accounts with a relationship.owner requirement.
    */
  var owners_provided: js.UndefOr[Boolean] = js.native
  
  /**
    * The company’s phone number (used for verification).
    * This can be unset by updating the value to null and then saving.
    */
  var phone: js.UndefOr[String] = js.native
  
  /**
    * The jurisdiction in which the tax_id is registered (Germany-based companies only).
    * This can be unset by updating the value to null and then saving.
    */
  var tax_id_registrar: js.UndefOr[String] = js.native
}
object ICompanyShared {
  
  @scala.inline
  def apply(): ICompanyShared = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompanyShared]
  }
  
  @scala.inline
  implicit class ICompanySharedOps[Self <: ICompanyShared] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: IAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setAddress_kana(value: IAddressKana): Self = this.set("address_kana", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress_kana: Self = this.set("address_kana", js.undefined)
    
    @scala.inline
    def setAddress_kanji(value: IAddressKanji): Self = this.set("address_kanji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress_kanji: Self = this.set("address_kanji", js.undefined)
    
    @scala.inline
    def setDirectors_provided(value: Boolean): Self = this.set("directors_provided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectors_provided: Self = this.set("directors_provided", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setName_kana(value: String): Self = this.set("name_kana", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName_kana: Self = this.set("name_kana", js.undefined)
    
    @scala.inline
    def setName_kanji(value: String): Self = this.set("name_kanji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName_kanji: Self = this.set("name_kanji", js.undefined)
    
    @scala.inline
    def setOwners_provided(value: Boolean): Self = this.set("owners_provided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwners_provided: Self = this.set("owners_provided", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    
    @scala.inline
    def setTax_id_registrar(value: String): Self = this.set("tax_id_registrar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTax_id_registrar: Self = this.set("tax_id_registrar", js.undefined)
  }
}
