package typings
package webpackDashServeLib.webpackDashServeMod.WebpackServeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Addon to webpack-serve that allows access to the Koa server instance */
  var add: js.UndefOr[
    js.Function3[
      /* app */ InitializedKoa, 
      /* middleware */ Middleware, 
      /* options */ Options, 
      scala.Unit
    ]
  ] = js.undefined
  /** Copy the server URL to the clipboard when the server is started */
  var clipboard: js.UndefOr[scala.Boolean] = js.undefined
  /** Custom instance of a webpack compiler */
  var compiler: js.UndefOr[webpackLib.webpackMod.Compiler] = js.undefined
  /** Webpack configuration for creating a new webpack compiler instance */
  var config: js.UndefOr[webpackDashServeLib.webpackDashServeMod.webpackMod.Configuration] = js.undefined
  /** A path or array of paths where content will be served from */
  var content: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** Options for webpack-dev-middleware */
  var devMiddleware: js.UndefOr[
    webpackDashDevDashMiddlewareLib.webpackDashDevDashMiddlewareMod.WebpackDevMiddlewareNs.Options
  ] = js.undefined
  /** The host the server will listen on */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /** Options for webpack-hot-client */
  var hotClient: js.UndefOr[
    webpackDashHotDashClientLib.webpackDashHotDashClientMod.WebpackHotClientNs.Options | scala.Boolean
  ] = js.undefined
  /** Enable HTTP2 support */
  var http2: js.UndefOr[scala.Boolean] = js.undefined
  /** Configuration object for the server to use HTTPS */
  var https: js.UndefOr[nodeLib.httpsMod.ServerOptions] = js.undefined
  /** Level of information for webpack-serve to output */
  var logLevel: js.UndefOr[
    webpackDashServeLib.webpackDashServeLibStrings.trace | webpackDashServeLib.webpackDashServeLibStrings.debug | webpackDashServeLib.webpackDashServeLibStrings.info | webpackDashServeLib.webpackDashServeLibStrings.warn | webpackDashServeLib.webpackDashServeLibStrings.error | webpackDashServeLib.webpackDashServeLibStrings.silent
  ] = js.undefined
  /** Prepend timestamp to each log line */
  var logTime: js.UndefOr[scala.Boolean] = js.undefined
  /** Object of subscribers to webpack-serve bus events */
  var on: js.UndefOr[OnOptions] = js.undefined
  /** Open the browser when started */
  var open: js.UndefOr[OpenOptions | scala.Boolean] = js.undefined
  /** Port that the server listens on */
  var port: js.UndefOr[scala.Double] = js.undefined
}

