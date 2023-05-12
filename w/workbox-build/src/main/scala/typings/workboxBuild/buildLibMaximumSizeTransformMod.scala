package typings.workboxBuild

import typings.workboxBuild.buildTypesMod.ManifestTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibMaximumSizeTransformMod {
  
  @JSImport("workbox-build/build/lib/maximum-size-transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def maximumSizeTransform(maximumFileSizeToCacheInBytes: Double): ManifestTransform = ^.asInstanceOf[js.Dynamic].applyDynamic("maximumSizeTransform")(maximumFileSizeToCacheInBytes.asInstanceOf[js.Any]).asInstanceOf[ManifestTransform]
}
