package typings.workboxBuild.getManifestMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.workboxBuild.typesMod.ManifestEntry
import typings.workboxBuild.typesMod.ManifestTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetManifestConfig extends js.Object {
  /**
    * A list of entries to be precached, in addition to any entries that are
    * generated as part of the build configuration.
    */
  var additionalManifestEntries: js.UndefOr[js.Array[ManifestEntry]] = js.native
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

object GetManifestConfig {
  @scala.inline
  def apply(globDirectory: String): GetManifestConfig = {
    val __obj = js.Dynamic.literal(globDirectory = globDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetManifestConfig]
  }
  @scala.inline
  implicit class GetManifestConfigOps[Self <: GetManifestConfig] (val x: Self) extends AnyVal {
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
    def setAdditionalManifestEntriesVarargs(value: ManifestEntry*): Self = this.set("additionalManifestEntries", js.Array(value :_*))
    @scala.inline
    def setAdditionalManifestEntries(value: js.Array[ManifestEntry]): Self = this.set("additionalManifestEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalManifestEntries: Self = this.set("additionalManifestEntries", js.undefined)
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
    def setTemplatedURLs(value: js.Object): Self = this.set("templatedURLs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplatedURLs: Self = this.set("templatedURLs", js.undefined)
  }
  
}

