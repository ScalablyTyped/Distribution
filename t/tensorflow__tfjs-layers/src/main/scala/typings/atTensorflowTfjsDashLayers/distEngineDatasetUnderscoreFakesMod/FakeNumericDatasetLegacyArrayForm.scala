package typings.atTensorflowTfjsDashLayers.distEngineDatasetUnderscoreFakesMod

import typings.atTensorflowTfjsDashLayers.distEngineDatasetUnderscoreStubMod.Dataset
import typings.atTensorflowTfjsDashLayers.distTypesMod.TensorOrArrayOrMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/dataset_fakes", "FakeNumericDatasetLegacyArrayForm")
@js.native
class FakeNumericDatasetLegacyArrayForm protected ()
  extends Dataset[js.Tuple2[TensorOrArrayOrMap, TensorOrArrayOrMap]] {
  def this(args: FakeDatasetArgs) = this()
  val args: FakeDatasetArgs = js.native
  var ds: FakeNumericDataset = js.native
}

