package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isMACAddress", JSImport.Namespace)
@js.native
object isMACAddressMod extends js.Object {
  /**
    * Check if the string is a MAC address.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: typings.validator.mod.validator.IsMACAddressOptions): Boolean = js.native
  type IsMACAddressOptions = typings.validator.mod.validator.IsMACAddressOptions
}

