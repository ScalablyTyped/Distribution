package typings.stripe.stripeMod.errors

import org.scalablytyped.runtime.StringDictionary
import typings.stripe.stripeMod.paymentIntents.IPaymentIntent
import typings.stripe.stripeMod.paymentMethods.IPaymentMethod
import typings.stripe.stripeMod.setupIntents.ISetupIntent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.stripe.stripeMod.IStripeError because var conflicts: message. Inlined `type`, code, param */ @JSImport("stripe", "errors.StripeError")
@js.native
abstract class StripeError () extends _Error {
  val charge: js.UndefOr[String] = js.native
  val code: js.UndefOr[String] = js.native
  val decline_code: js.UndefOr[String] = js.native
  val detail: js.UndefOr[js.Any] = js.native
  val headers: StringDictionary[String] = js.native
  /**
    * The parameter the error relates to if the error is parameter-specific. You can use this to display a
    * message near the correct form field, for example.
    */
  var param: js.UndefOr[String] = js.native
  val params: js.UndefOr[String] = js.native
  val payment_intent: js.UndefOr[IPaymentIntent] = js.native
  val payment_method: js.UndefOr[IPaymentMethod] = js.native
  val raw: js.Any = js.native
  val rawType: RawType = js.native
  val requestId: String = js.native
  val setup_intent: js.UndefOr[ISetupIntent] = js.native
  val source: js.UndefOr[typings.stripe.stripeMod.sources.ISource] = js.native
  val statusCode: js.UndefOr[Double] = js.native
  val `type`: String = js.native
}

/* static members */
@JSImport("stripe", "errors.StripeError")
@js.native
object StripeError extends js.Object {
  def populate(`type`: RawType): StripeError = js.native
}

