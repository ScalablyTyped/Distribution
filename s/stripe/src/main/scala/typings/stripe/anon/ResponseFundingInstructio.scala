package typings.stripe.anon

import typings.stripe.mod.Stripe.FundingInstructions.BankTransfer
import typings.stripe.stripeStrings.bank_transfer
import typings.stripe.stripeStrings.funding_instructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.FundingInstructions> */
trait ResponseFundingInstructio extends StObject {
  
  var bank_transfer: BankTransfer
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency: String
  
  /**
    * The `funding_type` of the returned instructions
    */
  var funding_type: bank_transfer
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: funding_instructions
}
object ResponseFundingInstructio {
  
  inline def apply(bank_transfer: BankTransfer, currency: String, lastResponse: ApiVersion, livemode: Boolean): ResponseFundingInstructio = {
    val __obj = js.Dynamic.literal(bank_transfer = bank_transfer.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], funding_type = "bank_transfer", lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("funding_instructions")
    __obj.asInstanceOf[ResponseFundingInstructio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseFundingInstructio] (val x: Self) extends AnyVal {
    
    inline def setBank_transfer(value: BankTransfer): Self = StObject.set(x, "bank_transfer", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setFunding_type(value: bank_transfer): Self = StObject.set(x, "funding_type", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: funding_instructions): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
