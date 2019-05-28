package typings
package stripeLib.stripeMod.accountsNs

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
  var id_number: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The last four digits of the individual’s Social Security Number (U.S. only).
    * This can be unset by updating the value to null and then saving.
    */
  var ssn_last_4: js.UndefOr[java.lang.String] = js.undefined
}

object IIndividualCreateUpdateOptions {
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
    id_number: java.lang.String = null,
    last_name: java.lang.String = null,
    last_name_kana: java.lang.String = null,
    last_name_kanji: java.lang.String = null,
    maiden_name: java.lang.String = null,
    metadata: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    phone: java.lang.String = null,
    ssn_last_4: java.lang.String = null,
    verification: stripeLib.Anon_Document = null
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

