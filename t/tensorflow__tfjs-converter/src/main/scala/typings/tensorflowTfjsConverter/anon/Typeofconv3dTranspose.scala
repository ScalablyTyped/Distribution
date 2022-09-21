package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.same
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.valid
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTensorMod.Tensor5D
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.distTypesMod.Rank.R5
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofconv3dTranspose extends StObject {
  
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same | valid
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: same | valid
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same | valid
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: same | valid
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: valid | same
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: valid | same
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: valid | same
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: valid | same
  ): T = js.native
}
