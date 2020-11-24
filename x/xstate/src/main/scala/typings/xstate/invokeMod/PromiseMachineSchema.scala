package typings.xstate.invokeMod

import typings.xstate.anon.Pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseMachineSchema extends js.Object {
  
  var states: Pending = js.native
}
object PromiseMachineSchema {
  
  @scala.inline
  def apply(states: Pending): PromiseMachineSchema = {
    val __obj = js.Dynamic.literal(states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseMachineSchema]
  }
  
  @scala.inline
  implicit class PromiseMachineSchemaOps[Self <: PromiseMachineSchema] (val x: Self) extends AnyVal {
    
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
    def setStates(value: Pending): Self = this.set("states", value.asInstanceOf[js.Any])
  }
}
