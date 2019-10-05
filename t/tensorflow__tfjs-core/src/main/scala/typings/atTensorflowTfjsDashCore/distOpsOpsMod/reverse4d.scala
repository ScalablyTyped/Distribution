package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "reverse4d")
@js.native
object reverse4d
  extends TopLevel[
      js.Function2[
        /* x */ Tensor4D | TensorLike, 
        /* axis */ js.UndefOr[Double | js.Array[Double]], 
        Tensor4D
      ]
    ]

