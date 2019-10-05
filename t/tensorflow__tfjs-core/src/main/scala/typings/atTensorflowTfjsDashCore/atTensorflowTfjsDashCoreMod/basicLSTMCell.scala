package typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTensorMod.Scalar
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "basicLSTMCell")
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

