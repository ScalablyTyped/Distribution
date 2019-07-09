package typings
package atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "conv3d")
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

