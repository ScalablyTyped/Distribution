package typings
package atTensorflowTfjsLib.atTensorflowTfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "depthwiseConv2d")
@js.native
object depthwiseConv2d extends js.Object {
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same | scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same | scala.Double,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.NHWC | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.NCHW
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same | scala.Double,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.NHWC | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.NCHW,
    dilations: (js.Tuple2[scala.Double, scala.Double]) | scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same | scala.Double,
    dataFormat: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.NHWC | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.NCHW,
    dilations: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    dimRoundingMode: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.floor | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.round | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.ceil
  ): T = js.native
}

