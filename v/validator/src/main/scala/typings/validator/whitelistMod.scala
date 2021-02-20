package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object whitelistMod {
  
  /**
    * Remove characters that do not appear in the whitelist.
    *
    * @param chars - The characters are used in a `RegExp` and so you will need to escape some chars, e.g. `whitelist(input, '\\[\\]')`.
    */
  @JSImport("validator/lib/whitelist", JSImport.Default)
  @js.native
  def default(input: String, chars: String): String = js.native
}
