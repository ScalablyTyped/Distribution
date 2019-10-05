package typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "whereAsync")
@js.native
object whereAsync
  extends TopLevel[
      js.Function1[
        /* condition */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] | TensorLike, 
        js.Promise[Tensor2D]
      ]
    ]

