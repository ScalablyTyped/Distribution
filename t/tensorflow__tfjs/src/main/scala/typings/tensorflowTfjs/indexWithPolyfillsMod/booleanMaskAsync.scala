package typings.tensorflowTfjs.indexWithPolyfillsMod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "booleanMaskAsync")
@js.native
object booleanMaskAsync
  extends TopLevel[
      js.Function3[
        /* tensor */ Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        /* mask */ Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        /* axis */ js.UndefOr[Double], 
        js.Promise[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
      ]
    ]

