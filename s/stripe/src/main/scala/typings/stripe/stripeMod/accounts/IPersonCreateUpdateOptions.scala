package typings.stripe.stripeMod.accounts

import typings.stripe.Anon_AdditionaldocumentDocument
import typings.stripe.Anon_Day
import typings.stripe.Anon_Director
import typings.stripe.stripeMod.IAddress
import typings.stripe.stripeMod.IAddressKana
import typings.stripe.stripeMod.IAddressKanji
import typings.stripe.stripeMod.IOptionsMetadata
import typings.stripe.stripeStrings.female
import typings.stripe.stripeStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPersonCreateUpdateOptions extends IPersonShared {
  /**
    * The person’s ID number, as appropriate for their country. For example, a social security number
    * in the U.S., social insurance number in Canada, etc. Instead of the number itself,
    * you can also provide a PII token provided by Stripe.js.
    */
  var id_number: js.UndefOr[String] = js.undefined
  /**
    * Set of key-value pairs that you can attach to an object.
    * This can be useful for storing additional information about the object in a structured format.
    * Individual keys can be unset by posting an empty value to them.
    * All keys can be unset by posting an empty value to metadata.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
  /**
    * A person token, used to securely provide details to the person.
    */
  var person_token: js.UndefOr[String] = js.undefined
  /**
    * The last four digits of the person’s Social Security Number (U.S. only).
    */
  var ssn_last_4: js.UndefOr[String] = js.undefined
  /**
    * The person’s verification document information.
    */
  var verification: js.UndefOr[Anon_AdditionaldocumentDocument] = js.undefined
}

object IPersonCreateUpdateOptions {
  @scala.inline
  def apply(
    account: String = null,
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
    metadata: IOptionsMetadata = null,
    person_token: String = null,
    phone: String = null,
    relationship: Anon_Director = null,
    ssn_last_4: String = null,
    verification: Anon_AdditionaldocumentDocument = null
  ): IPersonCreateUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account)
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
    if (person_token != null) __obj.updateDynamic("person_token")(person_token)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (relationship != null) __obj.updateDynamic("relationship")(relationship)
    if (ssn_last_4 != null) __obj.updateDynamic("ssn_last_4")(ssn_last_4)
    if (verification != null) __obj.updateDynamic("verification")(verification)
    __obj.asInstanceOf[IPersonCreateUpdateOptions]
  }
}

