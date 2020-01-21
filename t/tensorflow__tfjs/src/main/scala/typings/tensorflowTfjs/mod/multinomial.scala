package typings.tensorflowTfjs.mod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import typings.tensorflowTfjsCore.tensorMod.Tensor2D
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

