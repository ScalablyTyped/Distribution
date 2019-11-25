package typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "dropout")
@js.native
object dropout
  extends TopLevel[
      js.Function4[
        /* x */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] | TensorLike, 
        /* rate */ Double, 
        /* noiseShape */ js.UndefOr[js.Array[Double]], 
        /* seed */ js.UndefOr[Double | String], 
        typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
      ]
    ]

