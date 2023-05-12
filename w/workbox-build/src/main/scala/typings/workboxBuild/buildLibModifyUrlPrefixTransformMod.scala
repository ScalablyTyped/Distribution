package typings.workboxBuild

import org.scalablytyped.runtime.StringDictionary
import typings.workboxBuild.buildTypesMod.ManifestTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibModifyUrlPrefixTransformMod {
  
  @JSImport("workbox-build/build/lib/modify-url-prefix-transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def modifyURLPrefixTransform(modifyURLPrefix: StringDictionary[String]): ManifestTransform = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyURLPrefixTransform")(modifyURLPrefix.asInstanceOf[js.Any]).asInstanceOf[ManifestTransform]
}
