package typings
package atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "conv2dDerFilter")
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
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same
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
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil
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
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor
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
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round
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
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid
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
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil
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
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor
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
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round
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
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil
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
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor
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
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round
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
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same
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
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil
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
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor
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
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round
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
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid
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
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil
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
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor
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
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid,
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round
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
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil
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
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor
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
    dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
}

