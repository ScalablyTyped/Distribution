package typings
package stripejsLib.stripejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeJS extends js.Object {
  /**
    * The currently used key
    */
  var _apiKey: java.lang.String = js.native
  /**
    * The mode in which the requests are currently done
    * @example 'test'
    */
  var _keyMode: java.lang.String = js.native
  /**
    * Initialization function for StripeJS
    * @see https://stripe.com/docs/stripe-js/reference#including-stripejs
    *
    * @param key - The public key of the user
    * @param [options] - Any options to configure StripeJS
    *
    * @return StripeJS instance
    */
  def apply(key: java.lang.String): StripeJS = js.native
  def apply(key: java.lang.String, options: StripeConfigOptions): StripeJS = js.native
  def createSource(data: stripejsLib.sourceMod.SourceData): js.Promise[stripejsLib.sourceMod.SourceResult] = js.native
  /**
    *  convert payment information collected by Elements into a Source object that you safely pass
    *  to your server to use in an API call
    *  @see https://stripe.com/docs/stripe-js/reference#stripe-create-source
    *
    * @param element - The element from which information should be extracted
    * @param data - An object containing the type of Source you want to create and any additional payment source information
    * NOTE: You cannot pass raw card information without an `Element`!
    *
    * @return an object containing the generated Source or an error
    */
  def createSource(element: stripejsLib.elementMod.StripeElement, data: stripejsLib.sourceMod.SourceData): js.Promise[stripejsLib.sourceMod.SourceResult] = js.native
  /**
    * to convert information collected by Elements into a single-use token that you safely pass to your server
    * to use in an API call
    * @see https://stripe.com/docs/stripe-js/reference#stripe-create-token
    *
    * @param element - The element from which the data should be extracted
    * @param [data] - an object containing additional payment information you might have collected
    *
    * @return an object containing the generated token or an error
    */
  def createToken(element: stripejsLib.elementMod.StripeElement): js.Promise[stripejsLib.tokenMod.TokenResult] = js.native
  def createToken(element: stripejsLib.elementMod.StripeElement, data: stripejsLib.tokenMod.IBANTokenData): js.Promise[stripejsLib.tokenMod.TokenResult] = js.native
  def createToken(element: stripejsLib.elementMod.StripeElement, data: stripejsLib.tokenMod.TokenData): js.Promise[stripejsLib.tokenMod.TokenResult] = js.native
  @JSName("createToken")
  def createToken_bank_account(`type`: stripejsLib.stripejsLibStrings.bank_account, data: stripejsLib.tokenMod.BankTokenData): js.Promise[stripejsLib.tokenMod.TokenResult] = js.native
  @JSName("createToken")
  def createToken_pii(`type`: stripejsLib.stripejsLibStrings.pii, data: stripejsLib.tokenMod.PiiTokenData): js.Promise[stripejsLib.tokenMod.TokenResult] = js.native
  /**
    * Create an instance of elements which can be used to manage a group of StripeJS elements
    * @see https://stripe.com/docs/stripe-js/reference#stripe-elements
    *
    * @param [options] - Configuration options for the elements object
    *
    * @return an instance of `Elements` to manage a group of elements
    */
  def elements(): stripejsLib.elementMod.ElementFactory = js.native
  def elements(options: stripejsLib.elementMod.ElementCreatorOptions): stripejsLib.elementMod.ElementFactory = js.native
  /**
    * Creates a new payment request based on the given options
    * @see https://stripe.com/docs/stripe-js/reference#stripe-payment-request
    *
    * @param options - Options that should be used to configure the payment request
    */
  def paymentRequest(options: stripejsLib.paymentMod.StripePaymentOptions): stripejsLib.paymentMod.StripePaymentRequest = js.native
  /**
    * Retrieve a Source using its unique ID and client secret
    * NOTE: The parameters are always available in any source object fetched with StripeJS
    *
    * @param id - Unique identifier of the source
    * @param client_secret - A secret available to the web client that created the Source
    *
    * @return an object containing the generated Source or an error
    */
  def retrieveSource(hasIdClient_secret: stripejsLib.Anon_Clientsecret): js.Promise[stripejsLib.sourceMod.SourceResult] = js.native
}

