package typings.validator

import typings.validator.validatorStrings.`10`
import typings.validator.validatorStrings.`13`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isISBN", JSImport.Namespace)
@js.native
object isISBNMod extends js.Object {
  /**
    * Check if the string is an ISBN (version 10 or 13).
    *
    * @param [version] - ISBN Version
    */
  def default(str: String): Boolean = js.native
  @JSName("default")
  def default_10(str: String, version: `10`): Boolean = js.native
  @JSName("default")
  def default_13(str: String, version: `13`): Boolean = js.native
}

