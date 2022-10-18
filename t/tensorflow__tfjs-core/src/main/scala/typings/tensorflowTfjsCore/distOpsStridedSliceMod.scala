package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsStridedSliceMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/strided_slice", "stridedSlice")
  @js.native
  val stridedSlice: js.Function9[
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
  ] = js.native
}
