package typings.stripe.mod.accounts

import typings.stripe.anon.Branding
import typings.stripe.anon.Date
import typings.stripe.anon.Mcc
import typings.stripe.stripeStrings.company
import typings.stripe.stripeStrings.individual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAccountShared extends StObject {
  
  /**
    * Optional information related to the business.
    */
  var business_profile: js.UndefOr[Mcc] = js.native
  
  /**
    * The business type. Can be individual or company.
    */
  var business_type: js.UndefOr[individual | company] = js.native
  
  /**
    * Three-letter ISO currency code representing the default currency for the
    * account. This must be a currency that Stripe supports in the account’s
    * country.
    */
  var default_currency: js.UndefOr[String] = js.native
  
  /**
    * Email address of the account holder. For standalone accounts, this is used
    * to email them asking them to claim their Stripe account. For managed
    * accounts, this is only to make the account easier to identify to you: Stripe
    * will not email the account holder.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * Internal-only description of the product being sold or service being
    * provided by this account. It’s used by Stripe for risk and underwriting
    * purposes.
    */
  var product_description: js.UndefOr[String] = js.native
  
  /**
    * The set of capabilities you want to unlock for this account (US only).
    * Each capability will be inactive until you have provided its specific
    * requirements and Stripe has verified them. An account may have some of
    * its requested capabilities be active and some be inactive.
    */
  var requested_capabilities: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Account options for customizing how the account functions within Stripe.
    */
  var settings: js.UndefOr[Branding] = js.native
  
  /**
    * Details on who accepted the Stripe terms of service, and when they
    * accepted it. See our updating managed accounts guide for more
    * information
    */
  var tos_acceptance: js.UndefOr[Date] = js.native
}
object IAccountShared {
  
  @scala.inline
  def apply(): IAccountShared = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccountShared]
  }
  
  @scala.inline
  implicit class IAccountSharedMutableBuilder[Self <: IAccountShared] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusiness_profile(value: Mcc): Self = StObject.set(x, "business_profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusiness_profileUndefined: Self = StObject.set(x, "business_profile", js.undefined)
    
    @scala.inline
    def setBusiness_type(value: individual | company): Self = StObject.set(x, "business_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusiness_typeUndefined: Self = StObject.set(x, "business_type", js.undefined)
    
    @scala.inline
    def setDefault_currency(value: String): Self = StObject.set(x, "default_currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_currencyUndefined: Self = StObject.set(x, "default_currency", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setProduct_description(value: String): Self = StObject.set(x, "product_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct_descriptionUndefined: Self = StObject.set(x, "product_description", js.undefined)
    
    @scala.inline
    def setRequested_capabilities(value: js.Array[String]): Self = StObject.set(x, "requested_capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequested_capabilitiesUndefined: Self = StObject.set(x, "requested_capabilities", js.undefined)
    
    @scala.inline
    def setRequested_capabilitiesVarargs(value: String*): Self = StObject.set(x, "requested_capabilities", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: Branding): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    @scala.inline
    def setTos_acceptance(value: Date): Self = StObject.set(x, "tos_acceptance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTos_acceptanceUndefined: Self = StObject.set(x, "tos_acceptance", js.undefined)
  }
}
