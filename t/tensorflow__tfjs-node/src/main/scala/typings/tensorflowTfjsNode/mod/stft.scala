package typings.tensorflowTfjsNode.mod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "stft")
@js.native
object stft
  extends TopLevel[
      js.Function5[
        /* signal */ Tensor1D, 
        /* frameLength */ Double, 
        /* frameStep */ Double, 
        /* fftLength */ js.UndefOr[Double], 
        /* windowFn */ js.UndefOr[js.Function1[/* length */ Double, Tensor1D]], 
        Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]

