package typings.swDashPrecacheDashWebpackDashPlugin.swDashPrecacheDashWebpackDashPluginMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.RegExp
import typings.swDashPrecache.Anon_Handler
import typings.swDashPrecache.Fn_Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// workaround to override parent types
trait _Options
  extends typings.swDashPrecache.swDashPrecacheMod.Options {
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
    logger: Fn_Message = null,
    maximumFileSizeToCacheInBytes: Int | Double = null,
    navigateFallback: String = null,
    navigateFallbackWhitelist: js.Array[RegExp] = null,
    replacePrefix: String = null,
    runtimeCaching: js.Array[Anon_Handler] = null,
    skipWaiting: js.UndefOr[Boolean] = js.undefined,
    staticFileGlobs: js.Array[String] = null,
    stripPrefix: String = null,
    stripPrefixMulti: StringDictionary[String] = null,
    templateFilePath: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): _Options = {
    val __obj = js.Dynamic.literal()
    if (cacheId != null) __obj.updateDynamic("cacheId")(cacheId)
    if (!js.isUndefined(clientsClaim)) __obj.updateDynamic("clientsClaim")(clientsClaim)
    if (directoryIndex != null) __obj.updateDynamic("directoryIndex")(directoryIndex)
    if (dontCacheBustUrlsMatching != null) __obj.updateDynamic("dontCacheBustUrlsMatching")(dontCacheBustUrlsMatching)
    if (dynamicUrlToDependencies != null) __obj.updateDynamic("dynamicUrlToDependencies")(dynamicUrlToDependencies)
    if (!js.isUndefined(handleFetch)) __obj.updateDynamic("handleFetch")(handleFetch)
    if (ignoreUrlParametersMatching != null) __obj.updateDynamic("ignoreUrlParametersMatching")(ignoreUrlParametersMatching)
    if (importScripts != null) __obj.updateDynamic("importScripts")(importScripts)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (maximumFileSizeToCacheInBytes != null) __obj.updateDynamic("maximumFileSizeToCacheInBytes")(maximumFileSizeToCacheInBytes.asInstanceOf[js.Any])
    if (navigateFallback != null) __obj.updateDynamic("navigateFallback")(navigateFallback)
    if (navigateFallbackWhitelist != null) __obj.updateDynamic("navigateFallbackWhitelist")(navigateFallbackWhitelist)
    if (replacePrefix != null) __obj.updateDynamic("replacePrefix")(replacePrefix)
    if (runtimeCaching != null) __obj.updateDynamic("runtimeCaching")(runtimeCaching)
    if (!js.isUndefined(skipWaiting)) __obj.updateDynamic("skipWaiting")(skipWaiting)
    if (staticFileGlobs != null) __obj.updateDynamic("staticFileGlobs")(staticFileGlobs)
    if (stripPrefix != null) __obj.updateDynamic("stripPrefix")(stripPrefix)
    if (stripPrefixMulti != null) __obj.updateDynamic("stripPrefixMulti")(stripPrefixMulti)
    if (templateFilePath != null) __obj.updateDynamic("templateFilePath")(templateFilePath)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[_Options]
  }
}

