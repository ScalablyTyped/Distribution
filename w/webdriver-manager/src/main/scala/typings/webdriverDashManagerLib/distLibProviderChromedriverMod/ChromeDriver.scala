package typings
package webdriverDashManagerLib.distLibProviderChromedriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-manager/dist/lib/provider/chromedriver", "ChromeDriver")
@js.native
class ChromeDriver ()
  extends webdriverDashManagerLib.distLibProviderProviderMod.ProviderInterface {
  def this(providerConfig: webdriverDashManagerLib.distLibProviderProviderMod.ProviderConfig) = this()
  var cacheFileName: java.lang.String = js.native
  var configFileName: java.lang.String = js.native
  var ignoreSSL: scala.Boolean = js.native
  var osArch: java.lang.String = js.native
  @JSName("osType")
  var osType_ChromeDriver: java.lang.String = js.native
  var outDir: java.lang.String = js.native
  var proxy: java.lang.String = js.native
  var requestUrl: java.lang.String = js.native
  @JSName("seleniumFlag")
  var seleniumFlag_ChromeDriver: java.lang.String = js.native
  /**
    * Get a line delimited list of files removed.
    */
  @JSName("cleanFiles")
  def cleanFiles_MChromeDriver(): java.lang.String = js.native
  /**
    * Gets the binary file path.
    * @param version Optional to provide the version number or latest.
    */
  @JSName("getBinaryPath")
  def getBinaryPath_MChromeDriver(): java.lang.String | scala.Null = js.native
  @JSName("getBinaryPath")
  def getBinaryPath_MChromeDriver(version: java.lang.String): java.lang.String | scala.Null = js.native
  /**
    * Gets a comma delimited list of versions downloaded. Also has the "latest"
    * downloaded noted.
    */
  @JSName("getStatus")
  def getStatus_MChromeDriver(): java.lang.String | scala.Null = js.native
}

