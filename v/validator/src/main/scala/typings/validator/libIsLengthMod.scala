package typings.validator

import typings.validator.validatorMod.IsLengthOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isLength", JSImport.Namespace)
@js.native
object libIsLengthMod extends js.Object {
  def default(str: String): Boolean = js.native
  def default(str: String, options: IsLengthOptions): Boolean = js.native
}

