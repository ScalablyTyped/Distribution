package typings.tensorflowTfjsNode.mod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "dot")
@js.native
object dot
  extends TopLevel[
      js.Function2[
        /* t1 */ Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        /* t2 */ Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]

