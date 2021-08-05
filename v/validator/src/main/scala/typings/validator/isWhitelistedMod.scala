package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isWhitelistedMod {
  
  @JSImport("validator/lib/isWhitelisted", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Checks characters if they appear in the whitelist.
    *
    * @param chars - whitelist
    */
  inline def default(str: String, chars: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], chars.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(str: String, chars: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], chars.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
