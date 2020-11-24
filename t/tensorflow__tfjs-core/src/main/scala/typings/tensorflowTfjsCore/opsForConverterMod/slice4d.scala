package typings.tensorflowTfjsCore.opsForConverterMod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice4d")
@js.native
object slice4d
  extends TopLevel[
      js.Function3[
        /* x */ Tensor4D | TensorLike, 
        /* begin */ js.Tuple4[Double, Double, Double, Double], 
        /* size */ js.Tuple4[Double, Double, Double, Double], 
        Tensor4D
      ]
    ]
