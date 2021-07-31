package typings.stripeV3.stripe

import typings.stripeV3.anon.Country
import typings.stripeV3.anon.Iban
import typings.stripeV3.anon.Returnurl
import typings.stripeV3.stripeV3Strings.code_verification
import typings.stripeV3.stripeV3Strings.none
import typings.stripeV3.stripeV3Strings.receiver
import typings.stripeV3.stripeV3Strings.redirect
import typings.stripeV3.stripeV3Strings.reusable
import typings.stripeV3.stripeV3Strings.single_use
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceOptions extends StObject {
  
  var amount: js.UndefOr[Double] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var flow: js.UndefOr[redirect | receiver | code_verification | none] = js.undefined
  
  var mandate: js.UndefOr[SourceMandate] = js.undefined
  
  var metadata: js.UndefOr[js.Object] = js.undefined
  
  var owner: js.UndefOr[OwnerInfo] = js.undefined
  
  var redirect: js.UndefOr[Returnurl] = js.undefined
  
  var sepa_debit: js.UndefOr[Iban] = js.undefined
  
  var sofort: js.UndefOr[Country] = js.undefined
  
  var statement_descriptor: js.UndefOr[String] = js.undefined
  
  var three_d_secure: js.UndefOr[typings.stripeV3.anon.Card] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
  
  var `type`: String
  
  var usage: js.UndefOr[reusable | single_use] = js.undefined
}
object SourceOptions {
  
  @scala.inline
  def apply(`type`: String): SourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOptions]
  }
  
  @scala.inline
  implicit class SourceOptionsMutableBuilder[Self <: SourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setFlow(value: redirect | receiver | code_verification | none): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
    
    @scala.inline
    def setMandate(value: SourceMandate): Self = StObject.set(x, "mandate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMandateUndefined: Self = StObject.set(x, "mandate", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setOwner(value: OwnerInfo): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setRedirect(value: Returnurl): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    @scala.inline
    def setSepa_debit(value: Iban): Self = StObject.set(x, "sepa_debit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSepa_debitUndefined: Self = StObject.set(x, "sepa_debit", js.undefined)
    
    @scala.inline
    def setSofort(value: Country): Self = StObject.set(x, "sofort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSofortUndefined: Self = StObject.set(x, "sofort", js.undefined)
    
    @scala.inline
    def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement_descriptorUndefined: Self = StObject.set(x, "statement_descriptor", js.undefined)
    
    @scala.inline
    def setThree_d_secure(value: typings.stripeV3.anon.Card): Self = StObject.set(x, "three_d_secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThree_d_secureUndefined: Self = StObject.set(x, "three_d_secure", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsage(value: reusable | single_use): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
