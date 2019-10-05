package typings.webpackDashDevDashMiddleware.webpackDashDevDashMiddlewareMod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.webpackMod.Options.Stats
import typings.webpack.webpackMod.Options.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var filename: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var index: js.UndefOr[String | Boolean] = js.undefined
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var logLevel: js.UndefOr[String] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var publicPath: String
  var reporter: js.UndefOr[Reporter | Null] = js.undefined
  var serverSideRender: js.UndefOr[Boolean] = js.undefined
  var stats: js.UndefOr[Stats] = js.undefined
  var watchOptions: js.UndefOr[WatchOptions] = js.undefined
  var writeToDisk: js.UndefOr[Boolean | (js.Function1[/* filename */ String, Boolean])] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    publicPath: String,
    filename: String = null,
    headers: StringDictionary[String] = null,
    index: String | Boolean = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    logLevel: String = null,
    logger: Logger = null,
    reporter: (/* middlewareOptions */ Options, /* reporterOptions */ ReporterOptions) => Unit = null,
    serverSideRender: js.UndefOr[Boolean] = js.undefined,
    stats: Stats = null,
    watchOptions: WatchOptions = null,
    writeToDisk: Boolean | (js.Function1[/* filename */ String, Boolean]) = null
  ): Options = {
    val __obj = js.Dynamic.literal(publicPath = publicPath)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (reporter != null) __obj.updateDynamic("reporter")(js.Any.fromFunction2(reporter))
    if (!js.isUndefined(serverSideRender)) __obj.updateDynamic("serverSideRender")(serverSideRender)
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (watchOptions != null) __obj.updateDynamic("watchOptions")(watchOptions)
    if (writeToDisk != null) __obj.updateDynamic("writeToDisk")(writeToDisk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

