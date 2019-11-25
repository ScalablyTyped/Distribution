package typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NCDHW
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NDHWC
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.same_
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.valid_
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor5D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "maxPool3d")
@js.native
object maxPool3d extends js.Object {
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_ | Double
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor | typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round | typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor | typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round | typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil,
    dataFormat: NDHWC | NCDHW
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor | typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round | typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil,
    dataFormat: NDHWC | NCDHW,
    dilations: (js.Tuple3[Double, Double, Double]) | Double
  ): T = js.native
}

