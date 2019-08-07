package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NCHW
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NHWC
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.same
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.valid
import typings.atTensorflowTfjsDashCore.distOpsFusedUnderscoreUtilMod.Activation
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "fused")
@js.native
object fusedNs extends js.Object {
  @js.native
  object conv2d extends js.Object {
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      filter: Tensor4D | TensorLike,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid | same | Double
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      filter: Tensor4D | TensorLike,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid | same | Double,
      dataFormat: NHWC | NCHW
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      filter: Tensor4D | TensorLike,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid | same | Double,
      dataFormat: NHWC | NCHW,
      dilations: (js.Tuple2[Double, Double]) | Double
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      filter: Tensor4D | TensorLike,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid | same | Double,
      dataFormat: NHWC | NCHW,
      dilations: (js.Tuple2[Double, Double]) | Double,
      dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor | typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round | typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      filter: Tensor4D | TensorLike,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid | same | Double,
      dataFormat: NHWC | NCHW,
      dilations: (js.Tuple2[Double, Double]) | Double,
      dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor | typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round | typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil,
      bias: Tensor[Rank] | TensorLike
    ): T = js.native
    def apply[T /* <: Tensor3D | Tensor4D */](
      x: T | TensorLike,
      filter: Tensor4D | TensorLike,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid | same | Double,
      dataFormat: NHWC | NCHW,
      dilations: (js.Tuple2[Double, Double]) | Double,
      dimRoundingMode: typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor | typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round | typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil,
      bias: Tensor[Rank] | TensorLike,
      activation: Activation
    ): T = js.native
  }
  
  @js.native
  object matMul extends js.Object {
    def apply[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: T, transposeA: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: T, transposeA: Boolean, transposeB: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: T, transposeA: Boolean, transposeB: Boolean, bias: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: T, transposeA: Boolean, transposeB: Boolean, bias: Tensor[Rank], activation: Activation): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: T, transposeA: Boolean, transposeB: Boolean, bias: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: T, transposeA: Boolean, transposeB: Boolean, bias: TensorLike, activation: Activation): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: TensorLike, transposeA: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: TensorLike, transposeA: Boolean, transposeB: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: TensorLike, transposeA: Boolean, transposeB: Boolean, bias: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](
      a: T,
      b: TensorLike,
      transposeA: Boolean,
      transposeB: Boolean,
      bias: Tensor[Rank],
      activation: Activation
    ): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: T, b: TensorLike, transposeA: Boolean, transposeB: Boolean, bias: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](
      a: T,
      b: TensorLike,
      transposeA: Boolean,
      transposeB: Boolean,
      bias: TensorLike,
      activation: Activation
    ): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: T, transposeA: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: T, transposeA: Boolean, transposeB: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: T, transposeA: Boolean, transposeB: Boolean, bias: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](
      a: TensorLike,
      b: T,
      transposeA: Boolean,
      transposeB: Boolean,
      bias: Tensor[Rank],
      activation: Activation
    ): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: T, transposeA: Boolean, transposeB: Boolean, bias: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](
      a: TensorLike,
      b: T,
      transposeA: Boolean,
      transposeB: Boolean,
      bias: TensorLike,
      activation: Activation
    ): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike, transposeA: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike, transposeA: Boolean, transposeB: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike, transposeA: Boolean, transposeB: Boolean, bias: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](
      a: TensorLike,
      b: TensorLike,
      transposeA: Boolean,
      transposeB: Boolean,
      bias: Tensor[Rank],
      activation: Activation
    ): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike, transposeA: Boolean, transposeB: Boolean, bias: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](
      a: TensorLike,
      b: TensorLike,
      transposeA: Boolean,
      transposeB: Boolean,
      bias: TensorLike,
      activation: Activation
    ): T = js.native
  }
  
}

