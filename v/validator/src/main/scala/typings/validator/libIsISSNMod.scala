package typings.validator

import typings.validator.validatorMod.IsISSNOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isISSN", JSImport.Namespace)
@js.native
object libIsISSNMod extends js.Object {
  def default(str: String): Boolean = js.native
  def default(str: String, options: IsISSNOptions): Boolean = js.native
}

