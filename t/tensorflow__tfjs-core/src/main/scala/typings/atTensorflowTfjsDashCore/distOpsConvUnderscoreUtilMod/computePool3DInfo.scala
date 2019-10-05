package typings.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NCDHW
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NDHWC
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.same
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computePool3DInfo")
@js.native
object computePool3DInfo extends js.Object {
  def apply(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterSize: Double | (js.Tuple3[Double, Double, Double]),
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same | valid | Double
  ): Conv3DInfo = js.native
  def apply(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterSize: Double | (js.Tuple3[Double, Double, Double]),
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same | valid | Double,
    roundingMode: floor | round | ceil
  ): Conv3DInfo = js.native
  def apply(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterSize: Double | (js.Tuple3[Double, Double, Double]),
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same | valid | Double,
    roundingMode: floor | round | ceil,
    dataFormat: NDHWC | NCDHW
  ): Conv3DInfo = js.native
}

