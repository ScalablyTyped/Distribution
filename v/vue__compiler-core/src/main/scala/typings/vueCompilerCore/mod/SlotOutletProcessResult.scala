package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotOutletProcessResult extends StObject {
  
  var slotName: String | ExpressionNode = js.native
  
  var slotProps: js.UndefOr[PropsExpression] = js.native
}
object SlotOutletProcessResult {
  
  @scala.inline
  def apply(slotName: String | ExpressionNode): SlotOutletProcessResult = {
    val __obj = js.Dynamic.literal(slotName = slotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotOutletProcessResult]
  }
  
  @scala.inline
  implicit class SlotOutletProcessResultMutableBuilder[Self <: SlotOutletProcessResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSlotName(value: String | ExpressionNode): Self = StObject.set(x, "slotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotProps(value: PropsExpression): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
  }
}
