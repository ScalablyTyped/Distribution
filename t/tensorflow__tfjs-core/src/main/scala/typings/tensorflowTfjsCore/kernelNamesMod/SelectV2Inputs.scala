package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'condition' | 't' | 'e'> */
@js.native
trait SelectV2Inputs extends StObject {
  
  var condition: js.UndefOr[js.Any] = js.native
  
  var e: js.UndefOr[js.Any] = js.native
  
  var t: js.UndefOr[js.Any] = js.native
}
object SelectV2Inputs {
  
  @scala.inline
  def apply(): SelectV2Inputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectV2Inputs]
  }
  
  @scala.inline
  implicit class SelectV2InputsMutableBuilder[Self <: SelectV2Inputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: js.Any): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setE(value: js.Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEUndefined: Self = StObject.set(x, "e", js.undefined)
    
    @scala.inline
    def setT(value: js.Any): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTUndefined: Self = StObject.set(x, "t", js.undefined)
  }
}
