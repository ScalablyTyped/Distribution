package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "image")
@js.native
object imageNs extends js.Object {
  val cropAndResize: js.Function6[
    /* image */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* boxes */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* boxInd */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* cropSize */ js.Tuple2[scala.Double, scala.Double], 
    /* method */ js.UndefOr[
      atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.bilinear | atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.nearest
    ], 
    /* extrapolationValue */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D
  ] = js.native
  val nonMaxSuppression: js.Function5[
    /* boxes */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* scores */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* maxOutputSize */ scala.Double, 
    /* iouThreshold */ js.UndefOr[scala.Double], 
    /* scoreThreshold */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D
  ] = js.native
  val nonMaxSuppressionAsync: js.Function5[
    /* boxes */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* scores */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* maxOutputSize */ scala.Double, 
    /* iouThreshold */ js.UndefOr[scala.Double], 
    /* scoreThreshold */ js.UndefOr[scala.Double], 
    js.Promise[atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D]
  ] = js.native
  @js.native
  object resizeBilinear extends js.Object {
    def apply(
      images: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
          atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
        ],
      size: js.Tuple2[scala.Double, scala.Double]
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
    def apply(
      images: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
          atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
        ],
      size: js.Tuple2[scala.Double, scala.Double],
      alignCorners: scala.Boolean
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      images: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      size: js.Tuple2[scala.Double, scala.Double]
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      images: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      size: js.Tuple2[scala.Double, scala.Double],
      alignCorners: scala.Boolean
    ): T = js.native
  }
  
  @js.native
  object resizeNearestNeighbor extends js.Object {
    def apply(
      images: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
          atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
        ],
      size: js.Tuple2[scala.Double, scala.Double]
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
    def apply(
      images: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[
          atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3 | atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R4
        ],
      size: js.Tuple2[scala.Double, scala.Double],
      alignCorners: scala.Boolean
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank.R3] = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      images: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      size: js.Tuple2[scala.Double, scala.Double]
    ): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D */](
      images: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      size: js.Tuple2[scala.Double, scala.Double],
      alignCorners: scala.Boolean
    ): T = js.native
  }
  
}

