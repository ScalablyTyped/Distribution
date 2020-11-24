package typings.vegaTypings.onTriggerMod

import typings.vegaTypings.exprMod.Expr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnMarkTrigger extends js.Object {
  
  var modify: js.UndefOr[Expr] = js.native
  
  var trigger: Expr = js.native
  
  var values: js.UndefOr[Expr] = js.native
}
object OnMarkTrigger {
  
  @scala.inline
  def apply(trigger: Expr): OnMarkTrigger = {
    val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMarkTrigger]
  }
  
  @scala.inline
  implicit class OnMarkTriggerOps[Self <: OnMarkTrigger] (val x: Self) extends AnyVal {
    
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
    def setModify(value: Expr): Self = this.set("modify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModify: Self = this.set("modify", js.undefined)
    
    @scala.inline
    def setValues(value: Expr): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
