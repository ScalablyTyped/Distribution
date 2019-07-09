package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "depthwiseConv2d")
@js.native
object depthwiseConv2d extends js.Object {
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same | scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same | scala.Double,
    dataFormat: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.NHWC | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.NCHW
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same | scala.Double,
    dataFormat: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.NHWC | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.NCHW,
    dilations: (js.Tuple2[scala.Double, scala.Double]) | scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    filter: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same | scala.Double,
    dataFormat: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.NHWC | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.NCHW,
    dilations: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    dimRoundingMode: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.floor | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.round | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.ceil
  ): T = js.native
}

