package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isUUID", JSImport.Namespace)
@js.native
object isUUIDMod extends js.Object {
  /**
    * Check if the string is a UUID (version 3, 4 or 5).
    *
    * @param [version="all"] - UUID version
    */
  def default(str: String): Boolean = js.native
  def default(str: String, version: typings.validator.mod.validator.UUIDVersion): Boolean = js.native
  type UUIDVersion = typings.validator.mod.validator.UUIDVersion
}

