package typings.tensorflowTfjsCore.mod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "rfft")
@js.native
object rfft
  extends TopLevel[
      js.Function2[
        /* input */ Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
        /* fftLength */ js.UndefOr[Double], 
        Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]

