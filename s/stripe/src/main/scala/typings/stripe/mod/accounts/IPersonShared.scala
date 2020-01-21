package typings.stripe.mod.accounts

import typings.stripe.AnonDay
import typings.stripe.AnonDirector
import typings.stripe.mod.IAddress
import typings.stripe.mod.IAddressKana
import typings.stripe.mod.IAddressKanji
import typings.stripe.stripeStrings.female
import typings.stripe.stripeStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPersonShared extends js.Object {
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
  var dob: js.UndefOr[AnonDay] = js.undefined
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
  var relationship: js.UndefOr[AnonDirector] = js.undefined
}

object IPersonShared {
  @scala.inline
  def apply(
    account: String = null,
    address: IAddress = null,
    address_kana: IAddressKana = null,
    address_kanji: IAddressKanji = null,
    dob: AnonDay = null,
    email: String = null,
    first_name: String = null,
    first_name_kana: String = null,
    first_name_kanji: String = null,
    gender: male | female = null,
    last_name: String = null,
    last_name_kana: String = null,
    last_name_kanji: String = null,
    maiden_name: String = null,
    phone: String = null,
    relationship: AnonDirector = null
  ): IPersonShared = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (address_kana != null) __obj.updateDynamic("address_kana")(address_kana.asInstanceOf[js.Any])
    if (address_kanji != null) __obj.updateDynamic("address_kanji")(address_kanji.asInstanceOf[js.Any])
    if (dob != null) __obj.updateDynamic("dob")(dob.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (first_name != null) __obj.updateDynamic("first_name")(first_name.asInstanceOf[js.Any])
    if (first_name_kana != null) __obj.updateDynamic("first_name_kana")(first_name_kana.asInstanceOf[js.Any])
    if (first_name_kanji != null) __obj.updateDynamic("first_name_kanji")(first_name_kanji.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (last_name != null) __obj.updateDynamic("last_name")(last_name.asInstanceOf[js.Any])
    if (last_name_kana != null) __obj.updateDynamic("last_name_kana")(last_name_kana.asInstanceOf[js.Any])
    if (last_name_kanji != null) __obj.updateDynamic("last_name_kanji")(last_name_kanji.asInstanceOf[js.Any])
    if (maiden_name != null) __obj.updateDynamic("maiden_name")(maiden_name.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (relationship != null) __obj.updateDynamic("relationship")(relationship.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonShared]
  }
}

