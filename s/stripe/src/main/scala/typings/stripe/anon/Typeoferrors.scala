package typings.stripe.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.stripe.mod.Stripe.StripeRawError
import typings.stripe.mod.Stripe.errors.StripeAPIError
import typings.stripe.mod.Stripe.errors.StripeAuthenticationError
import typings.stripe.mod.Stripe.errors.StripeCardError
import typings.stripe.mod.Stripe.errors.StripeError
import typings.stripe.mod.Stripe.errors.StripeIdempotencyError
import typings.stripe.mod.Stripe.errors.StripeInvalidGrantError
import typings.stripe.mod.Stripe.errors.StripeInvalidRequestError
import typings.stripe.mod.Stripe.errors.StripeRateLimitError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoferrors extends StObject {
  
  /**
    * API errors cover any other type of problem (e.g., a temporary problem with Stripe's servers),
    * and are extremely uncommon.
    *
    * It could also be raised in the case that a new error has been introduced in the API,
    * but this version of the library doesn't know how to handle it.
    */
  var StripeAPIError: Instantiable0[typings.stripe.mod.Stripe.errors.StripeAPIError] = js.native
  
  /**
    * Failure to properly authenticate yourself in the request.
    */
  var StripeAuthenticationError: Instantiable0[typings.stripe.mod.Stripe.errors.StripeAuthenticationError] = js.native
  
  /**
    * Card errors are the most common type of error you should expect to handle.
    * They result when the user enters a card that can't be charged for some reason.
    */
  var StripeCardError: Instantiable0[typings.stripe.mod.Stripe.errors.StripeCardError] = js.native
  
  /**
    * The library cannot connect to Stripe.
    * This can happen for a variety of reasons,
    * such as loss of network connectivity or a bad TLS certificate.
    */
  var StripeConnectionError: Instantiable0[typings.stripe.mod.Stripe.errors.StripeConnectionError] = js.native
  
  var StripeError: Instantiable1[/* rawError */ StripeRawError, typings.stripe.mod.Stripe.errors.StripeError] = js.native
  
  /**
    * Idempotency errors occur when an `Idempotency-Key` is re-used on a request that does not match the first request's API endpoint and parameters.
    * @docs https://stripe.com/docs/api/idempotent_requests?lang=node
    */
  var StripeIdempotencyError: Instantiable0[typings.stripe.mod.Stripe.errors.StripeIdempotencyError] = js.native
  
  /**
    * InvalidGrantError is raised when a specified code doesn't exist, is
    * expired, has been used, or doesn't belong to you; a refresh token doesn't
    * exist, or doesn't belong to you; or if an API key's mode (live or test)
    * doesn't match the mode of a code or refresh token.
    */
  var StripeInvalidGrantError: Instantiable0[typings.stripe.mod.Stripe.errors.StripeInvalidGrantError] = js.native
  
  /**
    * Invalid request errors arise when your request has invalid parameters.
    */
  var StripeInvalidRequestError: Instantiable0[typings.stripe.mod.Stripe.errors.StripeInvalidRequestError] = js.native
  
  /**
    * Access was attempted on a resource that wasn't allowed.
    */
  var StripePermissionError: Instantiable0[typings.stripe.mod.Stripe.errors.StripePermissionError] = js.native
  
  /**
    * Too many requests hit the API too quickly.
    * @docs https://stripe.com/docs/rate-limits
    */
  var StripeRateLimitError: Instantiable0[typings.stripe.mod.Stripe.errors.StripeRateLimitError] = js.native
  
  /**
    * The signature verification for a webhook failed.
    * @docs https://stripe.com/docs/webhooks/signatures
    */
  var StripeSignatureVerificationError: Instantiable0[typings.stripe.mod.Stripe.errors.StripeSignatureVerificationError] = js.native
  
  def generate(rawError: StripeRawErrortypeRawErro): StripeError = js.native
  def generate(rawError: StripeRawErrortypeapierro): StripeAPIError = js.native
  def generate(rawError: StripeRawErrortypeauthent): StripeAuthenticationError = js.native
  def generate(rawError: StripeRawErrortypecarderr): StripeCardError = js.native
  def generate(rawError: StripeRawErrortypeidempot): StripeIdempotencyError = js.native
  def generate(rawError: StripeRawErrortypeinvalid): StripeInvalidRequestError = js.native
  def generate(rawError: StripeRawErrortypeinvalidCharge): StripeInvalidGrantError = js.native
  def generate(rawError: StripeRawErrortyperatelim): StripeRateLimitError = js.native
}
