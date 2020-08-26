package typings.stripe.mod.accounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompanyCreateUpdateOptions extends ICompanyShared {
  /**
    * The business ID number of the company, as appropriate for the company’s country.
    * (Examples are an Employer ID Number in the U.S., a Business Number in Canada, or a
    * Company Number in the UK.) This can be unset by updating the value to null and then saving.
    */
  var tax_id: js.UndefOr[String] = js.native
  /**
    * The VAT number of the company.
    * This can be unset by updating the value to null and then saving.
    */
  var vat_id: js.UndefOr[String] = js.native
}

object ICompanyCreateUpdateOptions {
  @scala.inline
  def apply(): ICompanyCreateUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompanyCreateUpdateOptions]
  }
  @scala.inline
  implicit class ICompanyCreateUpdateOptionsOps[Self <: ICompanyCreateUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTax_id(value: String): Self = this.set("tax_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax_id: Self = this.set("tax_id", js.undefined)
    @scala.inline
    def setVat_id(value: String): Self = this.set("vat_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVat_id: Self = this.set("vat_id", js.undefined)
  }
  
}

