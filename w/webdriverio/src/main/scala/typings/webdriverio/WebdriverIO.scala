package typings.webdriverio

import typings.std.Error
import typings.webdriver.AsyncClient
import typings.webdriver.WebDriver.ClientOptions
import typings.webdriver.WebDriver.DesiredCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebdriverIO")
@js.native
object WebdriverIO extends js.Object {
  @js.native
  trait Browser extends js.Object {
    /**
      * execute any async action within your test spec
      */
    def call[T](callback: js.Function1[/* repeated */ js.Any, js.Promise[T]]): js.Promise[T] = js.native
    /**
      * Inject a snippet of JavaScript into the page for execution in the context of the currently selected frame.
      * The executed script is assumed to be synchronous and the result of evaluating the script is returned to
      * the client.
      */
    def execute[T](script: String, arguments: js.Any*): js.Promise[T] = js.native
    def execute[T](script: js.Function1[/* repeated */ js.Any, T], arguments: js.Any*): js.Promise[T] = js.native
    // there is no way to add callback as last parameter after `...args`.
    // https://github.com/Microsoft/TypeScript/issues/1360
    // executeAsync: <T>(script: string | ((...arguments: any[], callback: (result: T) => void) => void), ...arguments: any[]) => Promise<T>;
    /**
      * Inject a snippet of JavaScript into the page for execution in the context of the currently selected frame.
      * The executed script is assumed to be asynchronous and must signal that is done by invoking
      * the provided callback, which is always provided as the final argument to the function. The value
      * to this callback will be returned to the client.
      */
    def executeAsync(script: String, arguments: js.Any*): js.Promise[_] = js.native
    def executeAsync(script: js.Function1[/* repeated */ js.Any, Unit], arguments: js.Any*): js.Promise[_] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.webdriver.WebDriver.BaseClient because var conflicts: capabilities, isAndroid, isIOS, isMobile, sessionId. Inlined requestedCapabilities */ @js.native
  trait BrowserObject
    extends ClientOptions
       with AsyncClient
       with Browser {
    // original requested capabilities
    var requestedCapabilities: DesiredCapabilities = js.native
  }
  
  /**
    * Error to be thrown when a severe error was encountered when a Service is being ran.
    */
  type SevereServiceError = Error
}

