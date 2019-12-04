package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isLatLong", JSImport.Namespace)
@js.native
object libIsLatLongMod extends js.Object {
  /**
    * Check if the string is a valid latitude-longitude coordinate in the format:
    *
    * `lat,long` or `lat, long`.
    */
  def default(str: String): Boolean = js.native
}

