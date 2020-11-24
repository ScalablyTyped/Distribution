package typings.vegaTypings.onTriggerMod

import typings.vegaTypings.exprMod.Expr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnTrigger extends js.Object {
  
  var insert: js.UndefOr[Expr] = js.native
  
  var modify: js.UndefOr[Expr] = js.native
  
  var remove: js.UndefOr[Boolean | Expr] = js.native
  
  var toggle: js.UndefOr[Expr] = js.native
  
  var trigger: Expr = js.native
  
  var values: js.UndefOr[Expr] = js.native
}
object OnTrigger {
  
  @scala.inline
  def apply(trigger: Expr): OnTrigger = {
    val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnTrigger]
  }
  
  @scala.inline
  implicit class OnTriggerOps[Self <: OnTrigger] (val x: Self) extends AnyVal {
    
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
    def setTrigger(value: Expr): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsert(value: Expr): Self = this.set("insert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    
    @scala.inline
    def setModify(value: Expr): Self = this.set("modify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModify: Self = this.set("modify", js.undefined)
    
    @scala.inline
    def setRemove(value: Boolean | Expr): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setToggle(value: Expr): Self = this.set("toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    
    @scala.inline
    def setValues(value: Expr): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
