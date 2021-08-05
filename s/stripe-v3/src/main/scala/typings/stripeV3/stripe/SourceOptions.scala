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
  
  inline def apply(`type`: String): SourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOptions]
  }
  
  extension [Self <: SourceOptions](x: Self) {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setFlow(value: redirect | receiver | code_verification | none): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
    
    inline def setMandate(value: SourceMandate): Self = StObject.set(x, "mandate", value.asInstanceOf[js.Any])
    
    inline def setMandateUndefined: Self = StObject.set(x, "mandate", js.undefined)
    
    inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOwner(value: OwnerInfo): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRedirect(value: Returnurl): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    inline def setSepa_debit(value: Iban): Self = StObject.set(x, "sepa_debit", value.asInstanceOf[js.Any])
    
    inline def setSepa_debitUndefined: Self = StObject.set(x, "sepa_debit", js.undefined)
    
    inline def setSofort(value: Country): Self = StObject.set(x, "sofort", value.asInstanceOf[js.Any])
    
    inline def setSofortUndefined: Self = StObject.set(x, "sofort", js.undefined)
    
    inline def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
    
    inline def setStatement_descriptorUndefined: Self = StObject.set(x, "statement_descriptor", js.undefined)
    
    inline def setThree_d_secure(value: typings.stripeV3.anon.Card): Self = StObject.set(x, "three_d_secure", value.asInstanceOf[js.Any])
    
    inline def setThree_d_secureUndefined: Self = StObject.set(x, "three_d_secure", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsage(value: reusable | single_use): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
