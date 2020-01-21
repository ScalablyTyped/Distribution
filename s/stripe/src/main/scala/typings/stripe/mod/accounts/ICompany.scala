package typings.stripe.mod.accounts

import typings.stripe.mod.IAddress
import typings.stripe.mod.IAddressKana
import typings.stripe.mod.IAddressKanji
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompany extends ICompanyShared {
  /**
    * Whether the company’s business ID number was provided.
    */
  var tax_id_provided: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the company’s business VAT number was provided.
    */
  var vat_id_provided: js.UndefOr[Boolean] = js.undefined
}

object ICompany {
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
    tax_id_provided: js.UndefOr[Boolean] = js.undefined,
    tax_id_registrar: String = null,
    vat_id_provided: js.UndefOr[Boolean] = js.undefined
  ): ICompany = {
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
    if (!js.isUndefined(tax_id_provided)) __obj.updateDynamic("tax_id_provided")(tax_id_provided.asInstanceOf[js.Any])
    if (tax_id_registrar != null) __obj.updateDynamic("tax_id_registrar")(tax_id_registrar.asInstanceOf[js.Any])
    if (!js.isUndefined(vat_id_provided)) __obj.updateDynamic("vat_id_provided")(vat_id_provided.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompany]
  }
}

