package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjs.atTensorflowTfjsStrings.same
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.valid
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R3
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "conv2dDerInput")
@js.native
object conv2dDerInput extends js.Object {
  def apply(
    xShape: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double]),
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same | valid,
    dimRoundingMode: typings.atTensorflowTfjs.atTensorflowTfjsStrings.ceil | typings.atTensorflowTfjs.atTensorflowTfjsStrings.floor | typings.atTensorflowTfjs.atTensorflowTfjsStrings.round
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    xShape: js.Tuple3[Double, Double, Double],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    xShape: js.Tuple3[Double, Double, Double],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: same
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    xShape: js.Tuple3[Double, Double, Double],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: valid
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    xShape: js.Tuple3[Double, Double, Double],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: Double
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    xShape: js.Tuple3[Double, Double, Double],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: same
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    xShape: js.Tuple3[Double, Double, Double],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: valid
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: same
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor4D,
    strides: js.Tuple2[Double, Double],
    pad: valid
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: Double
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: same
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double,
    pad: valid
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3] = js.native
}

