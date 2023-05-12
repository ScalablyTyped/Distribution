package typings.workboxBuild

import typings.workboxBuild.anon.BasePartialfileDetailsArr
import typings.workboxBuild.buildTypesMod.ManifestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibTransformManifestMod {
  
  @JSImport("workbox-build/build/lib/transform-manifest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformManifest(param0: BasePartialfileDetailsArr): js.Promise[ManifestTransformResultWithWarnings] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformManifest")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ManifestTransformResultWithWarnings]]
  
  /**
    * A `ManifestTransform` function can be used to modify the modify the `url` or
    * `revision` properties of some or all of the
    * {@link workbox-build.ManifestEntry} in the manifest.
    *
    * Deleting the `revision` property of an entry will cause
    * the corresponding `url` to be precached without cache-busting parameters
    * applied, which is to say, it implies that the URL itself contains
    * proper versioning info. If the `revision` property is present, it must be
    * set to a string.
    *
    * @example A transformation that prepended the origin of a CDN for any
    * URL starting with '/assets/' could be implemented as:
    *
    * const cdnTransform = async (manifestEntries) => {
    *   const manifest = manifestEntries.map(entry => {
    *     const cdnOrigin = 'https://example.com';
    *     if (entry.url.startsWith('/assets/')) {
    *       entry.url = cdnOrigin + entry.url;
    *     }
    *     return entry;
    *   });
    *   return {manifest, warnings: []};
    * };
    *
    * @example A transformation that nulls the revision field when the
    * URL contains an 8-character hash surrounded by '.', indicating that it
    * already contains revision information:
    *
    * const removeRevisionTransform = async (manifestEntries) => {
    *   const manifest = manifestEntries.map(entry => {
    *     const hashRegExp = /\.\w{8}\./;
    *     if (entry.url.match(hashRegExp)) {
    *       entry.revision = null;
    *     }
    *     return entry;
    *   });
    *   return {manifest, warnings: []};
    * };
    *
    * @callback ManifestTransform
    * @param {Array<workbox-build.ManifestEntry>} manifestEntries The full
    * array of entries, prior to the current transformation.
    * @param {Object} [compilation] When used in the webpack plugins, this param
    * will be set to the current `compilation`.
    * @return {Promise<workbox-build.ManifestTransformResult>}
    * The array of entries with the transformation applied, and optionally, any
    * warnings that should be reported back to the build tool.
    *
    * @memberof workbox-build
    */
  trait ManifestTransformResultWithWarnings extends StObject {
    
    var count: Double
    
    var manifestEntries: js.Array[ManifestEntry]
    
    var size: Double
    
    var warnings: js.Array[String]
  }
  object ManifestTransformResultWithWarnings {
    
    inline def apply(count: Double, manifestEntries: js.Array[ManifestEntry], size: Double, warnings: js.Array[String]): ManifestTransformResultWithWarnings = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], manifestEntries = manifestEntries.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManifestTransformResultWithWarnings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ManifestTransformResultWithWarnings] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setManifestEntries(value: js.Array[ManifestEntry]): Self = StObject.set(x, "manifestEntries", value.asInstanceOf[js.Any])
      
      inline def setManifestEntriesVarargs(value: ManifestEntry*): Self = StObject.set(x, "manifestEntries", js.Array(value*))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
}
