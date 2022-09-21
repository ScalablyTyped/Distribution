package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetChunkFilenameRuntimeModule extends RuntimeModule {
  
  var allChunks: Boolean = js.native
  
  var contentType: String = js.native
  
  def getFilenameForChunk(arg0: Chunk): String | (js.Function2[/* arg0 */ PathData, /* arg1 */ js.UndefOr[AssetInfo], String]) = js.native
  
  var global: String = js.native
}
