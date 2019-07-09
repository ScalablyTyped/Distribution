package typings
package atTensorflowTfjsLib.atTensorflowTfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "pool")
@js.native
object pool extends js.Object {
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    input: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    windowShape: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    poolingType: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.avg | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.max,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same | scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    input: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    windowShape: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    poolingType: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.avg | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.max,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same | scala.Double,
    dilations: (js.Tuple2[scala.Double, scala.Double]) | scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    input: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    windowShape: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    poolingType: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.avg | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.max,
    pad: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.valid | atTensorflowTfjsLib.atTensorflowTfjsLibStrings.same | scala.Double,
    dilations: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double
  ): T = js.native
}

