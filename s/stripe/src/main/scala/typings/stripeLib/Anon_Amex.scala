package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amex extends js.Object {
  /**
    * Card brand. Can be `amex`, `diners`, `discover`, `jcb`, `mastercard`, `unionpay`, `visa`, or `unknown`.
    */
  var brand: stripeLib.stripeLibStrings.amex | stripeLib.stripeLibStrings.diner | stripeLib.stripeLibStrings.discover | stripeLib.stripeLibStrings.jcb | stripeLib.stripeLibStrings.mastercard | stripeLib.stripeLibStrings.unionpay | stripeLib.stripeLibStrings.visa | stripeLib.stripeLibStrings.unknown
  /**
    * Check results by Card networks on Card address and CVC at time of payment.
    */
  var checks: Anon_Addressline1check
  /**
    * Two-letter ISO code representing the country of the card. You could use this attribute to get a sense of
    * the international breakdown of cards you’ve collected.
    */
  var country: java.lang.String
  /**
    * Two-digit number representing the card’s expiration month.
    */
  var exp_month: scala.Double
  /**
    * Four-digit number representing the card’s expiration year.
    */
  var exp_year: scala.Double
  /**
    * Uniquely identifies this particular card number. You can use this attribute to check whether two
    * customers who’ve signed up with you are using the same card number, for example.
    */
  var fingerprint: java.lang.String
  /**
    * Card funding type. Can be credit, debit, prepaid, or unknown.
    */
  var funding: stripeLib.stripeLibStrings.credit | stripeLib.stripeLibStrings.debit | stripeLib.stripeLibStrings.prepaid | stripeLib.stripeLibStrings.unknown
  /**
    * The last four digits of the card.
    */
  var last4: scala.Double
  /**
    * Populated if this transaction used 3D Secure authentication.
    */
  var three_d_secure: js.UndefOr[Anon_Authenticated] = js.undefined
  /**
    * If this Card is part of a card wallet, this contains the details of the card wallet.
    */
  var wallet: js.UndefOr[Anon_Amexexpresscheckout] = js.undefined
}

object Anon_Amex {
  @scala.inline
  def apply(
    brand: stripeLib.stripeLibStrings.amex | stripeLib.stripeLibStrings.diner | stripeLib.stripeLibStrings.discover | stripeLib.stripeLibStrings.jcb | stripeLib.stripeLibStrings.mastercard | stripeLib.stripeLibStrings.unionpay | stripeLib.stripeLibStrings.visa | stripeLib.stripeLibStrings.unknown,
    checks: Anon_Addressline1check,
    country: java.lang.String,
    exp_month: scala.Double,
    exp_year: scala.Double,
    fingerprint: java.lang.String,
    funding: stripeLib.stripeLibStrings.credit | stripeLib.stripeLibStrings.debit | stripeLib.stripeLibStrings.prepaid | stripeLib.stripeLibStrings.unknown,
    last4: scala.Double,
    three_d_secure: Anon_Authenticated = null,
    wallet: Anon_Amexexpresscheckout = null
  ): Anon_Amex = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], checks = checks, country = country, exp_month = exp_month, exp_year = exp_year, fingerprint = fingerprint, funding = funding.asInstanceOf[js.Any], last4 = last4)
    if (three_d_secure != null) __obj.updateDynamic("three_d_secure")(three_d_secure)
    if (wallet != null) __obj.updateDynamic("wallet")(wallet)
    __obj.asInstanceOf[Anon_Amex]
  }
}

