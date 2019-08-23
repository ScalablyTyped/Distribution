package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R3
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R4
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.NCHW
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.NHWC
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.same
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "conv2dDerInput")
@js.native
object conv2dDerInput extends js.Object {
  def apply(
    xShape: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double]),
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same | valid,
    dataFormat: NCHW | NHWC
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    xShape: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double]),
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same | valid,
    dataFormat: NCHW | NHWC,
    dimRoundingMode: typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.ceil | typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.floor | typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.round
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

