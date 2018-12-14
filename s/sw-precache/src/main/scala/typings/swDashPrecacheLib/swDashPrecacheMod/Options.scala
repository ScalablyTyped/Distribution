package typings
package swDashPrecacheLib.swDashPrecacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var cacheId: js.UndefOr[java.lang.String] = js.undefined
  var clientsClaim: js.UndefOr[scala.Boolean] = js.undefined
  var directoryIndex: js.UndefOr[java.lang.String] = js.undefined
  var dontCacheBustUrlsMatching: js.UndefOr[stdLib.RegExp] = js.undefined
  var dynamicUrlToDependencies: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | nodeLib.Buffer | js.Array[java.lang.String]]
  ] = js.undefined
  var handleFetch: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreUrlParametersMatching: js.UndefOr[js.Array[stdLib.RegExp]] = js.undefined
  var importScripts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var logger: js.UndefOr[
    js.Function0[scala.Unit] | (js.Function2[/* message */ js.Any, /* repeated */js.Any, scala.Unit])
  ] = js.undefined
  var maximumFileSizeToCacheInBytes: js.UndefOr[scala.Double] = js.undefined
  var navigateFallback: js.UndefOr[java.lang.String] = js.undefined
  var navigateFallbackWhitelist: js.UndefOr[js.Array[stdLib.RegExp]] = js.undefined
  var replacePrefix: js.UndefOr[java.lang.String] = js.undefined
  var runtimeCaching: js.UndefOr[js.Array[swDashPrecacheLib.Anon_UrlPattern]] = js.undefined
  var skipWaiting: js.UndefOr[scala.Boolean] = js.undefined
  var staticFileGlobs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var stripPrefix: js.UndefOr[java.lang.String] = js.undefined
  var stripPrefixMulti: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var templateFilePath: js.UndefOr[java.lang.String] = js.undefined
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

