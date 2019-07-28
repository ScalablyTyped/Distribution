package typings.webpackDashPluginDashServe.webpackDashPluginDashServeMod

import typings.connectDashHistoryDashApiDashFallback.connectDashHistoryDashApiDashFallbackMod.Options
import typings.koa.koaMod.^
import typings.node.http2Mod.SecureServerOptions
import typings.node.http2Mod.ServerOptions
import typings.webpackDashPluginDashServe.Anon_Address
import typings.webpackDashPluginDashServe.Anon_App
import typings.webpackDashPluginDashServe.Anon_Debug
import typings.webpackDashPluginDashServe.webpackDashPluginDashServeStrings.minimal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpackPluginServeOptions extends js.Object {
  var client: js.UndefOr[Anon_Address] = js.undefined
  var compress: js.UndefOr[Boolean] = js.undefined
  var historyFallback: js.UndefOr[Boolean | Options] = js.undefined
  var hmr: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String | js.Promise[String]] = js.undefined
  var http2: js.UndefOr[Boolean | ServerOptions | SecureServerOptions] = js.undefined
  var https: js.UndefOr[typings.node.httpsMod.ServerOptions] = js.undefined
  var liveReload: js.UndefOr[Boolean] = js.undefined
  var log: js.UndefOr[Anon_Debug] = js.undefined
  var middleware: js.UndefOr[js.Function2[/* app */ ^[_, js.Object], /* builtins */ Builtins, Unit]] = js.undefined
  var open: js.UndefOr[Boolean | Anon_App] = js.undefined
  var port: js.UndefOr[Double | js.Promise[Double]] = js.undefined
  var progress: js.UndefOr[Boolean | minimal] = js.undefined
  var static: js.UndefOr[String | js.Array[String] | StaticObject] = js.undefined
  var status: js.UndefOr[Boolean] = js.undefined
  var waitForBuild: js.UndefOr[Boolean] = js.undefined
}

object WebpackPluginServeOptions {
  @scala.inline
  def apply(
    client: Anon_Address = null,
    compress: js.UndefOr[Boolean] = js.undefined,
    historyFallback: Boolean | Options = null,
    hmr: js.UndefOr[Boolean] = js.undefined,
    host: String | js.Promise[String] = null,
    http2: Boolean | ServerOptions | SecureServerOptions = null,
    https: typings.node.httpsMod.ServerOptions = null,
    liveReload: js.UndefOr[Boolean] = js.undefined,
    log: Anon_Debug = null,
    middleware: (/* app */ ^[_, js.Object], /* builtins */ Builtins) => Unit = null,
    open: Boolean | Anon_App = null,
    port: Double | js.Promise[Double] = null,
    progress: Boolean | minimal = null,
    static: String | js.Array[String] | StaticObject = null,
    status: js.UndefOr[Boolean] = js.undefined,
    waitForBuild: js.UndefOr[Boolean] = js.undefined
  ): WebpackPluginServeOptions = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (historyFallback != null) __obj.updateDynamic("historyFallback")(historyFallback.asInstanceOf[js.Any])
    if (!js.isUndefined(hmr)) __obj.updateDynamic("hmr")(hmr)
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (http2 != null) __obj.updateDynamic("http2")(http2.asInstanceOf[js.Any])
    if (https != null) __obj.updateDynamic("https")(https)
    if (!js.isUndefined(liveReload)) __obj.updateDynamic("liveReload")(liveReload)
    if (log != null) __obj.updateDynamic("log")(log)
    if (middleware != null) __obj.updateDynamic("middleware")(js.Any.fromFunction2(middleware))
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (static != null) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status)
    if (!js.isUndefined(waitForBuild)) __obj.updateDynamic("waitForBuild")(waitForBuild)
    __obj.asInstanceOf[WebpackPluginServeOptions]
  }
}

