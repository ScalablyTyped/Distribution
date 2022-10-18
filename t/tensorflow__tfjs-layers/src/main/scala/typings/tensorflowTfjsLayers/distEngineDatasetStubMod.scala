package typings.tensorflowTfjsLayers

import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEngineDatasetStubMod {
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-layers/dist/engine/dataset_stub", "Dataset")
  @js.native
  open class Dataset[T] () extends StObject {
    
    def iterator(): js.Promise[LazyIterator[T]] = js.native
    
    var size: Double = js.native
  }
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-layers/dist/engine/dataset_stub", "LazyIterator")
  @js.native
  open class LazyIterator[T] () extends StObject {
    
    def next(): js.Promise[IteratorResult[T, Any]] = js.native
  }
}
