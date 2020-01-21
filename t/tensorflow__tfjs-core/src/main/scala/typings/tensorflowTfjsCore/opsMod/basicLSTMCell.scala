package typings.tensorflowTfjsCore.opsMod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Scalar
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "basicLSTMCell")
@js.native
object basicLSTMCell
  extends TopLevel[
      js.Function6[
        /* forgetBias */ Scalar | TensorLike, 
        /* lstmKernel */ Tensor2D | TensorLike, 
        /* lstmBias */ Tensor1D | TensorLike, 
        /* data */ Tensor2D | TensorLike, 
        /* c */ Tensor2D | TensorLike, 
        /* h */ Tensor2D | TensorLike, 
        js.Tuple2[Tensor2D, Tensor2D]
      ]
    ]

