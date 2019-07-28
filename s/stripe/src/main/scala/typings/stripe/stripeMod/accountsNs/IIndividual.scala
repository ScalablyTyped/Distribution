package typings.stripe.stripeMod.accountsNs

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

trait IIndividual extends IIndividualShared {
  /**
    * Whether the individual’s personal ID number was provided.
    */
  var id_number_provided: Boolean
  /**
    * Whether the individual’s last 4 SSN digits was provided.
    */
  var ssn_last_4_provided: Boolean
}

object IIndividual {
  @scala.inline
  def apply(
    id_number_provided: Boolean,
    ssn_last_4_provided: Boolean,
    address: IAddress = null,
    address_kana: IAddressKana = null,
    address_kanji: IAddressKanji = null,
    dob: Anon_Day = null,
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
    verification: Anon_Document = null
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

