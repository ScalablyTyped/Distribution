package typings.stripe.anon

import typings.stripe.mod.paymentMethods.CardBrand
import typings.stripe.mod.paymentMethods.CardChecks
import typings.stripe.mod.paymentMethods.CardWallet
import typings.stripe.stripeStrings.credit
import typings.stripe.stripeStrings.debit
import typings.stripe.stripeStrings.prepaid
import typings.stripe.stripeStrings.unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checks extends StObject {
  
  /** Card brand. Can be `amex`, `diners`, `discover`, `jcb`, `mastercard`, `unionpay`, `visa`, or `unknown`. */
  var brand: CardBrand
  
  /** Check results by Card networks on Card address and CVC at time of payment. */
  var checks: CardChecks
  
  /**
    * Two-letter ISO code representing the country of the card. You could use this attribute to get a sense of
    * the international breakdown of cards you’ve collected.
    */
  var country: String
  
  /** Two-digit number representing the card’s expiration month. */
  var exp_month: Double
  
  /** Four-digit number representing the card’s expiration year. */
  var exp_year: Double
  
  /**
    * Uniquely identifies this particular card number. You can use this attribute to check whether two
    * customers who’ve signed up with you are using the same card number, for example.
    */
  var fingerprint: String
  
  /** Card funding type. Can be credit, debit, prepaid, or unknown. */
  var funding: credit | debit | prepaid | unknown_
  
  /** Details of the original PaymentMethod that created this object. */
  var generated_from: Null | Charge
  
  /** The last four digits of the card. */
  var last4: String
  
  /** Contains details on how this Card may be be used for 3D Secure authentication. */
  var three_d_secure_usage: Supported
  
  /** If this Card is part of a card wallet, this contains the details of the card wallet. */
  var wallet: Null | CardWallet
}
object Checks {
  
  inline def apply(
    brand: CardBrand,
    checks: CardChecks,
    country: String,
    exp_month: Double,
    exp_year: Double,
    fingerprint: String,
    funding: credit | debit | prepaid | unknown_,
    last4: String,
    three_d_secure_usage: Supported
  ): Checks = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], three_d_secure_usage = three_d_secure_usage.asInstanceOf[js.Any], generated_from = null, wallet = null)
    __obj.asInstanceOf[Checks]
  }
  
  extension [Self <: Checks](x: Self) {
    
    inline def setBrand(value: CardBrand): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setChecks(value: CardChecks): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
    
    inline def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFunding(value: credit | debit | prepaid | unknown_): Self = StObject.set(x, "funding", value.asInstanceOf[js.Any])
    
    inline def setGenerated_from(value: Charge): Self = StObject.set(x, "generated_from", value.asInstanceOf[js.Any])
    
    inline def setGenerated_fromNull: Self = StObject.set(x, "generated_from", null)
    
    inline def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
    
    inline def setThree_d_secure_usage(value: Supported): Self = StObject.set(x, "three_d_secure_usage", value.asInstanceOf[js.Any])
    
    inline def setWallet(value: CardWallet): Self = StObject.set(x, "wallet", value.asInstanceOf[js.Any])
    
    inline def setWalletNull: Self = StObject.set(x, "wallet", null)
  }
}
