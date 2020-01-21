package typings.tensorflowTfjsData

import typings.tensorflowTfjsData.datasetMod.Dataset
import typings.tensorflowTfjsData.datasourceMod.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/datasets/text_line_dataset", JSImport.Namespace)
@js.native
object textLineDatasetMod extends js.Object {
  @js.native
  class TextLineDataset protected () extends Dataset[String] {
    /**
      * Create a `TextLineDataset`.
      *
      * @param input A `DataSource` providing a chunked, UTF8-encoded byte stream.
      */
    def this(input: DataSource) = this()
    val input: DataSource = js.native
  }
  
}

