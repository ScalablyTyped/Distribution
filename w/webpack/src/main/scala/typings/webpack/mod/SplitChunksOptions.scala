package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplitChunksOptions extends StObject {
  
  var automaticNameDelimiter: String = js.native
  
  def chunksFilter(chunk: Chunk): Boolean = js.native
  
  var defaultSizeTypes: js.Array[String] = js.native
  
  var enforceSizeThreshold: SplitChunksSizes = js.native
  
  var fallbackCacheGroup: FallbackCacheGroup = js.native
  
  var filename: String | (js.Function2[/* arg0 */ PathData, /* arg1 */ js.UndefOr[AssetInfo], String]) = js.native
  
  def getCacheGroups(module: Module, context: CacheGroupsContext): js.Array[CacheGroupSource] = js.native
  
  def getName(): js.UndefOr[String] = js.native
  def getName(module: Unit, chunks: js.Array[Chunk]): js.UndefOr[String] = js.native
  def getName(module: Unit, chunks: js.Array[Chunk], key: String): js.UndefOr[String] = js.native
  def getName(module: Unit, chunks: Unit, key: String): js.UndefOr[String] = js.native
  def getName(module: Module): js.UndefOr[String] = js.native
  def getName(module: Module, chunks: js.Array[Chunk]): js.UndefOr[String] = js.native
  def getName(module: Module, chunks: js.Array[Chunk], key: String): js.UndefOr[String] = js.native
  def getName(module: Module, chunks: Unit, key: String): js.UndefOr[String] = js.native
  
  var hidePathInfo: Boolean = js.native
  
  var maxAsyncRequests: Double = js.native
  
  var maxAsyncSize: SplitChunksSizes = js.native
  
  var maxInitialRequests: Double = js.native
  
  var maxInitialSize: SplitChunksSizes = js.native
  
  var minChunks: Double = js.native
  
  var minRemainingSize: SplitChunksSizes = js.native
  
  var minSize: SplitChunksSizes = js.native
  
  var minSizeReduction: SplitChunksSizes = js.native
  
  var usedExports: Boolean = js.native
}
