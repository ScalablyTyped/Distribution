package typings
package webpackDashDevDashMiddlewareLib.webpackDashDevDashMiddlewareMod.WebpackDevMiddlewareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var index: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  var logLevel: js.UndefOr[java.lang.String] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var publicPath: java.lang.String
  var reporter: js.UndefOr[Reporter | scala.Null] = js.undefined
  var serverSideRender: js.UndefOr[scala.Boolean] = js.undefined
  var stats: js.UndefOr[webpackLib.webpackMod.webpackNs.OptionsNs.Stats] = js.undefined
  var watchOptions: js.UndefOr[webpackLib.webpackMod.webpackNs.OptionsNs.WatchOptions] = js.undefined
  var writeToDisk: js.UndefOr[scala.Boolean | (js.Function1[/* filename */ java.lang.String, scala.Boolean])] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    publicPath: java.lang.String,
    filename: java.lang.String = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    index: java.lang.String | scala.Boolean = null,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    logLevel: java.lang.String = null,
    logger: Logger = null,
    reporter: Reporter = null,
    serverSideRender: js.UndefOr[scala.Boolean] = js.undefined,
    stats: webpackLib.webpackMod.webpackNs.OptionsNs.Stats = null,
    watchOptions: webpackLib.webpackMod.webpackNs.OptionsNs.WatchOptions = null,
    writeToDisk: scala.Boolean | (js.Function1[/* filename */ java.lang.String, scala.Boolean]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("publicPath")(publicPath)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (reporter != null) __obj.updateDynamic("reporter")(reporter)
    if (!js.isUndefined(serverSideRender)) __obj.updateDynamic("serverSideRender")(serverSideRender)
    if (stats != null) __obj.updateDynamic("stats")(stats)
    if (watchOptions != null) __obj.updateDynamic("watchOptions")(watchOptions)
    if (writeToDisk != null) __obj.updateDynamic("writeToDisk")(writeToDisk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

