package typings.webdriverio.WebdriverIOAsync

import typings.webdriverio.AsyncSelectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ K in keyof webdriverio.BrowserPromise ]: (args : std.Parameters<webdriverio.BrowserPromise[K]>): std.Promise<std.ReturnType<webdriverio.BrowserPromise[K]>>}
- Dropped {[ P in 'addCommand' | 'overwriteCommand' | 'options' | 'config' ]: webdriverio.WebdriverIO.Browser[P]} */ @js.native
trait Browser extends AsyncSelectors {
  // there is no way to wrap generic functions, like `<T>(arg: T) => T`
  // have to declare explicitly for sync and async typings.
  // https://github.com/microsoft/TypeScript/issues/5453
  def call[T](callback: js.Function1[/* repeated */ js.Any, js.Promise[T]]): js.Promise[T] = js.native
  def execute[T](script: String, arguments: js.Any*): js.Promise[T] = js.native
  def execute[T](script: js.Function1[/* repeated */ js.Any, T], arguments: js.Any*): js.Promise[T] = js.native
  // also there is no way to add callback as last parameter after `...args`.
  // https://github.com/Microsoft/TypeScript/issues/1360
  // executeAsync: <T>(script: string | ((...arguments: any[], callback: (result: T) => void) => void), ...arguments: any[]) => Promise<T>;
  def executeAsync(script: String, arguments: js.Any*): js.Promise[_] = js.native
  def executeAsync(script: js.Function1[/* repeated */ js.Any, Unit], arguments: js.Any*): js.Promise[_] = js.native
  def touchAction(action: TouchActions): js.Promise[Unit] = js.native
  def waitUntil(condition: js.Function0[js.Promise[Boolean]]): js.Promise[Boolean] = js.native
  def waitUntil(condition: js.Function0[js.Promise[Boolean]], timeout: Double): js.Promise[Boolean] = js.native
  def waitUntil(condition: js.Function0[js.Promise[Boolean]], timeout: Double, timeoutMsg: String): js.Promise[Boolean] = js.native
  def waitUntil(
    condition: js.Function0[js.Promise[Boolean]],
    timeout: Double,
    timeoutMsg: String,
    interval: Double
  ): js.Promise[Boolean] = js.native
}

