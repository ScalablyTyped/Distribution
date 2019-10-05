package typings.atTensorflowTfjsDashData

import typings.atTensorflowTfjsDashData.distIteratorsByteUnderscoreChunkUnderscoreIteratorMod.ByteChunkIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/datasource", JSImport.Namespace)
@js.native
object distDatasourceMod extends js.Object {
  @js.native
  abstract class DataSource () extends js.Object {
    /**
      * Obtain a new stream of binary data chunks.
      *
      * Starts the new stream from the beginning of the data source, even if other
      * streams have been obtained previously.
      */
    def iterator(): js.Promise[ByteChunkIterator] = js.native
  }
  
}

