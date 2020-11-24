package typings.webdriverManager

import typings.webdriverManager.binaryMod.Binary
import typings.webdriverManager.binaryMod.OS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webdriver-manager/built/lib/binaries/iedriver", JSImport.Namespace)
@js.native
object iedriverMod extends js.Object {
  
  @js.native
  class IEDriver () extends Binary {
    def this(opt_alternativeCdn: String) = this()
  }
  /* static members */
  @js.native
  object IEDriver extends js.Object {
    
    var id: String = js.native
    
    var isDefault32: Boolean = js.native
    
    var isDefault64: Boolean = js.native
    
    var os: js.Array[OS] = js.native
    
    var versionDefault: String = js.native
  }
}
