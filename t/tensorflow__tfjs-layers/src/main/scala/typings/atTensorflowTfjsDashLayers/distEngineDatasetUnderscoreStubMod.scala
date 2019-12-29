package typings.atTensorflowTfjsDashLayers

import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/dataset_stub", JSImport.Namespace)
@js.native
object distEngineDatasetUnderscoreStubMod extends js.Object {
  @js.native
  abstract class Dataset[T] () extends js.Object {
    var size: Double = js.native
    def iterator(): js.Promise[LazyIterator[T]] = js.native
  }
  
  @js.native
  abstract class LazyIterator[T] () extends js.Object {
    def next(): js.Promise[IteratorResult[T, _]] = js.native
  }
  
}

