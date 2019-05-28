package typings
package stripeLib.stripeMod.accountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompanyCreateUpdateOptions extends ICompanyShared {
  /**
    * The business ID number of the company, as appropriate for the company’s country.
    * (Examples are an Employer ID Number in the U.S., a Business Number in Canada, or a
    * Company Number in the UK.) This can be unset by updating the value to null and then saving.
    */
  var tax_id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The VAT number of the company.
    * This can be unset by updating the value to null and then saving.
    */
  var vat_id: js.UndefOr[java.lang.String] = js.undefined
}

object ICompanyCreateUpdateOptions {
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
    tax_id: java.lang.String = null,
    tax_id_registrar: java.lang.String = null,
    vat_id: java.lang.String = null
  ): ICompanyCreateUpdateOptions = {
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
    if (tax_id != null) __obj.updateDynamic("tax_id")(tax_id)
    if (tax_id_registrar != null) __obj.updateDynamic("tax_id_registrar")(tax_id_registrar)
    if (vat_id != null) __obj.updateDynamic("vat_id")(vat_id)
    __obj.asInstanceOf[ICompanyCreateUpdateOptions]
  }
}

