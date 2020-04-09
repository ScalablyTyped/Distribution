package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isIBAN", JSImport.Namespace)
@js.native
object isIBANMod extends js.Object {
  /**
    * Check if a string is a IBAN (International Bank Account Number).
    */
  def default(str: String): Boolean = js.native
}

