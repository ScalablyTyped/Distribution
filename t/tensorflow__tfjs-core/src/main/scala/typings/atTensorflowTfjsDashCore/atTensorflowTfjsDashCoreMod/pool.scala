package typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.avg
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.max
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.same
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.valid
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "pool")
@js.native
object pool extends js.Object {
  def apply[T /* <: Tensor3D | Tensor4D */](
    input: T | TensorLike,
    windowShape: (js.Tuple2[Double, Double]) | Double,
    poolingType: avg | max,
    pad: valid | same | Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    input: T | TensorLike,
    windowShape: (js.Tuple2[Double, Double]) | Double,
    poolingType: avg | max,
    pad: valid | same | Double,
    dilations: (js.Tuple2[Double, Double]) | Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    input: T | TensorLike,
    windowShape: (js.Tuple2[Double, Double]) | Double,
    poolingType: avg | max,
    pad: valid | same | Double,
    dilations: (js.Tuple2[Double, Double]) | Double,
    strides: (js.Tuple2[Double, Double]) | Double
  ): T = js.native
}

