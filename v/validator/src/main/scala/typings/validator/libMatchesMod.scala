package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMatchesMod {
  
  @JSImport("validator/lib/matches", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if string matches the pattern.
    *
    * @param pattern - `'foo'`
    * @param [modifiers] - `'i'`
    */
  inline def default(str: String, pattern: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(str: String, pattern: String, modifiers: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  /**
    * Check if string matches the pattern.
    *
    * @param pattern - `/foo/i`
    */
  inline def default(str: String, pattern: js.RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
