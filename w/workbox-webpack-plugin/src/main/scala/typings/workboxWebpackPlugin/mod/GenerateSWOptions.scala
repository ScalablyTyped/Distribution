package typings.workboxWebpackPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.workboxWebpackPlugin.anon.Integrity
import typings.workboxWebpackPlugin.anon.Manifest
import typings.workboxWebpackPlugin.workboxWebpackPluginStrings.production
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateSWOptions extends CommonOptions {
  /**
    * The targets to pass to babel-preset-env when transpiling the service worker bundle
    */
  var babelPresetEnvTargets: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An optional ID to be prepended to cache names used by Workbox.
    *
    * This is primarily useful for local development where multiple sites may be served from the same `http://localhost:port` origin.
    *
    * @default null
    * @example cacheId: 'my-app'
    */
  var cacheId: js.UndefOr[String | Null] = js.undefined
  /**
    * Whether or not Workbox should attempt to identify an delete any precaches created by older, incompatible versions
    */
  var cleanupOutdatedCaches: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not the service worker should [start controlling](https://developers.google.com/web/fundamentals/primers/service-workers/lifecycle#clientsclaim)
    * any existing clients as soon as it activates.
    *
    * @default false
    * @example clientsClaim: true
    */
  var clientsClaim: js.UndefOr[Boolean] = js.undefined
  /**
    * If a [navigation request](https://developers.google.com/web/fundamentals/primers/service-workers/high-performance-loading#first_what_are_navigation_requests)
    * for a URL ending in `/` fails to match a precached URL, this value will be appended to the URL and that will be checked for a precache match.
    *
    * This should be configured to whatever your web server is using, if anything, for its [directory index](https://httpd.apache.org/docs/2.0/mod/mod_dir.html).
    *
    * @default 'index.html'
    * @example directoryIndex: 'index.html'
    */
  var directoryIndex: js.UndefOr[String] = js.undefined
  /**
    * Any search parameter names that match against one of the regex's in this array will be removed before looking for a precache match.
    *
    * This is useful if your users might request URLs that contain, for example, URL parameters used to track the source of the traffic.
    * Those URL parameters would normally cause the cache lookup to fail, since the URL strings used as cache keys would not be expected to include them.
    *
    * @default [/^utm_/]
    * @example ignoreUrlParametersMatching: [/./]
    */
  var ignoreUrlParametersMatching: js.UndefOr[js.Array[RegExp]] = js.undefined
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
  var importScripts: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Whether the runtime code for the Workbox library should be included in the top-level service worker,
    * or split into a separate file that needs to be deployed alongside the service worker. Keeping the runtime separate means
    * that users will not have to re-download the Workbox code each time your top-level service worker changes
    */
  var inlineWorkboxRuntime: js.UndefOr[Boolean] = js.undefined
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
  var navigateFallback: js.UndefOr[String] = js.undefined
  /**
    * An optional array of regular expressions that restricts which URLs the configured navigateFallback behavior applies to.
    *
    * This is useful if only a subset of your site's URLs should be treated as being part of a Single Page App.
    *
    * If both navigateFallbackDenylist and navigateFallbackAllowlist are configured, the blacklist takes precedent.
    *
    * @default []
    * @example navigateFallbackAllowlist: [/^\/pages/]
    */
  var navigateFallbackAllowlist: js.UndefOr[js.Array[RegExp]] = js.undefined
  /**
    * An optional array of regular expressions that restricts which URLs the configured navigateFallback behavior applies to.
    *
    * This is useful if only a subset of your site's URLs should be treated as being part of a Single Page App.
    *
    * If both navigateFallbackDenylist and navigateFallbackAllowlist are configured, the blacklist takes precedent.
    *
    * @default []
    * @example navigateFallbackDenylist: [/^\/_/, /admin/]
    */
  var navigateFallbackDenylist: js.UndefOr[js.Array[RegExp]] = js.undefined
  /**
    * Whether or not to enable navigation preload in the generated service worker.
    * When set to true, you must also use runtimeCaching to set up an appropriate response strategy that will match navigation requests, and make use of the preloaded response
    */
  var navigationPreload: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls whether or not to include support for [offline Google Analytics](https://developers.google.com/web/tools/workbox/guides/enable-offline-analytics).
    *
    * When `true`, `workbox.googleAnalytics.initialize()` will be added to your new service worker file.
    *
    * @default false
    * @example offlineGoogleAnalytics: true
    */
  var offlineGoogleAnalytics: js.UndefOr[Boolean] = js.undefined
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
  var skipWaiting: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to create a sourcemap for the generated service worker files
    */
  var sourcemap: js.UndefOr[Boolean] = js.undefined
}

object GenerateSWOptions {
  @scala.inline
  def apply(
    additionalManifestEntries: js.Array[Integrity | String] = null,
    babelPresetEnvTargets: js.Array[String] = null,
    cacheId: js.UndefOr[Null | String] = js.undefined,
    chunks: js.Array[String] = null,
    cleanupOutdatedCaches: js.UndefOr[Boolean] = js.undefined,
    clientsClaim: js.UndefOr[Boolean] = js.undefined,
    directoryIndex: String = null,
    dontCacheBustUrlsMatching: js.UndefOr[Null | RegExp] = js.undefined,
    exclude: js.Array[String | RegExp] = null,
    excludeChunks: js.Array[String] = null,
    globDirectory: String = null,
    globFollow: js.UndefOr[Boolean] = js.undefined,
    globIgnores: js.Array[String] = null,
    globPatterns: js.Array[String] = null,
    globStrict: js.UndefOr[Boolean] = js.undefined,
    ignoreUrlParametersMatching: js.Array[RegExp] = null,
    importScripts: js.Array[String] = null,
    importScriptsViaChunks: js.Array[String] = null,
    importsDirectory: String = null,
    include: js.Array[String | RegExp] = null,
    inlineWorkboxRuntime: js.UndefOr[Boolean] = js.undefined,
    manifestTransforms: js.UndefOr[
      Null | (js.Array[js.Function1[/* originalManifest */ js.Array[ManifestEntry], Manifest]])
    ] = js.undefined,
    maximumFileSizeToCacheInBytes: js.UndefOr[Double] = js.undefined,
    mode: production | String = null,
    modifyUrlPrefix: js.UndefOr[Null | StringDictionary[String]] = js.undefined,
    navigateFallback: String = null,
    navigateFallbackAllowlist: js.Array[RegExp] = null,
    navigateFallbackDenylist: js.Array[RegExp] = null,
    navigationPreload: js.UndefOr[Boolean] = js.undefined,
    offlineGoogleAnalytics: js.UndefOr[Boolean] = js.undefined,
    precacheManifestFilename: String = null,
    runtimeCaching: js.Array[RuntimeCacheRule] = null,
    skipWaiting: js.UndefOr[Boolean] = js.undefined,
    sourcemap: js.UndefOr[Boolean] = js.undefined,
    swDest: String = null,
    templatedUrls: js.UndefOr[Null | (StringDictionary[String | js.Array[String]])] = js.undefined,
    test: js.Array[String | RegExp] = null
  ): GenerateSWOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalManifestEntries != null) __obj.updateDynamic("additionalManifestEntries")(additionalManifestEntries.asInstanceOf[js.Any])
    if (babelPresetEnvTargets != null) __obj.updateDynamic("babelPresetEnvTargets")(babelPresetEnvTargets.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheId)) __obj.updateDynamic("cacheId")(cacheId.asInstanceOf[js.Any])
    if (chunks != null) __obj.updateDynamic("chunks")(chunks.asInstanceOf[js.Any])
    if (!js.isUndefined(cleanupOutdatedCaches)) __obj.updateDynamic("cleanupOutdatedCaches")(cleanupOutdatedCaches.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clientsClaim)) __obj.updateDynamic("clientsClaim")(clientsClaim.get.asInstanceOf[js.Any])
    if (directoryIndex != null) __obj.updateDynamic("directoryIndex")(directoryIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(dontCacheBustUrlsMatching)) __obj.updateDynamic("dontCacheBustUrlsMatching")(dontCacheBustUrlsMatching.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (excludeChunks != null) __obj.updateDynamic("excludeChunks")(excludeChunks.asInstanceOf[js.Any])
    if (globDirectory != null) __obj.updateDynamic("globDirectory")(globDirectory.asInstanceOf[js.Any])
    if (!js.isUndefined(globFollow)) __obj.updateDynamic("globFollow")(globFollow.get.asInstanceOf[js.Any])
    if (globIgnores != null) __obj.updateDynamic("globIgnores")(globIgnores.asInstanceOf[js.Any])
    if (globPatterns != null) __obj.updateDynamic("globPatterns")(globPatterns.asInstanceOf[js.Any])
    if (!js.isUndefined(globStrict)) __obj.updateDynamic("globStrict")(globStrict.get.asInstanceOf[js.Any])
    if (ignoreUrlParametersMatching != null) __obj.updateDynamic("ignoreUrlParametersMatching")(ignoreUrlParametersMatching.asInstanceOf[js.Any])
    if (importScripts != null) __obj.updateDynamic("importScripts")(importScripts.asInstanceOf[js.Any])
    if (importScriptsViaChunks != null) __obj.updateDynamic("importScriptsViaChunks")(importScriptsViaChunks.asInstanceOf[js.Any])
    if (importsDirectory != null) __obj.updateDynamic("importsDirectory")(importsDirectory.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineWorkboxRuntime)) __obj.updateDynamic("inlineWorkboxRuntime")(inlineWorkboxRuntime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(manifestTransforms)) __obj.updateDynamic("manifestTransforms")(manifestTransforms.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumFileSizeToCacheInBytes)) __obj.updateDynamic("maximumFileSizeToCacheInBytes")(maximumFileSizeToCacheInBytes.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(modifyUrlPrefix)) __obj.updateDynamic("modifyUrlPrefix")(modifyUrlPrefix.asInstanceOf[js.Any])
    if (navigateFallback != null) __obj.updateDynamic("navigateFallback")(navigateFallback.asInstanceOf[js.Any])
    if (navigateFallbackAllowlist != null) __obj.updateDynamic("navigateFallbackAllowlist")(navigateFallbackAllowlist.asInstanceOf[js.Any])
    if (navigateFallbackDenylist != null) __obj.updateDynamic("navigateFallbackDenylist")(navigateFallbackDenylist.asInstanceOf[js.Any])
    if (!js.isUndefined(navigationPreload)) __obj.updateDynamic("navigationPreload")(navigationPreload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offlineGoogleAnalytics)) __obj.updateDynamic("offlineGoogleAnalytics")(offlineGoogleAnalytics.get.asInstanceOf[js.Any])
    if (precacheManifestFilename != null) __obj.updateDynamic("precacheManifestFilename")(precacheManifestFilename.asInstanceOf[js.Any])
    if (runtimeCaching != null) __obj.updateDynamic("runtimeCaching")(runtimeCaching.asInstanceOf[js.Any])
    if (!js.isUndefined(skipWaiting)) __obj.updateDynamic("skipWaiting")(skipWaiting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sourcemap)) __obj.updateDynamic("sourcemap")(sourcemap.get.asInstanceOf[js.Any])
    if (swDest != null) __obj.updateDynamic("swDest")(swDest.asInstanceOf[js.Any])
    if (!js.isUndefined(templatedUrls)) __obj.updateDynamic("templatedUrls")(templatedUrls.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateSWOptions]
  }
}

