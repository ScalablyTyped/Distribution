package typings.tensorflowTfjsCore.baseMod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.multiRnnCellMod.LSTMCellFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/base", "multiRNNCell")
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
