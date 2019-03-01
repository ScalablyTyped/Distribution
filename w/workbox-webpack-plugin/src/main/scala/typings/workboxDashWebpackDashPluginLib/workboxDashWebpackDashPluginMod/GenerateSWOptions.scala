package typings
package workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateSWOptions extends CommonOptions {
  /**
  	 * An optional ID to be prepended to cache names used by Workbox.
  	 *
  	 * This is primarily useful for local development where multiple sites may be served from the same `http://localhost:port` origin.
  	 *
  	 * @default null
  	 * @example cacheId: 'my-app'
  	 */
  var cacheId: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
  	 * Whether or not the service worker should [start controlling](https://developers.google.com/web/fundamentals/primers/service-workers/lifecycle#clientsclaim)
  	 * any existing clients as soon as it activates.
  	 *
  	 * @default false
  	 * @example clientsClaim: true
  	 */
  var clientsClaim: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If a [navigation request](https://developers.google.com/web/fundamentals/primers/service-workers/high-performance-loading#first_what_are_navigation_requests)
  	 * for a URL ending in `/` fails to match a precached URL, this value will be appended to the URL and that will be checked for a precache match.
  	 *
  	 * This should be configured to whatever your web server is using, if anything, for its [directory index](https://httpd.apache.org/docs/2.0/mod/mod_dir.html).
  	 *
  	 * @default 'index.html'
  	 * @example directoryIndex: 'index.html'
  	 */
  var directoryIndex: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Any search parameter names that match against one of the regex's in this array will be removed before looking for a precache match.
  	 *
  	 * This is useful if your users might request URLs that contain, for example, URL parameters used to track the source of the traffic.
  	 * Those URL parameters would normally cause the cache lookup to fail, since the URL strings used as cache keys would not be expected to include them.
  	 *
  	 * @default [/^utm_/]
  	 * @example ignoreUrlParametersMatching: [/./]
  	 */
  var ignoreUrlParametersMatching: js.UndefOr[js.Array[stdLib.RegExp]] = js.undefined
  /**
  	 * An required list of JavaScript files that should be passed to
  	 * [`importScripts()`](https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/importScripts) inside the generated service worker file.
  	 *
  	 * If one of the imported files sets the `self.__precacheManifest` variable to an array of
  	 * [`ManifestEntrys`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-build#.ManifestEntry),
  	 * those entries will be automatically precached in the generated service worker.
  	 *
  	 * This is also useful when you want to let Workbox create your top-level service worker file, but want to include some additional code, such as a `push` event listener.
  	 *
  	 * @default []
  	 * @example importScripts: ['push-notifications.abcd1234.js']
  	 */
  var importScripts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  	 * This will be used to create a [`NavigationRoute`](https://developers.google.com/web/tools/workbox/reference-docs/latest/workbox.routing.NavigationRoute)
  	 * that will respond to [navigation requests](https://developers.google.com/web/fundamentals/primers/service-workers/high-performance-loading#first_what_are_navigation_requests)
  	 * for URLs that that aren't precached.
  	 *
  	 * This is meant to be used in a [Single Page App](https://en.wikipedia.org/wiki/Single-page_application) scenario, in which you want all navigations to use common App Shell HTML.
  	 *
  	 * It's not intended for use as a fallback that's displayed when the browser is offline.
  	 *
  	 * @default undefined
  	 * @example navigateFallback: '/app-shell'
  	 */
  var navigateFallback: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * An optional array of regular expressions that restricts which URLs the configured navigateFallback behavior applies to.
  	 *
  	 * This is useful if only a subset of your site's URLs should be treated as being part of a Single Page App.
  	 *
  	 * If both navigateFallbackBlacklist and navigateFallbackWhitelist are configured, the blacklist takes precedent.
  	 *
  	 * @default []
  	 * @example navigateFallbackBlacklist: [/^\/_/, /admin/]
  	 */
  var navigateFallbackBlacklist: js.UndefOr[js.Array[stdLib.RegExp]] = js.undefined
  /**
  	 * An optional array of regular expressions that restricts which URLs the configured navigateFallback behavior applies to.
  	 *
  	 * This is useful if only a subset of your site's URLs should be treated as being part of a Single Page App.
  	 *
  	 * If both navigateFallbackBlacklist and navigateFallbackWhitelist are configured, the blacklist takes precedent.
  	 *
  	 * @default []
  	 * @example navigateFallbackWhitelist: [/^\/pages/]
  	 */
  var navigateFallbackWhitelist: js.UndefOr[js.Array[stdLib.RegExp]] = js.undefined
  /**
  	 * Controls whether or not to include support for [offline Google Analytics](https://developers.google.com/web/tools/workbox/guides/enable-offline-analytics).
  	 *
  	 * When `true`, `workbox.googleAnalytics.initialize()` will be added to your new service worker file.
  	 *
  	 * @default false
  	 * @example offlineGoogleAnalytics: true
  	 */
  var offlineGoogleAnalytics: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Passing in an array of objects containing `urlPatterns`, `handlers`, and potentially `options` will add the appropriate code to the generated service worker to handle runtime caching.
  	 *
  	 * Requests for precached URLs that are picked up via `globPatterns` are handled by default, and don't need to be accommodated in `runtimeCaching`.
  	 *
  	 * @default []
  	 */
  var runtimeCaching: js.UndefOr[js.Array[RuntimeCacheRule]] = js.undefined
  /**
  	 * Whether or not the service worker should skip over the waiting lifecycle stage. Normally this is used with `clientsClaim: true`.
  	 *
  	 * @default false
  	 * @example skipWaiting: true
  	 */
  var skipWaiting: js.UndefOr[scala.Boolean] = js.undefined
}

object GenerateSWOptions {
  @scala.inline
  def apply(
    cacheId: java.lang.String = null,
    chunks: js.Array[java.lang.String] = null,
    clientsClaim: js.UndefOr[scala.Boolean] = js.undefined,
    directoryIndex: java.lang.String = null,
    dontCacheBustUrlsMatching: stdLib.RegExp = null,
    exclude: js.Array[java.lang.String | stdLib.RegExp] = null,
    excludeChunks: js.Array[java.lang.String] = null,
    globDirectory: java.lang.String = null,
    globFollow: js.UndefOr[scala.Boolean] = js.undefined,
    globIgnores: js.Array[java.lang.String] = null,
    globPatterns: js.Array[java.lang.String] = null,
    globStrict: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreUrlParametersMatching: js.Array[stdLib.RegExp] = null,
    importScripts: js.Array[java.lang.String] = null,
    importWorkboxFrom: workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginLibStrings.cdn | workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginLibStrings.local | workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginLibStrings.disabled = null,
    importsDirectory: java.lang.String = null,
    include: js.Array[java.lang.String | stdLib.RegExp] = null,
    manifestTransforms: js.Array[
      js.Function1[
        /* originalManifest */ js.Array[ManifestEntry], 
        workboxDashWebpackDashPluginLib.Anon_Manifest
      ]
    ] = null,
    maximumFileSizeToCacheInBytes: scala.Int | scala.Double = null,
    modifyUrlPrefix: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    navigateFallback: java.lang.String = null,
    navigateFallbackBlacklist: js.Array[stdLib.RegExp] = null,
    navigateFallbackWhitelist: js.Array[stdLib.RegExp] = null,
    offlineGoogleAnalytics: js.UndefOr[scala.Boolean] = js.undefined,
    precacheManifestFilename: java.lang.String = null,
    runtimeCaching: js.Array[RuntimeCacheRule] = null,
    skipWaiting: js.UndefOr[scala.Boolean] = js.undefined,
    swDest: java.lang.String = null,
    templatedUrls: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]] = null,
    test: js.Array[java.lang.String | stdLib.RegExp] = null
  ): GenerateSWOptions = {
    val __obj = js.Dynamic.literal()
    if (cacheId != null) __obj.updateDynamic("cacheId")(cacheId)
    if (chunks != null) __obj.updateDynamic("chunks")(chunks)
    if (!js.isUndefined(clientsClaim)) __obj.updateDynamic("clientsClaim")(clientsClaim)
    if (directoryIndex != null) __obj.updateDynamic("directoryIndex")(directoryIndex)
    if (dontCacheBustUrlsMatching != null) __obj.updateDynamic("dontCacheBustUrlsMatching")(dontCacheBustUrlsMatching)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (excludeChunks != null) __obj.updateDynamic("excludeChunks")(excludeChunks)
    if (globDirectory != null) __obj.updateDynamic("globDirectory")(globDirectory)
    if (!js.isUndefined(globFollow)) __obj.updateDynamic("globFollow")(globFollow)
    if (globIgnores != null) __obj.updateDynamic("globIgnores")(globIgnores)
    if (globPatterns != null) __obj.updateDynamic("globPatterns")(globPatterns)
    if (!js.isUndefined(globStrict)) __obj.updateDynamic("globStrict")(globStrict)
    if (ignoreUrlParametersMatching != null) __obj.updateDynamic("ignoreUrlParametersMatching")(ignoreUrlParametersMatching)
    if (importScripts != null) __obj.updateDynamic("importScripts")(importScripts)
    if (importWorkboxFrom != null) __obj.updateDynamic("importWorkboxFrom")(importWorkboxFrom.asInstanceOf[js.Any])
    if (importsDirectory != null) __obj.updateDynamic("importsDirectory")(importsDirectory)
    if (include != null) __obj.updateDynamic("include")(include)
    if (manifestTransforms != null) __obj.updateDynamic("manifestTransforms")(manifestTransforms)
    if (maximumFileSizeToCacheInBytes != null) __obj.updateDynamic("maximumFileSizeToCacheInBytes")(maximumFileSizeToCacheInBytes.asInstanceOf[js.Any])
    if (modifyUrlPrefix != null) __obj.updateDynamic("modifyUrlPrefix")(modifyUrlPrefix)
    if (navigateFallback != null) __obj.updateDynamic("navigateFallback")(navigateFallback)
    if (navigateFallbackBlacklist != null) __obj.updateDynamic("navigateFallbackBlacklist")(navigateFallbackBlacklist)
    if (navigateFallbackWhitelist != null) __obj.updateDynamic("navigateFallbackWhitelist")(navigateFallbackWhitelist)
    if (!js.isUndefined(offlineGoogleAnalytics)) __obj.updateDynamic("offlineGoogleAnalytics")(offlineGoogleAnalytics)
    if (precacheManifestFilename != null) __obj.updateDynamic("precacheManifestFilename")(precacheManifestFilename)
    if (runtimeCaching != null) __obj.updateDynamic("runtimeCaching")(runtimeCaching)
    if (!js.isUndefined(skipWaiting)) __obj.updateDynamic("skipWaiting")(skipWaiting)
    if (swDest != null) __obj.updateDynamic("swDest")(swDest)
    if (templatedUrls != null) __obj.updateDynamic("templatedUrls")(templatedUrls)
    if (test != null) __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[GenerateSWOptions]
  }
}

