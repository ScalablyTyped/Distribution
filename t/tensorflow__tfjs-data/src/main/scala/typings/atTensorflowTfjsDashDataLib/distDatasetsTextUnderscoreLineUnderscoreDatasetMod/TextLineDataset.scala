package typings
package atTensorflowTfjsDashDataLib.distDatasetsTextUnderscoreLineUnderscoreDatasetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/datasets/text_line_dataset", "TextLineDataset")
@js.native
class TextLineDataset protected ()
  extends atTensorflowTfjsDashDataLib.distDatasetMod.Dataset[java.lang.String] {
  /**
    * Create a `TextLineDataset`.
    *
    * @param input A `DataSource` providing a chunked, UTF8-encoded byte stream.
    */
  def this(input: atTensorflowTfjsDashDataLib.distDatasourceMod.DataSource) = this()
  val input: atTensorflowTfjsDashDataLib.distDatasourceMod.DataSource = js.native
}

