package typings
package webpackDashServeLib.webpackDashServeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitializedOptions extends Options {
  var protocol: webpackDashServeLib.webpackDashServeLibStrings.http | webpackDashServeLib.webpackDashServeLibStrings.https
}

object InitializedOptions {
  @scala.inline
  def apply(
    protocol: webpackDashServeLib.webpackDashServeLibStrings.http | webpackDashServeLib.webpackDashServeLibStrings.https,
    add: (/* app */ InitializedKoa, /* middleware */ Middleware, /* options */ Options) => scala.Unit = null,
    clipboard: js.UndefOr[scala.Boolean] = js.undefined,
    compiler: webpackLib.webpackMod.Compiler = null,
    config: webpackLib.webpackMod.Configuration = null,
    content: java.lang.String | js.Array[java.lang.String] = null,
    devMiddleware: webpackDashDevDashMiddlewareLib.webpackDashDevDashMiddlewareMod.Options = null,
    host: java.lang.String = null,
    hotClient: webpackDashHotDashClientLib.webpackDashHotDashClientMod.Options | scala.Boolean = null,
    http2: js.UndefOr[scala.Boolean] = js.undefined,
    https: nodeLib.httpsMod.ServerOptions = null,
    logLevel: webpackDashServeLib.webpackDashServeLibStrings.trace | webpackDashServeLib.webpackDashServeLibStrings.debug | webpackDashServeLib.webpackDashServeLibStrings.info | webpackDashServeLib.webpackDashServeLibStrings.warn | webpackDashServeLib.webpackDashServeLibStrings.error | webpackDashServeLib.webpackDashServeLibStrings.silent = null,
    logTime: js.UndefOr[scala.Boolean] = js.undefined,
    on: OnOptions = null,
    open: OpenOptions | scala.Boolean = null,
    port: scala.Int | scala.Double = null
  ): InitializedOptions = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any])
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction3(add))
    if (!js.isUndefined(clipboard)) __obj.updateDynamic("clipboard")(clipboard)
    if (compiler != null) __obj.updateDynamic("compiler")(compiler)
    if (config != null) __obj.updateDynamic("config")(config)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (devMiddleware != null) __obj.updateDynamic("devMiddleware")(devMiddleware)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hotClient != null) __obj.updateDynamic("hotClient")(hotClient.asInstanceOf[js.Any])
    if (!js.isUndefined(http2)) __obj.updateDynamic("http2")(http2)
    if (https != null) __obj.updateDynamic("https")(https)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(logTime)) __obj.updateDynamic("logTime")(logTime)
    if (on != null) __obj.updateDynamic("on")(on)
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializedOptions]
  }
}

