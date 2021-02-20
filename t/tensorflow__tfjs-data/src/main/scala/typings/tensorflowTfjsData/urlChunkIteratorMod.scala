package typings.tensorflowTfjsData

import typings.std.RequestInfo
import typings.tensorflowTfjsData.fileChunkIteratorMod.FileChunkIterator
import typings.tensorflowTfjsData.fileChunkIteratorMod.FileChunkIteratorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlChunkIteratorMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/iterators/url_chunk_iterator", "urlChunkIterator")
  @js.native
  def urlChunkIterator(url: RequestInfo): js.Promise[FileChunkIterator] = js.native
  @JSImport("@tensorflow/tfjs-data/dist/iterators/url_chunk_iterator", "urlChunkIterator")
  @js.native
  def urlChunkIterator(url: RequestInfo, options: FileChunkIteratorOptions): js.Promise[FileChunkIterator] = js.native
}
