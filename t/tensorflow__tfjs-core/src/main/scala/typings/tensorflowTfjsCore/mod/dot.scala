package typings.tensorflowTfjsCore.mod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "dot")
@js.native
object dot
  extends TopLevel[
      js.Function2[
        /* x */ Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        /* indices */ Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]

