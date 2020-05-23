package typings.webpackHotClient.anon

import typings.node.netMod.Server
import typings.webpack.mod.Options.Stats
import typings.webpackHotClient.mod.WebpackHotHost
import typings.webpackHotClient.webpackHotClientStrings.debug
import typings.webpackHotClient.webpackHotClientStrings.error
import typings.webpackHotClient.webpackHotClientStrings.info
import typings.webpackHotClient.webpackHotClientStrings.silent
import typings.webpackHotClient.webpackHotClientStrings.trace
import typings.webpackHotClient.webpackHotClientStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<webpack-hot-client.webpack-hot-client.Options> */
trait ReadonlyOptions extends js.Object {
  val allEntries: js.UndefOr[Boolean] = js.undefined
  val autoConfigure: js.UndefOr[Boolean] = js.undefined
  val hmr: js.UndefOr[Boolean] = js.undefined
  val host: js.UndefOr[WebpackHotHost | String] = js.undefined
  val https: js.UndefOr[Boolean] = js.undefined
  val logLevel: js.UndefOr[trace | debug | info | warn | error | silent] = js.undefined
  val logTime: js.UndefOr[Boolean] = js.undefined
  val port: js.UndefOr[Double] = js.undefined
  val reload: js.UndefOr[Boolean] = js.undefined
  val server: js.UndefOr[Server] = js.undefined
  val stats: js.UndefOr[Stats] = js.undefined
  val validTargets: js.UndefOr[js.Array[String]] = js.undefined
}

object ReadonlyOptions {
  @scala.inline
  def apply(
    allEntries: js.UndefOr[Boolean] = js.undefined,
    autoConfigure: js.UndefOr[Boolean] = js.undefined,
    hmr: js.UndefOr[Boolean] = js.undefined,
    host: WebpackHotHost | String = null,
    https: js.UndefOr[Boolean] = js.undefined,
    logLevel: trace | debug | info | warn | error | silent = null,
    logTime: js.UndefOr[Boolean] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    reload: js.UndefOr[Boolean] = js.undefined,
    server: Server = null,
    stats: Stats = null,
    validTargets: js.Array[String] = null
  ): ReadonlyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allEntries)) __obj.updateDynamic("allEntries")(allEntries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoConfigure)) __obj.updateDynamic("autoConfigure")(autoConfigure.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hmr)) __obj.updateDynamic("hmr")(hmr.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https.get.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(logTime)) __obj.updateDynamic("logTime")(logTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reload)) __obj.updateDynamic("reload")(reload.get.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (validTargets != null) __obj.updateDynamic("validTargets")(validTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyOptions]
  }
}

