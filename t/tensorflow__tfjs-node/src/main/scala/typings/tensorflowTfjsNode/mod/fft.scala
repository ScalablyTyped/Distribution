package typings.tensorflowTfjsNode.mod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "fft")
@js.native
object fft
  extends TopLevel[
      js.Function1[
        /* input */ Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
        Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]

