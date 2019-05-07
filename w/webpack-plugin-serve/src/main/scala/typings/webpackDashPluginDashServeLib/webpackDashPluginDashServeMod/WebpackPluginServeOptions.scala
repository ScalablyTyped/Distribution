package typings
package webpackDashPluginDashServeLib.webpackDashPluginDashServeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpackPluginServeOptions extends js.Object {
  var client: js.UndefOr[webpackDashPluginDashServeLib.Anon_Address] = js.undefined
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  var historyFallback: js.UndefOr[
    scala.Boolean | connectDashHistoryDashApiDashFallbackLib.connectDashHistoryDashApiDashFallbackMod.Options
  ] = js.undefined
  var hmr: js.UndefOr[scala.Boolean] = js.undefined
  var host: js.UndefOr[java.lang.String | js.Promise[java.lang.String]] = js.undefined
  var http2: js.UndefOr[
    scala.Boolean | nodeLib.http2Mod.ServerOptions | nodeLib.http2Mod.SecureServerOptions
  ] = js.undefined
  var https: js.UndefOr[nodeLib.httpsMod.ServerOptions] = js.undefined
  var liveReload: js.UndefOr[scala.Boolean] = js.undefined
  var log: js.UndefOr[webpackDashPluginDashServeLib.Anon_Debug] = js.undefined
  var middleware: js.UndefOr[
    js.Function2[/* app */ koaLib.koaMod.^[_, js.Object], /* builtins */ Builtins, scala.Unit]
  ] = js.undefined
  var open: js.UndefOr[scala.Boolean | webpackDashPluginDashServeLib.Anon_App] = js.undefined
  var port: js.UndefOr[scala.Double | js.Promise[scala.Double]] = js.undefined
  var progress: js.UndefOr[
    scala.Boolean | webpackDashPluginDashServeLib.webpackDashPluginDashServeLibStrings.minimal
  ] = js.undefined
  var static: js.UndefOr[java.lang.String | js.Array[java.lang.String] | StaticObject] = js.undefined
  var status: js.UndefOr[scala.Boolean] = js.undefined
  var waitForBuild: js.UndefOr[scala.Boolean] = js.undefined
}

object WebpackPluginServeOptions {
  @scala.inline
  def apply(
    client: webpackDashPluginDashServeLib.Anon_Address = null,
    compress: js.UndefOr[scala.Boolean] = js.undefined,
    historyFallback: scala.Boolean | connectDashHistoryDashApiDashFallbackLib.connectDashHistoryDashApiDashFallbackMod.Options = null,
    hmr: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String | js.Promise[java.lang.String] = null,
    http2: scala.Boolean | nodeLib.http2Mod.ServerOptions | nodeLib.http2Mod.SecureServerOptions = null,
    https: nodeLib.httpsMod.ServerOptions = null,
    liveReload: js.UndefOr[scala.Boolean] = js.undefined,
    log: webpackDashPluginDashServeLib.Anon_Debug = null,
    middleware: (/* app */ koaLib.koaMod.^[_, js.Object], /* builtins */ Builtins) => scala.Unit = null,
    open: scala.Boolean | webpackDashPluginDashServeLib.Anon_App = null,
    port: scala.Double | js.Promise[scala.Double] = null,
    progress: scala.Boolean | webpackDashPluginDashServeLib.webpackDashPluginDashServeLibStrings.minimal = null,
    static: java.lang.String | js.Array[java.lang.String] | StaticObject = null,
    status: js.UndefOr[scala.Boolean] = js.undefined,
    waitForBuild: js.UndefOr[scala.Boolean] = js.undefined
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

