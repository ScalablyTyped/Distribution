package typings.vueCompilerCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotOutletProcessResult extends js.Object {
  
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
  implicit class SlotOutletProcessResultOps[Self <: SlotOutletProcessResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSlotName(value: String | ExpressionNode): Self = this.set("slotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotProps(value: PropsExpression): Self = this.set("slotProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotProps: Self = this.set("slotProps", js.undefined)
  }
}
