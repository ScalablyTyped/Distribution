package typings.stripe.stripeMod.accounts

import org.scalablytyped.runtime.StringDictionary
import typings.stripe.Anon_Day
import typings.stripe.Anon_Document
import typings.stripe.stripeMod.IAddress
import typings.stripe.stripeMod.IAddressKana
import typings.stripe.stripeMod.IAddressKanji
import typings.stripe.stripeStrings.female
import typings.stripe.stripeStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndividualCreateUpdateOptions extends IIndividualShared {
  /**
    * The government-issued ID number of the individual, as appropriate for the representative’s country.
    * (Examples are a Social Security Number in the U.S., or a Social Insurance Number in Canada).
    * Instead of the number itself, you can also provide a PII token created with Stripe.js.
    * This can be unset by updating the value to null and then saving.
    */
  var id_number: js.UndefOr[String] = js.undefined
  /**
    * The last four digits of the individual’s Social Security Number (U.S. only).
    * This can be unset by updating the value to null and then saving.
    */
  var ssn_last_4: js.UndefOr[String] = js.undefined
}

object IIndividualCreateUpdateOptions {
  @scala.inline
  def apply(
    address: IAddress = null,
    address_kana: IAddressKana = null,
    address_kanji: IAddressKanji = null,
    dob: Anon_Day = null,
    email: String = null,
    first_name: String = null,
    first_name_kana: String = null,
    first_name_kanji: String = null,
    gender: male | female = null,
    id_number: String = null,
    last_name: String = null,
    last_name_kana: String = null,
    last_name_kanji: String = null,
    maiden_name: String = null,
    metadata: StringDictionary[String] = null,
    phone: String = null,
    ssn_last_4: String = null,
    verification: Anon_Document = null
  ): IIndividualCreateUpdateOptions = {
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
    if (id_number != null) __obj.updateDynamic("id_number")(id_number)
    if (last_name != null) __obj.updateDynamic("last_name")(last_name)
    if (last_name_kana != null) __obj.updateDynamic("last_name_kana")(last_name_kana)
    if (last_name_kanji != null) __obj.updateDynamic("last_name_kanji")(last_name_kanji)
    if (maiden_name != null) __obj.updateDynamic("maiden_name")(maiden_name)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (ssn_last_4 != null) __obj.updateDynamic("ssn_last_4")(ssn_last_4)
    if (verification != null) __obj.updateDynamic("verification")(verification)
    __obj.asInstanceOf[IIndividualCreateUpdateOptions]
  }
}

