package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'data' | 'indices' | 'segmentIds'> */
trait SparseSegmentMeanInputs extends StObject {
  
  var data: js.UndefOr[scala.Any] = js.undefined
  
  var indices: js.UndefOr[scala.Any] = js.undefined
  
  var segmentIds: js.UndefOr[scala.Any] = js.undefined
}
object SparseSegmentMeanInputs {
  
  inline def apply(): SparseSegmentMeanInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparseSegmentMeanInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SparseSegmentMeanInputs] (val x: Self) extends AnyVal {
    
    inline def setData(value: scala.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setIndices(value: scala.Any): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setSegmentIds(value: scala.Any): Self = StObject.set(x, "segmentIds", value.asInstanceOf[js.Any])
    
    inline def setSegmentIdsUndefined: Self = StObject.set(x, "segmentIds", js.undefined)
  }
}
