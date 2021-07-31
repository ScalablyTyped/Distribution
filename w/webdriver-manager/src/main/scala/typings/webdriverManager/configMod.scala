package typings.webdriverManager

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    @scala.inline
    def binaryVersions(): ConfigFile = ^.asInstanceOf[js.Dynamic].applyDynamic("binaryVersions")().asInstanceOf[ConfigFile]
    
    /**
      * Get the CDN urls from the configuration file.
      * @returns A map of the CDN versions defined in the configuration file.
      */
    @scala.inline
    def cdnUrls(): ConfigFile = ^.asInstanceOf[js.Dynamic].applyDynamic("cdnUrls")().asInstanceOf[ConfigFile]
    
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
    
    @scala.inline
    def getBaseDir(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBaseDir")().asInstanceOf[String]
    
    @scala.inline
    def getConfigFile_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfigFile_")().asInstanceOf[String]
    
    @scala.inline
    def getPackageFile_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageFile_")().asInstanceOf[String]
    
    @scala.inline
    def getSeleniumDir(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeleniumDir")().asInstanceOf[String]
    
    /**
      * Get the package version.
      */
    @scala.inline
    def getVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")().asInstanceOf[String]
    
    @scala.inline
    def httpProxy(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("httpProxy")().asInstanceOf[String]
    
    @JSImport("webdriver-manager/built/lib/config", "Config.httpProxy_")
    @js.native
    def httpProxy_ : js.Any = js.native
    @scala.inline
    def httpProxy__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("httpProxy_")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def httpsProxy(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("httpsProxy")().asInstanceOf[String]
    
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
    
    @scala.inline
    def noProxy(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("noProxy")().asInstanceOf[String]
    
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
    
    @scala.inline
    def osArch(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("osArch")().asInstanceOf[String]
    
    @JSImport("webdriver-manager/built/lib/config", "Config.osArch_")
    @js.native
    def osArch_ : String = js.native
    @scala.inline
    def osArch__=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("osArch_")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def osType(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("osType")().asInstanceOf[String]
    
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
  
  trait ConfigFile
    extends StObject
       with /* key */ StringDictionary[String] {
    
    var android: js.UndefOr[String] = js.undefined
    
    var appium: js.UndefOr[String] = js.undefined
    
    var chrome: js.UndefOr[String] = js.undefined
    
    var gecko: js.UndefOr[String] = js.undefined
    
    var ie: js.UndefOr[String] = js.undefined
    
    var maxChrome: js.UndefOr[String] = js.undefined
    
    var selenium: js.UndefOr[String] = js.undefined
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
