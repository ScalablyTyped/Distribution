package typings.validator

import typings.validator.mod.validator.IsEmptyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isEmpty", JSImport.Namespace)
@js.native
object isEmptyMod extends js.Object {
  /**
    * Check if the string has a length of zero.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: IsEmptyOptions): Boolean = js.native
}

