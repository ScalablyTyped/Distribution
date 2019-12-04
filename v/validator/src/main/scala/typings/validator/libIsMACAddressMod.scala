package typings.validator

import typings.validator.validatorMod.validator.IsMACAddressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isMACAddress", JSImport.Namespace)
@js.native
object libIsMACAddressMod extends js.Object {
  /**
    * Check if the string is a MAC address.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: IsMACAddressOptions): Boolean = js.native
}

