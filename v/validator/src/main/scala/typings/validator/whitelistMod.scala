package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/whitelist", JSImport.Namespace)
@js.native
object whitelistMod extends js.Object {
  
  /**
    * Remove characters that do not appear in the whitelist.
    *
    * @param chars - The characters are used in a `RegExp` and so you will need to escape some chars, e.g. `whitelist(input, '\\[\\]')`.
    */
  def default(input: String, chars: String): String = js.native
}
