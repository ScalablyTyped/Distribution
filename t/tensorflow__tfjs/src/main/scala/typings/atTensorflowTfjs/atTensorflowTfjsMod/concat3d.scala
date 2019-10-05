package typings.atTensorflowTfjs.atTensorflowTfjsMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "concat3d")
@js.native
object concat3d
  extends TopLevel[
      js.Function2[/* tensors */ js.Array[Tensor3D | TensorLike], /* axis */ Double, Tensor3D]
    ]

