package typings.validator

import typings.validator.mod.validator.IsFQDNOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isFQDN", JSImport.Namespace)
@js.native
object isFQDNMod extends js.Object {
  /**
    * Check if the string is a fully qualified domain name (e.g. `domain.com`).
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: IsFQDNOptions): Boolean = js.native
}

