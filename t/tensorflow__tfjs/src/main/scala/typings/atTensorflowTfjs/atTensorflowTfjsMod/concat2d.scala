package typings.atTensorflowTfjs.atTensorflowTfjsMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "concat2d")
@js.native
object concat2d
  extends TopLevel[
      js.Function2[/* tensors */ js.Array[Tensor2D | TensorLike], /* axis */ Double, Tensor2D]
    ]

