package typings
package atTensorflowTfjsDashDataLib.distSourcesUrlUnderscoreDataUnderscoreSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/sources/url_data_source", "URLDataSource")
@js.native
class URLDataSource protected ()
  extends atTensorflowTfjsDashDataLib.distDatasourceMod.DataSource {
  /**
    * Create a `URLDataSource`.
    *
    * @param url A source URL string, or a `Request` object.
    * @param options Options passed to the underlying `FileChunkIterator`s,
    *   such as {chunksize: 1024}.
    */
  def this(url: stdLib.RequestInfo) = this()
  def this(url: stdLib.RequestInfo, fileOptions: atTensorflowTfjsDashDataLib.distIteratorsFileUnderscoreChunkUnderscoreIteratorMod.FileChunkIteratorOptions) = this()
  val fileOptions: atTensorflowTfjsDashDataLib.distIteratorsFileUnderscoreChunkUnderscoreIteratorMod.FileChunkIteratorOptions = js.native
  val url: stdLib.RequestInfo = js.native
}

