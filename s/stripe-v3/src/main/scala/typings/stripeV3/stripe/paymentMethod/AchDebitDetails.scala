package typings.stripeV3.stripe.paymentMethod

import typings.stripeV3.stripeV3Strings.company
import typings.stripeV3.stripeV3Strings.individual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AchDebitDetails extends StObject {
  
  var account_holder_type: individual | company
  
  var bank_name: String
  
  var country: String
  
  var fingerprint: String
  
  var last4: String
  
  var routing_number: String
}
object AchDebitDetails {
  
  @scala.inline
  def apply(
    account_holder_type: individual | company,
    bank_name: String,
    country: String,
    fingerprint: String,
    last4: String,
    routing_number: String
  ): AchDebitDetails = {
    val __obj = js.Dynamic.literal(account_holder_type = account_holder_type.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[AchDebitDetails]
  }
  
  @scala.inline
  implicit class AchDebitDetailsMutableBuilder[Self <: AchDebitDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount_holder_type(value: individual | company): Self = StObject.set(x, "account_holder_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBank_name(value: String): Self = StObject.set(x, "bank_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouting_number(value: String): Self = StObject.set(x, "routing_number", value.asInstanceOf[js.Any])
  }
}
