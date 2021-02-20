package typings.stripe.mod.accounts

import org.scalablytyped.runtime.StringDictionary
import typings.stripe.anon.Day
import typings.stripe.anon.Details
import typings.stripe.mod.IAddress
import typings.stripe.mod.IAddressKana
import typings.stripe.mod.IAddressKanji
import typings.stripe.stripeStrings.female
import typings.stripe.stripeStrings.male
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIndividualShared extends StObject {
  
  /**
    * The individual’s primary address.
    */
  var address: js.UndefOr[IAddress] = js.native
  
  /**
    * The Kana variation of the the individual’s primary address (Japan only).
    */
  var address_kana: js.UndefOr[IAddressKana] = js.native
  
  /**
    * The Kanji variation of the the individual’s primary address (Japan only).
    */
  var address_kanji: js.UndefOr[IAddressKanji] = js.native
  
  /**
    * The individual’s date of birth.
    */
  var dob: js.UndefOr[Day] = js.native
  
  /**
    * The individual's email address.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The individual’s first name.
    * This can be unset by updating the value to null and then saving.
    */
  var first_name: js.UndefOr[String] = js.native
  
  /**
    * The Kana variation of the the individual’s first name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var first_name_kana: js.UndefOr[String] = js.native
  
  /**
    * The Kanji variation of the individual’s first name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var first_name_kanji: js.UndefOr[String] = js.native
  
  /**
    * The individual’s gender (International regulations require either “male” or “female”).
    * This can be unset by updating the value to null and then saving.
    */
  var gender: js.UndefOr[male | female] = js.native
  
  /**
    * The individual’s last name.
    * This can be unset by updating the value to null and then saving.
    */
  var last_name: js.UndefOr[String] = js.native
  
  /**
    * The Kana variation of the individual’s last name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var last_name_kana: js.UndefOr[String] = js.native
  
  /**
    * The Kanji variation of the individual’s last name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var last_name_kanji: js.UndefOr[String] = js.native
  
  /**
    * The individual’s maiden name.
    * This can be unset by updating the value to null and then saving.
    */
  var maiden_name: js.UndefOr[String] = js.native
  
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful
    * for storing additional information about the object in a structured format.
    * Individual keys can be unset by posting an empty value to them.
    * All keys can be unset by posting an empty value to metadata.
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The individual’s phone number.
    */
  var phone: js.UndefOr[String] = js.native
  
  /**
    * The individual’s verification document information.
    */
  var verification: js.UndefOr[Details] = js.native
}
object IIndividualShared {
  
  @scala.inline
  def apply(): IIndividualShared = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIndividualShared]
  }
  
  @scala.inline
  implicit class IIndividualSharedMutableBuilder[Self <: IIndividualShared] (val x: Self) extends AnyVal {
    
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
    def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setVerification(value: Details): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
  }
}
