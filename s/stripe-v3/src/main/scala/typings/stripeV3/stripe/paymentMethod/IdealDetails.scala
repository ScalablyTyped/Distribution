package typings.stripeV3.stripe.paymentMethod

import typings.stripeV3.stripeV3Strings.abn_amro
import typings.stripeV3.stripeV3Strings.asn_bank
import typings.stripeV3.stripeV3Strings.bunq
import typings.stripeV3.stripeV3Strings.handelsbanken
import typings.stripeV3.stripeV3Strings.ing
import typings.stripeV3.stripeV3Strings.knab
import typings.stripeV3.stripeV3Strings.moneyou
import typings.stripeV3.stripeV3Strings.rabobank
import typings.stripeV3.stripeV3Strings.regiobank
import typings.stripeV3.stripeV3Strings.sns_bank
import typings.stripeV3.stripeV3Strings.triodos_bank
import typings.stripeV3.stripeV3Strings.van_lanschot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdealDetails extends StObject {
  
  var bank: abn_amro | asn_bank | bunq | handelsbanken | ing | knab | moneyou | rabobank | regiobank | sns_bank | triodos_bank | van_lanschot
  
  var bic: String
  
  var iban_last4: String
  
  var verified_name: String
}
object IdealDetails {
  
  @scala.inline
  def apply(
    bank: abn_amro | asn_bank | bunq | handelsbanken | ing | knab | moneyou | rabobank | regiobank | sns_bank | triodos_bank | van_lanschot,
    bic: String,
    iban_last4: String,
    verified_name: String
  ): IdealDetails = {
    val __obj = js.Dynamic.literal(bank = bank.asInstanceOf[js.Any], bic = bic.asInstanceOf[js.Any], iban_last4 = iban_last4.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdealDetails]
  }
  
  @scala.inline
  implicit class IdealDetailsMutableBuilder[Self <: IdealDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBank(
      value: abn_amro | asn_bank | bunq | handelsbanken | ing | knab | moneyou | rabobank | regiobank | sns_bank | triodos_bank | van_lanschot
    ): Self = StObject.set(x, "bank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBic(value: String): Self = StObject.set(x, "bic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIban_last4(value: String): Self = StObject.set(x, "iban_last4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_name(value: String): Self = StObject.set(x, "verified_name", value.asInstanceOf[js.Any])
  }
}
