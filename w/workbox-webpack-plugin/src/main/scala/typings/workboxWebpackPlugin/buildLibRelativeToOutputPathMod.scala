package typings.workboxWebpackPlugin

import typings.webpack.mod.Compilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibRelativeToOutputPathMod {
  
  @JSImport("workbox-webpack-plugin/build/lib/relative-to-output-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def relativeToOutputPath(compilation: Compilation, swDest: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relativeToOutputPath")(compilation.asInstanceOf[js.Any], swDest.asInstanceOf[js.Any])).asInstanceOf[String]
}
