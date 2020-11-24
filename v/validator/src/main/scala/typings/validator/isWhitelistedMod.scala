package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/isWhitelisted", JSImport.Namespace)
@js.native
object isWhitelistedMod extends js.Object {
  
  /**
    * Checks characters if they appear in the whitelist.
    *
    * @param chars - whitelist
    */
  def default(str: String, chars: String): Boolean = js.native
  def default(str: String, chars: js.Array[String]): Boolean = js.native
}
