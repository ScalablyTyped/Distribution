package typings.tensorflowTfjsCore.mod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "frame")
@js.native
object frame
  extends TopLevel[
      js.Function5[
        /* signal */ Tensor1D, 
        /* frameLength */ Double, 
        /* frameStep */ Double, 
        /* padEnd */ js.UndefOr[Boolean], 
        /* padValue */ js.UndefOr[Double], 
        Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]

