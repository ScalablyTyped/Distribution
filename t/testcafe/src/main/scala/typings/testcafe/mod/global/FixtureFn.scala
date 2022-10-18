package typings.testcafe.mod.global

import org.scalablytyped.runtime.StringDictionary
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FixtureFn extends StObject {
  
  /**
    * Declares a test fixture.
    *
    * @param name - The name of the fixture.
    * @param tagArgs - tag function arguments required to support the "fixture`${x}`" syntax
    */
  def apply(name: String, tagArgs: Any*): this.type = js.native
  def apply(name: TemplateStringsArray, tagArgs: Any*): this.type = js.native
  
  /**
    * Specifies the fixture hook that is executed after the end of the last test in the fixture.
    *
    * @param fn - An asynchronous hook function that contains initialization or clean-up code.
    * @param fn `ctx` - A fixture context object used to share variables between fixture hooks and test code.
    */
  def after(fn: js.Function1[/* ctx */ StringDictionary[Any], js.Promise[Any]]): this.type = js.native
  
  /**
    * Specifies the hook that is executed on the end of each test in the fixture.
    *
    * @param fn - An asynchronous hook function that contains initialization or clean-up code.
    * @param fn `t` - The test controller used to access test run API.
    */
  def afterEach(fn: js.Function1[/* t */ TestController, js.Promise[Any]]): this.type = js.native
  
  /**
    * Specifies the fixture hook that is executed before the start of the first test in the fixture.
    *
    * @param fn - An asynchronous hook function that contains initialization or clean-up code.
    * @param fn `ctx` - A fixture context object used to share variables between fixture hooks and test code.
    */
  def before(fn: js.Function1[/* ctx */ StringDictionary[Any], js.Promise[Any]]): this.type = js.native
  
  /**
    * Specifies the hook that is executed on the start of each test in the fixture.
    *
    * @param fn - An asynchronous hook function that contains initialization or clean-up code.
    * @param fn `t` - The test controller used to access test run API.
    */
  def beforeEach(fn: js.Function1[/* t */ TestController, js.Promise[Any]]): this.type = js.native
  
  def clientScripts(scripts: js.Array[ClientScript]): this.type = js.native
  /**
    * Injects scripts into pages visited during the fixture execution.
    *
    * @param scripts - Scripts that should be added to the tested pages.
    */
  def clientScripts(scripts: ClientScript): this.type = js.native
  
  /**
    * Disables page caching for tests in this fixture.
    */
  var disablePageCaching: this.type = js.native
  
  /**
    * WARNING: This feature is experimental and is not recommended for everyday use. It can be removed in the future TestCafe versions.
    *
    * Disables page reloading which would happen right before each test in this fixture.
    */
  var disablePageReloads: this.type = js.native
  
  /**
    * Specifies HTTP Basic or Windows (NTLM) authentication credentials for all tests in the fixture.
    *
    * @param credentials - Contains credentials used for authentication.
    */
  def httpAuth(credentials: HTTPAuthCredentials): this.type = js.native
  
  /**
    * Specifies the additional information for all tests in the fixture. This information can be used in reports.
    *
    * @param data - Key-value pairs
    */
  def meta(data: js.Object): this.type = js.native
  /**
    * Specifies the additional information for all tests in the fixture. This information can be used in reports.
    *
    * @param key - The name of the metadata entry
    * @param value - The value of the metadata entry
    */
  def meta(key: String, value: String): this.type = js.native
  
  /**
    * Skips execution of all tests, except whose that are in this fixture.
    */
  var only: this.type = js.native
  
  /**
    * Specifies a webpage at which all tests in a fixture start.
    *
    * @param url - The URL of the webpage where tests start.
    * @param tagArgs - tag function arguments required to support the "fixture.page`${x}`" syntax
    * To test webpages in local directories, you can use the `file://` scheme or relative paths.
    */
  def page(url: String, tagArgs: Any*): this.type = js.native
  def page(url: TemplateStringsArray, tagArgs: Any*): this.type = js.native
  
  /**
    * Attaches hooks to all tests in the fixture
    *
    * @param hooks - The set of the RequestHook subclasses
    */
  def requestHooks(hooks: js.Object*): this.type = js.native
  
  /**
    * Skips execution of all tests in the fixture.
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
}
