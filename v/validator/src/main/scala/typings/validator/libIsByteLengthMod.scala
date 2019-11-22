package typings.validator

import typings.validator.validatorMod.IsByteLengthOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isByteLength", JSImport.Namespace)
@js.native
object libIsByteLengthMod extends js.Object {
  def default(str: String): Boolean = js.native
  def default(str: String, options: IsByteLengthOptions): Boolean = js.native
}

