package typings.webdriverManager

import org.scalablytyped.runtime.NumberDictionary
import typings.webdriverManager.binaryMod.OS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webdriver-manager/built/lib/binaries", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class AndroidSDK ()
    extends typings.webdriverManager.androidSdkMod.AndroidSDK {
    def this(alternateCDN: String) = this()
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
  
  @js.native
  class Appium ()
    extends typings.webdriverManager.appiumMod.Appium {
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
  
  @js.native
  abstract class Binary ()
    extends typings.webdriverManager.binaryMod.Binary {
    def this(opt_alternativeCdn: String) = this()
  }
  /* static members */
  @js.native
  object Binary extends js.Object {
    
    var os: js.Array[OS] = js.native
  }
  
  @js.native
  class ChromeDriver ()
    extends typings.webdriverManager.chromeDriverMod.ChromeDriver {
    def this(opt_alternativeCdn: String) = this()
  }
  /* static members */
  @js.native
  object ChromeDriver extends js.Object {
    
    var id: String = js.native
    
    var isDefault: Boolean = js.native
    
    var os: js.Array[OS] = js.native
    
    var versionDefault: String = js.native
  }
  
  @js.native
  class GeckoDriver ()
    extends typings.webdriverManager.geckoDriverMod.GeckoDriver {
    def this(opt_alternativeCdn: String) = this()
  }
  /* static members */
  @js.native
  object GeckoDriver extends js.Object {
    
    var id: String = js.native
    
    var isDefault: Boolean = js.native
    
    var os: js.Array[OS] = js.native
    
    var suffixes: js.Any = js.native
    
    var versionDefault: String = js.native
  }
  
  @js.native
  class IEDriver ()
    extends typings.webdriverManager.iedriverMod.IEDriver {
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
  
  @js.native
  object OS extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.webdriverManager.binaryMod.OS with Double] = js.native
    
    /* 2 */ val Darwin: typings.webdriverManager.binaryMod.OS.Darwin with Double = js.native
    
    /* 1 */ val Linux: typings.webdriverManager.binaryMod.OS.Linux with Double = js.native
    
    /* 0 */ val Windows_NT: typings.webdriverManager.binaryMod.OS.Windows_NT with Double = js.native
  }
  
  @js.native
  class Standalone ()
    extends typings.webdriverManager.standaloneMod.Standalone {
    def this(opt_alternativeCdn: String) = this()
  }
  /* static members */
  @js.native
  object Standalone extends js.Object {
    
    var id: String = js.native
    
    var isDefault: Boolean = js.native
    
    var os: js.Array[OS] = js.native
    
    var versionDefault: String = js.native
  }
}
