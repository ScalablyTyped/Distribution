package typings
package swDashPrecacheDashWebpackDashPluginLib.swDashPrecacheDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// workaround to override parent types
trait _Options
  extends swDashPrecacheLib.swDashPrecacheMod.Options {
  @JSName("importScripts")
  var importScripts__Options: js.UndefOr[js.Any] = js.undefined
}

object _Options {
  @scala.inline
  def apply(
    cacheId: java.lang.String = null,
    clientsClaim: js.UndefOr[scala.Boolean] = js.undefined,
    directoryIndex: java.lang.String = null,
    dontCacheBustUrlsMatching: stdLib.RegExp = null,
    dynamicUrlToDependencies: org.scalablytyped.runtime.StringDictionary[java.lang.String | nodeLib.Buffer | js.Array[java.lang.String]] = null,
    handleFetch: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreUrlParametersMatching: js.Array[stdLib.RegExp] = null,
    importScripts: js.Any = null,
    logger: js.Function0[scala.Unit] | (js.Function2[/* message */ js.Any, /* repeated */ js.Any, scala.Unit]) = null,
    maximumFileSizeToCacheInBytes: scala.Int | scala.Double = null,
    navigateFallback: java.lang.String = null,
    navigateFallbackWhitelist: js.Array[stdLib.RegExp] = null,
    replacePrefix: java.lang.String = null,
    runtimeCaching: js.Array[swDashPrecacheLib.Anon_Handler] = null,
    skipWaiting: js.UndefOr[scala.Boolean] = js.undefined,
    staticFileGlobs: js.Array[java.lang.String] = null,
    stripPrefix: java.lang.String = null,
    stripPrefixMulti: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    templateFilePath: java.lang.String = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
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
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
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

