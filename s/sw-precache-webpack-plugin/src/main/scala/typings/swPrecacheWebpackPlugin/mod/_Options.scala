package typings.swPrecacheWebpackPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.RegExp
import typings.swPrecache.AnonHandler
import typings.swPrecache.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// workaround to override parent types
trait _Options
  extends typings.swPrecache.mod.Options {
  @JSName("importScripts")
  var importScripts__Options: js.UndefOr[js.Any] = js.undefined
}

object _Options {
  @scala.inline
  def apply(
    cacheId: String = null,
    clientsClaim: js.UndefOr[Boolean] = js.undefined,
    directoryIndex: String = null,
    dontCacheBustUrlsMatching: RegExp = null,
    dynamicUrlToDependencies: StringDictionary[String | Buffer | js.Array[String]] = null,
    handleFetch: js.UndefOr[Boolean] = js.undefined,
    ignoreUrlParametersMatching: js.Array[RegExp] = null,
    importScripts: js.Any = null,
    logger: FnCall = null,
    maximumFileSizeToCacheInBytes: Int | Double = null,
    navigateFallback: String = null,
    navigateFallbackWhitelist: js.Array[RegExp] = null,
    replacePrefix: String = null,
    runtimeCaching: js.Array[AnonHandler] = null,
    skipWaiting: js.UndefOr[Boolean] = js.undefined,
    staticFileGlobs: js.Array[String] = null,
    stripPrefix: String = null,
    stripPrefixMulti: StringDictionary[String] = null,
    templateFilePath: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): _Options = {
    val __obj = js.Dynamic.literal()
    if (cacheId != null) __obj.updateDynamic("cacheId")(cacheId.asInstanceOf[js.Any])
    if (!js.isUndefined(clientsClaim)) __obj.updateDynamic("clientsClaim")(clientsClaim.asInstanceOf[js.Any])
    if (directoryIndex != null) __obj.updateDynamic("directoryIndex")(directoryIndex.asInstanceOf[js.Any])
    if (dontCacheBustUrlsMatching != null) __obj.updateDynamic("dontCacheBustUrlsMatching")(dontCacheBustUrlsMatching.asInstanceOf[js.Any])
    if (dynamicUrlToDependencies != null) __obj.updateDynamic("dynamicUrlToDependencies")(dynamicUrlToDependencies.asInstanceOf[js.Any])
    if (!js.isUndefined(handleFetch)) __obj.updateDynamic("handleFetch")(handleFetch.asInstanceOf[js.Any])
    if (ignoreUrlParametersMatching != null) __obj.updateDynamic("ignoreUrlParametersMatching")(ignoreUrlParametersMatching.asInstanceOf[js.Any])
    if (importScripts != null) __obj.updateDynamic("importScripts")(importScripts.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (maximumFileSizeToCacheInBytes != null) __obj.updateDynamic("maximumFileSizeToCacheInBytes")(maximumFileSizeToCacheInBytes.asInstanceOf[js.Any])
    if (navigateFallback != null) __obj.updateDynamic("navigateFallback")(navigateFallback.asInstanceOf[js.Any])
    if (navigateFallbackWhitelist != null) __obj.updateDynamic("navigateFallbackWhitelist")(navigateFallbackWhitelist.asInstanceOf[js.Any])
    if (replacePrefix != null) __obj.updateDynamic("replacePrefix")(replacePrefix.asInstanceOf[js.Any])
    if (runtimeCaching != null) __obj.updateDynamic("runtimeCaching")(runtimeCaching.asInstanceOf[js.Any])
    if (!js.isUndefined(skipWaiting)) __obj.updateDynamic("skipWaiting")(skipWaiting.asInstanceOf[js.Any])
    if (staticFileGlobs != null) __obj.updateDynamic("staticFileGlobs")(staticFileGlobs.asInstanceOf[js.Any])
    if (stripPrefix != null) __obj.updateDynamic("stripPrefix")(stripPrefix.asInstanceOf[js.Any])
    if (stripPrefixMulti != null) __obj.updateDynamic("stripPrefixMulti")(stripPrefixMulti.asInstanceOf[js.Any])
    if (templateFilePath != null) __obj.updateDynamic("templateFilePath")(templateFilePath.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Options]
  }
}

