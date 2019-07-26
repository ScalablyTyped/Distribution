package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BrandChecks extends js.Object {
  /** Card brand. Can be `amex`, `diners`, `discover`, `jcb`, `mastercard`, `unionpay`, `visa`, or `unknown`. */
  var brand: stripeLib.stripeMod.paymentMethodsNs.CardBrand
  /** Check results by Card networks on Card address and CVC at time of payment. */
  var checks: stripeLib.stripeMod.paymentMethodsNs.CardChecks
  /**
    * Two-letter ISO code representing the country of the card. You could use this attribute to get a sense of
    * the international breakdown of cards you’ve collected.
    */
  var country: java.lang.String
  /** Two-digit number representing the card’s expiration month. */
  var exp_month: scala.Double
  /** Four-digit number representing the card’s expiration year. */
  var exp_year: scala.Double
  /**
    * Uniquely identifies this particular card number. You can use this attribute to check whether two
    * customers who’ve signed up with you are using the same card number, for example.
    */
  var fingerprint: java.lang.String
  /** Card funding type. Can be credit, debit, prepaid, or unknown. */
  var funding: stripeLib.stripeLibStrings.credit | stripeLib.stripeLibStrings.debit | stripeLib.stripeLibStrings.prepaid | stripeLib.stripeLibStrings.unknown
  /** Details of the original PaymentMethod that created this object. */
  var generated_from: scala.Null | Anon_Charge
  /** The last four digits of the card. */
  var last4: java.lang.String
  /** Contains details on how this Card may be be used for 3D Secure authentication. */
  var three_d_secure_usage: Anon_Supported
  /** If this Card is part of a card wallet, this contains the details of the card wallet. */
  var wallet: scala.Null | stripeLib.stripeMod.paymentMethodsNs.CardWallet
}

object Anon_BrandChecks {
  @scala.inline
  def apply(
    brand: stripeLib.stripeMod.paymentMethodsNs.CardBrand,
    checks: stripeLib.stripeMod.paymentMethodsNs.CardChecks,
    country: java.lang.String,
    exp_month: scala.Double,
    exp_year: scala.Double,
    fingerprint: java.lang.String,
    funding: stripeLib.stripeLibStrings.credit | stripeLib.stripeLibStrings.debit | stripeLib.stripeLibStrings.prepaid | stripeLib.stripeLibStrings.unknown,
    last4: java.lang.String,
    three_d_secure_usage: Anon_Supported,
    generated_from: Anon_Charge = null,
    wallet: stripeLib.stripeMod.paymentMethodsNs.CardWallet = null
  ): Anon_BrandChecks = {
    val __obj = js.Dynamic.literal(brand = brand, checks = checks, country = country, exp_month = exp_month, exp_year = exp_year, fingerprint = fingerprint, funding = funding.asInstanceOf[js.Any], last4 = last4, three_d_secure_usage = three_d_secure_usage)
    if (generated_from != null) __obj.updateDynamic("generated_from")(generated_from)
    if (wallet != null) __obj.updateDynamic("wallet")(wallet)
    __obj.asInstanceOf[Anon_BrandChecks]
  }
}

