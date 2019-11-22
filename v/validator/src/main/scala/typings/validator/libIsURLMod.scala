package typings.validator

import typings.validator.validatorMod.IsURLOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isURL", JSImport.Namespace)
@js.native
object libIsURLMod extends js.Object {
  def default(str: String): Boolean = js.native
  def default(str: String, options: IsURLOptions): Boolean = js.native
}

