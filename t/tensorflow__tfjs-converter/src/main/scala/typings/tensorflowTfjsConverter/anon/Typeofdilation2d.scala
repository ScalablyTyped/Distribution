package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.NHWC
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.same
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.valid
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.Rank.R3
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofdilation2d extends StObject {
  
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor3D,
    strides: js.Tuple2[Double, Double],
    pad: same | valid
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor3D,
    strides: js.Tuple2[Double, Double],
    pad: same | valid,
    dilations: js.Tuple2[Double, Double]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor3D,
    strides: js.Tuple2[Double, Double],
    pad: same | valid,
    dilations: js.Tuple2[Double, Double],
    dataFormat: NHWC
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor3D,
    strides: js.Tuple2[Double, Double],
    pad: same | valid,
    dilations: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor3D,
    strides: js.Tuple2[Double, Double],
    pad: same | valid,
    dilations: Double,
    dataFormat: NHWC
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor3D,
    strides: js.Tuple2[Double, Double],
    pad: same | valid,
    dilations: Unit,
    dataFormat: NHWC
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor3D,
    strides: Double,
    pad: same | valid
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor3D,
    strides: Double,
    pad: same | valid,
    dilations: js.Tuple2[Double, Double]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor3D,
    strides: Double,
    pad: same | valid,
    dilations: js.Tuple2[Double, Double],
    dataFormat: NHWC
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor3D,
    strides: Double,
    pad: same | valid,
    dilations: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor3D,
    strides: Double,
    pad: same | valid,
    dilations: Double,
    dataFormat: NHWC
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: Tensor3D,
    strides: Double,
    pad: same | valid,
    dilations: Unit,
    dataFormat: NHWC
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: TensorLike,
    strides: js.Tuple2[Double, Double],
    pad: same | valid
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: TensorLike,
    strides: js.Tuple2[Double, Double],
    pad: same | valid,
    dilations: js.Tuple2[Double, Double]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: TensorLike,
    strides: js.Tuple2[Double, Double],
    pad: same | valid,
    dilations: js.Tuple2[Double, Double],
    dataFormat: NHWC
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: TensorLike,
    strides: js.Tuple2[Double, Double],
    pad: same | valid,
    dilations: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: TensorLike,
    strides: js.Tuple2[Double, Double],
    pad: same | valid,
    dilations: Double,
    dataFormat: NHWC
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: TensorLike,
    strides: js.Tuple2[Double, Double],
    pad: same | valid,
    dilations: Unit,
    dataFormat: NHWC
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: TensorLike,
    strides: Double,
    pad: same | valid
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: TensorLike,
    strides: Double,
    pad: same | valid,
    dilations: js.Tuple2[Double, Double]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: TensorLike,
    strides: Double,
    pad: same | valid,
    dilations: js.Tuple2[Double, Double],
    dataFormat: NHWC
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: TensorLike,
    strides: Double,
    pad: same | valid,
    dilations: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: TensorLike,
    strides: Double,
    pad: same | valid,
    dilations: Double,
    dataFormat: NHWC
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filter: TensorLike,
    strides: Double,
    pad: same | valid,
    dilations: Unit,
    dataFormat: NHWC
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filter: Tensor3D, strides: js.Tuple2[Double, Double], pad: valid | same): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filter: Tensor3D,
    strides: js.Tuple2[Double, Double],
    pad: valid | same,
    dilations: js.Tuple2[Double, Double]
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filter: Tensor3D,
    strides: js.Tuple2[Double, Double],
    pad: valid | same,
    dilations: js.Tuple2[Double, Double],
    dataFormat: NHWC
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filter: Tensor3D,
    strides: js.Tuple2[Double, Double],
    pad: valid | same,
    dilations: Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filter: Tensor3D,
    strides: js.Tuple2[Double, Double],
    pad: valid | same,
    dilations: Double,
    dataFormat: NHWC
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filter: Tensor3D,
    strides: js.Tuple2[Double, Double],
    pad: valid | same,
    dilations: Unit,
    dataFormat: NHWC
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filter: Tensor3D, strides: Double, pad: valid | same): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filter: Tensor3D,
    strides: Double,
    pad: valid | same,
    dilations: js.Tuple2[Double, Double]
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filter: Tensor3D,
    strides: Double,
    pad: valid | same,
    dilations: js.Tuple2[Double, Double],
    dataFormat: NHWC
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filter: Tensor3D, strides: Double, pad: valid | same, dilations: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filter: Tensor3D,
    strides: Double,
    pad: valid | same,
    dilations: Double,
    dataFormat: NHWC
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filter: Tensor3D,
    strides: Double,
    pad: valid | same,
    dilations: Unit,
    dataFormat: NHWC
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filter: TensorLike, strides: js.Tuple2[Double, Double], pad: valid | same): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filter: TensorLike,
    strides: js.Tuple2[Double, Double],
    pad: valid | same,
    dilations: js.Tuple2[Double, Double]
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filter: TensorLike,
    strides: js.Tuple2[Double, Double],
    pad: valid | same,
    dilations: js.Tuple2[Double, Double],
    dataFormat: NHWC
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filter: TensorLike,
    strides: js.Tuple2[Double, Double],
    pad: valid | same,
    dilations: Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filter: TensorLike,
    strides: js.Tuple2[Double, Double],
    pad: valid | same,
    dilations: Double,
    dataFormat: NHWC
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filter: TensorLike,
    strides: js.Tuple2[Double, Double],
    pad: valid | same,
    dilations: Unit,
    dataFormat: NHWC
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filter: TensorLike, strides: Double, pad: valid | same): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: valid | same,
    dilations: js.Tuple2[Double, Double]
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: valid | same,
    dilations: js.Tuple2[Double, Double],
    dataFormat: NHWC
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filter: TensorLike, strides: Double, pad: valid | same, dilations: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: valid | same,
    dilations: Double,
    dataFormat: NHWC
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: valid | same,
    dilations: Unit,
    dataFormat: NHWC
  ): T = js.native
}
