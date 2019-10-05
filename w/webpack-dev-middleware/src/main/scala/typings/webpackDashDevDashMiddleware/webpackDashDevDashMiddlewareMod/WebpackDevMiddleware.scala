package typings.webpackDashDevDashMiddleware.webpackDashDevDashMiddlewareMod

import typings.memoryDashFs.memoryDashFsMod.^
import typings.webpack.webpackMod.Stats
import typings.webpackDashDevDashMiddleware.webpackDashDevDashMiddlewareNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpackDevMiddleware extends js.Object {
  var fileSystem: ^ = js.native
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  def getFilenameFromUrl(url: String): String | `false` = js.native
  def invalidate(): Unit = js.native
  def invalidate(callback: js.Function1[/* stats */ Stats, Unit]): Unit = js.native
  def waitUntilValid(): Unit = js.native
  def waitUntilValid(callback: js.Function1[/* stats */ Stats, Unit]): Unit = js.native
}

