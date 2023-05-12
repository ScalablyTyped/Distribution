package typings.workboxBuild

import typings.workboxBuild.anon.Manifest
import typings.workboxBuild.anon.ManifestEntrysizenumber
import typings.workboxBuild.buildTypesMod.ManifestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibAdditionalManifestEntriesTransformMod {
  
  @JSImport("workbox-build/build/lib/additional-manifest-entries-transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def additionalManifestEntriesTransform(additionalManifestEntries: js.Array[ManifestEntry | String]): AdditionalManifestEntriesTransform_ = ^.asInstanceOf[js.Dynamic].applyDynamic("additionalManifestEntriesTransform")(additionalManifestEntries.asInstanceOf[js.Any]).asInstanceOf[AdditionalManifestEntriesTransform_]
  
  type AdditionalManifestEntriesTransform_ = js.Function1[/* manifest */ js.Array[ManifestEntrysizenumber], Manifest]
}
