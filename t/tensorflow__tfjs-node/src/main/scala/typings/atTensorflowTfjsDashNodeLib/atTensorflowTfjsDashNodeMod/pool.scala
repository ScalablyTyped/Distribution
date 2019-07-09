package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "pool")
@js.native
object pool extends js.Object {
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    input: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    windowShape: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    poolingType: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.avg | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.max,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same | scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    input: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    windowShape: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    poolingType: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.avg | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.max,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same | scala.Double,
    dilations: (js.Tuple2[scala.Double, scala.Double]) | scala.Double
  ): T = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
    input: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    windowShape: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    poolingType: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.avg | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.max,
    pad: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.valid | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.same | scala.Double,
    dilations: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
    strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double
  ): T = js.native
}

