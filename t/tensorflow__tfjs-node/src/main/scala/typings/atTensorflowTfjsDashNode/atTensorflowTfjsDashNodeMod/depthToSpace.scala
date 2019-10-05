package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike4D
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.NCHW
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.NHWC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "depthToSpace")
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

