package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.same
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.valid
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofmaxPoolWithArgmax extends StObject {
  
  def apply[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same | valid
  ): NamedTensorMap = js.native
  def apply[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same | valid,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  def apply[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): NamedTensorMap = js.native
  def apply[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  def apply[T /* <: Tensor4D */](x: T | TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: same | valid): NamedTensorMap = js.native
  def apply[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: same | valid,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  def apply[T /* <: Tensor4D */](x: T | TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double): NamedTensorMap = js.native
  def apply[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: Double,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  def apply[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: same | valid): NamedTensorMap = js.native
  def apply[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: same | valid,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  def apply[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double): NamedTensorMap = js.native
  def apply[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: Double,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  def apply[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: same | valid): NamedTensorMap = js.native
  def apply[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: Double,
    pad: same | valid,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  def apply[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: Double): NamedTensorMap = js.native
  def apply[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: Double, includeBatchInIndex: Boolean): NamedTensorMap = js.native
}
