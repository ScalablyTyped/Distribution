package typings.tensorflowTfjsData

import typings.std.RequestInfo
import typings.tensorflowTfjsData.datasourceMod.DataSource
import typings.tensorflowTfjsData.fileChunkIteratorMod.FileChunkIteratorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/sources/url_data_source", JSImport.Namespace)
@js.native
object urlDataSourceMod extends js.Object {
  @js.native
  class URLDataSource protected () extends DataSource {
    /**
      * Create a `URLDataSource`.
      *
      * @param url A source URL string, or a `Request` object.
      * @param options Options passed to the underlying `FileChunkIterator`s,
      *   such as {chunksize: 1024}.
      */
    def this(url: RequestInfo) = this()
    def this(url: RequestInfo, fileOptions: FileChunkIteratorOptions) = this()
    val fileOptions: FileChunkIteratorOptions = js.native
    val url: RequestInfo = js.native
  }
  
}

