package typings.validator

import typings.validator.validatorBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/normalizeEmail", JSImport.Namespace)
@js.native
object normalizeEmailMod extends js.Object {
  /**
    * Canonicalizes an email address. (This doesn't validate that the input is an email, if you want to validate the email use `isEmail` beforehand)
    *
    * @param [options] - Options
    */
  def default(email: String): String | `false` = js.native
  def default(email: String, options: typings.validator.mod.validator.NormalizeEmailOptions): String | `false` = js.native
  type NormalizeEmailOptions = typings.validator.mod.validator.NormalizeEmailOptions
}

