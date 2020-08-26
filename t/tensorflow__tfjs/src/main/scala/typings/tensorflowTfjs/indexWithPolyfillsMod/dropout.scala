package typings.tensorflowTfjs.indexWithPolyfillsMod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "dropout")
@js.native
object dropout
  extends TopLevel[
      js.Function4[
        /* x */ Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        /* rate */ Double, 
        /* noiseShape */ js.UndefOr[js.Array[Double]], 
        /* seed */ js.UndefOr[Double | String], 
        Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]

