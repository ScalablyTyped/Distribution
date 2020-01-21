package typings.tensorflowTfjsNode

import typings.std.Int32Array
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/int64_tensors", JSImport.Namespace)
@js.native
object int64TensorsMod extends js.Object {
  @js.native
  class Int64Scalar protected () extends js.Object {
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
  @js.native
  object Int64Scalar extends js.Object {
    var endiannessOkay_ : js.Any = js.native
  }
  
}

