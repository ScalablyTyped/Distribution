package typings.atTensorflowTfjs.atTensorflowTfjsMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distOpsLstmMod.LSTMCellFunc
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "multiRNNCell")
@js.native
object multiRNNCell
  extends TopLevel[
      js.Function4[
        /* lstmCells */ js.Array[LSTMCellFunc], 
        /* data */ Tensor2D | TensorLike, 
        /* c */ js.Array[Tensor2D | TensorLike], 
        /* h */ js.Array[Tensor2D | TensorLike], 
        js.Tuple2[js.Array[Tensor2D], js.Array[Tensor2D]]
      ]
    ]

