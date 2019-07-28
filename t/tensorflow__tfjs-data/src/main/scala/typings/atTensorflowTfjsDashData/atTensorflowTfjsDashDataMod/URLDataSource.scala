package typings.atTensorflowTfjsDashData.atTensorflowTfjsDashDataMod

import typings.atTensorflowTfjsDashData.distIteratorsFileUnderscoreChunkUnderscoreIteratorMod.FileChunkIteratorOptions
import typings.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data", "URLDataSource")
@js.native
class URLDataSource protected ()
  extends typings.atTensorflowTfjsDashData.distSourcesUrlUnderscoreDataUnderscoreSourceMod.URLDataSource {
  /**
    * Create a `URLDataSource`.
    *
    * @param url A source URL string, or a `Request` object.
    * @param options Options passed to the underlying `FileChunkIterator`s,
    *   such as {chunksize: 1024}.
    */
  def this(url: RequestInfo) = this()
  def this(url: RequestInfo, fileOptions: FileChunkIteratorOptions) = this()
}

