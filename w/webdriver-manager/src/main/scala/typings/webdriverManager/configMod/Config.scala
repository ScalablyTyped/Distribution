package typings.webdriverManager.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webdriver-manager/built/lib/config", "Config")
@js.native
class Config () extends js.Object
/* static members */
@JSImport("webdriver-manager/built/lib/config", "Config")
@js.native
object Config extends js.Object {
  
  /**
    * Get the binary versions from the configuration file.
    * @returns A map of the versions defined in the configuration file.
    */
  def binaryVersions(): ConfigFile = js.native
  
  /**
    * Get the CDN urls from the configuration file.
    * @returns A map of the CDN versions defined in the configuration file.
    */
  def cdnUrls(): ConfigFile = js.native
  
  var configFile: String = js.native
  
  var cwd: String = js.native
  
  var dir: String = js.native
  
  var folder: String = js.native
  
  def getBaseDir(): String = js.native
  
  def getConfigFile_(): String = js.native
  
  def getPackageFile_(): String = js.native
  
  def getSeleniumDir(): String = js.native
  
  /**
    * Get the package version.
    */
  def getVersion(): String = js.native
  
  def httpProxy(): String = js.native
  
  var httpProxy_ : js.Any = js.native
  
  def httpsProxy(): String = js.native
  
  var httpsProxy_ : js.Any = js.native
  
  var isLocalVersion: Boolean = js.native
  
  var isProjectVersion: Boolean = js.native
  
  var localInstall: String = js.native
  
  def noProxy(): String = js.native
  
  var noProxy_ : js.Any = js.native
  
  var nodeModuleName: String = js.native
  
  def osArch(): String = js.native
  
  var osArch_ : String = js.native
  
  def osType(): String = js.native
  
  var osType_ : String = js.native
  
  var packageFile: String = js.native
  
  var parentPath: String = js.native
  
  var runCommand: String = js.native
}
