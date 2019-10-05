package typings.atTensorflowTfjsDashData

import typings.atTensorflowTfjsDashData.distDatasourceMod.DataSource
import typings.atTensorflowTfjsDashData.distIteratorsFileUnderscoreChunkUnderscoreIteratorMod.FileChunkIteratorOptions
import typings.atTensorflowTfjsDashData.distTypesMod.FileElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/sources/file_data_source", JSImport.Namespace)
@js.native
object distSourcesFileUnderscoreDataUnderscoreSourceMod extends js.Object {
  @js.native
  class FileDataSource protected () extends DataSource {
    def this(input: String) = this()
    /**
      * Create a `FileDataSource`.
      *
      * @param input Local file path, or `File`/`Blob`/`Uint8Array` object to
      *     read. Local file only works in node environment.
      * @param options Options passed to the underlying `FileChunkIterator`s,
      *   such as {chunksize: 1024}.
      */
    def this(input: FileElement) = this()
    def this(input: String, options: FileChunkIteratorOptions) = this()
    def this(input: FileElement, options: FileChunkIteratorOptions) = this()
    var input: FileElement | String = js.native
    val options: FileChunkIteratorOptions = js.native
  }
  
}

