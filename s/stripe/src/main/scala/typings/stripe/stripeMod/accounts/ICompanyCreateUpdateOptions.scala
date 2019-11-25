package typings.stripe.stripeMod.accounts

import typings.stripe.stripeMod.IAddress
import typings.stripe.stripeMod.IAddressKana
import typings.stripe.stripeMod.IAddressKanji
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompanyCreateUpdateOptions extends ICompanyShared {
  /**
    * The business ID number of the company, as appropriate for the company’s country.
    * (Examples are an Employer ID Number in the U.S., a Business Number in Canada, or a
    * Company Number in the UK.) This can be unset by updating the value to null and then saving.
    */
  var tax_id: js.UndefOr[String] = js.undefined
  /**
    * The VAT number of the company.
    * This can be unset by updating the value to null and then saving.
    */
  var vat_id: js.UndefOr[String] = js.undefined
}

object ICompanyCreateUpdateOptions {
  @scala.inline
  def apply(
    address: IAddress = null,
    address_kana: IAddressKana = null,
    address_kanji: IAddressKanji = null,
    directors_provided: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    name_kana: String = null,
    name_kanji: String = null,
    owners_provided: js.UndefOr[Boolean] = js.undefined,
    phone: String = null,
    tax_id: String = null,
    tax_id_registrar: String = null,
    vat_id: String = null
  ): ICompanyCreateUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (address_kana != null) __obj.updateDynamic("address_kana")(address_kana.asInstanceOf[js.Any])
    if (address_kanji != null) __obj.updateDynamic("address_kanji")(address_kanji.asInstanceOf[js.Any])
    if (!js.isUndefined(directors_provided)) __obj.updateDynamic("directors_provided")(directors_provided.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (name_kana != null) __obj.updateDynamic("name_kana")(name_kana.asInstanceOf[js.Any])
    if (name_kanji != null) __obj.updateDynamic("name_kanji")(name_kanji.asInstanceOf[js.Any])
    if (!js.isUndefined(owners_provided)) __obj.updateDynamic("owners_provided")(owners_provided.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (tax_id != null) __obj.updateDynamic("tax_id")(tax_id.asInstanceOf[js.Any])
    if (tax_id_registrar != null) __obj.updateDynamic("tax_id_registrar")(tax_id_registrar.asInstanceOf[js.Any])
    if (vat_id != null) __obj.updateDynamic("vat_id")(vat_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompanyCreateUpdateOptions]
  }
}

