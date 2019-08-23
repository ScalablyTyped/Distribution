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

@JSImport("@tensorflow/tfjs-node", "conv2dDerFilter")
@js.native
object conv2dDerFilter extends js.Object {
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same | valid,
    dataFormat: NCHW | NHWC,
    dimRoundingMode: typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.ceil | typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.floor | typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.round
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: NCHW
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: NHWC
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same,
    dataFormat: NCHW
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same,
    dataFormat: NHWC
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid,
    dataFormat: NCHW
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid,
    dataFormat: NHWC
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: Double
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: Double,
    dataFormat: NCHW
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: Double,
    dataFormat: NHWC
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same,
    dataFormat: NCHW
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same,
    dataFormat: NHWC
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: valid
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: valid,
    dataFormat: NCHW
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: valid,
    dataFormat: NHWC
  ): Tensor4D = js.native
}

