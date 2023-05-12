package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIoCompositeArrayBufferMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/io/composite_array_buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/composite_array_buffer", "CompositeArrayBuffer")
  @js.native
  open class CompositeArrayBuffer protected () extends StObject {
    def this(buffers: js.Array[js.typedarray.ArrayBuffer | TypedArray]) = this()
    def this(buffers: js.typedarray.ArrayBuffer) = this()
    def this(buffers: TypedArray) = this()
    
    /* private */ var bufferUniformSize: Any = js.native
    
    val byteLength: Double = js.native
    
    /**
      * Get the index of the shard that contains the byte at `byteIndex`.
      */
    /* private */ var findShardForByte: Any = js.native
    
    /* private */ var previousShardIndex: Any = js.native
    
    /* private */ var shards: Any = js.native
    
    def slice(): js.typedarray.ArrayBuffer = js.native
    def slice(start: Double): js.typedarray.ArrayBuffer = js.native
    def slice(start: Double, end: Double): js.typedarray.ArrayBuffer = js.native
    def slice(start: Unit, end: Double): js.typedarray.ArrayBuffer = js.native
  }
  
  inline def search[T](sortedArray: js.Array[T], compare: js.Function1[/* t */ T, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(sortedArray.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Double]
}
