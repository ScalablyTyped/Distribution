package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isJWT", JSImport.Namespace)
@js.native
object libIsJWTMod extends js.Object {
  /**
    * Check if the string is valid JWT token.
    */
  def default(str: String): Boolean = js.native
}

