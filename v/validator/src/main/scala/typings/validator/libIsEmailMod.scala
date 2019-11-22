package typings.validator

import typings.validator.validatorMod.IsEmailOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isEmail", JSImport.Namespace)
@js.native
object libIsEmailMod extends js.Object {
  def default(str: String): Boolean = js.native
  def default(str: String, options: IsEmailOptions): Boolean = js.native
}

