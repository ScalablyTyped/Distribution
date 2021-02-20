package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x' | 'segmentIds'> */
@js.native
trait UnsortedSegmentSumInputs extends StObject {
  
  var segmentIds: js.UndefOr[js.Any] = js.native
  
  var x: js.UndefOr[js.Any] = js.native
}
object UnsortedSegmentSumInputs {
  
  @scala.inline
  def apply(): UnsortedSegmentSumInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnsortedSegmentSumInputs]
  }
  
  @scala.inline
  implicit class UnsortedSegmentSumInputsMutableBuilder[Self <: UnsortedSegmentSumInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegmentIds(value: js.Any): Self = StObject.set(x, "segmentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentIdsUndefined: Self = StObject.set(x, "segmentIds", js.undefined)
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
