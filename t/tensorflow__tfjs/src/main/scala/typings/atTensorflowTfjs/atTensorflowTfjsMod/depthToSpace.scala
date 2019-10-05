package typings.atTensorflowTfjs.atTensorflowTfjsMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.NCHW
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.NHWC
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "depthToSpace")
@js.native
object depthToSpace
  extends TopLevel[
      js.Function3[
        /* x */ Tensor4D | TensorLike4D, 
        /* blockSize */ Double, 
        /* dataFormat */ js.UndefOr[NHWC | NCHW], 
        Tensor4D
      ]
    ]

