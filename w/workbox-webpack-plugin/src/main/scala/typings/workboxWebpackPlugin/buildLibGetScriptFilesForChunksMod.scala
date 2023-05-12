package typings.workboxWebpackPlugin

import typings.webpack.mod.Compilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibGetScriptFilesForChunksMod {
  
  @JSImport("workbox-webpack-plugin/build/lib/get-script-files-for-chunks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getScriptFilesForChunks(compilation: Compilation, chunkNames: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getScriptFilesForChunks")(compilation.asInstanceOf[js.Any], chunkNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
