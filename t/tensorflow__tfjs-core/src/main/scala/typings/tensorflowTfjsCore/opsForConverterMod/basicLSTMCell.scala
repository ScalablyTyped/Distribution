package typings.tensorflowTfjsCore.opsForConverterMod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "basicLSTMCell")
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
