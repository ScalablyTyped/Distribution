package typings.validator

import typings.validator.validatorMod.IsMACAddressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isMACAddress", JSImport.Namespace)
@js.native
object libIsMACAddressMod extends js.Object {
  def default(str: String): Boolean = js.native
  def default(str: String, options: IsMACAddressOptions): Boolean = js.native
}

