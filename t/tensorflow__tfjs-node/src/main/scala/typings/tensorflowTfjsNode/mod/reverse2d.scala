package typings.tensorflowTfjsNode.mod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "reverse2d")
@js.native
object reverse2d
  extends TopLevel[
      js.Function2[
        /* x */ Tensor2D | TensorLike, 
        /* axis */ js.UndefOr[Double | js.Array[Double]], 
        Tensor2D
      ]
    ]
