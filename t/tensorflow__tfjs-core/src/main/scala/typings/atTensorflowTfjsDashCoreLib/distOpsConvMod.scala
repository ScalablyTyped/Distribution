package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/conv", JSImport.Namespace)
@js.native
object distOpsConvMod extends js.Object {
  @js.native
  object conv1d extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      stride: scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      stride: scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double,
      dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NWC | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCW
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      stride: scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double,
      dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NWC | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCW,
      dilation: scala.Double
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      stride: scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double,
      dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NWC | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCW,
      dilation: scala.Double,
      dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil
    ): T = js.native
  }
  
  @js.native
  object conv2d extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double,
      dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double,
      dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW,
      dilations: (js.Tuple2[scala.Double, scala.Double]) | scala.Double
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double,
      dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW,
      dilations: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil
    ): T = js.native
  }
  
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
  
  @js.native
  object conv2dTranspose extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      outputShape: (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double]),
      strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      outputShape: (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double]),
      strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double,
      dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil
    ): T = js.native
  }
  
  @js.native
  object conv3d extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      strides: (js.Tuple3[scala.Double, scala.Double, scala.Double]) | scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      strides: (js.Tuple3[scala.Double, scala.Double, scala.Double]) | scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
      dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NDHWC | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCDHW
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      strides: (js.Tuple3[scala.Double, scala.Double, scala.Double]) | scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
      dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NDHWC | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCDHW,
      dilations: (js.Tuple3[scala.Double, scala.Double, scala.Double]) | scala.Double
    ): T = js.native
  }
  
  @js.native
  object depthwiseConv2d extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double,
      dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double,
      dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW,
      dilations: (js.Tuple2[scala.Double, scala.Double]) | scala.Double
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double,
      dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW,
      dilations: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil
    ): T = js.native
  }
  
  @js.native
  object separableConv2d extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      depthwiseFilter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      pointwiseFilter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      depthwiseFilter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      pointwiseFilter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
      dilation: (js.Tuple2[scala.Double, scala.Double]) | scala.Double
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      depthwiseFilter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      pointwiseFilter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same,
      dilation: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      dataFormat: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW
    ): T = js.native
  }
  
}

