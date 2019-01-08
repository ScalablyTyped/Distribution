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

