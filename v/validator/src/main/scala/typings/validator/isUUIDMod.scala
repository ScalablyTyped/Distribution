package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isUUIDMod {
  
  /**
    * Check if the string is a UUID (version 3, 4 or 5).
    *
    * @param [version="all"] - UUID version
    */
  @JSImport("validator/lib/isUUID", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isUUID", JSImport.Default)
  @js.native
  def default(str: String, version: typings.validator.mod.validator.UUIDVersion): Boolean = js.native
  
  type UUIDVersion = typings.validator.mod.validator.UUIDVersion
}
