package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjs.atTensorflowTfjsStrings.NCHW
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.NHWC
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.same
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.valid
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R3
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "conv2dDerFilter")
@js.native
object conv2dDerFilter extends js.Object {
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same | valid,
    dataFormat: NCHW | NHWC,
    dimRoundingMode: typings.atTensorflowTfjs.atTensorflowTfjsStrings.ceil | typings.atTensorflowTfjs.atTensorflowTfjsStrings.floor | typings.atTensorflowTfjs.atTensorflowTfjsStrings.round
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

