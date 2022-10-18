package typings.tensorflowTfjsNode

import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInt64TensorsMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/int64_tensors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/int64_tensors", "Int64Scalar")
  @js.native
  open class Int64Scalar protected () extends StObject {
    def this(value: Double) = this()
    
    val dtype: String = js.native
    
    val rank: Double = js.native
    
    def shape: Shape = js.native
    
    val value: Double = js.native
    
    /** Get the Int32Array that represents the int64 value. */
    def valueArray: js.typedarray.Int32Array = js.native
    
    /* private */ var valueArray_ : Any = js.native
  }
  /* static members */
  object Int64Scalar {
    
    @JSImport("@tensorflow/tfjs-node/dist/int64_tensors", "Int64Scalar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-node/dist/int64_tensors", "Int64Scalar.endiannessOkay_")
    @js.native
    def endiannessOkay_ : Any = js.native
    inline def endiannessOkay__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endiannessOkay_")(x.asInstanceOf[js.Any])
  }
  
  inline def encodeInt32ArrayAsInt64(value: js.typedarray.Int32Array): js.typedarray.Int32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeInt32ArrayAsInt64")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Int32Array]
}
