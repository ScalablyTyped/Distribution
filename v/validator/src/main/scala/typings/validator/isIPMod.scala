package typings.validator

import typings.validator.validatorStrings.`4`
import typings.validator.validatorStrings.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isIP", JSImport.Namespace)
@js.native
object isIPMod extends js.Object {
  /**
    * Check if the string is an IP (version 4 or 6).
    *
    * @param [version] - IP Version
    */
  def default(str: String): Boolean = js.native
  @JSName("default")
  def default_4(str: String, version: `4`): Boolean = js.native
  @JSName("default")
  def default_6(str: String, version: `6`): Boolean = js.native
}

