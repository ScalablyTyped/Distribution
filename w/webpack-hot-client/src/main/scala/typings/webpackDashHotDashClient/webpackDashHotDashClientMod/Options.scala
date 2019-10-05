package typings.webpackDashHotDashClient.webpackDashHotDashClientMod

import typings.node.netMod.Server
import typings.webpack.webpackMod.Options.Stats
import typings.webpackDashHotDashClient.webpackDashHotDashClientStrings.debug
import typings.webpackDashHotDashClient.webpackDashHotDashClientStrings.error
import typings.webpackDashHotDashClient.webpackDashHotDashClientStrings.info
import typings.webpackDashHotDashClient.webpackDashHotDashClientStrings.silent
import typings.webpackDashHotDashClient.webpackDashHotDashClientStrings.trace
import typings.webpackDashHotDashClient.webpackDashHotDashClientStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Automatically configure every entry */
  var allEntries: js.UndefOr[Boolean] = js.undefined
  /** Auto configure the given webpack config with the hot configuration */
  var autoConfigure: js.UndefOr[Boolean] = js.undefined
  /** Enable hot module reloading */
  var hmr: js.UndefOr[Boolean] = js.undefined
  /** Level of information for webpack-hot-client to output */
  var host: js.UndefOr[WebpackHotHost | String] = js.undefined
  /** Enable HTTPS */
  var https: js.UndefOr[Boolean] = js.undefined
  /** Level of information for webpack-hot-client to output */
  var logLevel: js.UndefOr[trace | debug | info | warn | error | silent] = js.undefined
  /** Prepend timestamp to each log line */
  var logTime: js.UndefOr[Boolean] = js.undefined
  /** Port that the WebSocket listens on */
  var port: js.UndefOr[Double] = js.undefined
  /** Reload the page if a patch cannot be applied by webpack */
  var reload: js.UndefOr[Boolean] = js.undefined
  /** Server instance for webpack-hot-client to connect to */
  var server: js.UndefOr[Server] = js.undefined
  /** Webpack stats configuration */
  var stats: js.UndefOr[Stats] = js.undefined
  /** Webpack compile target */
  var validTargets: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allEntries: js.UndefOr[Boolean] = js.undefined,
    autoConfigure: js.UndefOr[Boolean] = js.undefined,
    hmr: js.UndefOr[Boolean] = js.undefined,
    host: WebpackHotHost | String = null,
    https: js.UndefOr[Boolean] = js.undefined,
    logLevel: trace | debug | info | warn | error | silent = null,
    logTime: js.UndefOr[Boolean] = js.undefined,
    port: Int | Double = null,
    reload: js.UndefOr[Boolean] = js.undefined,
    server: Server = null,
    stats: Stats = null,
    validTargets: js.Array[String] = null
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

