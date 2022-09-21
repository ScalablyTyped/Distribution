package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.NCW
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.NWC
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.ceil
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.floor
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.round
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.same
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.valid
import typings.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofconv1d extends StObject {
  
  def apply[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid | same | Double | ExplicitPadding,
    dataFormat: js.UndefOr[NWC | NCW],
    dilation: js.UndefOr[Double],
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = js.native
}
