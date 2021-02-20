package typings.validator

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchesMod {
  
  /**
    * Check if string matches the pattern.
    *
    * @param pattern - `'foo'`
    * @param [modifiers] - `'i'`
    */
  @JSImport("validator/lib/matches", JSImport.Default)
  @js.native
  def default(str: String, pattern: String): Boolean = js.native
  @JSImport("validator/lib/matches", JSImport.Default)
  @js.native
  def default(str: String, pattern: String, modifiers: String): Boolean = js.native
  /**
    * Check if string matches the pattern.
    *
    * @param pattern - `/foo/i`
    */
  @JSImport("validator/lib/matches", JSImport.Default)
  @js.native
  def default(str: String, pattern: RegExp): Boolean = js.native
}
