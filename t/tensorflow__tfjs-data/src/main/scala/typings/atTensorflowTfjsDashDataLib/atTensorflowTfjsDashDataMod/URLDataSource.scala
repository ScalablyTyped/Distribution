package typings
package atTensorflowTfjsDashDataLib.atTensorflowTfjsDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data", "URLDataSource")
@js.native
class URLDataSource protected ()
  extends atTensorflowTfjsDashDataLib.distSourcesUrlUnderscoreDataUnderscoreSourceMod.URLDataSource {
  /**
    * Create a `URLDataSource`.
    *
    * @param url A source URL string, or a `Request` object.
    * @param options Options passed to the underlying `FileChunkIterator`s,
    *   such as {chunksize: 1024}.
    */
  def this(url: stdLib.RequestInfo) = this()
  def this(url: stdLib.RequestInfo, fileOptions: atTensorflowTfjsDashDataLib.distIteratorsFileUnderscoreChunkUnderscoreIteratorMod.FileChunkIteratorOptions) = this()
}

