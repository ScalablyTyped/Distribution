package typings.tensorflowTfjsData

import typings.tensorflowTfjsData.distDatasourceMod.DataSource
import typings.tensorflowTfjsData.distIteratorsFileChunkIteratorMod.FileChunkIteratorOptions
import typings.tensorflowTfjsData.distTypesMod.FileElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSourcesFileDataSourceMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/sources/file_data_source", "FileDataSource")
  @js.native
  open class FileDataSource protected () extends DataSource {
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
    
    /* protected */ var input: FileElement | String = js.native
    
    /* protected */ val options: FileChunkIteratorOptions = js.native
  }
}
