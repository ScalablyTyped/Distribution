package typings.workboxBuild

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.workboxBuild.anon.Count
import typings.workboxBuild.typesMod.ManifestEntry
import typings.workboxBuild.typesMod.ManifestTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getManifestMod {
  
  @JSImport("workbox-build/get-manifest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getManifest(config: GetManifestConfig): GetManifestResult = ^.asInstanceOf[js.Dynamic].applyDynamic("getManifest")(config.asInstanceOf[js.Any]).asInstanceOf[GetManifestResult]
  
  trait GetManifestConfig extends StObject {
    
    /**
      * A list of entries to be precached, in addition to any entries that are
      * generated as part of the build configuration.
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
  object GetManifestConfig {
    
    @scala.inline
    def apply(globDirectory: String): GetManifestConfig = {
      val __obj = js.Dynamic.literal(globDirectory = globDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetManifestConfig]
    }
    
    @scala.inline
    implicit class GetManifestConfigMutableBuilder[Self <: GetManifestConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalManifestEntries(value: js.Array[ManifestEntry]): Self = StObject.set(x, "additionalManifestEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalManifestEntriesUndefined: Self = StObject.set(x, "additionalManifestEntries", js.undefined)
      
      @scala.inline
      def setAdditionalManifestEntriesVarargs(value: ManifestEntry*): Self = StObject.set(x, "additionalManifestEntries", js.Array(value :_*))
      
      @scala.inline
      def setDontCacheBustURLsMatching(value: RegExp): Self = StObject.set(x, "dontCacheBustURLsMatching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDontCacheBustURLsMatchingUndefined: Self = StObject.set(x, "dontCacheBustURLsMatching", js.undefined)
      
      @scala.inline
      def setGlobDirectory(value: String): Self = StObject.set(x, "globDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobFollow(value: Boolean): Self = StObject.set(x, "globFollow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobFollowUndefined: Self = StObject.set(x, "globFollow", js.undefined)
      
      @scala.inline
      def setGlobIgnores(value: js.Array[String]): Self = StObject.set(x, "globIgnores", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobIgnoresUndefined: Self = StObject.set(x, "globIgnores", js.undefined)
      
      @scala.inline
      def setGlobIgnoresVarargs(value: String*): Self = StObject.set(x, "globIgnores", js.Array(value :_*))
      
      @scala.inline
      def setGlobPatterns(value: js.Array[String]): Self = StObject.set(x, "globPatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobPatternsUndefined: Self = StObject.set(x, "globPatterns", js.undefined)
      
      @scala.inline
      def setGlobPatternsVarargs(value: String*): Self = StObject.set(x, "globPatterns", js.Array(value :_*))
      
      @scala.inline
      def setGlobStrict(value: Boolean): Self = StObject.set(x, "globStrict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobStrictUndefined: Self = StObject.set(x, "globStrict", js.undefined)
      
      @scala.inline
      def setManifestTransforms(value: js.Array[ManifestTransform]): Self = StObject.set(x, "manifestTransforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestTransformsUndefined: Self = StObject.set(x, "manifestTransforms", js.undefined)
      
      @scala.inline
      def setManifestTransformsVarargs(value: ManifestTransform*): Self = StObject.set(x, "manifestTransforms", js.Array(value :_*))
      
      @scala.inline
      def setMaximumFileSizeToCacheInBytes(value: Double): Self = StObject.set(x, "maximumFileSizeToCacheInBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumFileSizeToCacheInBytesUndefined: Self = StObject.set(x, "maximumFileSizeToCacheInBytes", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setModifyURLPrefix(value: StringDictionary[String]): Self = StObject.set(x, "modifyURLPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifyURLPrefixUndefined: Self = StObject.set(x, "modifyURLPrefix", js.undefined)
      
      @scala.inline
      def setTemplatedURLs(value: js.Object): Self = StObject.set(x, "templatedURLs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplatedURLsUndefined: Self = StObject.set(x, "templatedURLs", js.undefined)
    }
  }
  
  type GetManifestResult = js.Promise[Count]
}
