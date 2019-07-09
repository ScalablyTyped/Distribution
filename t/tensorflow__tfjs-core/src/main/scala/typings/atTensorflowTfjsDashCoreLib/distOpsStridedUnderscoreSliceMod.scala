package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/strided_slice", JSImport.Namespace)
@js.native
object distOpsStridedUnderscoreSliceMod extends js.Object {
  val stridedSlice: js.Function9[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* begin */ js.Array[scala.Double], 
    /* end */ js.Array[scala.Double], 
    /* strides */ js.Array[scala.Double], 
    /* beginMask */ js.UndefOr[scala.Double], 
    /* endMask */ js.UndefOr[scala.Double], 
    /* ellipsisMask */ js.UndefOr[scala.Double], 
    /* newAxisMask */ js.UndefOr[scala.Double], 
    /* shrinkAxisMask */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
}

