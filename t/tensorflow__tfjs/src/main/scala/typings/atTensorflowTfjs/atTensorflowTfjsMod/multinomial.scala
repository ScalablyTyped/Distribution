package typings.atTensorflowTfjs.atTensorflowTfjsMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "multinomial")
@js.native
object multinomial
  extends TopLevel[
      js.Function4[
        /* logits */ Tensor1D | Tensor2D | TensorLike, 
        /* numSamples */ Double, 
        /* seed */ js.UndefOr[Double], 
        /* normalized */ js.UndefOr[Boolean], 
        Tensor1D | Tensor2D
      ]
    ]

