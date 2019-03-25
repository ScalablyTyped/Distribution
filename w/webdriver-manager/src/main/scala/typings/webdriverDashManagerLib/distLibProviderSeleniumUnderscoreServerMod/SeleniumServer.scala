package typings
package webdriverDashManagerLib.distLibProviderSeleniumUnderscoreServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-manager/dist/lib/provider/selenium_server", "SeleniumServer")
@js.native
class SeleniumServer ()
  extends webdriverDashManagerLib.distLibProviderProviderMod.ProviderInterface {
  def this(providerConfig: SeleniumServerProviderConfig) = this()
  var cacheFileName: java.lang.String = js.native
  var configFileName: java.lang.String = js.native
  var ignoreSSL: scala.Boolean = js.native
  var osArch: java.lang.String = js.native
  @JSName("osType")
  var osType_SeleniumServer: java.lang.String = js.native
  var outDir: java.lang.String = js.native
  var port: scala.Double = js.native
  var proxy: java.lang.String = js.native
  var requestUrl: java.lang.String = js.native
  var runAsDetach: scala.Boolean = js.native
  var runAsNode: scala.Boolean = js.native
  var seleniumProcess: nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  /**
    * Get a line delimited list of files removed.
    */
  @JSName("cleanFiles")
  def cleanFiles_MSeleniumServer(): java.lang.String = js.native
  /**
    * Get the binary file path.
    * @param version Optional to provide the version number or the latest.
    */
  @JSName("getBinaryPath")
  def getBinaryPath_MSeleniumServer(): java.lang.String | scala.Null = js.native
  @JSName("getBinaryPath")
  def getBinaryPath_MSeleniumServer(version: java.lang.String): java.lang.String | scala.Null = js.native
  /**
    * Get the selenium server start command (not including the java command)
    * @param opts The options to pass to the jar file.
    * @param version The optional version of the selenium jar file.
    * @returns The spawn arguments array.
    */
  def getCmdStartServer(opts: org.scalablytyped.runtime.StringDictionary[java.lang.String]): js.Array[java.lang.String] = js.native
  def getCmdStartServer(opts: org.scalablytyped.runtime.StringDictionary[java.lang.String], version: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * Gets the java command either by the JAVA_HOME environment variable or
    * just the java command.
    */
  def getJava(): java.lang.String = js.native
  /**
    * Gets a comma delimited list of versions downloaded. Also has the "latest"
    * downloaded noted.
    */
  @JSName("getStatus")
  def getStatus_MSeleniumServer(): java.lang.String | scala.Null = js.native
  /**
    * Starts selenium standalone server and handles emitted exit events.
    * @param opts The options to pass to the jar file.
    * @param version The optional version of the selenium jar file.
    * @returns A promise so the server can run while awaiting its completion.
    */
  def startServer(opts: org.scalablytyped.runtime.StringDictionary[java.lang.String]): js.Promise[scala.Double] = js.native
  def startServer(opts: org.scalablytyped.runtime.StringDictionary[java.lang.String], version: java.lang.String): js.Promise[scala.Double] = js.native
  /**
    * If we are running the selenium server role = node, send
    * the command to stop the server via http get request. Reference:
    * https://github.com/SeleniumHQ/selenium/issues/2852#issuecomment-268324091
    *
    * If we are not running as the selenium server role = node, kill the
    * process with pid.
    *
    * @param host The protocol and ip address, default http://127.0.0.1
    * @param port The port number, default 4444
    * @returns A promise of the http get request completing.
    */
  def stopServer(): js.Promise[scala.Unit] = js.native
  def stopServer(host: java.lang.String): js.Promise[scala.Unit] = js.native
  def stopServer(host: java.lang.String, port: scala.Double): js.Promise[scala.Unit] = js.native
}

