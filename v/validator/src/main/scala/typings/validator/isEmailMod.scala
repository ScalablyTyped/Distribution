package typings.validator

import typings.validator.mod.validator.IsEmailOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isEmail", JSImport.Namespace)
@js.native
object isEmailMod extends js.Object {
  /**
    * Check if the string is an email.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: IsEmailOptions): Boolean = js.native
}

