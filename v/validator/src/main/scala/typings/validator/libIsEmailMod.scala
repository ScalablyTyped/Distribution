package typings.validator

import typings.validator.validatorMod.validator.IsEmailOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isEmail", JSImport.Namespace)
@js.native
object libIsEmailMod extends js.Object {
  /**
    * Check if the string is an email.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: IsEmailOptions): Boolean = js.native
}

