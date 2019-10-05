package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distOpsLstmMod.LSTMCellFunc
import typings.atTensorflowTfjsDashCore.distTensorMod.Scalar
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/lstm", JSImport.Namespace)
@js.native
object distOpsLstmMod extends js.Object {
  @js.native
  trait LSTMCellFunc extends js.Object {
    def apply(data: Tensor2D, c: Tensor2D, h: Tensor2D): js.Tuple2[Tensor2D, Tensor2D] = js.native
  }
  
  val basicLSTMCell: js.Function6[
    /* forgetBias */ Scalar | TensorLike, 
    /* lstmKernel */ Tensor2D | TensorLike, 
    /* lstmBias */ Tensor1D | TensorLike, 
    /* data */ Tensor2D | TensorLike, 
    /* c */ Tensor2D | TensorLike, 
    /* h */ Tensor2D | TensorLike, 
    js.Tuple2[Tensor2D, Tensor2D]
  ] = js.native
  val multiRNNCell: js.Function4[
    /* lstmCells */ js.Array[LSTMCellFunc], 
    /* data */ Tensor2D | TensorLike, 
    /* c */ js.Array[Tensor2D | TensorLike], 
    /* h */ js.Array[Tensor2D | TensorLike], 
    js.Tuple2[js.Array[Tensor2D], js.Array[Tensor2D]]
  ] = js.native
}

