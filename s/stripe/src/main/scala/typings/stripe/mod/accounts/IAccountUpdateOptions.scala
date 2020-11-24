package typings.stripe.mod.accounts

import typings.stripe.anon.Accountholdername
import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAccountUpdateOptions
  extends IDataOptionsWithMetadata
     with IAccountShared {
  
  /**
    * An account token, used to securely provide details to the account.
    */
  var account_token: js.UndefOr[String] = js.native
  
  /**
    * Information about the company or business.
    * This field is null unless business_type is set to company.
    */
  var company: js.UndefOr[ICompanyCreateUpdateOptions] = js.native
  
  /**
    * A card or bank account to attach to the account. You can provide either a
    * token, like the ones returned by Stripe.js, or a dictionary as documented in
    * the external_account parameter for either card or bank account creation.
    *
    * This will create a new external account object, make it the new default
    * external account for its currency, and delete the old default if one exists. If
    * you want to add additional external accounts instead of replacing the
    * existing default for this currency, use the bank account or card creation
    * API.
    */
  var external_account: js.UndefOr[Accountholdername] = js.native
  
  /**
    * Information about the person represented by the account.
    * This field is null unless business_type is set to individual.
    */
  var individual: js.UndefOr[IIndividualCreateUpdateOptions] = js.native
}
object IAccountUpdateOptions {
  
  @scala.inline
  def apply(): IAccountUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccountUpdateOptions]
  }
  
  @scala.inline
  implicit class IAccountUpdateOptionsOps[Self <: IAccountUpdateOptions] (val x: Self) extends AnyVal {
    
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
    def setAccount_token(value: String): Self = this.set("account_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount_token: Self = this.set("account_token", js.undefined)
    
    @scala.inline
    def setCompany(value: ICompanyCreateUpdateOptions): Self = this.set("company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompany: Self = this.set("company", js.undefined)
    
    @scala.inline
    def setExternal_account(value: Accountholdername): Self = this.set("external_account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal_account: Self = this.set("external_account", js.undefined)
    
    @scala.inline
    def setIndividual(value: IIndividualCreateUpdateOptions): Self = this.set("individual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndividual: Self = this.set("individual", js.undefined)
  }
}
