package typings
package stripeLib.stripeMod.accountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndividual extends IIndividualShared {
  /**
    * Whether the individual’s personal ID number was provided.
    */
  var id_number_provided: scala.Boolean
  /**
    * Whether the individual’s last 4 SSN digits was provided.
    */
  var ssn_last_4_provided: scala.Boolean
}

object IIndividual {
  @scala.inline
  def apply(
    id_number_provided: scala.Boolean,
    ssn_last_4_provided: scala.Boolean,
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
  ): IIndividual = {
    val __obj = js.Dynamic.literal(id_number_provided = id_number_provided, ssn_last_4_provided = ssn_last_4_provided)
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
    __obj.asInstanceOf[IIndividual]
  }
}

