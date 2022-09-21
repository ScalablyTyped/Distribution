package typings.webdriverManager

import org.scalablytyped.runtime.NumberDictionary
import typings.webdriverManager.binaryMod.OS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webdriver-manager/built/lib/binaries", "AndroidSDK")
  @js.native
  open class AndroidSDK ()
    extends typings.webdriverManager.androidSdkMod.AndroidSDK {
    def this(alternateCDN: String) = this()
  }
  /* static members */
  object AndroidSDK {
    
    @JSImport("webdriver-manager/built/lib/binaries", "AndroidSDK")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver-manager/built/lib/binaries", "AndroidSDK.DEFAULT_API_LEVELS")
    @js.native
    def DEFAULT_API_LEVELS: String = js.native
    inline def DEFAULT_API_LEVELS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_API_LEVELS")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "AndroidSDK.DEFAULT_ARCHITECTURES")
    @js.native
    def DEFAULT_ARCHITECTURES: String = js.native
    inline def DEFAULT_ARCHITECTURES_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ARCHITECTURES")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "AndroidSDK.DEFAULT_PLATFORMS")
    @js.native
    def DEFAULT_PLATFORMS: String = js.native
    inline def DEFAULT_PLATFORMS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_PLATFORMS")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "AndroidSDK.VERSIONS")
    @js.native
    def VERSIONS: NumberDictionary[String] = js.native
    inline def VERSIONS_=(x: NumberDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSIONS")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "AndroidSDK.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "AndroidSDK.isDefault")
    @js.native
    def isDefault: Boolean = js.native
    inline def isDefault_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "AndroidSDK.os")
    @js.native
    def os: js.Array[OS] = js.native
    inline def os_=(x: js.Array[OS]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("os")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "AndroidSDK.versionDefault")
    @js.native
    def versionDefault: String = js.native
    inline def versionDefault_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionDefault")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("webdriver-manager/built/lib/binaries", "Appium")
  @js.native
  open class Appium ()
    extends typings.webdriverManager.appiumMod.Appium {
    def this(alternateCDN: String) = this()
  }
  /* static members */
  object Appium {
    
    @JSImport("webdriver-manager/built/lib/binaries", "Appium")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver-manager/built/lib/binaries", "Appium.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "Appium.isDefault")
    @js.native
    def isDefault: Boolean = js.native
    inline def isDefault_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "Appium.os")
    @js.native
    def os: js.Array[OS] = js.native
    inline def os_=(x: js.Array[OS]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("os")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "Appium.versionDefault")
    @js.native
    def versionDefault: String = js.native
    inline def versionDefault_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionDefault")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("webdriver-manager/built/lib/binaries", "Binary")
  @js.native
  abstract class Binary ()
    extends typings.webdriverManager.binaryMod.Binary {
    def this(opt_alternativeCdn: String) = this()
  }
  /* static members */
  object Binary {
    
    @JSImport("webdriver-manager/built/lib/binaries", "Binary")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver-manager/built/lib/binaries", "Binary.os")
    @js.native
    def os: js.Array[OS] = js.native
    inline def os_=(x: js.Array[OS]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("os")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("webdriver-manager/built/lib/binaries", "ChromeDriver")
  @js.native
  open class ChromeDriver ()
    extends typings.webdriverManager.chromeDriverMod.ChromeDriver {
    def this(opt_alternativeCdn: String) = this()
  }
  /* static members */
  object ChromeDriver {
    
    @JSImport("webdriver-manager/built/lib/binaries", "ChromeDriver")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver-manager/built/lib/binaries", "ChromeDriver.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "ChromeDriver.isDefault")
    @js.native
    def isDefault: Boolean = js.native
    inline def isDefault_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "ChromeDriver.os")
    @js.native
    def os: js.Array[OS] = js.native
    inline def os_=(x: js.Array[OS]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("os")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "ChromeDriver.versionDefault")
    @js.native
    def versionDefault: String = js.native
    inline def versionDefault_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionDefault")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("webdriver-manager/built/lib/binaries", "GeckoDriver")
  @js.native
  open class GeckoDriver ()
    extends typings.webdriverManager.geckoDriverMod.GeckoDriver {
    def this(opt_alternativeCdn: String) = this()
  }
  /* static members */
  object GeckoDriver {
    
    @JSImport("webdriver-manager/built/lib/binaries", "GeckoDriver")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver-manager/built/lib/binaries", "GeckoDriver.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "GeckoDriver.isDefault")
    @js.native
    def isDefault: Boolean = js.native
    inline def isDefault_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "GeckoDriver.os")
    @js.native
    def os: js.Array[OS] = js.native
    inline def os_=(x: js.Array[OS]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("os")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "GeckoDriver.suffixes")
    @js.native
    def suffixes: Any = js.native
    inline def suffixes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suffixes")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "GeckoDriver.versionDefault")
    @js.native
    def versionDefault: String = js.native
    inline def versionDefault_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionDefault")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("webdriver-manager/built/lib/binaries", "IEDriver")
  @js.native
  open class IEDriver ()
    extends typings.webdriverManager.iedriverMod.IEDriver {
    def this(opt_alternativeCdn: String) = this()
  }
  /* static members */
  object IEDriver {
    
    @JSImport("webdriver-manager/built/lib/binaries", "IEDriver")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver-manager/built/lib/binaries", "IEDriver.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "IEDriver.isDefault32")
    @js.native
    def isDefault32: Boolean = js.native
    inline def isDefault32_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDefault32")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "IEDriver.isDefault64")
    @js.native
    def isDefault64: Boolean = js.native
    inline def isDefault64_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDefault64")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "IEDriver.os")
    @js.native
    def os: js.Array[OS] = js.native
    inline def os_=(x: js.Array[OS]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("os")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "IEDriver.versionDefault")
    @js.native
    def versionDefault: String = js.native
    inline def versionDefault_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionDefault")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("webdriver-manager/built/lib/binaries", "OS")
  @js.native
  object OS extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.webdriverManager.binaryMod.OS & Double] = js.native
    
    /* 2 */ val Darwin: typings.webdriverManager.binaryMod.OS.Darwin & Double = js.native
    
    /* 1 */ val Linux: typings.webdriverManager.binaryMod.OS.Linux & Double = js.native
    
    /* 0 */ val Windows_NT: typings.webdriverManager.binaryMod.OS.Windows_NT & Double = js.native
  }
  
  @JSImport("webdriver-manager/built/lib/binaries", "Standalone")
  @js.native
  open class Standalone ()
    extends typings.webdriverManager.standaloneMod.Standalone {
    def this(opt_alternativeCdn: String) = this()
  }
  /* static members */
  object Standalone {
    
    @JSImport("webdriver-manager/built/lib/binaries", "Standalone")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver-manager/built/lib/binaries", "Standalone.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "Standalone.isDefault")
    @js.native
    def isDefault: Boolean = js.native
    inline def isDefault_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "Standalone.os")
    @js.native
    def os: js.Array[OS] = js.native
    inline def os_=(x: js.Array[OS]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("os")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/binaries", "Standalone.versionDefault")
    @js.native
    def versionDefault: String = js.native
    inline def versionDefault_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionDefault")(x.asInstanceOf[js.Any])
  }
}
