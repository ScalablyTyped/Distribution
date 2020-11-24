package typings.tern.anon

import typings.tern.inferMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends js.Object {
  
  var node: typings.estree.mod.Node = js.native
  
  var state: Scope | Null = js.native
}
object State {
  
  @scala.inline
  def apply(node: typings.estree.mod.Node): State = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    
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
    def setNode(value: typings.estree.mod.Node): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Scope): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNull: Self = this.set("state", null)
  }
}
