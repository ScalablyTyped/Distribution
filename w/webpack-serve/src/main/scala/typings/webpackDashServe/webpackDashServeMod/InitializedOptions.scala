package typings.webpackDashServe.webpackDashServeMod

import typings.node.httpsMod.ServerOptions
import typings.webpack.webpackMod.Compiler
import typings.webpack.webpackMod.Configuration
import typings.webpackDashServe.webpackDashServeStrings.debug
import typings.webpackDashServe.webpackDashServeStrings.error
import typings.webpackDashServe.webpackDashServeStrings.http
import typings.webpackDashServe.webpackDashServeStrings.https
import typings.webpackDashServe.webpackDashServeStrings.info
import typings.webpackDashServe.webpackDashServeStrings.silent
import typings.webpackDashServe.webpackDashServeStrings.trace
import typings.webpackDashServe.webpackDashServeStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitializedOptions extends Options {
  var protocol: http | https
}

object InitializedOptions {
  @scala.inline
  def apply(
    protocol: http | https,
    add: (/* app */ InitializedKoa, /* middleware */ Middleware, /* options */ Options) => Unit = null,
    clipboard: js.UndefOr[Boolean] = js.undefined,
    compiler: Compiler = null,
    config: Configuration = null,
    content: String | js.Array[String] = null,
    devMiddleware: typings.webpackDashDevDashMiddleware.webpackDashDevDashMiddlewareMod.Options = null,
    host: String = null,
    hotClient: typings.webpackDashHotDashClient.webpackDashHotDashClientMod.Options | Boolean = null,
    http2: js.UndefOr[Boolean] = js.undefined,
    https: ServerOptions = null,
    logLevel: trace | debug | info | warn | error | silent = null,
    logTime: js.UndefOr[Boolean] = js.undefined,
    on: OnOptions = null,
    open: OpenOptions | Boolean = null,
    port: Int | Double = null
  ): InitializedOptions = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any])
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction3(add))
    if (!js.isUndefined(clipboard)) __obj.updateDynamic("clipboard")(clipboard.asInstanceOf[js.Any])
    if (compiler != null) __obj.updateDynamic("compiler")(compiler.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (devMiddleware != null) __obj.updateDynamic("devMiddleware")(devMiddleware.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hotClient != null) __obj.updateDynamic("hotClient")(hotClient.asInstanceOf[js.Any])
    if (!js.isUndefined(http2)) __obj.updateDynamic("http2")(http2.asInstanceOf[js.Any])
    if (https != null) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(logTime)) __obj.updateDynamic("logTime")(logTime.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializedOptions]
  }
}

