package typings.atTensorflowTfjsDashData.distDatasetsTextUnderscoreLineUnderscoreDatasetMod

import typings.atTensorflowTfjsDashData.distDatasetMod.Dataset
import typings.atTensorflowTfjsDashData.distDatasourceMod.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/datasets/text_line_dataset", "TextLineDataset")
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

