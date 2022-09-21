package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x' | 'segmentIds'> */
trait UnsortedSegmentSumInputs extends StObject {
  
  var segmentIds: js.UndefOr[scala.Any] = js.undefined
  
  var x: js.UndefOr[scala.Any] = js.undefined
}
object UnsortedSegmentSumInputs {
  
  inline def apply(): UnsortedSegmentSumInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnsortedSegmentSumInputs]
  }
  
  extension [Self <: UnsortedSegmentSumInputs](x: Self) {
    
    inline def setSegmentIds(value: scala.Any): Self = StObject.set(x, "segmentIds", value.asInstanceOf[js.Any])
    
    inline def setSegmentIdsUndefined: Self = StObject.set(x, "segmentIds", js.undefined)
    
    inline def setX(value: scala.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
