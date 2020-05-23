package typings.workboxBuild.generateSwMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.workboxBuild.typesMod.ManifestEntry
import typings.workboxBuild.typesMod.ManifestTransform
import typings.workboxBuild.typesMod.RuntimeCachingEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateSWConfig extends js.Object {
  /**
    * A list of entries to be precached, in addition to any entries that are
    * generated as part of the build configuration.
    */
  var additionalManifestEntries: js.UndefOr[js.Array[ManifestEntry]] = js.undefined
  /**
    * The [targets](https://babeljs.io/docs/en/babel-preset-env#targets) to pass to
    * `babel-preset-env` when transpiling the service worker bundle.
    *
    * @default ['chrome >= 56']
    */
  var babelPresetEnvTargets: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An optional ID to be prepended to cache names. This is primarily useful for
    * local development where multiple sites may be served from the same
    * `http://localhost:port` origin.
    */
  var cacheId: js.UndefOr[String] = js.undefined
  /**
    * Whether or not Workbox should attempt to identify an delete any precaches
    * created by older, incompatible versions.
    *
    * @default false
    */
  var cleanupOutdatedCaches: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not the service worker should [start controlling](https://developers.google.com/web/fundamentals/primers/service-workers/lifecycle#clientsclaim)
    * any existing clients as soon as it activates.
    *
    * @default false
    */
  var clientsClaim: js.UndefOr[Boolean] = js.undefined
  /**
    * If a navigation request for a URL ending in `/` fails to match a precached
    * URL, this value will be appended to the URL and that will be checked for
    * a precache match. This should be set to what your web server is using for
    * its directory index.
    *
    * @default 'index.html'
    */
  var directoryIndex: js.UndefOr[String] = js.undefined
  /**
    * Assets that match this will be assumed to be uniquely versioned via their
    * URL, and exempted from the normal HTTP cache-busting that's done when
    * populating the precache. While not required, it's recommended that if your
    * existing build process already inserts a `[hash]` value into each filename,
    * you provide a RegExp that will detect that, as it will reduce the bandwidth
    * consumed when precaching.
    */
  var dontCacheBustURLsMatching: js.UndefOr[RegExp] = js.undefined
  /**
    * The local directory you wish to match `globPatterns` against. The path is relative to the current directory.
    */
  var globDirectory: String
  /**
    * Determines whether or not symlinks are followed when generating the precache
    * manifest. For more information, see the definition of `follow` in the `glob`
    * [documentation](https://github.com/isaacs/node-glob#options).
    *
    * @default true
    */
  var globFollow: js.UndefOr[Boolean] = js.undefined
  /**
    * A set of patterns matching files to always exclude when generating the
    * precache manifest. For more information, see the definition of `ignore` in the `glob`
    * [documentation](https://github.com/isaacs/node-glob#options).
    *
    * @default ['node_modules/ **']
    */
  var globIgnores: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Files matching any of these patterns will be included in the precache
    * manifest. For more information, see the
    * [`glob` primer](https://github.com/isaacs/node-glob#glob-primer).
    *
    * @default ['**.{js,css,html}']
    */
  var globPatterns: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If true, an error reading a directory when generating a precache manifest
    * will cause the build to fail. If false, the problematic directory will be
    * skipped. For more information, see the definition of `strict` in the `glob`
    * [documentation](https://github.com/isaacs/node-glob#options).
    *
    * @default true
    */
  var globStrict: js.UndefOr[Boolean] = js.undefined
  /**
    * Any search parameter names that match against one of the RegExp in this array
    * will be removed before looking for a precache match. This is useful if your
    * users might request URLs that contain, for example, URL parameters used to
    * track the source of the traffic.
    *
    * @default [/^utm_/]
    */
  var ignoreURLParametersMatching: js.UndefOr[js.Array[RegExp]] = js.undefined
  /**
    * A list of JavaScript files that should be passed to [`importScripts()`](https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/importScripts)
    * inside the generated service worker file. This is  useful when you want to
    * let Workbox create your top-level service worker file, but want to include
    * some additional code, such as a push event listener.
    */
  var importScripts: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Whether the runtime code for the Workbox library should be included in the
    * top-level service worker, or split into a separate file that needs to be deployed
    * alongside the service worker. Keeping the runtime separate means that users will
    * not have to re-download the Workbox code each time your top-level service worker changes.
    *
    * @default false
    */
  var inlineWorkboxRuntime: js.UndefOr[Boolean] = js.undefined
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
    *
    * @default 2097152
    */
  var maximumFileSizeToCacheInBytes: js.UndefOr[Double] = js.undefined
  /**
    * If set to 'production', then an optimized service worker bundle that excludes
    * debugging info will be produced. If not explicitly configured here, the `mode`
    * value configured in the current `webpack` compiltion will be used.
    */
  var mode: js.UndefOr[String] = js.undefined
  /**
    * A mapping of prefixes that, if present in an entry in the precache manifest,
    * will be replaced with the corresponding value. This can be used to, for example,
    * remove or add a path prefix from a manifest entry if your web hosting setup
    * doesn't match your local filesystem setup. As an alternative with more flexibility,
    * you can use the `manifestTransforms` option and provide a function that modifies
    * the entries in the manifest using whatever logic you provide.
    */
  var modifyURLPrefix: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * If specified, all [navigation requests](https://developers.google.com/web/fundamentals/primers/service-workers/high-performance-loading#first_what_are_navigation_requests)
    * for URLs that aren't precached will be fulfilled with the HTML at the URL
    * provided. You must pass in the URL of an HTML document that is listed in your
    * precache manifest. This is meant to be used in a Single Page App scenario, in
    * which you want all navigations to use common [App Shell HTML](https://developers.google.com/web/fundamentals/architecture/app-shell).
    */
  var navigateFallback: js.UndefOr[String] = js.undefined
  /**
    * An optional array of regular expressions that restricts which URLs the configured
    * `navigateFallback` behavior applies to. This is useful if only a subset of
    * your site's URLs should be treated as being part of a
    * [Single Page App](https://en.wikipedia.org/wiki/Single-page_application). If
    * both `navigateFallbackDenylist` and `navigateFallbackAllowlist` are
    * configured, the denylist takes precedent.
    */
  var navigateFallbackAllowlist: js.UndefOr[js.Array[RegExp]] = js.undefined
  /**
    * An optional array of regular expressions that restricts which URLs the configured
    * `navigateFallback` behavior applies to. This is useful if only a subset of
    * your site's URLs should be treated as being part of a
    * [Single Page App](https://en.wikipedia.org/wiki/Single-page_application). If
    * both `navigateFallbackDenylist` and `navigateFallbackAllowlist` are
    * configured, the denylist takes precedent.
    */
  var navigateFallbackDenylist: js.UndefOr[js.Array[RegExp]] = js.undefined
  /**
    * Whether or not to enable [navigation preload](https://developers.google.com/web/tools/workbox/modules/workbox-navigation-preload)
    * in the generated service worker. When set to true, you must also use
    * `runtimeCaching` to set up an appropriate response strategy that will match
    * navigation requests, and make use of the preloaded response.
    *
    * @default false
    */
  var navigationPreload: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls whether or not to include support for [offline Google Analytics](https://developers.google.com/web/tools/workbox/guides/enable-offline-analytics).
    * When `true`, the call to `workbox-google-analytics`'s `initialize()` will be
    * added to your generated service worker. When set to an `Object`, that object
    * will be passed in to the `initialize()` call, allowing you to customize the
    * behavior.
    *
    * @default false
    */
  var offlineGoogleAnalytics: js.UndefOr[Boolean | js.Object] = js.undefined
  var runtimeCaching: js.UndefOr[js.Array[RuntimeCachingEntry]] = js.undefined
  /**
    * Whether to add an unconditional call to [`skipWaiting()`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-core#.skipWaiting)
    * to the generated service worker. If `false`, then a `message` listener will
    * be added instead, allowing you to conditionally call `skipWaiting()`.
    *
    * @default false
    */
  var skipWaiting: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to create a sourcemap for the generated service worker files.
    *
    * @default true
    */
  var sourcemap: js.UndefOr[Boolean] = js.undefined
  /**
    * The path and filename of the service worker file that will be created by the
    * build process, relative to the current working directory. It must end in '.js'.
    */
  var swDest: String
  /**
    * If a URL is rendered based on some server-side logic, its contents may depend
    * on multiple files or on some other unique string value. The keys in this object
    * are server-rendered URLs. If the values are an array of strings, they will be
    * interpreted as `glob` patterns, and the contents of any files matching the
    * patterns will be used to uniquely version the URL. If used with a single string,
    * it will be interpreted as unique versioning information that you've generated
    * for a given URL.
    */
  var templatedURLs: js.UndefOr[js.Object] = js.undefined
}

object GenerateSWConfig {
  @scala.inline
  def apply(
    globDirectory: String,
    swDest: String,
    additionalManifestEntries: js.Array[ManifestEntry] = null,
    babelPresetEnvTargets: js.Array[String] = null,
    cacheId: String = null,
    cleanupOutdatedCaches: js.UndefOr[Boolean] = js.undefined,
    clientsClaim: js.UndefOr[Boolean] = js.undefined,
    directoryIndex: String = null,
    dontCacheBustURLsMatching: RegExp = null,
    globFollow: js.UndefOr[Boolean] = js.undefined,
    globIgnores: js.Array[String] = null,
    globPatterns: js.Array[String] = null,
    globStrict: js.UndefOr[Boolean] = js.undefined,
    ignoreURLParametersMatching: js.Array[RegExp] = null,
    importScripts: js.Array[String] = null,
    inlineWorkboxRuntime: js.UndefOr[Boolean] = js.undefined,
    manifestTransforms: js.Array[ManifestTransform] = null,
    maximumFileSizeToCacheInBytes: js.UndefOr[Double] = js.undefined,
    mode: String = null,
    modifyURLPrefix: StringDictionary[String] = null,
    navigateFallback: String = null,
    navigateFallbackAllowlist: js.Array[RegExp] = null,
    navigateFallbackDenylist: js.Array[RegExp] = null,
    navigationPreload: js.UndefOr[Boolean] = js.undefined,
    offlineGoogleAnalytics: Boolean | js.Object = null,
    runtimeCaching: js.Array[RuntimeCachingEntry] = null,
    skipWaiting: js.UndefOr[Boolean] = js.undefined,
    sourcemap: js.UndefOr[Boolean] = js.undefined,
    templatedURLs: js.Object = null
  ): GenerateSWConfig = {
    val __obj = js.Dynamic.literal(globDirectory = globDirectory.asInstanceOf[js.Any], swDest = swDest.asInstanceOf[js.Any])
    if (additionalManifestEntries != null) __obj.updateDynamic("additionalManifestEntries")(additionalManifestEntries.asInstanceOf[js.Any])
    if (babelPresetEnvTargets != null) __obj.updateDynamic("babelPresetEnvTargets")(babelPresetEnvTargets.asInstanceOf[js.Any])
    if (cacheId != null) __obj.updateDynamic("cacheId")(cacheId.asInstanceOf[js.Any])
    if (!js.isUndefined(cleanupOutdatedCaches)) __obj.updateDynamic("cleanupOutdatedCaches")(cleanupOutdatedCaches.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clientsClaim)) __obj.updateDynamic("clientsClaim")(clientsClaim.get.asInstanceOf[js.Any])
    if (directoryIndex != null) __obj.updateDynamic("directoryIndex")(directoryIndex.asInstanceOf[js.Any])
    if (dontCacheBustURLsMatching != null) __obj.updateDynamic("dontCacheBustURLsMatching")(dontCacheBustURLsMatching.asInstanceOf[js.Any])
    if (!js.isUndefined(globFollow)) __obj.updateDynamic("globFollow")(globFollow.get.asInstanceOf[js.Any])
    if (globIgnores != null) __obj.updateDynamic("globIgnores")(globIgnores.asInstanceOf[js.Any])
    if (globPatterns != null) __obj.updateDynamic("globPatterns")(globPatterns.asInstanceOf[js.Any])
    if (!js.isUndefined(globStrict)) __obj.updateDynamic("globStrict")(globStrict.get.asInstanceOf[js.Any])
    if (ignoreURLParametersMatching != null) __obj.updateDynamic("ignoreURLParametersMatching")(ignoreURLParametersMatching.asInstanceOf[js.Any])
    if (importScripts != null) __obj.updateDynamic("importScripts")(importScripts.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineWorkboxRuntime)) __obj.updateDynamic("inlineWorkboxRuntime")(inlineWorkboxRuntime.get.asInstanceOf[js.Any])
    if (manifestTransforms != null) __obj.updateDynamic("manifestTransforms")(manifestTransforms.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumFileSizeToCacheInBytes)) __obj.updateDynamic("maximumFileSizeToCacheInBytes")(maximumFileSizeToCacheInBytes.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (modifyURLPrefix != null) __obj.updateDynamic("modifyURLPrefix")(modifyURLPrefix.asInstanceOf[js.Any])
    if (navigateFallback != null) __obj.updateDynamic("navigateFallback")(navigateFallback.asInstanceOf[js.Any])
    if (navigateFallbackAllowlist != null) __obj.updateDynamic("navigateFallbackAllowlist")(navigateFallbackAllowlist.asInstanceOf[js.Any])
    if (navigateFallbackDenylist != null) __obj.updateDynamic("navigateFallbackDenylist")(navigateFallbackDenylist.asInstanceOf[js.Any])
    if (!js.isUndefined(navigationPreload)) __obj.updateDynamic("navigationPreload")(navigationPreload.get.asInstanceOf[js.Any])
    if (offlineGoogleAnalytics != null) __obj.updateDynamic("offlineGoogleAnalytics")(offlineGoogleAnalytics.asInstanceOf[js.Any])
    if (runtimeCaching != null) __obj.updateDynamic("runtimeCaching")(runtimeCaching.asInstanceOf[js.Any])
    if (!js.isUndefined(skipWaiting)) __obj.updateDynamic("skipWaiting")(skipWaiting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sourcemap)) __obj.updateDynamic("sourcemap")(sourcemap.get.asInstanceOf[js.Any])
    if (templatedURLs != null) __obj.updateDynamic("templatedURLs")(templatedURLs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateSWConfig]
  }
}

