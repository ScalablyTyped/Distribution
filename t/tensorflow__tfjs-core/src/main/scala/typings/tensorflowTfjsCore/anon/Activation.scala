package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activation[T /* <: Tensor3D | Tensor4D */] extends StObject {
  
  var activation: js.UndefOr[typings.tensorflowTfjsCore.fusedTypesMod.Activation] = js.undefined
  
  var bias: js.UndefOr[Tensor[Rank] | TensorLike] = js.undefined
  
  var dataFormat: js.UndefOr[NHWC | NCHW] = js.undefined
  
  var dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double] = js.undefined
  
  var dimRoundingMode: js.UndefOr[floor | round | ceil] = js.undefined
  
  var filter: Tensor4D | TensorLike
  
  var leakyreluAlpha: js.UndefOr[Double] = js.undefined
  
  var pad: valid_ | same_ | Double | ExplicitPadding
  
  var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.undefined
  
  var strides: (js.Tuple2[Double, Double]) | Double
  
  var x: T | TensorLike
}
object Activation {
  
  inline def apply[T /* <: Tensor3D | Tensor4D */](
    filter: Tensor4D | TensorLike,
    pad: valid_ | same_ | Double | ExplicitPadding,
    strides: (js.Tuple2[Double, Double]) | Double,
    x: T | TensorLike
  ): Activation[T] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activation[T]]
  }
  
  extension [Self <: Activation[?], T /* <: Tensor3D | Tensor4D */](x: Self & Activation[T]) {
    
    inline def setActivation(value: typings.tensorflowTfjsCore.fusedTypesMod.Activation): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
    
    inline def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
    
    inline def setBias(value: Tensor[Rank] | TensorLike): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
    
    inline def setBiasVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "bias", js.Array(value*))
    
    inline def setDataFormat(value: NHWC | NCHW): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
    
    inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
    
    inline def setDilations(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "dilations", value.asInstanceOf[js.Any])
    
    inline def setDilationsUndefined: Self = StObject.set(x, "dilations", js.undefined)
    
    inline def setDimRoundingMode(value: floor | round | ceil): Self = StObject.set(x, "dimRoundingMode", value.asInstanceOf[js.Any])
    
    inline def setDimRoundingModeUndefined: Self = StObject.set(x, "dimRoundingMode", js.undefined)
    
    inline def setFilter(value: Tensor4D | TensorLike): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setLeakyreluAlpha(value: Double): Self = StObject.set(x, "leakyreluAlpha", value.asInstanceOf[js.Any])
    
    inline def setLeakyreluAlphaUndefined: Self = StObject.set(x, "leakyreluAlpha", js.undefined)
    
    inline def setPad(value: valid_ | same_ | Double | ExplicitPadding): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPreluActivationWeights(value: Tensor[Rank]): Self = StObject.set(x, "preluActivationWeights", value.asInstanceOf[js.Any])
    
    inline def setPreluActivationWeightsUndefined: Self = StObject.set(x, "preluActivationWeights", js.undefined)
    
    inline def setStrides(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
    
    inline def setX(value: T | TensorLike): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "x", js.Array(value*))
  }
}
