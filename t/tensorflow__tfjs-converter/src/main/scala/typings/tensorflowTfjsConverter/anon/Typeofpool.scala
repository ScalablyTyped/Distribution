package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.avg
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.ceil
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.floor
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.max
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.round
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.same
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.valid
import typings.tensorflowTfjsCore.distOpsConvUtilMod.ExplicitPadding
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpool extends StObject {
  
  def apply[T /* <: Tensor3D | Tensor4D */](
    input: T | TensorLike,
    windowShape: (js.Tuple2[Double, Double]) | Double,
    poolingType: avg | max,
    pad: valid | same | Double | ExplicitPadding,
    dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    strides: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = js.native
}
