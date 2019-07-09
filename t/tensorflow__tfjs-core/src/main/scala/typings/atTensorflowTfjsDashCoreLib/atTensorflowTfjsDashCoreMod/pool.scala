package typings
package atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "pool")
@js.native
object pool extends js.Object {
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    input: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    windowShape: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    poolingType: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.avg | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.max,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    input: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    windowShape: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    poolingType: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.avg | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.max,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double,
    dilations: (js.Tuple2[scala.Double, scala.Double]) | scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    input: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    windowShape: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    poolingType: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.avg | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.max,
    pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double,
    dilations: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double
  ): T = js.native
}

