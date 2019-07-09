package typings
package atTensorflowTfjsDashDataLib.distDatasourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/datasource", "DataSource")
@js.native
abstract class DataSource () extends js.Object {
  /**
    * Obtain a new stream of binary data chunks.
    *
    * Starts the new stream from the beginning of the data source, even if other
    * streams have been obtained previously.
    */
  def iterator(): js.Promise[
    atTensorflowTfjsDashDataLib.distIteratorsByteUnderscoreChunkUnderscoreIteratorMod.ByteChunkIterator
  ] = js.native
}

