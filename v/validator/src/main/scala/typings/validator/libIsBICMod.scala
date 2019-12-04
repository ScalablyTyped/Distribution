package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isBIC", JSImport.Namespace)
@js.native
object libIsBICMod extends js.Object {
  /**
    * Check if a string is a BIC (Bank Identification Code) or SWIFT code.
    */
  def default(str: String): Boolean = js.native
}

