package typings.stripeV3.stripe.paymentMethod

import typings.stripeV3.anon.Addressline1check
import typings.stripeV3.anon.Amexexpresscheckout
import typings.stripeV3.anon.Charge
import typings.stripeV3.anon.Supported
import typings.stripeV3.stripe.fundingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentMethodCard extends js.Object {
  /**
    * Card brand
    */
  var brand: paymentMethodCardBrand = js.native
  /**
    * Checks on Card address and CVC if provided.
    */
  var checks: Addressline1check = js.native
  /**
    * Two-letter ISO code representing the country of the card. You
    * could use this attribute to get a sense of the international
    * breakdown of cards you’ve collected.
    */
  var country: String = js.native
  /**
    * Two-digit number representing the card’s expiration month.
    */
  var exp_month: Double = js.native
  /**
    * Four-digit number representing the card’s expiration year.
    */
  var exp_year: Double = js.native
  /**
    * Uniquely identifies this particular card number. You can use
    * this attribute to check whether two customers who’ve signed
    * up with you are using the same card number, for example.
    */
  var fingerprint: String = js.native
  /**
    * Card funding type
    */
  var funding: fundingType = js.native
  /**
    * Details of the original PaymentMethod that created this object.
    */
  var generated_from: Charge = js.native
  /**
    * The last four digits of the card.
    */
  var last4: String = js.native
  /**
    * Contains details on how this Card maybe be used for 3D Secure authentication.
    */
  var three_d_secure_usage: js.UndefOr[Supported] = js.native
  /**
    * If this Card is part of a card wallet, this contains the details of
    * the card wallet.
    */
  var wallet: Amexexpresscheckout | Null = js.native
}

object PaymentMethodCard {
  @scala.inline
  def apply(
    brand: paymentMethodCardBrand,
    checks: Addressline1check,
    country: String,
    exp_month: Double,
    exp_year: Double,
    fingerprint: String,
    funding: fundingType,
    generated_from: Charge,
    last4: String
  ): PaymentMethodCard = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], generated_from = generated_from.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodCard]
  }
  @scala.inline
  implicit class PaymentMethodCardOps[Self <: PaymentMethodCard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBrand(value: paymentMethodCardBrand): Self = this.set("brand", value.asInstanceOf[js.Any])
    @scala.inline
    def setChecks(value: Addressline1check): Self = this.set("checks", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setExp_month(value: Double): Self = this.set("exp_month", value.asInstanceOf[js.Any])
    @scala.inline
    def setExp_year(value: Double): Self = this.set("exp_year", value.asInstanceOf[js.Any])
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunding(value: fundingType): Self = this.set("funding", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenerated_from(value: Charge): Self = this.set("generated_from", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast4(value: String): Self = this.set("last4", value.asInstanceOf[js.Any])
    @scala.inline
    def setThree_d_secure_usage(value: Supported): Self = this.set("three_d_secure_usage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThree_d_secure_usage: Self = this.set("three_d_secure_usage", js.undefined)
    @scala.inline
    def setWallet(value: Amexexpresscheckout): Self = this.set("wallet", value.asInstanceOf[js.Any])
    @scala.inline
    def setWalletNull: Self = this.set("wallet", null)
  }
  
}

