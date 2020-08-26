package typings.workboxWebpackPlugin.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateSWOptions extends CommonOptions {
  /**
    * The targets to pass to babel-preset-env when transpiling the service worker bundle
    */
  var babelPresetEnvTargets: js.UndefOr[js.Array[String]] = js.native
  /**
    * An optional ID to be prepended to cache names used by Workbox.
    *
    * This is primarily useful for local development where multiple sites may be served from the same `http://localhost:port` origin.
    *
    * @default null
    * @example cacheId: 'my-app'
    */
  var cacheId: js.UndefOr[String | Null] = js.native
  /**
    * Whether or not Workbox should attempt to identify an delete any precaches created by older, incompatible versions
    */
  var cleanupOutdatedCaches: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the service worker should [start controlling](https://developers.google.com/web/fundamentals/primers/service-workers/lifecycle#clientsclaim)
    * any existing clients as soon as it activates.
    *
    * @default false
    * @example clientsClaim: true
    */
  var clientsClaim: js.UndefOr[Boolean] = js.native
  /**
    * If a [navigation request](https://developers.google.com/web/fundamentals/primers/service-workers/high-performance-loading#first_what_are_navigation_requests)
    * for a URL ending in `/` fails to match a precached URL, this value will be appended to the URL and that will be checked for a precache match.
    *
    * This should be configured to whatever your web server is using, if anything, for its [directory index](https://httpd.apache.org/docs/2.0/mod/mod_dir.html).
    *
    * @default 'index.html'
    * @example directoryIndex: 'index.html'
    */
  var directoryIndex: js.UndefOr[String] = js.native
  /**
    * Any search parameter names that match against one of the regex's in this array will be removed before looking for a precache match.
    *
    * This is useful if your users might request URLs that contain, for example, URL parameters used to track the source of the traffic.
    * Those URL parameters would normally cause the cache lookup to fail, since the URL strings used as cache keys would not be expected to include them.
    *
    * @default [/^utm_/]
    * @example ignoreUrlParametersMatching: [/./]
    */
  var ignoreUrlParametersMatching: js.UndefOr[js.Array[RegExp]] = js.native
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
  var importScripts: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether the runtime code for the Workbox library should be included in the top-level service worker,
    * or split into a separate file that needs to be deployed alongside the service worker. Keeping the runtime separate means
    * that users will not have to re-download the Workbox code each time your top-level service worker changes
    */
  var inlineWorkboxRuntime: js.UndefOr[Boolean] = js.native
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
  var navigateFallback: js.UndefOr[String] = js.native
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
  var navigateFallbackAllowlist: js.UndefOr[js.Array[RegExp]] = js.native
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
  var navigateFallbackDenylist: js.UndefOr[js.Array[RegExp]] = js.native
  /**
    * Whether or not to enable navigation preload in the generated service worker.
    * When set to true, you must also use runtimeCaching to set up an appropriate response strategy that will match navigation requests, and make use of the preloaded response
    */
  var navigationPreload: js.UndefOr[Boolean] = js.native
  /**
    * Controls whether or not to include support for [offline Google Analytics](https://developers.google.com/web/tools/workbox/guides/enable-offline-analytics).
    *
    * When `true`, `workbox.googleAnalytics.initialize()` will be added to your new service worker file.
    *
    * @default false
    * @example offlineGoogleAnalytics: true
    */
  var offlineGoogleAnalytics: js.UndefOr[Boolean] = js.native
  /**
    * Passing in an array of objects containing `urlPatterns`, `handlers`, and potentially `options` will add the appropriate code to the generated service worker to handle runtime caching.
    *
    * Requests for precached URLs that are picked up via `globPatterns` are handled by default, and don't need to be accommodated in `runtimeCaching`.
    *
    * @default []
    */
  var runtimeCaching: js.UndefOr[js.Array[RuntimeCacheRule]] = js.native
  /**
    * Whether or not the service worker should skip over the waiting lifecycle stage. Normally this is used with `clientsClaim: true`.
    *
    * @default false
    * @example skipWaiting: true
    */
  var skipWaiting: js.UndefOr[Boolean] = js.native
  /**
    * Whether to create a sourcemap for the generated service worker files
    */
  var sourcemap: js.UndefOr[Boolean] = js.native
}

object GenerateSWOptions {
  @scala.inline
  def apply(): GenerateSWOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateSWOptions]
  }
  @scala.inline
  implicit class GenerateSWOptionsOps[Self <: GenerateSWOptions] (val x: Self) extends AnyVal {
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
    def setBabelPresetEnvTargetsVarargs(value: String*): Self = this.set("babelPresetEnvTargets", js.Array(value :_*))
    @scala.inline
    def setBabelPresetEnvTargets(value: js.Array[String]): Self = this.set("babelPresetEnvTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBabelPresetEnvTargets: Self = this.set("babelPresetEnvTargets", js.undefined)
    @scala.inline
    def setCacheId(value: String): Self = this.set("cacheId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheId: Self = this.set("cacheId", js.undefined)
    @scala.inline
    def setCacheIdNull: Self = this.set("cacheId", null)
    @scala.inline
    def setCleanupOutdatedCaches(value: Boolean): Self = this.set("cleanupOutdatedCaches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCleanupOutdatedCaches: Self = this.set("cleanupOutdatedCaches", js.undefined)
    @scala.inline
    def setClientsClaim(value: Boolean): Self = this.set("clientsClaim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientsClaim: Self = this.set("clientsClaim", js.undefined)
    @scala.inline
    def setDirectoryIndex(value: String): Self = this.set("directoryIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryIndex: Self = this.set("directoryIndex", js.undefined)
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
    def setInlineWorkboxRuntime(value: Boolean): Self = this.set("inlineWorkboxRuntime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineWorkboxRuntime: Self = this.set("inlineWorkboxRuntime", js.undefined)
    @scala.inline
    def setNavigateFallback(value: String): Self = this.set("navigateFallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigateFallback: Self = this.set("navigateFallback", js.undefined)
    @scala.inline
    def setNavigateFallbackAllowlistVarargs(value: RegExp*): Self = this.set("navigateFallbackAllowlist", js.Array(value :_*))
    @scala.inline
    def setNavigateFallbackAllowlist(value: js.Array[RegExp]): Self = this.set("navigateFallbackAllowlist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigateFallbackAllowlist: Self = this.set("navigateFallbackAllowlist", js.undefined)
    @scala.inline
    def setNavigateFallbackDenylistVarargs(value: RegExp*): Self = this.set("navigateFallbackDenylist", js.Array(value :_*))
    @scala.inline
    def setNavigateFallbackDenylist(value: js.Array[RegExp]): Self = this.set("navigateFallbackDenylist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigateFallbackDenylist: Self = this.set("navigateFallbackDenylist", js.undefined)
    @scala.inline
    def setNavigationPreload(value: Boolean): Self = this.set("navigationPreload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationPreload: Self = this.set("navigationPreload", js.undefined)
    @scala.inline
    def setOfflineGoogleAnalytics(value: Boolean): Self = this.set("offlineGoogleAnalytics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfflineGoogleAnalytics: Self = this.set("offlineGoogleAnalytics", js.undefined)
    @scala.inline
    def setRuntimeCachingVarargs(value: RuntimeCacheRule*): Self = this.set("runtimeCaching", js.Array(value :_*))
    @scala.inline
    def setRuntimeCaching(value: js.Array[RuntimeCacheRule]): Self = this.set("runtimeCaching", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntimeCaching: Self = this.set("runtimeCaching", js.undefined)
    @scala.inline
    def setSkipWaiting(value: Boolean): Self = this.set("skipWaiting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipWaiting: Self = this.set("skipWaiting", js.undefined)
    @scala.inline
    def setSourcemap(value: Boolean): Self = this.set("sourcemap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcemap: Self = this.set("sourcemap", js.undefined)
  }
  
}

