package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.ceil
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.floor
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.round
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.same
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.valid
import typings.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofconv2dTranspose extends StObject {
  
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    outputShape: (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple3[Double, Double, Double]),
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same | Double | ExplicitPadding,
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = js.native
}
