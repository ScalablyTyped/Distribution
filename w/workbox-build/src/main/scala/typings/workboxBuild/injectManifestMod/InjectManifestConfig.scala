package typings.workboxBuild.injectManifestMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.workboxBuild.typesMod.ManifestEntry
import typings.workboxBuild.typesMod.ManifestTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectManifestConfig extends js.Object {
  /**
    * A list of entries to be precached, in addition to any entries that are
    * generated as part of the build configuration.
    *
    * @default true
    */
  var additionalManifestEntries: js.UndefOr[js.Array[ManifestEntry]] = js.undefined
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
    * The string to find inside of the `swSrc` file. Once found, it will be replaced by
    * the generated precache manifest.
    *
    * @default 'self.__WB_MANIFEST'
    */
  var injectionPoint: js.UndefOr[String] = js.undefined
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
    * The path and filename of the service worker file that will be created by the
    * build process, relative to the current working directory. It must end in '.js'.
    */
  var swDest: String
  /**
    * The path and filename of the service worker file that will be created by
    * the build process, relative to the current working directory. It must end in '.js'.
    */
  var swSrc: String
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

object InjectManifestConfig {
  @scala.inline
  def apply(
    globDirectory: String,
    swDest: String,
    swSrc: String,
    additionalManifestEntries: js.Array[ManifestEntry] = null,
    dontCacheBustURLsMatching: RegExp = null,
    globFollow: js.UndefOr[Boolean] = js.undefined,
    globIgnores: js.Array[String] = null,
    globPatterns: js.Array[String] = null,
    globStrict: js.UndefOr[Boolean] = js.undefined,
    injectionPoint: String = null,
    manifestTransforms: js.Array[ManifestTransform] = null,
    maximumFileSizeToCacheInBytes: Int | Double = null,
    mode: String = null,
    modifyURLPrefix: StringDictionary[String] = null,
    templatedURLs: js.Object = null
  ): InjectManifestConfig = {
    val __obj = js.Dynamic.literal(globDirectory = globDirectory.asInstanceOf[js.Any], swDest = swDest.asInstanceOf[js.Any], swSrc = swSrc.asInstanceOf[js.Any])
    if (additionalManifestEntries != null) __obj.updateDynamic("additionalManifestEntries")(additionalManifestEntries.asInstanceOf[js.Any])
    if (dontCacheBustURLsMatching != null) __obj.updateDynamic("dontCacheBustURLsMatching")(dontCacheBustURLsMatching.asInstanceOf[js.Any])
    if (!js.isUndefined(globFollow)) __obj.updateDynamic("globFollow")(globFollow.asInstanceOf[js.Any])
    if (globIgnores != null) __obj.updateDynamic("globIgnores")(globIgnores.asInstanceOf[js.Any])
    if (globPatterns != null) __obj.updateDynamic("globPatterns")(globPatterns.asInstanceOf[js.Any])
    if (!js.isUndefined(globStrict)) __obj.updateDynamic("globStrict")(globStrict.asInstanceOf[js.Any])
    if (injectionPoint != null) __obj.updateDynamic("injectionPoint")(injectionPoint.asInstanceOf[js.Any])
    if (manifestTransforms != null) __obj.updateDynamic("manifestTransforms")(manifestTransforms.asInstanceOf[js.Any])
    if (maximumFileSizeToCacheInBytes != null) __obj.updateDynamic("maximumFileSizeToCacheInBytes")(maximumFileSizeToCacheInBytes.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (modifyURLPrefix != null) __obj.updateDynamic("modifyURLPrefix")(modifyURLPrefix.asInstanceOf[js.Any])
    if (templatedURLs != null) __obj.updateDynamic("templatedURLs")(templatedURLs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectManifestConfig]
  }
}

