package typings.stripe.mod.accounts

import typings.stripe.mod.IAddress
import typings.stripe.mod.IAddressKana
import typings.stripe.mod.IAddressKanji
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICompanyShared extends StObject {
  
  /**
    * The company’s primary address.
    */
  var address: js.UndefOr[IAddress] = js.undefined
  
  /**
    * The Kana variation of the company’s primary address (Japan only).
    */
  var address_kana: js.UndefOr[IAddressKana] = js.undefined
  
  /**
    * The Kanji variation of the company’s primary address (Japan only).
    */
  var address_kanji: js.UndefOr[IAddressKanji] = js.undefined
  
  /**
    * Whether the company’s directors have been provided. Set this Boolean
    * to true after creating all the company’s directors with the Persons API
    * for accounts with a relationship.director requirement. This value is
    * not automatically set to true after creating directors, so it needs to
    * be updated to indicate all directors have been provided.
    */
  var directors_provided: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The company’s legal name.
    * This can be unset by updating the value to null and then saving.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The Kana variation of the company’s legal name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var name_kana: js.UndefOr[String] = js.undefined
  
  /**
    * The Kanji variation of the company’s legal name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var name_kanji: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the company’s owners have been provided. Set this Boolean
    * to true after creating all the company’s owners with the Persons API
    * for accounts with a relationship.owner requirement.
    */
  var owners_provided: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The company’s phone number (used for verification).
    * This can be unset by updating the value to null and then saving.
    */
  var phone: js.UndefOr[String] = js.undefined
  
  /**
    * The jurisdiction in which the tax_id is registered (Germany-based companies only).
    * This can be unset by updating the value to null and then saving.
    */
  var tax_id_registrar: js.UndefOr[String] = js.undefined
}
object ICompanyShared {
  
  @scala.inline
  def apply(): ICompanyShared = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompanyShared]
  }
  
  @scala.inline
  implicit class ICompanySharedMutableBuilder[Self <: ICompanyShared] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: IAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setAddress_kana(value: IAddressKana): Self = StObject.set(x, "address_kana", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_kanaUndefined: Self = StObject.set(x, "address_kana", js.undefined)
    
    @scala.inline
    def setAddress_kanji(value: IAddressKanji): Self = StObject.set(x, "address_kanji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_kanjiUndefined: Self = StObject.set(x, "address_kanji", js.undefined)
    
    @scala.inline
    def setDirectors_provided(value: Boolean): Self = StObject.set(x, "directors_provided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectors_providedUndefined: Self = StObject.set(x, "directors_provided", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setName_kana(value: String): Self = StObject.set(x, "name_kana", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName_kanaUndefined: Self = StObject.set(x, "name_kana", js.undefined)
    
    @scala.inline
    def setName_kanji(value: String): Self = StObject.set(x, "name_kanji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName_kanjiUndefined: Self = StObject.set(x, "name_kanji", js.undefined)
    
    @scala.inline
    def setOwners_provided(value: Boolean): Self = StObject.set(x, "owners_provided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwners_providedUndefined: Self = StObject.set(x, "owners_provided", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setTax_id_registrar(value: String): Self = StObject.set(x, "tax_id_registrar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTax_id_registrarUndefined: Self = StObject.set(x, "tax_id_registrar", js.undefined)
  }
}
