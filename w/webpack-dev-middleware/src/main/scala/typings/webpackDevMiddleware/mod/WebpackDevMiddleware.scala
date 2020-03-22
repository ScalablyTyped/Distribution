package typings.webpackDevMiddleware.mod

import typings.webpack.mod.Stats
import typings.webpackDevMiddleware.webpackDevMiddlewareBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpackDevMiddleware extends js.Object {
  var fileSystem: typings.memoryFs.mod.^ = js.native
  /** A function executed once the middleware has stopped watching. */
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  def getFilenameFromUrl(url: String): String | `false` = js.native
  /** Instructs a webpack-dev-middleware instance to recompile the bundle. e.g. after a change to the configuration. */
  def invalidate(): Unit = js.native
  def invalidate(callback: js.Function1[/* stats */ js.UndefOr[Stats], Unit]): Unit = js.native
  /** Executes a callback function when the compiler bundle is valid, typically after compilation */
  def waitUntilValid(): Unit = js.native
  def waitUntilValid(callback: js.Function1[/* stats */ js.UndefOr[Stats], Unit]): Unit = js.native
}

