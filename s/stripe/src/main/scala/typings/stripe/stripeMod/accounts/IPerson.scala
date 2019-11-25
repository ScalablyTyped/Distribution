package typings.stripe.stripeMod.accounts

import typings.stripe.Anon_Additionaldocument
import typings.stripe.Anon_Currentlydue
import typings.stripe.Anon_Day
import typings.stripe.Anon_Director
import typings.stripe.stripeMod.IAddress
import typings.stripe.stripeMod.IAddressKana
import typings.stripe.stripeMod.IAddressKanji
import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeStrings.female
import typings.stripe.stripeStrings.male
import typings.stripe.stripeStrings.person
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPerson extends IPersonShared {
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * Unique identifier for the object.
    */
  var id: String
  /**
    * Whether the person’s personal ID number was provided.
    */
  var id_number_provided: Boolean
  /**
    * Set of key-value pairs that you can attach to an object.
    * This can be useful for storing additional information about
    * the object in a structured format.
    */
  var metadata: IMetadata
  /**
    * String representing the object’s type. Objects of the same type share the same value.
    */
  var `object`: person
  /**
    * Information about the requirements for this person, including what information needs to be collected, and by when.
    */
  var requirements: Anon_Currentlydue
  /**
    * Whether the person’s last 4 SSN digits was provided.
    */
  var ssn_last_4_provided: Boolean
  /**
    * The person’s verification document information.
    */
  var verification: Anon_Additionaldocument
}

object IPerson {
  @scala.inline
  def apply(
    created: Double,
    id: String,
    id_number_provided: Boolean,
    metadata: IMetadata,
    `object`: person,
    requirements: Anon_Currentlydue,
    ssn_last_4_provided: Boolean,
    verification: Anon_Additionaldocument,
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
    last_name: String = null,
    last_name_kana: String = null,
    last_name_kanji: String = null,
    maiden_name: String = null,
    phone: String = null,
    relationship: Anon_Director = null
  ): IPerson = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], id_number_provided = id_number_provided.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], requirements = requirements.asInstanceOf[js.Any], ssn_last_4_provided = ssn_last_4_provided.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[IPerson]
  }
}

