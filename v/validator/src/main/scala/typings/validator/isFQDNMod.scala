package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isFQDNMod {
  
  /**
    * Check if the string is a fully qualified domain name (e.g. `domain.com`).
    *
    * @param [options] - Options
    */
  @JSImport("validator/lib/isFQDN", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isFQDN", JSImport.Default)
  @js.native
  def default(str: String, options: typings.validator.mod.validator.IsFQDNOptions): Boolean = js.native
  
  type IsFQDNOptions = typings.validator.mod.validator.IsFQDNOptions
}
