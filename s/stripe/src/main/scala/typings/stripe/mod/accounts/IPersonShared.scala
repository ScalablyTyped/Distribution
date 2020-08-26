package typings.stripe.mod.accounts

import typings.stripe.anon.Day
import typings.stripe.anon.Director
import typings.stripe.mod.IAddress
import typings.stripe.mod.IAddressKana
import typings.stripe.mod.IAddressKanji
import typings.stripe.stripeStrings.female
import typings.stripe.stripeStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPersonShared extends js.Object {
  /**
    * The account the person is associated with.
    */
  var account: js.UndefOr[String] = js.native
  /**
    * The person’s address.
    */
  var address: js.UndefOr[IAddress] = js.native
  /**
    * The Kana variation of the person’s address (Japan only).
    */
  var address_kana: js.UndefOr[IAddressKana] = js.native
  /**
    * The Kanji variation of the person’s address (Japan only).
    */
  var address_kanji: js.UndefOr[IAddressKanji] = js.native
  /**
    * The person’s date of birth.
    */
  var dob: js.UndefOr[Day] = js.native
  /**
    * The person’s email address.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The person’s first name.
    */
  var first_name: js.UndefOr[String] = js.native
  /**
    * The Kana variation of the the person’s first name (Japan only).
    */
  var first_name_kana: js.UndefOr[String] = js.native
  /**
    * The Kanji variation of the person’s first name (Japan only).
    */
  var first_name_kanji: js.UndefOr[String] = js.native
  /**
    * The person’s gender (International regulations require either “male” or “female”).
    */
  var gender: js.UndefOr[male | female] = js.native
  /**
    * The person’s last name.
    */
  var last_name: js.UndefOr[String] = js.native
  /**
    * The Kana variation of the person’s last name (Japan only).
    */
  var last_name_kana: js.UndefOr[String] = js.native
  /**
    * The Kanji variation of the person’s last name (Japan only).
    */
  var last_name_kanji: js.UndefOr[String] = js.native
  /**
    * The person’s maiden name.
    */
  var maiden_name: js.UndefOr[String] = js.native
  /**
    * The person’s phone number.
    */
  var phone: js.UndefOr[String] = js.native
  /**
    * Describes the person’s relationship to the account.
    */
  var relationship: js.UndefOr[Director] = js.native
}

object IPersonShared {
  @scala.inline
  def apply(): IPersonShared = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonShared]
  }
  @scala.inline
  implicit class IPersonSharedOps[Self <: IPersonShared] (val x: Self) extends AnyVal {
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
    def setAccount(value: String): Self = this.set("account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
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
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    @scala.inline
    def setRelationship(value: Director): Self = this.set("relationship", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationship: Self = this.set("relationship", js.undefined)
  }
  
}

