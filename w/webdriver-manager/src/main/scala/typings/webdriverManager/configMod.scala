package typings.webdriverManager

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("webdriver-manager/built/lib/config", "Config")
  @js.native
  class Config () extends StObject
  /* static members */
  object Config {
    
    @JSImport("webdriver-manager/built/lib/config", "Config")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the binary versions from the configuration file.
      * @returns A map of the versions defined in the configuration file.
      */
    @JSImport("webdriver-manager/built/lib/config", "Config.binaryVersions")
    @js.native
    def binaryVersions(): ConfigFile = js.native
    
    /**
      * Get the CDN urls from the configuration file.
      * @returns A map of the CDN versions defined in the configuration file.
      */
    @JSImport("webdriver-manager/built/lib/config", "Config.cdnUrls")
    @js.native
    def cdnUrls(): ConfigFile = js.native
    
    @JSImport("webdriver-manager/built/lib/config", "Config.configFile")
    @js.native
    def configFile: String = js.native
    @scala.inline
    def configFile_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configFile")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/config", "Config.cwd")
    @js.native
    def cwd: String = js.native
    @scala.inline
    def cwd_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cwd")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/config", "Config.dir")
    @js.native
    def dir: String = js.native
    @scala.inline
    def dir_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dir")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/config", "Config.folder")
    @js.native
    def folder: String = js.native
    @scala.inline
    def folder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("folder")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/config", "Config.getBaseDir")
    @js.native
    def getBaseDir(): String = js.native
    
    @JSImport("webdriver-manager/built/lib/config", "Config.getConfigFile_")
    @js.native
    def getConfigFile_(): String = js.native
    
    @JSImport("webdriver-manager/built/lib/config", "Config.getPackageFile_")
    @js.native
    def getPackageFile_(): String = js.native
    
    @JSImport("webdriver-manager/built/lib/config", "Config.getSeleniumDir")
    @js.native
    def getSeleniumDir(): String = js.native
    
    /**
      * Get the package version.
      */
    @JSImport("webdriver-manager/built/lib/config", "Config.getVersion")
    @js.native
    def getVersion(): String = js.native
    
    @JSImport("webdriver-manager/built/lib/config", "Config.httpProxy")
    @js.native
    def httpProxy(): String = js.native
    
    @JSImport("webdriver-manager/built/lib/config", "Config.httpProxy_")
    @js.native
    def httpProxy_ : js.Any = js.native
    @scala.inline
    def httpProxy__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("httpProxy_")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/config", "Config.httpsProxy")
    @js.native
    def httpsProxy(): String = js.native
    
    @JSImport("webdriver-manager/built/lib/config", "Config.httpsProxy_")
    @js.native
    def httpsProxy_ : js.Any = js.native
    @scala.inline
    def httpsProxy__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("httpsProxy_")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/config", "Config.isLocalVersion")
    @js.native
    def isLocalVersion: Boolean = js.native
    @scala.inline
    def isLocalVersion_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isLocalVersion")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/config", "Config.isProjectVersion")
    @js.native
    def isProjectVersion: Boolean = js.native
    @scala.inline
    def isProjectVersion_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isProjectVersion")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/config", "Config.localInstall")
    @js.native
    def localInstall: String = js.native
    @scala.inline
    def localInstall_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localInstall")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/config", "Config.noProxy")
    @js.native
    def noProxy(): String = js.native
    
    @JSImport("webdriver-manager/built/lib/config", "Config.noProxy_")
    @js.native
    def noProxy_ : js.Any = js.native
    @scala.inline
    def noProxy__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noProxy_")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/config", "Config.nodeModuleName")
    @js.native
    def nodeModuleName: String = js.native
    @scala.inline
    def nodeModuleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeModuleName")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/config", "Config.osArch")
    @js.native
    def osArch(): String = js.native
    
    @JSImport("webdriver-manager/built/lib/config", "Config.osArch_")
    @js.native
    def osArch_ : String = js.native
    @scala.inline
    def osArch__=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("osArch_")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/config", "Config.osType")
    @js.native
    def osType(): String = js.native
    
    @JSImport("webdriver-manager/built/lib/config", "Config.osType_")
    @js.native
    def osType_ : String = js.native
    @scala.inline
    def osType__=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("osType_")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/config", "Config.packageFile")
    @js.native
    def packageFile: String = js.native
    @scala.inline
    def packageFile_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packageFile")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/config", "Config.parentPath")
    @js.native
    def parentPath: String = js.native
    @scala.inline
    def parentPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentPath")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/config", "Config.runCommand")
    @js.native
    def runCommand: String = js.native
    @scala.inline
    def runCommand_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runCommand")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ConfigFile extends /* key */ StringDictionary[String] {
    
    var android: js.UndefOr[String] = js.native
    
    var appium: js.UndefOr[String] = js.native
    
    var chrome: js.UndefOr[String] = js.native
    
    var gecko: js.UndefOr[String] = js.native
    
    var ie: js.UndefOr[String] = js.native
    
    var maxChrome: js.UndefOr[String] = js.native
    
    var selenium: js.UndefOr[String] = js.native
  }
  object ConfigFile {
    
    @scala.inline
    def apply(): ConfigFile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigFile]
    }
    
    @scala.inline
    implicit class ConfigFileMutableBuilder[Self <: ConfigFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAndroid(value: String): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      @scala.inline
      def setAppium(value: String): Self = StObject.set(x, "appium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppiumUndefined: Self = StObject.set(x, "appium", js.undefined)
      
      @scala.inline
      def setChrome(value: String): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChromeUndefined: Self = StObject.set(x, "chrome", js.undefined)
      
      @scala.inline
      def setGecko(value: String): Self = StObject.set(x, "gecko", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeckoUndefined: Self = StObject.set(x, "gecko", js.undefined)
      
      @scala.inline
      def setIe(value: String): Self = StObject.set(x, "ie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIeUndefined: Self = StObject.set(x, "ie", js.undefined)
      
      @scala.inline
      def setMaxChrome(value: String): Self = StObject.set(x, "maxChrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxChromeUndefined: Self = StObject.set(x, "maxChrome", js.undefined)
      
      @scala.inline
      def setSelenium(value: String): Self = StObject.set(x, "selenium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeleniumUndefined: Self = StObject.set(x, "selenium", js.undefined)
    }
  }
}
