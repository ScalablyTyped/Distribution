package typings.workboxBuild.anon

import org.scalablytyped.runtime.StringDictionary
import typings.workboxBuild.buildTypesMod.ManifestEntry
import typings.workboxBuild.buildTypesMod.ManifestTransform
import typings.workboxBuild.buildTypesMod.RuntimeCaching
import typings.workboxGoogleAnalytics.initializeMod.GoogleAnalyticsInitializeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined workbox-build.workbox-build/build/types.GenerateSWOptions & {  manifestEntries :std.Array<workbox-build.workbox-build/build/types.ManifestEntry>} */
trait GenerateSWOptionsmanifest extends StObject {
  
  /**
    * A list of entries to be precached, in addition to any entries that are
    * generated as part of the build configuration.
    */
  var additionalManifestEntries: js.UndefOr[js.Array[String | ManifestEntry]] = js.undefined
  
  /**
    * The [targets](https://babeljs.io/docs/en/babel-preset-env#targets) to pass
    * to `babel-preset-env` when transpiling the service worker bundle.
    * @default ["chrome >= 56"]
    */
  var babelPresetEnvTargets: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An optional ID to be prepended to cache names. This is primarily useful for
    * local development where multiple sites may be served from the same
    * `http://localhost:port` origin.
    */
  var cacheId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether or not Workbox should attempt to identify and delete any precaches
    * created by older, incompatible versions.
    * @default false
    */
  var cleanupOutdatedCaches: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not the service worker should [start controlling](https://developers.google.com/web/fundamentals/primers/service-workers/lifecycle#clientsclaim)
    * any existing clients as soon as it activates.
    * @default false
    */
  var clientsClaim: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If a navigation request for a URL ending in `/` fails to match a precached
    * URL, this value will be appended to the URL and that will be checked for a
    * precache match. This should be set to what your web server is using for its
    * directory index.
    */
  var directoryIndex: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @default false
    */
  var disableDevLogs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Assets that match this will be assumed to be uniquely versioned via their
    * URL, and exempted from the normal HTTP cache-busting that's done when
    * populating the precache. While not required, it's recommended that if your
    * existing build process already inserts a `[hash]` value into each filename,
    * you provide a RegExp that will detect that, as it will reduce the bandwidth
    * consumed when precaching.
    */
  var dontCacheBustURLsMatching: js.UndefOr[js.RegExp] = js.undefined
  
  /**
    * The local directory you wish to match `globPatterns` against. The path is
    * relative to the current directory.
    */
  var globDirectory: js.UndefOr[String] = js.undefined
  
  /**
    * Determines whether or not symlinks are followed when generating the
    * precache manifest. For more information, see the definition of `follow` in
    * the `glob` [documentation](https://github.com/isaacs/node-glob#options).
    * @default true
    */
  var globFollow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A set of patterns matching files to always exclude when generating the
    * precache manifest. For more information, see the definition of `ignore` in
    * the `glob` [documentation](https://github.com/isaacs/node-glob#options).
    * @default ["**\/node_modules\/ **\/ *"]
    */
  var globIgnores: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Files matching any of these patterns will be included in the precache
    * manifest. For more information, see the
    * [`glob` primer](https://github.com/isaacs/node-glob#glob-primer).
    * @default ["**\/ *.{js,css,html}"]
    */
  var globPatterns: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If true, an error reading a directory when generating a precache manifest
    * will cause the build to fail. If false, the problematic directory will be
    * skipped. For more information, see the definition of `strict` in the `glob`
    * [documentation](https://github.com/isaacs/node-glob#options).
    * @default true
    */
  var globStrict: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Any search parameter names that match against one of the RegExp in this
    * array will be removed before looking for a precache match. This is useful
    * if your users might request URLs that contain, for example, URL parameters
    * used to track the source of the traffic. If not provided, the default value
    * is `[/^utm_/, /^fbclid$/]`.
    *
    */
  var ignoreURLParametersMatching: js.UndefOr[js.Array[js.RegExp]] = js.undefined
  
  /**
    * A list of JavaScript files that should be passed to
    * [`importScripts()`](https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/importScripts)
    * inside the generated service worker file. This is  useful when you want to
    * let Workbox create your top-level service worker file, but want to include
    * some additional code, such as a push event listener.
    */
  var importScripts: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether the runtime code for the Workbox library should be included in the
    * top-level service worker, or split into a separate file that needs to be
    * deployed alongside the service worker. Keeping the runtime separate means
    * that users will not have to re-download the Workbox code each time your
    * top-level service worker changes.
    * @default false
    */
  var inlineWorkboxRuntime: js.UndefOr[Boolean] = js.undefined
  
  var manifestEntries: js.Array[ManifestEntry]
  
  /**
    * One or more functions which will be applied sequentially against the
    * generated manifest. If `modifyURLPrefix` or `dontCacheBustURLsMatching` are
    * also specified, their corresponding transformations will be applied first.
    */
  var manifestTransforms: js.UndefOr[js.Array[ManifestTransform]] = js.undefined
  
  /**
    * This value can be used to determine the maximum size of files that will be
    * precached. This prevents you from inadvertently precaching very large files
    * that might have accidentally matched one of your patterns.
    * @default 2097152
    */
  var maximumFileSizeToCacheInBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * If set to 'production', then an optimized service worker bundle that
    * excludes debugging info will be produced. If not explicitly configured
    * here, the `process.env.NODE_ENV` value will be used, and failing that, it
    * will fall back to `'production'`.
    * @default "production"
    */
  var mode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An object mapping string prefixes to replacement string values. This can be
    * used to, e.g., remove or add a path prefix from a manifest entry if your
    * web hosting setup doesn't match your local filesystem setup. As an
    * alternative with more flexibility, you can use the `manifestTransforms`
    * option and provide a function that modifies the entries in the manifest
    * using whatever logic you provide.
    *
    * Example usage:
    *
    * ```
    * // Replace a '/dist/' prefix with '/', and also prepend
    * // '/static' to every URL.
    * modifyURLPrefix: {
    *   '/dist/': '/',
    *   '': '/static',
    * }
    * ```
    */
  var modifyURLPrefix: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * If specified, all
    * [navigation requests](https://developers.google.com/web/fundamentals/primers/service-workers/high-performance-loading#first_what_are_navigation_requests)
    * for URLs that aren't precached will be fulfilled with the HTML at the URL
    * provided. You must pass in the URL of an HTML document that is listed in
    * your precache manifest. This is meant to be used in a Single Page App
    * scenario, in which you want all navigations to use common
    * [App Shell HTML](https://developers.google.com/web/fundamentals/architecture/app-shell).
    * @default null
    */
  var navigateFallback: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional array of regular expressions that restricts which URLs the
    * configured `navigateFallback` behavior applies to. This is useful if only a
    * subset of your site's URLs should be treated as being part of a
    * [Single Page App](https://en.wikipedia.org/wiki/Single-page_application).
    * If both `navigateFallbackDenylist` and `navigateFallbackAllowlist` are
    * configured, the denylist takes precedent.
    *
    * *Note*: These RegExps may be evaluated against every destination URL during
    * a navigation. Avoid using
    * [complex RegExps](https://github.com/GoogleChrome/workbox/issues/3077),
    * or else your users may see delays when navigating your site.
    */
  var navigateFallbackAllowlist: js.UndefOr[js.Array[js.RegExp]] = js.undefined
  
  /**
    * An optional array of regular expressions that restricts which URLs the
    * configured `navigateFallback` behavior applies to. This is useful if only a
    * subset of your site's URLs should be treated as being part of a
    * [Single Page App](https://en.wikipedia.org/wiki/Single-page_application).
    * If both `navigateFallbackDenylist` and `navigateFallbackAllowlist` are
    * configured, the denylist takes precedence.
    *
    * *Note*: These RegExps may be evaluated against every destination URL during
    * a navigation. Avoid using
    * [complex RegExps](https://github.com/GoogleChrome/workbox/issues/3077),
    * or else your users may see delays when navigating your site.
    */
  var navigateFallbackDenylist: js.UndefOr[js.Array[js.RegExp]] = js.undefined
  
  /**
    * Whether or not to enable
    * [navigation preload](https://developers.google.com/web/tools/workbox/modules/workbox-navigation-preload)
    * in the generated service worker. When set to true, you must also use
    * `runtimeCaching` to set up an appropriate response strategy that will match
    * navigation requests, and make use of the preloaded response.
    * @default false
    */
  var navigationPreload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether or not to include support for
    * [offline Google Analytics](https://developers.google.com/web/tools/workbox/guides/enable-offline-analytics).
    * When `true`, the call to `workbox-google-analytics`'s `initialize()` will
    * be added to your generated service worker. When set to an `Object`, that
    * object will be passed in to the `initialize()` call, allowing you to
    * customize the behavior.
    * @default false
    */
  var offlineGoogleAnalytics: js.UndefOr[Boolean | GoogleAnalyticsInitializeOptions] = js.undefined
  
  /**
    * When using Workbox's build tools to generate your service worker, you can
    * specify one or more runtime caching configurations. These are then
    * translated to {@link workbox-routing.registerRoute} calls using the match
    * and handler configuration you define.
    *
    * For all of the options, see the {@link workbox-build.RuntimeCaching}
    * documentation. The example below shows a typical configuration, with two
    * runtime routes defined:
    *
    * @example
    * runtimeCaching: [{
    *   urlPattern: ({url}) => url.origin === 'https://api.example.com',
    *   handler: 'NetworkFirst',
    *   options: {
    *     cacheName: 'api-cache',
    *   },
    * }, {
    *   urlPattern: ({request}) => request.destination === 'image',
    *   handler: 'StaleWhileRevalidate',
    *   options: {
    *     cacheName: 'images-cache',
    *     expiration: {
    *       maxEntries: 10,
    *     },
    *   },
    * }]
    */
  var runtimeCaching: js.UndefOr[js.Array[RuntimeCaching]] = js.undefined
  
  /**
    * Whether to add an unconditional call to [`skipWaiting()`](https://developers.google.com/web/fundamentals/primers/service-workers/lifecycle#skip_the_waiting_phase)
    * to the generated service worker. If `false`, then a `message` listener will
    * be added instead, allowing client pages to trigger `skipWaiting()` by
    * calling `postMessage({type: 'SKIP_WAITING'})` on a waiting service worker.
    * @default false
    */
  var skipWaiting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to create a sourcemap for the generated service worker files.
    * @default true
    */
  var sourcemap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The path and filename of the service worker file that will be created by
    * the build process, relative to the current working directory. It must end
    * in '.js'.
    */
  var swDest: String
  
  /**
    * If a URL is rendered based on some server-side logic, its contents may
    * depend on multiple files or on some other unique string value. The keys in
    * this object are server-rendered URLs. If the values are an array of
    * strings, they will be interpreted as `glob` patterns, and the contents of
    * any files matching the patterns will be used to uniquely version the URL.
    * If used with a single string, it will be interpreted as unique versioning
    * information that you've generated for a given URL.
    */
  var templatedURLs: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
}
object GenerateSWOptionsmanifest {
  
  inline def apply(manifestEntries: js.Array[ManifestEntry], swDest: String): GenerateSWOptionsmanifest = {
    val __obj = js.Dynamic.literal(manifestEntries = manifestEntries.asInstanceOf[js.Any], swDest = swDest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateSWOptionsmanifest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateSWOptionsmanifest] (val x: Self) extends AnyVal {
    
    inline def setAdditionalManifestEntries(value: js.Array[String | ManifestEntry]): Self = StObject.set(x, "additionalManifestEntries", value.asInstanceOf[js.Any])
    
    inline def setAdditionalManifestEntriesUndefined: Self = StObject.set(x, "additionalManifestEntries", js.undefined)
    
    inline def setAdditionalManifestEntriesVarargs(value: (String | ManifestEntry)*): Self = StObject.set(x, "additionalManifestEntries", js.Array(value*))
    
    inline def setBabelPresetEnvTargets(value: js.Array[String]): Self = StObject.set(x, "babelPresetEnvTargets", value.asInstanceOf[js.Any])
    
    inline def setBabelPresetEnvTargetsUndefined: Self = StObject.set(x, "babelPresetEnvTargets", js.undefined)
    
    inline def setBabelPresetEnvTargetsVarargs(value: String*): Self = StObject.set(x, "babelPresetEnvTargets", js.Array(value*))
    
    inline def setCacheId(value: String): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
    
    inline def setCacheIdNull: Self = StObject.set(x, "cacheId", null)
    
    inline def setCacheIdUndefined: Self = StObject.set(x, "cacheId", js.undefined)
    
    inline def setCleanupOutdatedCaches(value: Boolean): Self = StObject.set(x, "cleanupOutdatedCaches", value.asInstanceOf[js.Any])
    
    inline def setCleanupOutdatedCachesUndefined: Self = StObject.set(x, "cleanupOutdatedCaches", js.undefined)
    
    inline def setClientsClaim(value: Boolean): Self = StObject.set(x, "clientsClaim", value.asInstanceOf[js.Any])
    
    inline def setClientsClaimUndefined: Self = StObject.set(x, "clientsClaim", js.undefined)
    
    inline def setDirectoryIndex(value: String): Self = StObject.set(x, "directoryIndex", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIndexNull: Self = StObject.set(x, "directoryIndex", null)
    
    inline def setDirectoryIndexUndefined: Self = StObject.set(x, "directoryIndex", js.undefined)
    
    inline def setDisableDevLogs(value: Boolean): Self = StObject.set(x, "disableDevLogs", value.asInstanceOf[js.Any])
    
    inline def setDisableDevLogsUndefined: Self = StObject.set(x, "disableDevLogs", js.undefined)
    
    inline def setDontCacheBustURLsMatching(value: js.RegExp): Self = StObject.set(x, "dontCacheBustURLsMatching", value.asInstanceOf[js.Any])
    
    inline def setDontCacheBustURLsMatchingUndefined: Self = StObject.set(x, "dontCacheBustURLsMatching", js.undefined)
    
    inline def setGlobDirectory(value: String): Self = StObject.set(x, "globDirectory", value.asInstanceOf[js.Any])
    
    inline def setGlobDirectoryUndefined: Self = StObject.set(x, "globDirectory", js.undefined)
    
    inline def setGlobFollow(value: Boolean): Self = StObject.set(x, "globFollow", value.asInstanceOf[js.Any])
    
    inline def setGlobFollowUndefined: Self = StObject.set(x, "globFollow", js.undefined)
    
    inline def setGlobIgnores(value: js.Array[String]): Self = StObject.set(x, "globIgnores", value.asInstanceOf[js.Any])
    
    inline def setGlobIgnoresUndefined: Self = StObject.set(x, "globIgnores", js.undefined)
    
    inline def setGlobIgnoresVarargs(value: String*): Self = StObject.set(x, "globIgnores", js.Array(value*))
    
    inline def setGlobPatterns(value: js.Array[String]): Self = StObject.set(x, "globPatterns", value.asInstanceOf[js.Any])
    
    inline def setGlobPatternsUndefined: Self = StObject.set(x, "globPatterns", js.undefined)
    
    inline def setGlobPatternsVarargs(value: String*): Self = StObject.set(x, "globPatterns", js.Array(value*))
    
    inline def setGlobStrict(value: Boolean): Self = StObject.set(x, "globStrict", value.asInstanceOf[js.Any])
    
    inline def setGlobStrictUndefined: Self = StObject.set(x, "globStrict", js.undefined)
    
    inline def setIgnoreURLParametersMatching(value: js.Array[js.RegExp]): Self = StObject.set(x, "ignoreURLParametersMatching", value.asInstanceOf[js.Any])
    
    inline def setIgnoreURLParametersMatchingUndefined: Self = StObject.set(x, "ignoreURLParametersMatching", js.undefined)
    
    inline def setIgnoreURLParametersMatchingVarargs(value: js.RegExp*): Self = StObject.set(x, "ignoreURLParametersMatching", js.Array(value*))
    
    inline def setImportScripts(value: js.Array[String]): Self = StObject.set(x, "importScripts", value.asInstanceOf[js.Any])
    
    inline def setImportScriptsUndefined: Self = StObject.set(x, "importScripts", js.undefined)
    
    inline def setImportScriptsVarargs(value: String*): Self = StObject.set(x, "importScripts", js.Array(value*))
    
    inline def setInlineWorkboxRuntime(value: Boolean): Self = StObject.set(x, "inlineWorkboxRuntime", value.asInstanceOf[js.Any])
    
    inline def setInlineWorkboxRuntimeUndefined: Self = StObject.set(x, "inlineWorkboxRuntime", js.undefined)
    
    inline def setManifestEntries(value: js.Array[ManifestEntry]): Self = StObject.set(x, "manifestEntries", value.asInstanceOf[js.Any])
    
    inline def setManifestEntriesVarargs(value: ManifestEntry*): Self = StObject.set(x, "manifestEntries", js.Array(value*))
    
    inline def setManifestTransforms(value: js.Array[ManifestTransform]): Self = StObject.set(x, "manifestTransforms", value.asInstanceOf[js.Any])
    
    inline def setManifestTransformsUndefined: Self = StObject.set(x, "manifestTransforms", js.undefined)
    
    inline def setManifestTransformsVarargs(value: ManifestTransform*): Self = StObject.set(x, "manifestTransforms", js.Array(value*))
    
    inline def setMaximumFileSizeToCacheInBytes(value: Double): Self = StObject.set(x, "maximumFileSizeToCacheInBytes", value.asInstanceOf[js.Any])
    
    inline def setMaximumFileSizeToCacheInBytesUndefined: Self = StObject.set(x, "maximumFileSizeToCacheInBytes", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setModifyURLPrefix(value: StringDictionary[String]): Self = StObject.set(x, "modifyURLPrefix", value.asInstanceOf[js.Any])
    
    inline def setModifyURLPrefixUndefined: Self = StObject.set(x, "modifyURLPrefix", js.undefined)
    
    inline def setNavigateFallback(value: String): Self = StObject.set(x, "navigateFallback", value.asInstanceOf[js.Any])
    
    inline def setNavigateFallbackAllowlist(value: js.Array[js.RegExp]): Self = StObject.set(x, "navigateFallbackAllowlist", value.asInstanceOf[js.Any])
    
    inline def setNavigateFallbackAllowlistUndefined: Self = StObject.set(x, "navigateFallbackAllowlist", js.undefined)
    
    inline def setNavigateFallbackAllowlistVarargs(value: js.RegExp*): Self = StObject.set(x, "navigateFallbackAllowlist", js.Array(value*))
    
    inline def setNavigateFallbackDenylist(value: js.Array[js.RegExp]): Self = StObject.set(x, "navigateFallbackDenylist", value.asInstanceOf[js.Any])
    
    inline def setNavigateFallbackDenylistUndefined: Self = StObject.set(x, "navigateFallbackDenylist", js.undefined)
    
    inline def setNavigateFallbackDenylistVarargs(value: js.RegExp*): Self = StObject.set(x, "navigateFallbackDenylist", js.Array(value*))
    
    inline def setNavigateFallbackNull: Self = StObject.set(x, "navigateFallback", null)
    
    inline def setNavigateFallbackUndefined: Self = StObject.set(x, "navigateFallback", js.undefined)
    
    inline def setNavigationPreload(value: Boolean): Self = StObject.set(x, "navigationPreload", value.asInstanceOf[js.Any])
    
    inline def setNavigationPreloadUndefined: Self = StObject.set(x, "navigationPreload", js.undefined)
    
    inline def setOfflineGoogleAnalytics(value: Boolean | GoogleAnalyticsInitializeOptions): Self = StObject.set(x, "offlineGoogleAnalytics", value.asInstanceOf[js.Any])
    
    inline def setOfflineGoogleAnalyticsUndefined: Self = StObject.set(x, "offlineGoogleAnalytics", js.undefined)
    
    inline def setRuntimeCaching(value: js.Array[RuntimeCaching]): Self = StObject.set(x, "runtimeCaching", value.asInstanceOf[js.Any])
    
    inline def setRuntimeCachingUndefined: Self = StObject.set(x, "runtimeCaching", js.undefined)
    
    inline def setRuntimeCachingVarargs(value: RuntimeCaching*): Self = StObject.set(x, "runtimeCaching", js.Array(value*))
    
    inline def setSkipWaiting(value: Boolean): Self = StObject.set(x, "skipWaiting", value.asInstanceOf[js.Any])
    
    inline def setSkipWaitingUndefined: Self = StObject.set(x, "skipWaiting", js.undefined)
    
    inline def setSourcemap(value: Boolean): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
    
    inline def setSourcemapUndefined: Self = StObject.set(x, "sourcemap", js.undefined)
    
    inline def setSwDest(value: String): Self = StObject.set(x, "swDest", value.asInstanceOf[js.Any])
    
    inline def setTemplatedURLs(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "templatedURLs", value.asInstanceOf[js.Any])
    
    inline def setTemplatedURLsUndefined: Self = StObject.set(x, "templatedURLs", js.undefined)
  }
}
