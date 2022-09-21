package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.NCDHW
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.NDHWC
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
trait Typeofconv3d extends StObject {
  
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid,
    dataFormat: NCDHW | NDHWC
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid,
    dataFormat: NCDHW | NDHWC,
    dilations: js.Tuple3[Double, Double, Double]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid,
    dataFormat: NCDHW | NDHWC,
    dilations: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid,
    dataFormat: Unit,
    dilations: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: Double,
    pad: same | valid
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: Double,
    pad: same | valid,
    dataFormat: NCDHW | NDHWC
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: Double,
    pad: same | valid,
    dataFormat: NCDHW | NDHWC,
    dilations: js.Tuple3[Double, Double, Double]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: Double,
    pad: same | valid,
    dataFormat: NCDHW | NDHWC,
    dilations: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: Double,
    pad: same | valid,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: Double,
    pad: same | valid,
    dataFormat: Unit,
    dilations: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid,
    dataFormat: NCDHW | NDHWC
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid,
    dataFormat: NCDHW | NDHWC,
    dilations: js.Tuple3[Double, Double, Double]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid,
    dataFormat: NCDHW | NDHWC,
    dilations: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid,
    dataFormat: Unit,
    dilations: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: Double,
    pad: same | valid
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: Double,
    pad: same | valid,
    dataFormat: NCDHW | NDHWC
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: Double,
    pad: same | valid,
    dataFormat: NCDHW | NDHWC,
    dilations: js.Tuple3[Double, Double, Double]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: Double,
    pad: same | valid,
    dataFormat: NCDHW | NDHWC,
    dilations: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: Double,
    pad: same | valid,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: Double,
    pad: same | valid,
    dataFormat: Unit,
    dilations: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: Tensor5D, strides: js.Tuple3[Double, Double, Double], pad: valid | same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same,
    dataFormat: NDHWC | NCDHW
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same,
    dataFormat: NDHWC | NCDHW,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same,
    dataFormat: NDHWC | NCDHW,
    dilations: Double
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same,
    dataFormat: Unit,
    dilations: Double
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: Tensor5D, strides: Double, pad: valid | same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: Tensor5D, strides: Double, pad: valid | same, dataFormat: NDHWC | NCDHW): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    strides: Double,
    pad: valid | same,
    dataFormat: NDHWC | NCDHW,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    strides: Double,
    pad: valid | same,
    dataFormat: NDHWC | NCDHW,
    dilations: Double
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    strides: Double,
    pad: valid | same,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    strides: Double,
    pad: valid | same,
    dataFormat: Unit,
    dilations: Double
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: TensorLike, strides: js.Tuple3[Double, Double, Double], pad: valid | same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same,
    dataFormat: NDHWC | NCDHW
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same,
    dataFormat: NDHWC | NCDHW,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same,
    dataFormat: NDHWC | NCDHW,
    dilations: Double
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same,
    dataFormat: Unit,
    dilations: Double
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: TensorLike, strides: Double, pad: valid | same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: TensorLike, strides: Double, pad: valid | same, dataFormat: NDHWC | NCDHW): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: valid | same,
    dataFormat: NDHWC | NCDHW,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: valid | same,
    dataFormat: NDHWC | NCDHW,
    dilations: Double
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: valid | same,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: valid | same,
    dataFormat: Unit,
    dilations: Double
  ): T = js.native
}
