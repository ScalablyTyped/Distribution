package typings
package stripeLib.stripeMod.StripeNs.errorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(stripeLib.stripeMod.StripeNs.IStripeError because Would inherit conflicting mutable fields List(message))*/
trait StripeError extends _Error {
  val code: js.UndefOr[java.lang.String] = js.undefined
  val detail: js.UndefOr[js.Any] = js.undefined
  val headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  val params: js.UndefOr[java.lang.String] = js.undefined
  val raw: js.Any
  val rawType: RawType
  var readonly: scala.Double
  val requestId: java.lang.String
  val `type`: java.lang.String
}

