package typings.webpackPluginServe.mod

import typings.connectHistoryApiFallback.mod.Options
import typings.httpProxyMiddleware.mod.Config
import typings.httpProxyMiddleware.mod.Proxy
import typings.koa.mod.Context
import typings.koaCompress.mod.CompressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Builtins extends js.Object {
  def compress(opts: CompressOptions): Unit = js.native
  def four0four(): Unit = js.native
  def four0four(fn: js.Function1[/* ctx */ Context, Unit]): Unit = js.native
  def historyFallback(opts: Options): Unit = js.native
  def proxy(args: Config): Proxy = js.native
  def static(paths: js.Array[String]): Unit = js.native
  def static(paths: js.Array[String], opts: typings.koaStatic.mod.Options): Unit = js.native
  def websocket(): Unit = js.native
}

