package typings.validator

import typings.validator.mod.validator.IsURLOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isURL", JSImport.Namespace)
@js.native
object isURLMod extends js.Object {
  /**
    * Check if the string is an URL.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: IsURLOptions): Boolean = js.native
}

