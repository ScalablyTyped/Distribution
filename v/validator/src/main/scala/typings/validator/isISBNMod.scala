package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isISBNMod {
  
  /**
    * Check if the string is an ISBN (version 10 or 13).
    *
    * @param [version] - ISBN Version
    */
  @JSImport("validator/lib/isISBN", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isISBN", JSImport.Default)
  @js.native
  def default(str: String, version: typings.validator.mod.validator.ISBNVersion): Boolean = js.native
  
  type ISBNVersion = typings.validator.mod.validator.ISBNVersion
}
