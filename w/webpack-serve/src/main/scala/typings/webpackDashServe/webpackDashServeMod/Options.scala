package typings.webpackDashServe.webpackDashServeMod

import typings.node.httpsMod.ServerOptions
import typings.webpack.webpackMod.Compiler
import typings.webpack.webpackMod.Configuration
import typings.webpackDashServe.webpackDashServeStrings.debug
import typings.webpackDashServe.webpackDashServeStrings.error
import typings.webpackDashServe.webpackDashServeStrings.info
import typings.webpackDashServe.webpackDashServeStrings.silent
import typings.webpackDashServe.webpackDashServeStrings.trace
import typings.webpackDashServe.webpackDashServeStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Addon to webpack-serve that allows access to the Koa server instance */
  var add: js.UndefOr[
    js.Function3[/* app */ InitializedKoa, /* middleware */ Middleware, /* options */ Options, Unit]
  ] = js.undefined
  /** Copy the server URL to the clipboard when the server is started */
  var clipboard: js.UndefOr[Boolean] = js.undefined
  /** Custom instance of a webpack compiler */
  var compiler: js.UndefOr[Compiler] = js.undefined
  /** Webpack configuration for creating a new webpack compiler instance */
  var config: js.UndefOr[Configuration] = js.undefined
  /** A path or array of paths where content will be served from */
  var content: js.UndefOr[String | js.Array[String]] = js.undefined
  /** Options for webpack-dev-middleware */
  var devMiddleware: js.UndefOr[typings.webpackDashDevDashMiddleware.webpackDashDevDashMiddlewareMod.Options] = js.undefined
  /** The host the server will listen on */
  var host: js.UndefOr[String] = js.undefined
  /** Options for webpack-hot-client */
  var hotClient: js.UndefOr[typings.webpackDashHotDashClient.webpackDashHotDashClientMod.Options | Boolean] = js.undefined
  /** Enable HTTP2 support */
  var http2: js.UndefOr[Boolean] = js.undefined
  /** Configuration object for the server to use HTTPS */
  var https: js.UndefOr[ServerOptions] = js.undefined
  /** Level of information for webpack-serve to output */
  var logLevel: js.UndefOr[trace | debug | info | warn | error | silent] = js.undefined
  /** Prepend timestamp to each log line */
  var logTime: js.UndefOr[Boolean] = js.undefined
  /** Object of subscribers to webpack-serve bus events */
  var on: js.UndefOr[OnOptions] = js.undefined
  /** Open the browser when started */
  var open: js.UndefOr[OpenOptions | Boolean] = js.undefined
  /** Port that the server listens on */
  var port: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
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
  ): Options = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[Options]
  }
}

