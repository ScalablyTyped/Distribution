package typings.stripe.mod.accounts

import typings.stripe.anon.Day
import typings.stripe.anon.Director
import typings.stripe.mod.IAddress
import typings.stripe.mod.IAddressKana
import typings.stripe.mod.IAddressKanji
import typings.stripe.stripeStrings.female
import typings.stripe.stripeStrings.male
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPersonShared extends StObject {
  
  /**
    * The account the person is associated with.
    */
  var account: js.UndefOr[String] = js.undefined
  
  /**
    * The person’s address.
    */
  var address: js.UndefOr[IAddress] = js.undefined
  
  /**
    * The Kana variation of the person’s address (Japan only).
    */
  var address_kana: js.UndefOr[IAddressKana] = js.undefined
  
  /**
    * The Kanji variation of the person’s address (Japan only).
    */
  var address_kanji: js.UndefOr[IAddressKanji] = js.undefined
  
  /**
    * The person’s date of birth.
    */
  var dob: js.UndefOr[Day] = js.undefined
  
  /**
    * The person’s email address.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * The person’s first name.
    */
  var first_name: js.UndefOr[String] = js.undefined
  
  /**
    * The Kana variation of the the person’s first name (Japan only).
    */
  var first_name_kana: js.UndefOr[String] = js.undefined
  
  /**
    * The Kanji variation of the person’s first name (Japan only).
    */
  var first_name_kanji: js.UndefOr[String] = js.undefined
  
  /**
    * The person’s gender (International regulations require either “male” or “female”).
    */
  var gender: js.UndefOr[male | female] = js.undefined
  
  /**
    * The person’s last name.
    */
  var last_name: js.UndefOr[String] = js.undefined
  
  /**
    * The Kana variation of the person’s last name (Japan only).
    */
  var last_name_kana: js.UndefOr[String] = js.undefined
  
  /**
    * The Kanji variation of the person’s last name (Japan only).
    */
  var last_name_kanji: js.UndefOr[String] = js.undefined
  
  /**
    * The person’s maiden name.
    */
  var maiden_name: js.UndefOr[String] = js.undefined
  
  /**
    * The person’s phone number.
    */
  var phone: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the person’s relationship to the account.
    */
  var relationship: js.UndefOr[Director] = js.undefined
}
object IPersonShared {
  
  @scala.inline
  def apply(): IPersonShared = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonShared]
  }
  
  @scala.inline
  implicit class IPersonSharedMutableBuilder[Self <: IPersonShared] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
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
    def setDob(value: Day): Self = StObject.set(x, "dob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDobUndefined: Self = StObject.set(x, "dob", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
    
    @scala.inline
    def setFirst_name_kana(value: String): Self = StObject.set(x, "first_name_kana", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_name_kanaUndefined: Self = StObject.set(x, "first_name_kana", js.undefined)
    
    @scala.inline
    def setFirst_name_kanji(value: String): Self = StObject.set(x, "first_name_kanji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_name_kanjiUndefined: Self = StObject.set(x, "first_name_kanji", js.undefined)
    
    @scala.inline
    def setGender(value: male | female): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    @scala.inline
    def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    @scala.inline
    def setLast_name_kana(value: String): Self = StObject.set(x, "last_name_kana", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_name_kanaUndefined: Self = StObject.set(x, "last_name_kana", js.undefined)
    
    @scala.inline
    def setLast_name_kanji(value: String): Self = StObject.set(x, "last_name_kanji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_name_kanjiUndefined: Self = StObject.set(x, "last_name_kanji", js.undefined)
    
    @scala.inline
    def setMaiden_name(value: String): Self = StObject.set(x, "maiden_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaiden_nameUndefined: Self = StObject.set(x, "maiden_name", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setRelationship(value: Director): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
  }
}
