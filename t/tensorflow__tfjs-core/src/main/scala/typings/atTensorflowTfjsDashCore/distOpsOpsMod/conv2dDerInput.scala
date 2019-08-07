package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.same
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.valid
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R3
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "conv2dDerInput")
@js.native
object conv2dDerInput extends js.Object {
  def apply(
    xShape: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double]),
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same | valid
  ): Tensor[R3] = js.native
  def apply(
    xShape: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double]),
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same | valid,
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil | typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor | typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round
  ): Tensor[R3] = js.native
}

