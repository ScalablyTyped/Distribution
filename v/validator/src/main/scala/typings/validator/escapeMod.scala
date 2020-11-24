package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/escape", JSImport.Namespace)
@js.native
object escapeMod extends js.Object {
  
  /**
    * Replace `<`, `>`, `&`, `'`, `"` and `/` with HTML entities.
    */
  def default(input: String): String = js.native
}
