package typings.webdriverManager

import typings.webdriverManager.binaryMod.Binary
import typings.webdriverManager.binaryMod.OS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webdriver-manager/built/lib/binaries/appium", JSImport.Namespace)
@js.native
object appiumMod extends js.Object {
  
  @js.native
  class Appium () extends Binary {
    def this(alternateCDN: String) = this()
  }
  /* static members */
  @js.native
  object Appium extends js.Object {
    
    var id: String = js.native
    
    var isDefault: Boolean = js.native
    
    var os: js.Array[OS] = js.native
    
    var versionDefault: String = js.native
  }
}
