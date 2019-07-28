package typings.atTensorflowTfjsDashLayers.distEngineDatasetUnderscoreStubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/dataset_stub", "Dataset")
@js.native
abstract class Dataset[T] () extends js.Object {
  var size: Double = js.native
  def iterator(): js.Promise[LazyIterator[T]] = js.native
}

