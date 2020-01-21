package typings.swPrecacheWebpackPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.RegExp
import typings.swPrecache.AnonHandler
import typings.swPrecache.FnMessage
import typings.swPrecacheWebpackPlugin.AnonChunkName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends _Options {
  var filename: js.UndefOr[String] = js.undefined
  var filepath: js.UndefOr[String] = js.undefined
  // override sw-precache options
  @JSName("importScripts")
  var importScripts_Options: js.UndefOr[js.Array[String | AnonChunkName]] = js.undefined
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
    importScripts: js.Array[String | AnonChunkName] = null,
    logger: FnMessage = null,
    maximumFileSizeToCacheInBytes: Int | Double = null,
    mergeStaticsConfig: js.UndefOr[Boolean] = js.undefined,
    minify: js.UndefOr[Boolean] = js.undefined,
    navigateFallback: String = null,
    navigateFallbackWhitelist: js.Array[RegExp] = null,
    replacePrefix: String = null,
    runtimeCaching: js.Array[AnonHandler] = null,
    skipWaiting: js.UndefOr[Boolean] = js.undefined,
    staticFileGlobs: js.Array[String] = null,
    staticFileGlobsIgnorePatterns: js.Array[RegExp] = null,
    stripPrefix: String = null,
    stripPrefixMulti: StringDictionary[String] = null,
    templateFilePath: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cacheId != null) __obj.updateDynamic("cacheId")(cacheId.asInstanceOf[js.Any])
    if (!js.isUndefined(clientsClaim)) __obj.updateDynamic("clientsClaim")(clientsClaim.asInstanceOf[js.Any])
    if (directoryIndex != null) __obj.updateDynamic("directoryIndex")(directoryIndex.asInstanceOf[js.Any])
    if (dontCacheBustUrlsMatching != null) __obj.updateDynamic("dontCacheBustUrlsMatching")(dontCacheBustUrlsMatching.asInstanceOf[js.Any])
    if (dynamicUrlToDependencies != null) __obj.updateDynamic("dynamicUrlToDependencies")(dynamicUrlToDependencies.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (filepath != null) __obj.updateDynamic("filepath")(filepath.asInstanceOf[js.Any])
    if (!js.isUndefined(handleFetch)) __obj.updateDynamic("handleFetch")(handleFetch.asInstanceOf[js.Any])
    if (ignoreUrlParametersMatching != null) __obj.updateDynamic("ignoreUrlParametersMatching")(ignoreUrlParametersMatching.asInstanceOf[js.Any])
    if (importScripts != null) __obj.updateDynamic("importScripts")(importScripts.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (maximumFileSizeToCacheInBytes != null) __obj.updateDynamic("maximumFileSizeToCacheInBytes")(maximumFileSizeToCacheInBytes.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeStaticsConfig)) __obj.updateDynamic("mergeStaticsConfig")(mergeStaticsConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(minify)) __obj.updateDynamic("minify")(minify.asInstanceOf[js.Any])
    if (navigateFallback != null) __obj.updateDynamic("navigateFallback")(navigateFallback.asInstanceOf[js.Any])
    if (navigateFallbackWhitelist != null) __obj.updateDynamic("navigateFallbackWhitelist")(navigateFallbackWhitelist.asInstanceOf[js.Any])
    if (replacePrefix != null) __obj.updateDynamic("replacePrefix")(replacePrefix.asInstanceOf[js.Any])
    if (runtimeCaching != null) __obj.updateDynamic("runtimeCaching")(runtimeCaching.asInstanceOf[js.Any])
    if (!js.isUndefined(skipWaiting)) __obj.updateDynamic("skipWaiting")(skipWaiting.asInstanceOf[js.Any])
    if (staticFileGlobs != null) __obj.updateDynamic("staticFileGlobs")(staticFileGlobs.asInstanceOf[js.Any])
    if (staticFileGlobsIgnorePatterns != null) __obj.updateDynamic("staticFileGlobsIgnorePatterns")(staticFileGlobsIgnorePatterns.asInstanceOf[js.Any])
    if (stripPrefix != null) __obj.updateDynamic("stripPrefix")(stripPrefix.asInstanceOf[js.Any])
    if (stripPrefixMulti != null) __obj.updateDynamic("stripPrefixMulti")(stripPrefixMulti.asInstanceOf[js.Any])
    if (templateFilePath != null) __obj.updateDynamic("templateFilePath")(templateFilePath.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

