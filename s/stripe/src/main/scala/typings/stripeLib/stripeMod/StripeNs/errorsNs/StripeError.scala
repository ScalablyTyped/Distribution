package typings
package stripeLib.stripeMod.StripeNs.errorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- stripeLib.stripeMod.StripeNs.IStripeError because var conflicts: message. Inlined `type`, code, param */ trait StripeError extends _Error {
  val code: js.UndefOr[java.lang.String] = js.undefined
  val detail: js.UndefOr[js.Any] = js.undefined
  val headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * The parameter the error relates to if the error is parameter-specific. You can use this to display a
    * message near the correct form field, for example.
    */
  var param: js.UndefOr[java.lang.String] = js.undefined
  val params: js.UndefOr[java.lang.String] = js.undefined
  val raw: js.Any
  val rawType: RawType
  var readonly: scala.Double
  val requestId: java.lang.String
  val `type`: java.lang.String
}

