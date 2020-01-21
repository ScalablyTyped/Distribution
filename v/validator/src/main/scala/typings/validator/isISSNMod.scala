package typings.validator

import typings.validator.mod.validator.IsISSNOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isISSN", JSImport.Namespace)
@js.native
object isISSNMod extends js.Object {
  /**
    * Check if the string is an [ISSN](https://en.wikipedia.org/wiki/International_Standard_Serial_Number).
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: IsISSNOptions): Boolean = js.native
}

