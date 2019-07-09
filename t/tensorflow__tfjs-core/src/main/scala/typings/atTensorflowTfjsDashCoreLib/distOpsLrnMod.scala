package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/lrn", JSImport.Namespace)
@js.native
object distOpsLrnMod extends js.Object {
  @js.native
  object localResponseNormalization extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](x: T): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](x: T, depthRadius: scala.Double): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](x: T, depthRadius: scala.Double, bias: scala.Double): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](x: T, depthRadius: scala.Double, bias: scala.Double, alpha: scala.Double): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](x: T, depthRadius: scala.Double, bias: scala.Double, alpha: scala.Double, beta: scala.Double): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, depthRadius: scala.Double): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      depthRadius: scala.Double,
      bias: scala.Double
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      depthRadius: scala.Double,
      bias: scala.Double,
      alpha: scala.Double
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      depthRadius: scala.Double,
      bias: scala.Double,
      alpha: scala.Double,
      beta: scala.Double
    ): T = js.native
  }
  
}

