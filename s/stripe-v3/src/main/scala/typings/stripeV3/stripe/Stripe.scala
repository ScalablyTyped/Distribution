package typings.stripeV3.stripe

import typings.stripeV3.anon.Owner
import typings.stripeV3.stripe.elements.Element
import typings.stripeV3.stripe.elements.Elements
import typings.stripeV3.stripe.elements.ElementsCreateOptions
import typings.stripeV3.stripe.paymentMethod.paymentMethodType
import typings.stripeV3.stripe.paymentRequest.StripePaymentRequest
import typings.stripeV3.stripe.paymentRequest.StripePaymentRequestOptions
import typings.stripeV3.stripeV3Strings.bank_account
import typings.stripeV3.stripeV3Strings.pii
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stripe extends js.Object {
  /**
    * Use stripe.confirmCardPayment when the customer submits your payment form.
    * When called, it will confirm the PaymentIntent with data you provide and
    * carry out 3DS or other next actions if they are required.
    */
  def confirmCardPayment(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
  def confirmCardPayment(clientSecret: String, data: js.UndefOr[scala.Nothing], options: ConfirmCardPaymentOptions): js.Promise[PaymentIntentResponse] = js.native
  def confirmCardPayment(clientSecret: String, data: ConfirmCardPaymentData): js.Promise[PaymentIntentResponse] = js.native
  def confirmCardPayment(clientSecret: String, data: ConfirmCardPaymentData, options: ConfirmCardPaymentOptions): js.Promise[PaymentIntentResponse] = js.native
  def confirmCardSetup(clientSecret: String): js.Promise[SetupIntentResponse] = js.native
  def confirmCardSetup(clientSecret: String, data: js.UndefOr[scala.Nothing], options: ConfirmCardSetupOptions): js.Promise[SetupIntentResponse] = js.native
  def confirmCardSetup(clientSecret: String, data: ConfirmCardSetupData): js.Promise[SetupIntentResponse] = js.native
  def confirmCardSetup(clientSecret: String, data: ConfirmCardSetupData, options: ConfirmCardSetupOptions): js.Promise[SetupIntentResponse] = js.native
  def confirmPaymentIntent(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
  /** @deprecated */
  def confirmPaymentIntent(clientSecret: String, element: Element): js.Promise[PaymentIntentResponse] = js.native
  def confirmPaymentIntent(clientSecret: String, element: Element, options: ConfirmPaymentIntentOptions): js.Promise[PaymentIntentResponse] = js.native
  def confirmPaymentIntent(clientSecret: String, options: ConfirmPaymentIntentWithoutElementsOptions): js.Promise[PaymentIntentResponse] = js.native
  def confirmSepaDebitPayment(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
  def confirmSepaDebitPayment(clientSecret: String, data: ConfirmSepaDebitPaymentData): js.Promise[PaymentIntentResponse] = js.native
  def confirmSepaDebitSetup(clientSecret: String): js.Promise[SetupIntentResponse] = js.native
  def confirmSepaDebitSetup(clientSecret: String, data: ConfirmSepaDebitSetupData): js.Promise[SetupIntentResponse] = js.native
  def createPaymentMethod(data: PaymentMethodData): js.Promise[PaymentMethodResponse] = js.native
  def createPaymentMethod(`type`: paymentMethodType, element: Element): js.Promise[PaymentMethodResponse] = js.native
  def createPaymentMethod(`type`: paymentMethodType, element: Element, options: CreatePaymentMethodOptions): js.Promise[PaymentMethodResponse] = js.native
  def createSource(element: Element): js.Promise[SourceResponse] = js.native
  def createSource(element: Element, options: Owner): js.Promise[SourceResponse] = js.native
  def createSource(options: SourceOptions): js.Promise[SourceResponse] = js.native
  def createToken(element: Element): js.Promise[TokenResponse] = js.native
  def createToken(element: Element, options: BankAccountTokenOptions): js.Promise[TokenResponse] = js.native
  def createToken(element: Element, options: TokenOptions): js.Promise[TokenResponse] = js.native
  @JSName("createToken")
  def createToken_bankaccount(name: bank_account, options: BankAccountTokenOptions): js.Promise[TokenResponse] = js.native
  @JSName("createToken")
  def createToken_pii(name: pii, options: PiiTokenOptions): js.Promise[TokenResponse] = js.native
  def elements(): Elements = js.native
  def elements(options: ElementsCreateOptions): Elements = js.native
  def handleCardAction(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
  /** @deprecated */
  def handleCardPayment(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
  /** @deprecated */
  def handleCardPayment(clientSecret: String, element: Element): js.Promise[PaymentIntentResponse] = js.native
  def handleCardPayment(clientSecret: String, element: Element, options: HandleCardPaymentOptions): js.Promise[PaymentIntentResponse] = js.native
  def handleCardPayment(clientSecret: String, options: HandleCardPaymentWithoutElementsOptions): js.Promise[PaymentIntentResponse] = js.native
  /** @deprecated */
  def handleCardSetup(clientSecret: String): js.Promise[SetupIntentResponse] = js.native
  def handleCardSetup(clientSecret: String, data: HandleCardSetupOptionsWithoutElementsOptions): js.Promise[SetupIntentResponse] = js.native
  /** @deprecated */
  def handleCardSetup(clientSecret: String, element: Element): js.Promise[SetupIntentResponse] = js.native
  def handleCardSetup(clientSecret: String, element: Element, data: HandleCardSetupOptions): js.Promise[SetupIntentResponse] = js.native
  def paymentRequest(options: StripePaymentRequestOptions): StripePaymentRequest = js.native
  // We use function overloading instead of a union here to ensure that redirectToCheckout can only be
  // called with either the server options or the client options - not a mix of both.
  def redirectToCheckout(options: StripeClientCheckoutOptions): js.Promise[StripeRedirectResponse] = js.native
  // tslint:disable-next-line unified-signatures
  def redirectToCheckout(options: StripeServerCheckoutOptions): js.Promise[StripeRedirectResponse] = js.native
  def retrievePaymentIntent(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
  def retrieveSetupIntent(clientSecret: String): js.Promise[SetupIntentResponse] = js.native
  def retrieveSource(options: RetrieveSourceOptions): js.Promise[SourceResponse] = js.native
}

