package typings.vueCompilerCore.anon

import typings.vueCompilerCore.mod.SlotsExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasDynamicSlots extends js.Object {
  
  var hasDynamicSlots: Boolean = js.native
  
  var slots: SlotsExpression = js.native
}
object HasDynamicSlots {
  
  @scala.inline
  def apply(hasDynamicSlots: Boolean, slots: SlotsExpression): HasDynamicSlots = {
    val __obj = js.Dynamic.literal(hasDynamicSlots = hasDynamicSlots.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasDynamicSlots]
  }
  
  @scala.inline
  implicit class HasDynamicSlotsOps[Self <: HasDynamicSlots] (val x: Self) extends AnyVal {
    
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
    def setHasDynamicSlots(value: Boolean): Self = this.set("hasDynamicSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlots(value: SlotsExpression): Self = this.set("slots", value.asInstanceOf[js.Any])
  }
}
