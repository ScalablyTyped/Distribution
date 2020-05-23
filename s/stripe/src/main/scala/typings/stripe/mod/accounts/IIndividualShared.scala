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
import scala.scalajs.js.annotation._

trait IIndividualShared extends js.Object {
  /**
    * The individual’s primary address.
    */
  var address: js.UndefOr[IAddress] = js.undefined
  /**
    * The Kana variation of the the individual’s primary address (Japan only).
    */
  var address_kana: js.UndefOr[IAddressKana] = js.undefined
  /**
    * The Kanji variation of the the individual’s primary address (Japan only).
    */
  var address_kanji: js.UndefOr[IAddressKanji] = js.undefined
  /**
    * The individual’s date of birth.
    */
  var dob: js.UndefOr[Day] = js.undefined
  /**
    * The individual's email address.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * The individual’s first name.
    * This can be unset by updating the value to null and then saving.
    */
  var first_name: js.UndefOr[String] = js.undefined
  /**
    * The Kana variation of the the individual’s first name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var first_name_kana: js.UndefOr[String] = js.undefined
  /**
    * The Kanji variation of the individual’s first name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var first_name_kanji: js.UndefOr[String] = js.undefined
  /**
    * The individual’s gender (International regulations require either “male” or “female”).
    * This can be unset by updating the value to null and then saving.
    */
  var gender: js.UndefOr[male | female] = js.undefined
  /**
    * The individual’s last name.
    * This can be unset by updating the value to null and then saving.
    */
  var last_name: js.UndefOr[String] = js.undefined
  /**
    * The Kana variation of the individual’s last name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var last_name_kana: js.UndefOr[String] = js.undefined
  /**
    * The Kanji variation of the individual’s last name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var last_name_kanji: js.UndefOr[String] = js.undefined
  /**
    * The individual’s maiden name.
    * This can be unset by updating the value to null and then saving.
    */
  var maiden_name: js.UndefOr[String] = js.undefined
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful
    * for storing additional information about the object in a structured format.
    * Individual keys can be unset by posting an empty value to them.
    * All keys can be unset by posting an empty value to metadata.
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * The individual’s phone number.
    */
  var phone: js.UndefOr[String] = js.undefined
  /**
    * The individual’s verification document information.
    */
  var verification: js.UndefOr[Details] = js.undefined
}

object IIndividualShared {
  @scala.inline
  def apply(
    address: IAddress = null,
    address_kana: IAddressKana = null,
    address_kanji: IAddressKanji = null,
    dob: Day = null,
    email: String = null,
    first_name: String = null,
    first_name_kana: String = null,
    first_name_kanji: String = null,
    gender: male | female = null,
    last_name: String = null,
    last_name_kana: String = null,
    last_name_kanji: String = null,
    maiden_name: String = null,
    metadata: StringDictionary[String] = null,
    phone: String = null,
    verification: Details = null
  ): IIndividualShared = {
    val __obj = js.Dynamic.literal()
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
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (verification != null) __obj.updateDynamic("verification")(verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIndividualShared]
  }
}

