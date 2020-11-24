package typings.tensorflowTfjsCore.opsForConverterMod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "stridedSlice")
@js.native
object stridedSlice
  extends TopLevel[
      js.Function9[
        /* x */ Tensor[Rank] | TensorLike, 
        /* begin */ js.Array[Double], 
        /* end */ js.Array[Double], 
        /* strides */ js.UndefOr[js.Array[Double]], 
        /* beginMask */ js.UndefOr[Double], 
        /* endMask */ js.UndefOr[Double], 
        /* ellipsisMask */ js.UndefOr[Double], 
        /* newAxisMask */ js.UndefOr[Double], 
        /* shrinkAxisMask */ js.UndefOr[Double], 
        Tensor[Rank]
      ]
    ]
