package typings
package webpackDashDevDashMiddlewareLib.webpackDashDevDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpackDevMiddleware extends js.Object {
  var fileSystem: memoryDashFsLib.memoryDashFsMod.^ = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def getFilenameFromUrl(url: java.lang.String): java.lang.String | webpackDashDevDashMiddlewareLib.webpackDashDevDashMiddlewareLibNumbers.`false` = js.native
  def invalidate(): scala.Unit = js.native
  def invalidate(callback: js.Function1[/* stats */ webpackLib.webpackMod.Stats, scala.Unit]): scala.Unit = js.native
  def waitUntilValid(): scala.Unit = js.native
  def waitUntilValid(callback: js.Function1[/* stats */ webpackLib.webpackMod.Stats, scala.Unit]): scala.Unit = js.native
}

