package typings.tensorflowTfjsCore.distKernelNamesMod

import typings.tensorflowTfjsCore.distKernelRegistryMod.NamedTensorInfoMap
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FusedConv2DInputs
  extends StObject
     with NamedTensorInfoMap {
  
  var bias: js.UndefOr[TensorInfo] = js.undefined
  
  var filter: TensorInfo
  
  var preluActivationWeights: js.UndefOr[TensorInfo] = js.undefined
  
  var x: TensorInfo
}
object FusedConv2DInputs {
  
  inline def apply(filter: TensorInfo, x: TensorInfo): FusedConv2DInputs = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedConv2DInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FusedConv2DInputs] (val x: Self) extends AnyVal {
    
    inline def setBias(value: TensorInfo): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
    
    inline def setFilter(value: TensorInfo): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setPreluActivationWeights(value: TensorInfo): Self = StObject.set(x, "preluActivationWeights", value.asInstanceOf[js.Any])
    
    inline def setPreluActivationWeightsUndefined: Self = StObject.set(x, "preluActivationWeights", js.undefined)
    
    inline def setX(value: TensorInfo): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
  }
}
