package typings.tensorflowTfjsData.fileChunkIteratorMod

import typings.tensorflowTfjsData.byteChunkIteratorMod.ByteChunkIterator
import typings.tensorflowTfjsData.typesMod.FileElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-data/dist/iterators/file_chunk_iterator", "FileChunkIterator")
@js.native
class FileChunkIterator protected () extends ByteChunkIterator {
  def this(file: FileElement) = this()
  def this(file: FileElement, options: FileChunkIteratorOptions) = this()
  
  var chunkSize: Double = js.native
  
  var file: FileElement = js.native
  
  var offset: Double = js.native
  
  var options: FileChunkIteratorOptions = js.native
}
