package typings
package atTensorflowTfjsLib.atTensorflowTfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "conv2dDerFilter")
@js.native
object conv2dDerFilter extends js.Object {
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.ceil
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.floor
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.round
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.ceil
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.floor
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.round
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    pad: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    pad: scala.Double,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.ceil
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    pad: scala.Double,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.floor
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: js.Tuple2[scala.Double, scala.Double],
    pad: scala.Double,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.round
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.ceil
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.floor
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.round
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.ceil
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.floor
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.round
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    pad: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    pad: scala.Double,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.ceil
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    pad: scala.Double,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.floor
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def apply(
    x: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    dy: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
      atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
    ],
    filterShape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    strides: scala.Double,
    pad: scala.Double,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.round
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
}

