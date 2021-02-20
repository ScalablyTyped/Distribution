package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blacklistMod {
  
  /******************
    *** Sanitizers ***
    ******************/
  /**
    * Remove characters that appear in the blacklist.
    *
    * @param chars - The characters are used in a `RegExp` and so you will need to escape some chars, e.g. `blacklist(input, '\\[\\]')`.
    */
  @JSImport("validator/lib/blacklist", JSImport.Default)
  @js.native
  def default(input: String, chars: String): String = js.native
}
