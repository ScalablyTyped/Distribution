package typings.webdriverManager

import org.scalablytyped.runtime.NumberDictionary
import typings.webdriverManager.binaryMod.Binary
import typings.webdriverManager.binaryMod.OS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webdriver-manager/built/lib/binaries/android_sdk", JSImport.Namespace)
@js.native
object androidSdkMod extends js.Object {
  
  @js.native
  class AndroidSDK () extends Binary {
    def this(alternateCDN: String) = this()
    
    def url(ostype: String): String = js.native
  }
  /* static members */
  @js.native
  object AndroidSDK extends js.Object {
    
    var DEFAULT_API_LEVELS: String = js.native
    
    var DEFAULT_ARCHITECTURES: String = js.native
    
    var DEFAULT_PLATFORMS: String = js.native
    
    var VERSIONS: NumberDictionary[String] = js.native
    
    var id: String = js.native
    
    var isDefault: Boolean = js.native
    
    var os: js.Array[OS] = js.native
    
    var versionDefault: String = js.native
  }
}
