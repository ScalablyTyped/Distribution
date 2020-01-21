package typings.webdriverio.WebdriverIO

import typings.webdriver.WebDriver.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ K in keyof webdriver.WebDriver.Client ]: (args : std.Parameters<webdriver.WebDriver.Client[K]>): std.Promise<std.ReturnType<webdriver.WebDriver.Client[K]>>}
- Dropped {[ K in keyof webdriver.WebDriver.Client ]: (args : std.Parameters<webdriver.WebDriver.Client[K]>): std.Promise<std.ReturnType<webdriver.WebDriver.Client[K]>>} */ @js.native
trait BrowserObject
  extends typings.webdriverio.WebdriverIOAsync.Browser
     with ClientOptions
     with Browser {
  /* InferMemberOverrides */
  @JSName("$")
  override def $(selector: String): js.Promise[typings.webdriverio.WebdriverIOAsync.Element] with Element = js.native
  /* InferMemberOverrides */
  @JSName("$")
  override def $(selector: js.Function): js.Promise[typings.webdriverio.WebdriverIOAsync.Element] with Element = js.native
  /* InferMemberOverrides */
  @JSName("$$")
  override def DollarDollar(selector: String): js.Promise[typings.webdriverio.WebdriverIOAsync.ElementArray] with ElementArray = js.native
  /* InferMemberOverrides */
  @JSName("$$")
  override def DollarDollar(selector: js.Function): js.Promise[typings.webdriverio.WebdriverIOAsync.ElementArray] with ElementArray = js.native
  // there is no way to wrap generic functions, like `<T>(arg: T) => T`
  // have to declare explicitly for sync and async typings.
  // https://github.com/microsoft/TypeScript/issues/5453
  /* InferMemberOverrides */
  override def call[T](callback: js.Function1[/* repeated */ js.Any, js.Promise[T]]): js.Promise[T] = js.native
  /* InferMemberOverrides */
  override def execute[T](script: String, arguments: js.Any*): js.Promise[T] = js.native
  /* InferMemberOverrides */
  override def execute[T](script: js.Function1[/* repeated */ js.Any, T], arguments: js.Any*): js.Promise[T] = js.native
  // also there is no way to add callback as last parameter after `...args`.
  // https://github.com/Microsoft/TypeScript/issues/1360
  // executeAsync: <T>(script: string | ((...arguments: any[], callback: (result: T) => void) => void), ...arguments: any[]) => Promise<T>;
  /* InferMemberOverrides */
  override def executeAsync(script: String, arguments: js.Any*): js.Promise[_] = js.native
  /* InferMemberOverrides */
  override def executeAsync(script: js.Function1[/* repeated */ js.Any, Unit], arguments: js.Any*): js.Promise[_] = js.native
  /* InferMemberOverrides */
  override def touchAction(action: typings.webdriverio.WebdriverIOAsync.TouchActions): js.Promise[Unit] with Unit = js.native
  /* InferMemberOverrides */
  override def waitUntil(condition: js.Function0[js.Promise[Boolean]]): js.Promise[Boolean] = js.native
  /* InferMemberOverrides */
  override def waitUntil(condition: js.Function0[js.Promise[Boolean]], timeout: Double): js.Promise[Boolean] = js.native
  /* InferMemberOverrides */
  override def waitUntil(condition: js.Function0[js.Promise[Boolean]], timeout: Double, timeoutMsg: String): js.Promise[Boolean] = js.native
  /* InferMemberOverrides */
  override def waitUntil(
    condition: js.Function0[js.Promise[Boolean]],
    timeout: Double,
    timeoutMsg: String,
    interval: Double
  ): js.Promise[Boolean] = js.native
}

