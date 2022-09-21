package typings.stripe.anon

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
trait TypeofStripeError extends StObject {
  
  /* static member */
  def generate(rawError: StripeRawError & TypeRawErrorType): StripeError = js.native
  /* static member */
  def generate(rawError: StripeRawError & Type): StripeCardError = js.native
  /* static member */
  def generate(rawError: StripeRawError & `4`): StripeIdempotencyError = js.native
  /* static member */
  def generate(rawError: StripeRawError & `3`): StripeRateLimitError = js.native
  /* static member */
  def generate(rawError: StripeRawError & `0`): StripeInvalidRequestError = js.native
  /* static member */
  def generate(rawError: StripeRawError & `5`): StripeInvalidGrantError = js.native
  /* static member */
  def generate(rawError: StripeRawError & `2`): StripeAuthenticationError = js.native
  /* static member */
  def generate(rawError: StripeRawError & `1`): StripeAPIError = js.native
}
