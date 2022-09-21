package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.ceil
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.floor
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.round
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.same
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.valid
import typings.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.Rank.R3
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofmaxPool extends StObject {
  
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same | valid
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same | valid,
    dimRoundingMode: ceil | floor | round
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dimRoundingMode: ceil | floor | round
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dimRoundingMode: ceil | floor | round
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: same | valid
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: same | valid,
    dimRoundingMode: ceil | floor | round
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: Double,
    dimRoundingMode: ceil | floor | round
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: ExplicitPadding
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: ExplicitPadding,
    dimRoundingMode: ceil | floor | round
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: same | valid
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: same | valid,
    dimRoundingMode: ceil | floor | round
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dimRoundingMode: ceil | floor | round
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dimRoundingMode: ceil | floor | round
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: Double,
    pad: same | valid
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: Double,
    pad: same | valid,
    dimRoundingMode: ceil | floor | round
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: Double,
    pad: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: Double,
    pad: Double,
    dimRoundingMode: ceil | floor | round
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: Double,
    pad: ExplicitPadding
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: Double,
    pad: ExplicitPadding,
    dimRoundingMode: ceil | floor | round
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid | same
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid | same,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: valid | same): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: valid | same,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: Double,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: ExplicitPadding): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: ExplicitPadding,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: valid | same): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: valid | same,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: ExplicitPadding): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filterSize: Double, strides: Double, pad: valid | same): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: Double,
    strides: Double,
    pad: valid | same,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filterSize: Double, strides: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: Double,
    strides: Double,
    pad: Double,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filterSize: Double, strides: Double, pad: ExplicitPadding): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: Double,
    strides: Double,
    pad: ExplicitPadding,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
}
