package typings
package atTensorflowTfjsDashCoreLib.distOpsOpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "separableConv2d")
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

