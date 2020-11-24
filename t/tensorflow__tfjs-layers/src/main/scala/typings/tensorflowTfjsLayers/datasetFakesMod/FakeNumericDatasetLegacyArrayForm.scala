package typings.tensorflowTfjsLayers.datasetFakesMod

import typings.tensorflowTfjsLayers.datasetStubMod.Dataset
import typings.tensorflowTfjsLayers.distTypesMod.TensorOrArrayOrMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/engine/dataset_fakes", "FakeNumericDatasetLegacyArrayForm")
@js.native
class FakeNumericDatasetLegacyArrayForm protected ()
  extends Dataset[js.Tuple2[TensorOrArrayOrMap, TensorOrArrayOrMap]] {
  def this(args: FakeDatasetArgs) = this()
  
  val args: FakeDatasetArgs = js.native
  
  var ds: FakeNumericDataset = js.native
}
