package typings
package webdriverDashManagerLib.builtLibConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-manager/built/lib/config", "Config")
@js.native
class Config () extends js.Object

@JSImport("webdriver-manager/built/lib/config", "Config")
@js.native
object Config extends js.Object {
  var configFile: java.lang.String = js.native
  var cwd: java.lang.String = js.native
  var dir: java.lang.String = js.native
  var folder: java.lang.String = js.native
  var `httpProxy_`: js.Any = js.native
  var `httpsProxy_`: js.Any = js.native
  var isLocalVersion: scala.Boolean = js.native
  var isProjectVersion: scala.Boolean = js.native
  var localInstall: java.lang.String = js.native
  var `noProxy_`: js.Any = js.native
  var nodeModuleName: java.lang.String = js.native
  var `osArch_`: java.lang.String = js.native
  var `osType_`: java.lang.String = js.native
  var packageFile: java.lang.String = js.native
  var parentPath: java.lang.String = js.native
  var runCommand: java.lang.String = js.native
  /**
       * Get the binary versions from the configuration file.
       * @returns A map of the versions defined in the configuration file.
       */
  def binaryVersions(): webdriverDashManagerLib.builtLibConfigMod.ConfigFile = js.native
  /**
       * Get the CDN urls from the configuration file.
       * @returns A map of the CDN versions defined in the configuration file.
       */
  def cdnUrls(): webdriverDashManagerLib.builtLibConfigMod.ConfigFile = js.native
  def getBaseDir(): java.lang.String = js.native
  def `getConfigFile_`(): java.lang.String = js.native
  def `getPackageFile_`(): java.lang.String = js.native
  def getSeleniumDir(): java.lang.String = js.native
  /**
       * Get the package version.
       */
  def getVersion(): java.lang.String = js.native
  def httpProxy(): java.lang.String = js.native
  def httpsProxy(): java.lang.String = js.native
  def noProxy(): java.lang.String = js.native
  def osArch(): java.lang.String = js.native
  def osType(): java.lang.String = js.native
}

