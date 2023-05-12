package typings.workboxWebpackPlugin

import typings.webpack.mod.Asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibGetAssetHashMod {
  
  @JSImport("workbox-webpack-plugin/build/lib/get-asset-hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAssetHash(asset: Asset): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAssetHash")(asset.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
