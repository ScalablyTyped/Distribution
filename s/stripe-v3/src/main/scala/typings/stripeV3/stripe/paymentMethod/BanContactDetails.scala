package typings.stripeV3.stripe.paymentMethod

import typings.stripeV3.stripeV3Strings.de
import typings.stripeV3.stripeV3Strings.en
import typings.stripeV3.stripeV3Strings.fr
import typings.stripeV3.stripeV3Strings.nl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BanContactDetails extends StObject {
  
  var bank_code: String = js.native
  
  var bank_name: String = js.native
  
  var bic: String = js.native
  
  var iban_last4: String = js.native
  
  var preferred_language: en | de | fr | nl = js.native
  
  var verified_name: String = js.native
}
object BanContactDetails {
  
  @scala.inline
  def apply(
    bank_code: String,
    bank_name: String,
    bic: String,
    iban_last4: String,
    preferred_language: en | de | fr | nl,
    verified_name: String
  ): BanContactDetails = {
    val __obj = js.Dynamic.literal(bank_code = bank_code.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], bic = bic.asInstanceOf[js.Any], iban_last4 = iban_last4.asInstanceOf[js.Any], preferred_language = preferred_language.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BanContactDetails]
  }
  
  @scala.inline
  implicit class BanContactDetailsMutableBuilder[Self <: BanContactDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBank_code(value: String): Self = StObject.set(x, "bank_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBank_name(value: String): Self = StObject.set(x, "bank_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBic(value: String): Self = StObject.set(x, "bic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIban_last4(value: String): Self = StObject.set(x, "iban_last4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferred_language(value: en | de | fr | nl): Self = StObject.set(x, "preferred_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_name(value: String): Self = StObject.set(x, "verified_name", value.asInstanceOf[js.Any])
  }
}
