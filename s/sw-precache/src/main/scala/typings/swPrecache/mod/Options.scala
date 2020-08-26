package typings.swPrecache.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var cacheId: js.UndefOr[String] = js.native
  var clientsClaim: js.UndefOr[Boolean] = js.native
  var directoryIndex: js.UndefOr[String] = js.native
  var dontCacheBustUrlsMatching: js.UndefOr[RegExp] = js.native
  var dynamicUrlToDependencies: js.UndefOr[StringDictionary[String | Buffer | js.Array[String]]] = js.native
  var handleFetch: js.UndefOr[Boolean] = js.native
  var ignoreUrlParametersMatching: js.UndefOr[js.Array[RegExp]] = js.native
  var importScripts: js.UndefOr[js.Array[String]] = js.native
  var logger: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var maximumFileSizeToCacheInBytes: js.UndefOr[Double] = js.native
  var navigateFallback: js.UndefOr[String] = js.native
  var navigateFallbackWhitelist: js.UndefOr[js.Array[RegExp]] = js.native
  var replacePrefix: js.UndefOr[String] = js.native
  var runtimeCaching: js.UndefOr[js.Array[typings.swPrecache.anon.Handler]] = js.native
  var skipWaiting: js.UndefOr[Boolean] = js.native
  var staticFileGlobs: js.UndefOr[js.Array[String]] = js.native
  var stripPrefix: js.UndefOr[String] = js.native
  var stripPrefixMulti: js.UndefOr[StringDictionary[String]] = js.native
  var templateFilePath: js.UndefOr[String] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCacheId(value: String): Self = this.set("cacheId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheId: Self = this.set("cacheId", js.undefined)
    @scala.inline
    def setClientsClaim(value: Boolean): Self = this.set("clientsClaim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientsClaim: Self = this.set("clientsClaim", js.undefined)
    @scala.inline
    def setDirectoryIndex(value: String): Self = this.set("directoryIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryIndex: Self = this.set("directoryIndex", js.undefined)
    @scala.inline
    def setDontCacheBustUrlsMatching(value: RegExp): Self = this.set("dontCacheBustUrlsMatching", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDontCacheBustUrlsMatching: Self = this.set("dontCacheBustUrlsMatching", js.undefined)
    @scala.inline
    def setDynamicUrlToDependencies(value: StringDictionary[String | Buffer | js.Array[String]]): Self = this.set("dynamicUrlToDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicUrlToDependencies: Self = this.set("dynamicUrlToDependencies", js.undefined)
    @scala.inline
    def setHandleFetch(value: Boolean): Self = this.set("handleFetch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleFetch: Self = this.set("handleFetch", js.undefined)
    @scala.inline
    def setIgnoreUrlParametersMatchingVarargs(value: RegExp*): Self = this.set("ignoreUrlParametersMatching", js.Array(value :_*))
    @scala.inline
    def setIgnoreUrlParametersMatching(value: js.Array[RegExp]): Self = this.set("ignoreUrlParametersMatching", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUrlParametersMatching: Self = this.set("ignoreUrlParametersMatching", js.undefined)
    @scala.inline
    def setImportScriptsVarargs(value: String*): Self = this.set("importScripts", js.Array(value :_*))
    @scala.inline
    def setImportScripts(value: js.Array[String]): Self = this.set("importScripts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportScripts: Self = this.set("importScripts", js.undefined)
    @scala.inline
    def setLogger(value: /* repeated */ js.Any => Unit): Self = this.set("logger", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setMaximumFileSizeToCacheInBytes(value: Double): Self = this.set("maximumFileSizeToCacheInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumFileSizeToCacheInBytes: Self = this.set("maximumFileSizeToCacheInBytes", js.undefined)
    @scala.inline
    def setNavigateFallback(value: String): Self = this.set("navigateFallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigateFallback: Self = this.set("navigateFallback", js.undefined)
    @scala.inline
    def setNavigateFallbackWhitelistVarargs(value: RegExp*): Self = this.set("navigateFallbackWhitelist", js.Array(value :_*))
    @scala.inline
    def setNavigateFallbackWhitelist(value: js.Array[RegExp]): Self = this.set("navigateFallbackWhitelist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigateFallbackWhitelist: Self = this.set("navigateFallbackWhitelist", js.undefined)
    @scala.inline
    def setReplacePrefix(value: String): Self = this.set("replacePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplacePrefix: Self = this.set("replacePrefix", js.undefined)
    @scala.inline
    def setRuntimeCachingVarargs(value: typings.swPrecache.anon.Handler*): Self = this.set("runtimeCaching", js.Array(value :_*))
    @scala.inline
    def setRuntimeCaching(value: js.Array[typings.swPrecache.anon.Handler]): Self = this.set("runtimeCaching", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntimeCaching: Self = this.set("runtimeCaching", js.undefined)
    @scala.inline
    def setSkipWaiting(value: Boolean): Self = this.set("skipWaiting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipWaiting: Self = this.set("skipWaiting", js.undefined)
    @scala.inline
    def setStaticFileGlobsVarargs(value: String*): Self = this.set("staticFileGlobs", js.Array(value :_*))
    @scala.inline
    def setStaticFileGlobs(value: js.Array[String]): Self = this.set("staticFileGlobs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticFileGlobs: Self = this.set("staticFileGlobs", js.undefined)
    @scala.inline
    def setStripPrefix(value: String): Self = this.set("stripPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripPrefix: Self = this.set("stripPrefix", js.undefined)
    @scala.inline
    def setStripPrefixMulti(value: StringDictionary[String]): Self = this.set("stripPrefixMulti", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripPrefixMulti: Self = this.set("stripPrefixMulti", js.undefined)
    @scala.inline
    def setTemplateFilePath(value: String): Self = this.set("templateFilePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateFilePath: Self = this.set("templateFilePath", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

