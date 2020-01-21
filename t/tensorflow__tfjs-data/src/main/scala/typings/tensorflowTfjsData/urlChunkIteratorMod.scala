package typings.tensorflowTfjsData

import typings.std.RequestInfo
import typings.tensorflowTfjsData.fileChunkIteratorMod.FileChunkIterator
import typings.tensorflowTfjsData.fileChunkIteratorMod.FileChunkIteratorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/iterators/url_chunk_iterator", JSImport.Namespace)
@js.native
object urlChunkIteratorMod extends js.Object {
  def urlChunkIterator(url: RequestInfo): js.Promise[FileChunkIterator] = js.native
  def urlChunkIterator(url: RequestInfo, options: FileChunkIteratorOptions): js.Promise[FileChunkIterator] = js.native
}

