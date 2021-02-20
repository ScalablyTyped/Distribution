package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isWhitelistedMod {
  
  /**
    * Checks characters if they appear in the whitelist.
    *
    * @param chars - whitelist
    */
  @JSImport("validator/lib/isWhitelisted", JSImport.Default)
  @js.native
  def default(str: String, chars: String): Boolean = js.native
  @JSImport("validator/lib/isWhitelisted", JSImport.Default)
  @js.native
  def default(str: String, chars: js.Array[String]): Boolean = js.native
}
