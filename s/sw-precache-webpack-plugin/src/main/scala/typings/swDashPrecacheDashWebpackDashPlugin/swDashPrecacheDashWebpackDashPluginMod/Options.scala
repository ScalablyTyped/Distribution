package typings.swDashPrecacheDashWebpackDashPlugin.swDashPrecacheDashWebpackDashPluginMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.RegExp
import typings.swDashPrecache.Anon_Handler
import typings.swDashPrecache.Fn_Message
import typings.swDashPrecacheDashWebpackDashPlugin.Anon_ChunkName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends _Options {
  var filename: js.UndefOr[String] = js.undefined
  var filepath: js.UndefOr[String] = js.undefined
  // override sw-precache options
  @JSName("importScripts")
  var importScripts_Options: js.UndefOr[js.Array[String | Anon_ChunkName]] = js.undefined
  var mergeStaticsConfig: js.UndefOr[Boolean] = js.undefined
  var minify: js.UndefOr[Boolean] = js.undefined
  var staticFileGlobsIgnorePatterns: js.UndefOr[js.Array[RegExp]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cacheId: String = null,
    clientsClaim: js.UndefOr[Boolean] = js.undefined,
    directoryIndex: String = null,
    dontCacheBustUrlsMatching: RegExp = null,
    dynamicUrlToDependencies: StringDictionary[String | Buffer | js.Array[String]] = null,
    filename: String = null,
    filepath: String = null,
    handleFetch: js.UndefOr[Boolean] = js.undefined,
    ignoreUrlParametersMatching: js.Array[RegExp] = null,
    importScripts: js.Array[String | Anon_ChunkName] = null,
    logger: Fn_Message = null,
    maximumFileSizeToCacheInBytes: Int | Double = null,
    mergeStaticsConfig: js.UndefOr[Boolean] = js.undefined,
    minify: js.UndefOr[Boolean] = js.undefined,
    navigateFallback: String = null,
    navigateFallbackWhitelist: js.Array[RegExp] = null,
    replacePrefix: String = null,
    runtimeCaching: js.Array[Anon_Handler] = null,
    skipWaiting: js.UndefOr[Boolean] = js.undefined,
    staticFileGlobs: js.Array[String] = null,
    staticFileGlobsIgnorePatterns: js.Array[RegExp] = null,
    stripPrefix: String = null,
    stripPrefixMulti: StringDictionary[String] = null,
    templateFilePath: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cacheId != null) __obj.updateDynamic("cacheId")(cacheId)
    if (!js.isUndefined(clientsClaim)) __obj.updateDynamic("clientsClaim")(clientsClaim)
    if (directoryIndex != null) __obj.updateDynamic("directoryIndex")(directoryIndex)
    if (dontCacheBustUrlsMatching != null) __obj.updateDynamic("dontCacheBustUrlsMatching")(dontCacheBustUrlsMatching)
    if (dynamicUrlToDependencies != null) __obj.updateDynamic("dynamicUrlToDependencies")(dynamicUrlToDependencies)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (filepath != null) __obj.updateDynamic("filepath")(filepath)
    if (!js.isUndefined(handleFetch)) __obj.updateDynamic("handleFetch")(handleFetch)
    if (ignoreUrlParametersMatching != null) __obj.updateDynamic("ignoreUrlParametersMatching")(ignoreUrlParametersMatching)
    if (importScripts != null) __obj.updateDynamic("importScripts")(importScripts)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (maximumFileSizeToCacheInBytes != null) __obj.updateDynamic("maximumFileSizeToCacheInBytes")(maximumFileSizeToCacheInBytes.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeStaticsConfig)) __obj.updateDynamic("mergeStaticsConfig")(mergeStaticsConfig)
    if (!js.isUndefined(minify)) __obj.updateDynamic("minify")(minify)
    if (navigateFallback != null) __obj.updateDynamic("navigateFallback")(navigateFallback)
    if (navigateFallbackWhitelist != null) __obj.updateDynamic("navigateFallbackWhitelist")(navigateFallbackWhitelist)
    if (replacePrefix != null) __obj.updateDynamic("replacePrefix")(replacePrefix)
    if (runtimeCaching != null) __obj.updateDynamic("runtimeCaching")(runtimeCaching)
    if (!js.isUndefined(skipWaiting)) __obj.updateDynamic("skipWaiting")(skipWaiting)
    if (staticFileGlobs != null) __obj.updateDynamic("staticFileGlobs")(staticFileGlobs)
    if (staticFileGlobsIgnorePatterns != null) __obj.updateDynamic("staticFileGlobsIgnorePatterns")(staticFileGlobsIgnorePatterns)
    if (stripPrefix != null) __obj.updateDynamic("stripPrefix")(stripPrefix)
    if (stripPrefixMulti != null) __obj.updateDynamic("stripPrefixMulti")(stripPrefixMulti)
    if (templateFilePath != null) __obj.updateDynamic("templateFilePath")(templateFilePath)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Options]
  }
}

