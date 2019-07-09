package typings
package atTensorflowTfjsDashDataLib.distIteratorsFileUnderscoreChunkUnderscoreIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/iterators/file_chunk_iterator", "FileChunkIterator")
@js.native
class FileChunkIterator protected ()
  extends atTensorflowTfjsDashDataLib.distIteratorsByteUnderscoreChunkUnderscoreIteratorMod.ByteChunkIterator {
  def this(file: atTensorflowTfjsDashDataLib.distTypesMod.FileElement) = this()
  def this(file: atTensorflowTfjsDashDataLib.distTypesMod.FileElement, options: FileChunkIteratorOptions) = this()
  var chunkSize: scala.Double = js.native
  var file: atTensorflowTfjsDashDataLib.distTypesMod.FileElement = js.native
  var offset: scala.Double = js.native
  var options: FileChunkIteratorOptions = js.native
}

