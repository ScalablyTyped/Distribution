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

object Options {
  @scala.inline
  def apply(
    allEntries: js.UndefOr[scala.Boolean] = js.undefined,
    autoConfigure: js.UndefOr[scala.Boolean] = js.undefined,
    hmr: js.UndefOr[scala.Boolean] = js.undefined,
    host: WebpackHotHost | java.lang.String = null,
    https: js.UndefOr[scala.Boolean] = js.undefined,
    logLevel: webpackDashHotDashClientLib.webpackDashHotDashClientLibStrings.trace | webpackDashHotDashClientLib.webpackDashHotDashClientLibStrings.debug | webpackDashHotDashClientLib.webpackDashHotDashClientLibStrings.info | webpackDashHotDashClientLib.webpackDashHotDashClientLibStrings.warn | webpackDashHotDashClientLib.webpackDashHotDashClientLibStrings.error | webpackDashHotDashClientLib.webpackDashHotDashClientLibStrings.silent = null,
    logTime: js.UndefOr[scala.Boolean] = js.undefined,
    port: scala.Int | scala.Double = null,
    reload: js.UndefOr[scala.Boolean] = js.undefined,
    server: nodeLib.netMod.Server = null,
    stats: webpackLib.webpackMod.webpackNs.OptionsNs.Stats = null,
    validTargets: js.Array[java.lang.String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allEntries)) __obj.updateDynamic("allEntries")(allEntries)
    if (!js.isUndefined(autoConfigure)) __obj.updateDynamic("autoConfigure")(autoConfigure)
    if (!js.isUndefined(hmr)) __obj.updateDynamic("hmr")(hmr)
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(logTime)) __obj.updateDynamic("logTime")(logTime)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(reload)) __obj.updateDynamic("reload")(reload)
    if (server != null) __obj.updateDynamic("server")(server)
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (validTargets != null) __obj.updateDynamic("validTargets")(validTargets)
    __obj.asInstanceOf[Options]
  }
}

