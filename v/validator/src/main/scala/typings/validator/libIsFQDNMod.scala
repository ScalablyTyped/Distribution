package typings.validator

import typings.validator.validatorMod.IsFQDNOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isFQDN", JSImport.Namespace)
@js.native
object libIsFQDNMod extends js.Object {
  def default(str: String): Boolean = js.native
  def default(str: String, options: IsFQDNOptions): Boolean = js.native
}

