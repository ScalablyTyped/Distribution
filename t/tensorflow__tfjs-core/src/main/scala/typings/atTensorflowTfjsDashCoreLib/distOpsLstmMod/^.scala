package typings
package atTensorflowTfjsDashCoreLib.distOpsLstmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/lstm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val basicLSTMCell: js.Function6[
    /* forgetBias */ atTensorflowTfjsDashCoreLib.distTensorMod.Scalar | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* lstmKernel */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* lstmBias */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* data */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* c */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* h */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    js.Tuple2[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D, 
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
    ]
  ] = js.native
  val multiRNNCell: js.Function4[
    /* lstmCells */ js.Array[LSTMCellFunc], 
    /* data */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* c */ js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* h */ js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    js.Tuple2[
      js.Array[atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D], 
      js.Array[atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D]
    ]
  ] = js.native
}

