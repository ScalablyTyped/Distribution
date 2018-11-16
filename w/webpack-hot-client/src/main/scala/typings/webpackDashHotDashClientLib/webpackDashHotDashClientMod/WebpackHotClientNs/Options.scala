package typings
package webpackDashHotDashClientLib.webpackDashHotDashClientMod.WebpackHotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /** Automatically configure every entry */
  var allEntries: js.UndefOr[scala.Boolean] = js.undefined
  /** Auto configure the given webpack config with the hot configuration */
  var autoConfigure: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable hot module reloading */
  var hmr: js.UndefOr[scala.Boolean] = js.undefined
  /** Level of information for webpack-hot-client to output */
  var host: js.UndefOr[WebpackHotHost | java.lang.String] = js.undefined
  /** Enable HTTPS */
  var https: js.UndefOr[scala.Boolean] = js.undefined
  /** Level of information for webpack-hot-client to output */
  var logLevel: js.UndefOr[
    webpackDashHotDashClientLib.webpackDashHotDashClientLibStrings.trace | webpackDashHotDashClientLib.webpackDashHotDashClientLibStrings.debug | webpackDashHotDashClientLib.webpackDashHotDashClientLibStrings.info | webpackDashHotDashClientLib.webpackDashHotDashClientLibStrings.warn | webpackDashHotDashClientLib.webpackDashHotDashClientLibStrings.error | webpackDashHotDashClientLib.webpackDashHotDashClientLibStrings.silent
  ] = js.undefined
  /** Prepend timestamp to each log line */
  var logTime: js.UndefOr[scala.Boolean] = js.undefined
  /** Port that the WebSocket listens on */
  var port: js.UndefOr[scala.Double] = js.undefined
  /** Reload the page if a patch cannot be applied by webpack */
  var reload: js.UndefOr[scala.Boolean] = js.undefined
  /** Server instance for webpack-hot-client to connect to */
  var server: js.UndefOr[nodeLib.netMod.Server] = js.undefined
  /** Webpack stats configuration */
  var stats: js.UndefOr[webpackLib.webpackMod.webpackNs.OptionsNs.Stats] = js.undefined
  /** Webpack compile target */
  var validTargets: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

