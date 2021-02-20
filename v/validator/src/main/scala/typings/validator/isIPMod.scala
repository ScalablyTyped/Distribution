package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isIPMod {
  
  /**
    * Check if the string is an IP (version 4 or 6).
    *
    * @param [version] - IP Version
    */
  @JSImport("validator/lib/isIP", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isIP", JSImport.Default)
  @js.native
  def default(str: String, version: typings.validator.mod.validator.IPVersion): Boolean = js.native
  
  type IPVersion = typings.validator.mod.validator.IPVersion
}
