package typings.tensorflowTfjsCore.opsMod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "multinomial")
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
