package typings.validator

import typings.validator.ValidatorJS.IsByteLengthOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Max extends js.Object {
  def apply(str: String, min: Double): Boolean = js.native
  def apply(str: String, min: Double, max: Double): Boolean = js.native
  def apply(str: String, options: IsByteLengthOptions): Boolean = js.native
}

