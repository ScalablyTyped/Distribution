package typings.workboxWebpackPlugin

import typings.webpack.mod.Compilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibGetSourcemapAssetNameMod {
  
  @JSImport("workbox-webpack-plugin/build/lib/get-sourcemap-asset-name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSourcemapAssetName(compilation: Compilation, swContents: String, swDest: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourcemapAssetName")(compilation.asInstanceOf[js.Any], swContents.asInstanceOf[js.Any], swDest.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
}
