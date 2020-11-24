package typings.workboxBuild.generateSwMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.workboxBuild.typesMod.ManifestEntry
import typings.workboxBuild.typesMod.ManifestTransform
import typings.workboxBuild.typesMod.RuntimeCachingEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateSWConfig extends js.Object {
  
  /**
    * A list of entries to be precached, in addition to any entries that are
    * generated as part of the build configuration.
    */
  var additionalManifestEntries: js.UndefOr[js.Array[ManifestEntry]] = js.native
  
  /**
    * The [targets](https://babeljs.io/docs/en/babel-preset-env#targets) to pass to
    * `babel-preset-env` when transpiling the service worker bundle.
    *
    * @default ['chrome >= 56']
    */
  var babelPresetEnvTargets: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An optional ID to be prepended to cache names. This is primarily useful for
    * local development where multiple sites may be served from the same
    * `http://localhost:port` origin.
    */
  var cacheId: js.UndefOr[String] = js.native
  
  /**
    * Whether or not Workbox should attempt to identify an delete any precaches
    * created by older, incompatible versions.
    *
    * @default false
    */
  var cleanupOutdatedCaches: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not the service worker should [start controlling](https://developers.google.com/web/fundamentals/primers/service-workers/lifecycle#clientsclaim)
    * any existing clients as soon as it activates.
    *
    * @default false
    */
  var clientsClaim: js.UndefOr[Boolean] = js.native
  
  /**
    * If a navigation request for a URL ending in `/` fails to match a precached
    * URL, this value will be appended to the URL and that will be checked for
    * a precache match. This should be set to what your web server is using for
    * its directory index.
    *
    * @default 'index.html'
    */
  var directoryIndex: js.UndefOr[String] = js.native
  
  /**
    * Assets that match this will be assumed to be uniquely versioned via their
    * URL, and exempted from the normal HTTP cache-busting that's done when
    * populating the precache. While not required, it's recommended that if your
    * existing build process already inserts a `[hash]` value into each filename,
    * you provide a RegExp that will detect that, as it will reduce the bandwidth
    * consumed when precaching.
    */
  var dontCacheBustURLsMatching: js.UndefOr[RegExp] = js.native
  
  /**
    * The local directory you wish to match `globPatterns` against. The path is relative to the current directory.
    */
  var globDirectory: String = js.native
  
  /**
    * Determines whether or not symlinks are followed when generating the precache
    * manifest. For more information, see the definition of `follow` in the `glob`
    * [documentation](https://github.com/isaacs/node-glob#options).
    *
    * @default true
    */
  var globFollow: js.UndefOr[Boolean] = js.native
  
  /**
    * A set of patterns matching files to always exclude when generating the
    * precache manifest. For more information, see the definition of `ignore` in the `glob`
    * [documentation](https://github.com/isaacs/node-glob#options).
    *
    * @default ['node_modules/ **']
    */
  var globIgnores: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Files matching any of these patterns will be included in the precache
    * manifest. For more information, see the
    * [`glob` primer](https://github.com/isaacs/node-glob#glob-primer).
    *
    * @default ['**.{js,css,html}']
    */
  var globPatterns: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If true, an error reading a directory when generating a precache manifest
    * will cause the build to fail. If false, the problematic directory will be
    * skipped. For more information, see the definition of `strict` in the `glob`
    * [documentation](https://github.com/isaacs/node-glob#options).
    *
    * @default true
    */
  var globStrict: js.UndefOr[Boolean] = js.native
  
  /**
    * Any search parameter names that match against one of the RegExp in this array
    * will be removed before looking for a precache match. This is useful if your
    * users might request URLs that contain, for example, URL parameters used to
    * track the source of the traffic.
    *
    * @default [/^utm_/]
    */
  var ignoreURLParametersMatching: js.UndefOr[js.Array[RegExp]] = js.native
  
  /**
    * A list of JavaScript files that should be passed to [`importScripts()`](https://developer.mozilla.org/en-US/docs/Web/API/WorkerGlobalScope/importScripts)
    * inside the generated service worker file. This is  useful when you want to
    * let Workbox create your top-level service worker file, but want to include
    * some additional code, such as a push event listener.
    */
  var importScripts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether the runtime code for the Workbox library should be included in the
    * top-level service worker, or split into a separate file that needs to be deployed
    * alongside the service worker. Keeping the runtime separate means that users will
    * not have to re-download the Workbox code each time your top-level service worker changes.
    *
    * @default false
    */
  var inlineWorkboxRuntime: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more functions which will be applied sequentially against the
    * generated manifest. If `modifyURLPrefix` or `dontCacheBustURLsMatching` are
    * also specified, their corresponding transformations will be applied first.
    */
  var manifestTransforms: js.UndefOr[js.Array[ManifestTransform]] = js.native
  
  /**
    * This value can be used to determine the maximum size of files that will be
    * precached. This prevents you from inadvertently precaching very large files
    * that might have accidentally matched one of your patterns.
    *
    * @default 2097152
    */
  var maximumFileSizeToCacheInBytes: js.UndefOr[Double] = js.native
  
  /**
    * If set to 'production', then an optimized service worker bundle that excludes
    * debugging info will be produced. If not explicitly configured here, the `mode`
    * value configured in the current `webpack` compiltion will be used.
    */
  var mode: js.UndefOr[String] = js.native
  
  /**
    * A mapping of prefixes that, if present in an entry in the precache manifest,
    * will be replaced with the corresponding value. This can be used to, for example,
    * remove or add a path prefix from a manifest entry if your web hosting setup
    * doesn't match your local filesystem setup. As an alternative with more flexibility,
    * you can use the `manifestTransforms` option and provide a function that modifies
    * the entries in the manifest using whatever logic you provide.
    */
  var modifyURLPrefix: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * If specified, all [navigation requests](https://developers.google.com/web/fundamentals/primers/service-workers/high-performance-loading#first_what_are_navigation_requests)
    * for URLs that aren't precached will be fulfilled with the HTML at the URL
    * provided. You must pass in the URL of an HTML document that is listed in your
    * precache manifest. This is meant to be used in a Single Page App scenario, in
    * which you want all navigations to use common [App Shell HTML](https://developers.google.com/web/fundamentals/architecture/app-shell).
    */
  var navigateFallback: js.UndefOr[String] = js.native
  
  /**
    * An optional array of regular expressions that restricts which URLs the configured
    * `navigateFallback` behavior applies to. This is useful if only a subset of
    * your site's URLs should be treated as being part of a
    * [Single Page App](https://en.wikipedia.org/wiki/Single-page_application). If
    * both `navigateFallbackDenylist` and `navigateFallbackAllowlist` are
    * configured, the denylist takes precedent.
    */
  var navigateFallbackAllowlist: js.UndefOr[js.Array[RegExp]] = js.native
  
  /**
    * An optional array of regular expressions that restricts which URLs the configured
    * `navigateFallback` behavior applies to. This is useful if only a subset of
    * your site's URLs should be treated as being part of a
    * [Single Page App](https://en.wikipedia.org/wiki/Single-page_application). If
    * both `navigateFallbackDenylist` and `navigateFallbackAllowlist` are
    * configured, the denylist takes precedent.
    */
  var navigateFallbackDenylist: js.UndefOr[js.Array[RegExp]] = js.native
  
  /**
    * Whether or not to enable [navigation preload](https://developers.google.com/web/tools/workbox/modules/workbox-navigation-preload)
    * in the generated service worker. When set to true, you must also use
    * `runtimeCaching` to set up an appropriate response strategy that will match
    * navigation requests, and make use of the preloaded response.
    *
    * @default false
    */
  var navigationPreload: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls whether or not to include support for [offline Google Analytics](https://developers.google.com/web/tools/workbox/guides/enable-offline-analytics).
    * When `true`, the call to `workbox-google-analytics`'s `initialize()` will be
    * added to your generated service worker. When set to an `Object`, that object
    * will be passed in to the `initialize()` call, allowing you to customize the
    * behavior.
    *
    * @default false
    */
  var offlineGoogleAnalytics: js.UndefOr[Boolean | js.Object] = js.native
  
  var runtimeCaching: js.UndefOr[js.Array[RuntimeCachingEntry]] = js.native
  
  /**
    * Whether to add an unconditional call to [`skipWaiting()`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-core#.skipWaiting)
    * to the generated service worker. If `false`, then a `message` listener will
    * be added instead, allowing you to conditionally call `skipWaiting()`.
    *
    * @default false
    */
  var skipWaiting: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to create a sourcemap for the generated service worker files.
    *
    * @default true
    */
  var sourcemap: js.UndefOr[Boolean] = js.native
  
  /**
    * The path and filename of the service worker file that will be created by the
    * build process, relative to the current working directory. It must end in '.js'.
    */
  var swDest: String = js.native
  
  /**
    * If a URL is rendered based on some server-side logic, its contents may depend
    * on multiple files or on some other unique string value. The keys in this object
    * are server-rendered URLs. If the values are an array of strings, they will be
    * interpreted as `glob` patterns, and the contents of any files matching the
    * patterns will be used to uniquely version the URL. If used with a single string,
    * it will be interpreted as unique versioning information that you've generated
    * for a given URL.
    */
  var templatedURLs: js.UndefOr[js.Object] = js.native
}
object GenerateSWConfig {
  
  @scala.inline
  def apply(globDirectory: String, swDest: String): GenerateSWConfig = {
    val __obj = js.Dynamic.literal(globDirectory = globDirectory.asInstanceOf[js.Any], swDest = swDest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateSWConfig]
  }
  
  @scala.inline
  implicit class GenerateSWConfigOps[Self <: GenerateSWConfig] (val x: Self) extends AnyVal {
    
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
    def setGlobDirectory(value: String): Self = this.set("globDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwDest(value: String): Self = this.set("swDest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalManifestEntriesVarargs(value: ManifestEntry*): Self = this.set("additionalManifestEntries", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalManifestEntries(value: js.Array[ManifestEntry]): Self = this.set("additionalManifestEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalManifestEntries: Self = this.set("additionalManifestEntries", js.undefined)
    
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
    def setDontCacheBustURLsMatching(value: RegExp): Self = this.set("dontCacheBustURLsMatching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDontCacheBustURLsMatching: Self = this.set("dontCacheBustURLsMatching", js.undefined)
    
    @scala.inline
    def setGlobFollow(value: Boolean): Self = this.set("globFollow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobFollow: Self = this.set("globFollow", js.undefined)
    
    @scala.inline
    def setGlobIgnoresVarargs(value: String*): Self = this.set("globIgnores", js.Array(value :_*))
    
    @scala.inline
    def setGlobIgnores(value: js.Array[String]): Self = this.set("globIgnores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobIgnores: Self = this.set("globIgnores", js.undefined)
    
    @scala.inline
    def setGlobPatternsVarargs(value: String*): Self = this.set("globPatterns", js.Array(value :_*))
    
    @scala.inline
    def setGlobPatterns(value: js.Array[String]): Self = this.set("globPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobPatterns: Self = this.set("globPatterns", js.undefined)
    
    @scala.inline
    def setGlobStrict(value: Boolean): Self = this.set("globStrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobStrict: Self = this.set("globStrict", js.undefined)
    
    @scala.inline
    def setIgnoreURLParametersMatchingVarargs(value: RegExp*): Self = this.set("ignoreURLParametersMatching", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreURLParametersMatching(value: js.Array[RegExp]): Self = this.set("ignoreURLParametersMatching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreURLParametersMatching: Self = this.set("ignoreURLParametersMatching", js.undefined)
    
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
    def setManifestTransformsVarargs(value: ManifestTransform*): Self = this.set("manifestTransforms", js.Array(value :_*))
    
    @scala.inline
    def setManifestTransforms(value: js.Array[ManifestTransform]): Self = this.set("manifestTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifestTransforms: Self = this.set("manifestTransforms", js.undefined)
    
    @scala.inline
    def setMaximumFileSizeToCacheInBytes(value: Double): Self = this.set("maximumFileSizeToCacheInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumFileSizeToCacheInBytes: Self = this.set("maximumFileSizeToCacheInBytes", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setModifyURLPrefix(value: StringDictionary[String]): Self = this.set("modifyURLPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifyURLPrefix: Self = this.set("modifyURLPrefix", js.undefined)
    
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
    def setOfflineGoogleAnalytics(value: Boolean | js.Object): Self = this.set("offlineGoogleAnalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfflineGoogleAnalytics: Self = this.set("offlineGoogleAnalytics", js.undefined)
    
    @scala.inline
    def setRuntimeCachingVarargs(value: RuntimeCachingEntry*): Self = this.set("runtimeCaching", js.Array(value :_*))
    
    @scala.inline
    def setRuntimeCaching(value: js.Array[RuntimeCachingEntry]): Self = this.set("runtimeCaching", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setTemplatedURLs(value: js.Object): Self = this.set("templatedURLs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplatedURLs: Self = this.set("templatedURLs", js.undefined)
  }
}
