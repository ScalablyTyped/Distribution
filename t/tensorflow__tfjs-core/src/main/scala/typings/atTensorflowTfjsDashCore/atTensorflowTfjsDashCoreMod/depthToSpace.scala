package typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NCHW
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NHWC
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "depthToSpace")
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

