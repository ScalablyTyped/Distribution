package typings.validator

import typings.validator.validatorMod.IsEmptyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isEmpty", JSImport.Namespace)
@js.native
object libIsEmptyMod extends js.Object {
  def default(str: String): Boolean = js.native
  def default(str: String, options: IsEmptyOptions): Boolean = js.native
}

