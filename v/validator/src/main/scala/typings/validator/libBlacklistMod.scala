package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBlacklistMod {
  
  @JSImport("validator/lib/blacklist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /******************
    *** Sanitizers ***
    ******************/
  /**
    * Remove characters that appear in the blacklist.
    *
    * @param chars - The characters are used in a `RegExp` and so you will need to escape some chars, e.g. `blacklist(input, '\\[\\]')`.
    */
  inline def default(input: String, chars: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], chars.asInstanceOf[js.Any])).asInstanceOf[String]
}
