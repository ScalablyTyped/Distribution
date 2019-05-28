package typings
package stripeLib.stripeMod.accountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompany extends ICompanyShared {
  /**
    * Whether the company’s business ID number was provided.
    */
  var tax_id_provided: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the company’s business VAT number was provided.
    */
  var vat_id_provided: js.UndefOr[scala.Boolean] = js.undefined
}

object ICompany {
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
    tax_id_provided: js.UndefOr[scala.Boolean] = js.undefined,
    tax_id_registrar: java.lang.String = null,
    vat_id_provided: js.UndefOr[scala.Boolean] = js.undefined
  ): ICompany = {
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
    if (!js.isUndefined(tax_id_provided)) __obj.updateDynamic("tax_id_provided")(tax_id_provided)
    if (tax_id_registrar != null) __obj.updateDynamic("tax_id_registrar")(tax_id_registrar)
    if (!js.isUndefined(vat_id_provided)) __obj.updateDynamic("vat_id_provided")(vat_id_provided)
    __obj.asInstanceOf[ICompany]
  }
}

