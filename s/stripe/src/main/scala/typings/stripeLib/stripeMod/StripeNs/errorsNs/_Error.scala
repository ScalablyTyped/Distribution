package typings
package stripeLib.stripeMod.StripeNs.errorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Error
  extends nodeLib.Error {
  val message: java.lang.String
}

object _Error {
  @scala.inline
  def apply(message: java.lang.String, stack: java.lang.String = null): _Error = {
    val __obj = js.Dynamic.literal(message = message)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[_Error]
  }
}

