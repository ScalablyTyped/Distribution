package typings.workboxBuild

import typings.workboxBuild.anon.JsFilename
import typings.workboxBuild.anon.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibReplaceAndUpdateSourceMapMod {
  
  @JSImport("workbox-build/build/lib/replace-and-update-source-map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def replaceAndUpdateSourceMap(param0: JsFilename): js.Promise[Map] = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceAndUpdateSourceMap")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Map]]
}
