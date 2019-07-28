package typings.atTensorflowTfjsDashLayers.distEngineDatasetUnderscoreStubMod

import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/dataset_stub", "LazyIterator")
@js.native
abstract class LazyIterator[T] () extends js.Object {
  def next(): js.Promise[IteratorResult[T]] = js.native
}

