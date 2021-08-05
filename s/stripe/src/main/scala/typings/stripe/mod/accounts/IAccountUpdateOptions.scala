package typings.stripe.mod.accounts

import typings.stripe.anon.Accountholdername
import typings.stripe.mod.IDataOptionsWithMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccountUpdateOptions
  extends StObject
     with IDataOptionsWithMetadata
     with IAccountShared {
  
  /**
    * An account token, used to securely provide details to the account.
    */
  var account_token: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the company or business.
    * This field is null unless business_type is set to company.
    */
  var company: js.UndefOr[ICompanyCreateUpdateOptions] = js.undefined
  
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
  var external_account: js.UndefOr[Accountholdername] = js.undefined
  
  /**
    * Information about the person represented by the account.
    * This field is null unless business_type is set to individual.
    */
  var individual: js.UndefOr[IIndividualCreateUpdateOptions] = js.undefined
}
object IAccountUpdateOptions {
  
  inline def apply(): IAccountUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccountUpdateOptions]
  }
  
  extension [Self <: IAccountUpdateOptions](x: Self) {
    
    inline def setAccount_token(value: String): Self = StObject.set(x, "account_token", value.asInstanceOf[js.Any])
    
    inline def setAccount_tokenUndefined: Self = StObject.set(x, "account_token", js.undefined)
    
    inline def setCompany(value: ICompanyCreateUpdateOptions): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    inline def setExternal_account(value: Accountholdername): Self = StObject.set(x, "external_account", value.asInstanceOf[js.Any])
    
    inline def setExternal_accountUndefined: Self = StObject.set(x, "external_account", js.undefined)
    
    inline def setIndividual(value: IIndividualCreateUpdateOptions): Self = StObject.set(x, "individual", value.asInstanceOf[js.Any])
    
    inline def setIndividualUndefined: Self = StObject.set(x, "individual", js.undefined)
  }
}
