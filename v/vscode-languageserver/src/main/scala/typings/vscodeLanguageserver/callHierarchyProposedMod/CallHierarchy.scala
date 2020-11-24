package typings.vscodeLanguageserver.callHierarchyProposedMod

import typings.vscodeLanguageserver.anon.OnIncomingCalls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallHierarchy extends js.Object {
  
  var callHierarchy: OnIncomingCalls = js.native
}
object CallHierarchy {
  
  @scala.inline
  def apply(callHierarchy: OnIncomingCalls): CallHierarchy = {
    val __obj = js.Dynamic.literal(callHierarchy = callHierarchy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchy]
  }
  
  @scala.inline
  implicit class CallHierarchyOps[Self <: CallHierarchy] (val x: Self) extends AnyVal {
    
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
    def setCallHierarchy(value: OnIncomingCalls): Self = this.set("callHierarchy", value.asInstanceOf[js.Any])
  }
}
