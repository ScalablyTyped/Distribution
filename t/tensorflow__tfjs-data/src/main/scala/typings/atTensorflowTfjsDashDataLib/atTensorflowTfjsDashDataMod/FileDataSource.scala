package typings
package atTensorflowTfjsDashDataLib.atTensorflowTfjsDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data", "FileDataSource")
@js.native
class FileDataSource protected ()
  extends atTensorflowTfjsDashDataLib.distSourcesFileUnderscoreDataUnderscoreSourceMod.FileDataSource {
  /**
    * Create a `FileDataSource`.
    *
    * @param input Local file path, or `File`/`Blob`/`Uint8Array` object to
    *     read. Local file only works in node environment.
    * @param options Options passed to the underlying `FileChunkIterator`s,
    *   such as {chunksize: 1024}.
    */
  def this(input: atTensorflowTfjsDashDataLib.distTypesMod.FileElement) = this()
  def this(input: java.lang.String) = this()
  def this(input: atTensorflowTfjsDashDataLib.distTypesMod.FileElement, options: atTensorflowTfjsDashDataLib.distIteratorsFileUnderscoreChunkUnderscoreIteratorMod.FileChunkIteratorOptions) = this()
  def this(input: java.lang.String, options: atTensorflowTfjsDashDataLib.distIteratorsFileUnderscoreChunkUnderscoreIteratorMod.FileChunkIteratorOptions) = this()
}

