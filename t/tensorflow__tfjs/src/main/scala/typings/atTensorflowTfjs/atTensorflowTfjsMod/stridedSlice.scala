package typings.atTensorflowTfjs.atTensorflowTfjsMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "stridedSlice")
@js.native
object stridedSlice
  extends TopLevel[
      js.Function9[
        /* x */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] | TensorLike, 
        /* begin */ js.Array[Double], 
        /* end */ js.Array[Double], 
        /* strides */ js.UndefOr[js.Array[Double]], 
        /* beginMask */ js.UndefOr[Double], 
        /* endMask */ js.UndefOr[Double], 
        /* ellipsisMask */ js.UndefOr[Double], 
        /* newAxisMask */ js.UndefOr[Double], 
        /* shrinkAxisMask */ js.UndefOr[Double], 
        typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
      ]
    ]

