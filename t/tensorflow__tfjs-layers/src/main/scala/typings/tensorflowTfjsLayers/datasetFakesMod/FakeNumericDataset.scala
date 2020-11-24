package typings.tensorflowTfjsLayers.datasetFakesMod

import typings.tensorflowTfjsLayers.datasetStubMod.Dataset
import typings.tensorflowTfjsLayers.trainingDatasetMod.FitDatasetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/engine/dataset_fakes", "FakeNumericDataset")
@js.native
class FakeNumericDataset protected () extends Dataset[FitDatasetElement] {
  def this(args: FakeDatasetArgs) = this()
  
  val args: FakeDatasetArgs = js.native
}
