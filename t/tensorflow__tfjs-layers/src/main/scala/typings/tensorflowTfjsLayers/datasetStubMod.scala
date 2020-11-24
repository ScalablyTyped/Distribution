package typings.tensorflowTfjsLayers

import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/engine/dataset_stub", JSImport.Namespace)
@js.native
object datasetStubMod extends js.Object {
  
  @js.native
  abstract class Dataset[T] () extends js.Object {
    
    def iterator(): js.Promise[LazyIterator[T]] = js.native
    
    var size: Double = js.native
  }
  
  @js.native
  abstract class LazyIterator[T] () extends js.Object {
    
    def next(): js.Promise[IteratorResult[T, _]] = js.native
  }
}
