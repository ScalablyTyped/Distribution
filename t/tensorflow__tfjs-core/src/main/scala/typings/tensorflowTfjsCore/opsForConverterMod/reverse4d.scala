package typings.tensorflowTfjsCore.opsForConverterMod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "reverse4d")
@js.native
object reverse4d
  extends TopLevel[
      js.Function2[
        /* x */ Tensor4D | TensorLike, 
        /* axis */ js.UndefOr[Double | js.Array[Double]], 
        Tensor4D
      ]
    ]
