package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestFn extends StObject {
  
  /**
    * Declares a test.
    *
    * @param name - The name of the test.
    * @param fn - An asynchronous function that contains test code.
    * @param fn `t` - The test controller used to access test run API.
    */
  def apply(name: String, fn: js.Function1[/* t */ TestController, js.Promise[Any]]): this.type = js.native
  
  /**
    * Specifies hook that is executed on the end of the test.
    *
    * @param fn - An asynchronous hook function that contains initialization or clean-up code.
    * @param fn `t` - The test controller used to access test run API.
    */
  def after(fn: js.Function1[/* t */ TestController, js.Promise[Any]]): this.type = js.native
  
  /**
    * Specifies hook that is executed on the start of the test.
    *
    * @param fn - An asynchronous hook function that contains initialization or clean-up code.
    * @param fn `t` - The test controller used to access test run API.
    */
  def before(fn: js.Function1[/* t */ TestController, js.Promise[Any]]): this.type = js.native
  
  def clientScripts(scripts: js.Array[ClientScript]): this.type = js.native
  /**
    * Injects scripts into pages visited during the test execution.
    *
    * @param scripts - Scripts that should be added to the tested pages.
    */
  def clientScripts(scripts: ClientScript): this.type = js.native
  
  /**
    * Disables page caching for this test.
    */
  var disablePageCaching: this.type = js.native
  
  /**
    * WARNING: This feature is experimental and is not recommended for everyday use. It can be removed in the future TestCafe versions.
    *
    * Disables page reloading which would happen right before this test.
    */
  var disablePageReloads: this.type = js.native
  
  /**
    * Specifies HTTP Basic or Windows (NTLM) authentication credentials for the test.
    *
    * @param credentials - Contains credentials used for authentication.
    */
  def httpAuth(credentials: HTTPAuthCredentials): this.type = js.native
  
  /**
    * Specifies the additional information for the test. This information can be used in reports.
    *
    * @param data - Key-value pairs
    */
  def meta(data: js.Object): this.type = js.native
  /**
    * Specifies the additional information for the test. This information can be used in reports.
    *
    * @param key - The name of the metadata entry
    * @param value - The value of the metadata entry
    */
  def meta(key: String, value: String): this.type = js.native
  
  /**
    * Skips execution of all tests, except this one.
    */
  var only: this.type = js.native
  
  /**
    * Specifies a webpage at which test starts.
    *
    * @param url - The URL of the webpage at which this test starts.
    * To test webpages in local directories, you can use the `file://` scheme or relative paths.
    */
  def page(url: String): this.type = js.native
  
  /**
    * Attaches hooks to the test
    *
    * @param hooks - The set of the RequestHook subclasses
    */
  def requestHooks(hooks: js.Object*): this.type = js.native
  
  /**
    * Skips test execution.
    */
  var skip: this.type = js.native
  
  /**
    * Customize the behavior of the skipJsErrors method.
    *
    * @param options - Error skipping conditions: a Boolean flag, an Object with options, or a callback function that defines custom error skipping logic.
    */
  def skipJsErrors(): this.type = js.native
  def skipJsErrors(options: Boolean): this.type = js.native
  def skipJsErrors(options: SkipJsErrorsCallback): this.type = js.native
  def skipJsErrors(options: SkipJsErrorsCallbackWithOptionsObject): this.type = js.native
  def skipJsErrors(options: SkipJsErrorsOptionsObject): this.type = js.native
  
  /**
    * Specifies the timeouts for the test.
    *
    */
  def timeouts(testTimeouts: TestTimeouts): this.type = js.native
}
