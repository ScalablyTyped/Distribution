package typings
package webdriverioLib.WebdriverIOAsyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ K in keyof webdriverio.BrowserPromise ]: (args : std.Parameters<webdriverio.BrowserPromise[K]>): std.Promise<std.ReturnType<webdriverio.BrowserPromise[K]>>}
- Dropped {[ P in 'addCommand' | 'overwriteCommand' | 'options' ]: any[P]} */ @js.native
trait Browser
  extends webdriverioLib.AsyncSelectors {
  // there is no way to wrap generic functions, like `<T>(arg: T) => T`
  // have to declare explicitly for sync and async typings.
  // https://github.com/microsoft/TypeScript/issues/5453
  def call[T](callback: js.Function1[/* args */ js.Any, js.Promise[T]]): js.Promise[T] = js.native
  def execute[T](script: java.lang.String, arguments: js.Any*): js.Promise[T] = js.native
  def execute[T](script: js.Function1[/* repeated */ js.Any, T], arguments: js.Any*): js.Promise[T] = js.native
  // also there is no way to add callback as last parameter after `...args`.
  // https://github.com/Microsoft/TypeScript/issues/1360
  // executeAsync: <T>(script: string | ((...arguments: any[], callback: (result: T) => void) => void), ...arguments: any[]) => Promise<T>;
  def executeAsync(script: java.lang.String, arguments: js.Any*): js.Promise[_] = js.native
  def executeAsync(script: js.Function1[/* repeated */ js.Any, scala.Unit], arguments: js.Any*): js.Promise[_] = js.native
  def waitUntil(condition: js.Function0[js.Promise[scala.Boolean]]): js.Promise[scala.Boolean] = js.native
  def waitUntil(condition: js.Function0[js.Promise[scala.Boolean]], timeout: scala.Double): js.Promise[scala.Boolean] = js.native
  def waitUntil(
    condition: js.Function0[js.Promise[scala.Boolean]],
    timeout: scala.Double,
    timeoutMsg: java.lang.String
  ): js.Promise[scala.Boolean] = js.native
  def waitUntil(
    condition: js.Function0[js.Promise[scala.Boolean]],
    timeout: scala.Double,
    timeoutMsg: java.lang.String,
    interval: scala.Double
  ): js.Promise[scala.Boolean] = js.native
}

