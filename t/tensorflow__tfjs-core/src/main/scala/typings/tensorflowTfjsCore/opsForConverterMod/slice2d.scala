package typings.tensorflowTfjsCore.opsForConverterMod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice2d")
@js.native
object slice2d
  extends TopLevel[
      js.Function3[
        /* x */ Tensor2D | TensorLike, 
        /* begin */ js.Tuple2[Double, Double], 
        /* size */ js.Tuple2[Double, Double], 
        Tensor2D
      ]
    ]
