package typings.tensorflowTfjsNode

import typings.std.Int32Array
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object int64TensorsMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/int64_tensors", "Int64Scalar")
  @js.native
  class Int64Scalar protected () extends StObject {
    def this(value: Double) = this()
    
    val dtype: String = js.native
    
    val rank: Double = js.native
    
    val shape: Shape = js.native
    
    val value: Double = js.native
    
    /** Get the Int32Array that represents the int64 value. */
    val valueArray: Int32Array = js.native
    
    var valueArray_ : js.Any = js.native
  }
  /* static members */
  object Int64Scalar {
    
    @JSImport("@tensorflow/tfjs-node/dist/int64_tensors", "Int64Scalar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-node/dist/int64_tensors", "Int64Scalar.endiannessOkay_")
    @js.native
    def endiannessOkay_ : js.Any = js.native
    @scala.inline
    def endiannessOkay__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endiannessOkay_")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-node/dist/int64_tensors", "encodeInt32ArrayAsInt64")
  @js.native
  def encodeInt32ArrayAsInt64(value: Int32Array): Int32Array = js.native
}
