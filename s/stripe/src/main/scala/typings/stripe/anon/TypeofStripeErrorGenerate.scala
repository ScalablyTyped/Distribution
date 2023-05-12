package typings.stripe.anon

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
trait TypeofStripeErrorGenerate extends StObject {
  
  /* static member */
  def generate(rawError: StripeRawErrortypeRawErro): StripeError = js.native
  /* static member */
  def generate(rawError: StripeRawErrortypeapierro): StripeAPIError = js.native
  /* static member */
  def generate(rawError: StripeRawErrortypeauthent): StripeAuthenticationError = js.native
  /* static member */
  def generate(rawError: StripeRawErrortypecarderr): StripeCardError = js.native
  /* static member */
  def generate(rawError: StripeRawErrortypeidempot): StripeIdempotencyError = js.native
  /* static member */
  def generate(rawError: StripeRawErrortypeinvalid): StripeInvalidRequestError = js.native
  /* static member */
  def generate(rawError: StripeRawErrortypeinvalidCharge): StripeInvalidGrantError = js.native
  /* static member */
  def generate(rawError: StripeRawErrortyperatelim): StripeRateLimitError = js.native
}
