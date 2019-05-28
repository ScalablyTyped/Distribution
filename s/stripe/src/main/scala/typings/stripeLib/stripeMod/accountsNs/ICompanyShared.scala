package typings
package stripeLib.stripeMod.accountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompanyShared extends js.Object {
  /**
    * The company’s primary address.
    */
  var address: js.UndefOr[stripeLib.stripeMod.IAddress] = js.undefined
  /**
    * The Kana variation of the company’s primary address (Japan only).
    */
  var address_kana: js.UndefOr[stripeLib.stripeMod.IAddressKana] = js.undefined
  /**
    * The Kanji variation of the company’s primary address (Japan only).
    */
  var address_kanji: js.UndefOr[stripeLib.stripeMod.IAddressKanji] = js.undefined
  /**
    * Whether the company’s directors have been provided. Set this Boolean
    * to true after creating all the company’s directors with the Persons API
    * for accounts with a relationship.director requirement. This value is
    * not automatically set to true after creating directors, so it needs to
    * be updated to indicate all directors have been provided.
    */
  var directors_provided: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The company’s legal name.
    * This can be unset by updating the value to null and then saving.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Kana variation of the company’s legal name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var name_kana: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Kanji variation of the company’s legal name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var name_kanji: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the company’s owners have been provided. Set this Boolean
    * to true after creating all the company’s owners with the Persons API
    * for accounts with a relationship.owner requirement.
    */
  var owners_provided: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The company’s phone number (used for verification).
    * This can be unset by updating the value to null and then saving.
    */
  var phone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The jurisdiction in which the tax_id is registered (Germany-based companies only).
    * This can be unset by updating the value to null and then saving.
    */
  var tax_id_registrar: js.UndefOr[java.lang.String] = js.undefined
}

object ICompanyShared {
  @scala.inline
  def apply(
    address: stripeLib.stripeMod.IAddress = null,
    address_kana: stripeLib.stripeMod.IAddressKana = null,
    address_kanji: stripeLib.stripeMod.IAddressKanji = null,
    directors_provided: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    name_kana: java.lang.String = null,
    name_kanji: java.lang.String = null,
    owners_provided: js.UndefOr[scala.Boolean] = js.undefined,
    phone: java.lang.String = null,
    tax_id_registrar: java.lang.String = null
  ): ICompanyShared = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (address_kana != null) __obj.updateDynamic("address_kana")(address_kana)
    if (address_kanji != null) __obj.updateDynamic("address_kanji")(address_kanji)
    if (!js.isUndefined(directors_provided)) __obj.updateDynamic("directors_provided")(directors_provided)
    if (name != null) __obj.updateDynamic("name")(name)
    if (name_kana != null) __obj.updateDynamic("name_kana")(name_kana)
    if (name_kanji != null) __obj.updateDynamic("name_kanji")(name_kanji)
    if (!js.isUndefined(owners_provided)) __obj.updateDynamic("owners_provided")(owners_provided)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (tax_id_registrar != null) __obj.updateDynamic("tax_id_registrar")(tax_id_registrar)
    __obj.asInstanceOf[ICompanyShared]
  }
}

