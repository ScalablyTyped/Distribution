package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/isLatLong", JSImport.Namespace)
@js.native
object isLatLongMod extends js.Object {
  
  /**
    * Check if the string is a valid latitude-longitude coordinate in the format:
    *
    * `lat,long` or `lat, long`.
    */
  def default(str: String): Boolean = js.native
}
