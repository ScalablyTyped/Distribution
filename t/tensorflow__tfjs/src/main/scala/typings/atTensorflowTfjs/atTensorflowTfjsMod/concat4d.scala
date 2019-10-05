package typings.atTensorflowTfjs.atTensorflowTfjsMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "concat4d")
@js.native
object concat4d
  extends TopLevel[
      js.Function2[/* tensors */ js.Array[Tensor4D | TensorLike], /* axis */ Double, Tensor4D]
    ]

