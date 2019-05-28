package typings
package stripeLib.stripeMod.accountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndividualShared extends js.Object {
  /**
    * The individual’s primary address.
    */
  var address: js.UndefOr[stripeLib.stripeMod.IAddress] = js.undefined
  /**
    * The Kana variation of the the individual’s primary address (Japan only).
    */
  var address_kana: js.UndefOr[stripeLib.stripeMod.IAddressKana] = js.undefined
  /**
    * The Kanji variation of the the individual’s primary address (Japan only).
    */
  var address_kanji: js.UndefOr[stripeLib.stripeMod.IAddressKanji] = js.undefined
  /**
    * The individual’s date of birth.
    */
  var dob: js.UndefOr[stripeLib.Anon_Day] = js.undefined
  /**
    * The individual's email address.
    */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The individual’s first name.
    * This can be unset by updating the value to null and then saving.
    */
  var first_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Kana variation of the the individual’s first name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var first_name_kana: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Kanji variation of the individual’s first name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var first_name_kanji: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The individual’s gender (International regulations require either “male” or “female”).
    * This can be unset by updating the value to null and then saving.
    */
  var gender: js.UndefOr[stripeLib.stripeLibStrings.male | stripeLib.stripeLibStrings.female] = js.undefined
  /**
    * The individual’s last name.
    * This can be unset by updating the value to null and then saving.
    */
  var last_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Kana varation of the individual’s last name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var last_name_kana: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Kanji varation of the individual’s last name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var last_name_kanji: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The individual’s maiden name.
    * This can be unset by updating the value to null and then saving.
    */
  var maiden_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful
    * for storing additional information about the object in a structured format.
    * Individual keys can be unset by posting an empty value to them.
    * All keys can be unset by posting an empty value to metadata.
    */
  var metadata: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * The individual’s phone number.
    */
  var phone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The individual’s verification document information.
    */
  var verification: js.UndefOr[stripeLib.Anon_Document] = js.undefined
}

object IIndividualShared {
  @scala.inline
  def apply(
    address: stripeLib.stripeMod.IAddress = null,
    address_kana: stripeLib.stripeMod.IAddressKana = null,
    address_kanji: stripeLib.stripeMod.IAddressKanji = null,
    dob: stripeLib.Anon_Day = null,
    email: java.lang.String = null,
    first_name: java.lang.String = null,
    first_name_kana: java.lang.String = null,
    first_name_kanji: java.lang.String = null,
    gender: stripeLib.stripeLibStrings.male | stripeLib.stripeLibStrings.female = null,
    last_name: java.lang.String = null,
    last_name_kana: java.lang.String = null,
    last_name_kanji: java.lang.String = null,
    maiden_name: java.lang.String = null,
    metadata: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    phone: java.lang.String = null,
    verification: stripeLib.Anon_Document = null
  ): IIndividualShared = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (address_kana != null) __obj.updateDynamic("address_kana")(address_kana)
    if (address_kanji != null) __obj.updateDynamic("address_kanji")(address_kanji)
    if (dob != null) __obj.updateDynamic("dob")(dob)
    if (email != null) __obj.updateDynamic("email")(email)
    if (first_name != null) __obj.updateDynamic("first_name")(first_name)
    if (first_name_kana != null) __obj.updateDynamic("first_name_kana")(first_name_kana)
    if (first_name_kanji != null) __obj.updateDynamic("first_name_kanji")(first_name_kanji)
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (last_name != null) __obj.updateDynamic("last_name")(last_name)
    if (last_name_kana != null) __obj.updateDynamic("last_name_kana")(last_name_kana)
    if (last_name_kanji != null) __obj.updateDynamic("last_name_kanji")(last_name_kanji)
    if (maiden_name != null) __obj.updateDynamic("maiden_name")(maiden_name)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (verification != null) __obj.updateDynamic("verification")(verification)
    __obj.asInstanceOf[IIndividualShared]
  }
}

