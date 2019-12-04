package typings.atTensorflowTfjsDashData.distStatisticsMod

import typings.atTensorflowTfjsDashData.distDatasetMod.Dataset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/statistics", "computeDatasetStatistics")
@js.native
object computeDatasetStatistics extends js.Object {
  def apply(dataset: Dataset[TabularRecord]): js.Promise[DatasetStatistics] = js.native
  def apply(dataset: Dataset[TabularRecord], sampleSize: Double): js.Promise[DatasetStatistics] = js.native
  def apply(dataset: Dataset[TabularRecord], sampleSize: Double, shuffleWindowSize: Double): js.Promise[DatasetStatistics] = js.native
}

