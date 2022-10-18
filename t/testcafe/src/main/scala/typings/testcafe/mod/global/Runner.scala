package typings.testcafe.mod.global

import typings.node.NodeJS.WritableStream
import typings.testcafe.anon.PartialRunOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Runner extends StObject {
  
  /**
    * Configures the test runner to run tests in the specified browsers.
    *
    * @param browser - A different browser alias for each browser type.
    */
  def browsers(browser: String): this.type = js.native
  def browsers(browser: js.Array[String]): this.type = js.native
  def browsers(browsers: BrowserOption*): this.type = js.native
  def browsers(browsers: BrowserOptions): this.type = js.native
  /**
    * Configures the test runner to run tests in the specified browsers.
    *
    * @param browser - The remote browser connection.
    */
  def browsers(browser: BrowserConnection): this.type = js.native
  /**
    * Configures the test runner to run tests in the specified browsers.
    *
    * @param browser - The path to the browser's executable (BrowserDescriptor.path) and command line parameters (BrowserDescriptor.cmd).
    */
  def browsers(browser: BrowserDescriptor): this.type = js.native
  
  /**
    * Injects scripts into pages visited during the test execution.
    *
    * @param scripts - Scripts that should be added to the tested pages.
    */
  def clientScripts(scripts: ClientScriptOptions): this.type = js.native
  
  /**
    * Specifies custom compiler options for built-in test file compilers.
    */
  def compilerOptions(compilerOptions: CompilerOptions): this.type = js.native
  
  /**
    * Specifies that tests should run concurrently.
    *
    * @param n - The number of browser instances that are invoked.
    */
  def concurrency(n: ConcurrencyOption): this.type = js.native
  
  /**
    * Allows you to select which tests should be run.
    *
    * @param callback - The callback that determines if a particular test should be run.
    */
  def filter(callback: FilterFunction): this.type = js.native
  
  /**
    * Configures TestCafe's reporting feature.
    *
    * @param name - The name of the reporter to use.
    * @param output - The stream or the name of the file to which the report is written.
    */
  def reporter(name: String): this.type = js.native
  def reporter(name: String, output: js.UndefOr[String | WritableStream]): this.type = js.native
  /**
    * Configures TestCafe's reporting feature.
    *
    * @param reporters An array of reporters
    */
  def reporter(reporters: ReporterOptions): this.type = js.native
  
  /**
    * Runs tests according to the current configuration. Returns the number of failed tests.
    */
  def run(): js.Promise[Double] = js.native
  def run(options: PartialRunOptions): js.Promise[Double] = js.native
  
  /**
    * Enables TestCafe to take screenshots of the tested webpages.
    *
    * @param path - The base path where the screenshots are saved. Note that to construct a complete path to these screenshots, TestCafe uses default path patterns.
    * @param takeOnFails - Specifies if screenshots should be taken automatically when a test fails.
    * @param pathPattern - The pattern to compose screenshot files' relative path and name.
    */
  def screenshots(): this.type = js.native
  /**
    *
    * Enables TestCafe to take screenshots of the tested webpages.
    *
    * @param options - Screenshots options
    */
  def screenshots(options: ScreenshotsOptions): this.type = js.native
  def screenshots(path: String): this.type = js.native
  def screenshots(path: String, takeOnFails: js.UndefOr[Boolean]): this.type = js.native
  def screenshots(path: String, takeOnFails: js.UndefOr[Boolean], pathPattern: js.UndefOr[String]): this.type = js.native
  def screenshots(path: String, takeOnFails: Unit, pathPattern: js.UndefOr[String]): this.type = js.native
  def screenshots(path: Unit, takeOnFails: js.UndefOr[Boolean]): this.type = js.native
  def screenshots(path: Unit, takeOnFails: js.UndefOr[Boolean], pathPattern: js.UndefOr[String]): this.type = js.native
  def screenshots(path: Unit, takeOnFails: Unit, pathPattern: js.UndefOr[String]): this.type = js.native
  
  /**
    * Configures the test runner to run tests from the specified files.
    *
    * @param source - The relative or absolute path to a test fixture file, or several such paths. You can use glob patterns to include (or exclude) multiple files.
    */
  def src(source: String): this.type = js.native
  def src(source: js.Array[String]): this.type = js.native
  
  /**
    * Specifies a shell command that is executed before running tests. Use it to launch or deploy the application that is tested.
    *
    * @param command - The shell command to be executed.
    * @param initDelay - The amount of time (in milliseconds) allowed for the command to initialize the tested application.
    */
  def startApp(command: String): this.type = js.native
  def startApp(command: String, initDelay: js.UndefOr[Double]): this.type = js.native
  
  /**
    * Stops all the pending test tasks.
    */
  def stop(): Unit = js.native
  
  /**
    * The absolute or relative path to the TypeScript configuration file. Relative paths resolve from the current directory (the directory from which you run TestCafe).
    */
  def tsConfigPath(path: String): this.type = js.native
  
  /**
    * Specifies the proxy server used in your local network to access the Internet. Allows you to bypass the proxy when accessing specific resources.
    *
    * @param host - The proxy server host.
    * @param bypassRules - A set of rules that specify which resources are accessed bypassing the proxy.
    */
  def useProxy(host: String): this.type = js.native
  def useProxy(host: String, bypassRules: js.UndefOr[String | js.Array[String]]): this.type = js.native
  
  /**
    * https://devexpress.github.io/testcafe/documentation/using-testcafe/common-concepts/screenshots-and-videos.html#basic-video-options
    *
    * Enables TestCafe to take videos of the tested webpages.
    *
    * @param path - Output directory
    * @param options - Video options
    * @param encodingOptions - Video encoding options
    */
  def video(path: String): this.type = js.native
  def video(path: String, options: js.UndefOr[VideoOptions]): this.type = js.native
  def video(path: String, options: js.UndefOr[VideoOptions], encodingOptions: js.UndefOr[VideoEncodingOptions]): this.type = js.native
  def video(path: String, options: Unit, encodingOptions: js.UndefOr[VideoEncodingOptions]): this.type = js.native
}
