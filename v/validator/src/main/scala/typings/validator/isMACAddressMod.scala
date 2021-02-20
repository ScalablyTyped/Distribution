package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isMACAddressMod {
  
  /**
    * Check if the string is a MAC address.
    *
    * @param [options] - Options
    */
  @JSImport("validator/lib/isMACAddress", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isMACAddress", JSImport.Default)
  @js.native
  def default(str: String, options: typings.validator.mod.validator.IsMACAddressOptions): Boolean = js.native
  
  type IsMACAddressOptions = typings.validator.mod.validator.IsMACAddressOptions
}
