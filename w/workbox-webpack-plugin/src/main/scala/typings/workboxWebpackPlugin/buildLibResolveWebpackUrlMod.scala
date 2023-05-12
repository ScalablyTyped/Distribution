package typings.workboxWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibResolveWebpackUrlMod {
  
  @JSImport("workbox-webpack-plugin/build/lib/resolve-webpack-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveWebpackURL(publicPath: String, paths: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveWebpackURL")(scala.List(publicPath.asInstanceOf[js.Any]).`++`(paths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
}
