package typings.workboxBuild.anon

import org.scalablytyped.runtime.StringDictionary
import typings.workboxBuild.buildTypesMod.FileDetails
import typings.workboxBuild.buildTypesMod.ManifestEntry
import typings.workboxBuild.buildTypesMod.ManifestTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined workbox-build.workbox-build/build/types.BasePartial & {  fileDetails :std.Array<workbox-build.workbox-build/build/types.FileDetails>,   transformParam :unknown | undefined} */
trait BasePartialfileDetailsArr extends StObject {
  
  /**
    * A list of entries to be precached, in addition to any entries that are
    * generated as part of the build configuration.
    */
  var additionalManifestEntries: js.UndefOr[js.Array[String | ManifestEntry]] = js.undefined
  
  /**
    * Assets that match this will be assumed to be uniquely versioned via their
    * URL, and exempted from the normal HTTP cache-busting that's done when
    * populating the precache. While not required, it's recommended that if your
    * existing build process already inserts a `[hash]` value into each filename,
    * you provide a RegExp that will detect that, as it will reduce the bandwidth
    * consumed when precaching.
    */
  var dontCacheBustURLsMatching: js.UndefOr[js.RegExp] = js.undefined
  
  var fileDetails: js.Array[FileDetails]
  
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
  
  var transformParam: js.UndefOr[Any] = js.undefined
}
object BasePartialfileDetailsArr {
  
  inline def apply(fileDetails: js.Array[FileDetails]): BasePartialfileDetailsArr = {
    val __obj = js.Dynamic.literal(fileDetails = fileDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePartialfileDetailsArr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasePartialfileDetailsArr] (val x: Self) extends AnyVal {
    
    inline def setAdditionalManifestEntries(value: js.Array[String | ManifestEntry]): Self = StObject.set(x, "additionalManifestEntries", value.asInstanceOf[js.Any])
    
    inline def setAdditionalManifestEntriesUndefined: Self = StObject.set(x, "additionalManifestEntries", js.undefined)
    
    inline def setAdditionalManifestEntriesVarargs(value: (String | ManifestEntry)*): Self = StObject.set(x, "additionalManifestEntries", js.Array(value*))
    
    inline def setDontCacheBustURLsMatching(value: js.RegExp): Self = StObject.set(x, "dontCacheBustURLsMatching", value.asInstanceOf[js.Any])
    
    inline def setDontCacheBustURLsMatchingUndefined: Self = StObject.set(x, "dontCacheBustURLsMatching", js.undefined)
    
    inline def setFileDetails(value: js.Array[FileDetails]): Self = StObject.set(x, "fileDetails", value.asInstanceOf[js.Any])
    
    inline def setFileDetailsVarargs(value: FileDetails*): Self = StObject.set(x, "fileDetails", js.Array(value*))
    
    inline def setManifestTransforms(value: js.Array[ManifestTransform]): Self = StObject.set(x, "manifestTransforms", value.asInstanceOf[js.Any])
    
    inline def setManifestTransformsUndefined: Self = StObject.set(x, "manifestTransforms", js.undefined)
    
    inline def setManifestTransformsVarargs(value: ManifestTransform*): Self = StObject.set(x, "manifestTransforms", js.Array(value*))
    
    inline def setMaximumFileSizeToCacheInBytes(value: Double): Self = StObject.set(x, "maximumFileSizeToCacheInBytes", value.asInstanceOf[js.Any])
    
    inline def setMaximumFileSizeToCacheInBytesUndefined: Self = StObject.set(x, "maximumFileSizeToCacheInBytes", js.undefined)
    
    inline def setModifyURLPrefix(value: StringDictionary[String]): Self = StObject.set(x, "modifyURLPrefix", value.asInstanceOf[js.Any])
    
    inline def setModifyURLPrefixUndefined: Self = StObject.set(x, "modifyURLPrefix", js.undefined)
    
    inline def setTransformParam(value: Any): Self = StObject.set(x, "transformParam", value.asInstanceOf[js.Any])
    
    inline def setTransformParamUndefined: Self = StObject.set(x, "transformParam", js.undefined)
  }
}
