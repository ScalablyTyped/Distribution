package typings.validator

import typings.validator.ValidatorJSNs.IsLengthOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_MaxMin extends js.Object {
  def apply(str: String, min: Double): Boolean = js.native
  def apply(str: String, min: Double, max: Double): Boolean = js.native
  def apply(str: String, options: IsLengthOptions): Boolean = js.native
}

