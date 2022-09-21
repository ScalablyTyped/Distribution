package typings.tensorflowTfjsLayers

import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datasetStubMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/dataset_stub", "Dataset")
  @js.native
  abstract class Dataset[T] () extends StObject {
    
    def iterator(): js.Promise[LazyIterator[T]] = js.native
    
    var size: Double = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/dataset_stub", "LazyIterator")
  @js.native
  abstract class LazyIterator[T] () extends StObject {
    
    def next(): js.Promise[IteratorResult[T, Any]] = js.native
  }
}
