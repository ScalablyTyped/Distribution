package typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.same
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.valid
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R3
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank.R4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "conv2dDerFilter")
@js.native
object conv2dDerFilter extends js.Object {
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
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round
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
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same,
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same,
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round
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
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid,
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid,
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round
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
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: Double,
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: Double,
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round
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
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same,
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same,
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round
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
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: valid,
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor
  ): Tensor4D = js.native
  def apply(
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    dy: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R3 | R4],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: valid,
    dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round
  ): Tensor4D = js.native
}

