package typings.stripe.mod.accounts

import org.scalablytyped.runtime.StringDictionary
import typings.stripe.anon.Day
import typings.stripe.anon.Details
import typings.stripe.mod.IAddress
import typings.stripe.mod.IAddressKana
import typings.stripe.mod.IAddressKanji
import typings.stripe.stripeStrings.female
import typings.stripe.stripeStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIndividualShared extends js.Object {
  
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
  implicit class IIndividualSharedOps[Self <: IIndividualShared] (val x: Self) extends AnyVal {
    
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
    def setDob(value: Day): Self = this.set("dob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDob: Self = this.set("dob", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFirst_name(value: String): Self = this.set("first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirst_name: Self = this.set("first_name", js.undefined)
    
    @scala.inline
    def setFirst_name_kana(value: String): Self = this.set("first_name_kana", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirst_name_kana: Self = this.set("first_name_kana", js.undefined)
    
    @scala.inline
    def setFirst_name_kanji(value: String): Self = this.set("first_name_kanji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirst_name_kanji: Self = this.set("first_name_kanji", js.undefined)
    
    @scala.inline
    def setGender(value: male | female): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    
    @scala.inline
    def setLast_name(value: String): Self = this.set("last_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast_name: Self = this.set("last_name", js.undefined)
    
    @scala.inline
    def setLast_name_kana(value: String): Self = this.set("last_name_kana", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast_name_kana: Self = this.set("last_name_kana", js.undefined)
    
    @scala.inline
    def setLast_name_kanji(value: String): Self = this.set("last_name_kanji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast_name_kanji: Self = this.set("last_name_kanji", js.undefined)
    
    @scala.inline
    def setMaiden_name(value: String): Self = this.set("maiden_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaiden_name: Self = this.set("maiden_name", js.undefined)
    
    @scala.inline
    def setMetadata(value: StringDictionary[String]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    
    @scala.inline
    def setVerification(value: Details): Self = this.set("verification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerification: Self = this.set("verification", js.undefined)
  }
}
