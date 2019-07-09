package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/pool", JSImport.Namespace)
@js.native
object distOpsPoolMod extends js.Object {
  @js.native
  object avgPool extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      filterSize: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      filterSize: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double,
      dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil
    ): T = js.native
  }
  
  @js.native
  object maxPool extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      filterSize: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      x: T | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      filterSize: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      strides: (js.Tuple2[scala.Double, scala.Double]) | scala.Double,
      pad: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.valid | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.same | scala.Double,
      dimRoundingMode: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.floor | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.round | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.ceil
    ): T = js.native
  }
  
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
  
}

