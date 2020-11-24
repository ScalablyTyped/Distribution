package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallHierarchy extends js.Object {
  
  /**
    * Capabilities specific to the `textDocument/callHierarchy`.
    *
    * @since 3.16.0 - Proposed state
    */
  var callHierarchy: js.UndefOr[DynamicRegistration] = js.native
}
object CallHierarchy {
  
  @scala.inline
  def apply(): CallHierarchy = {
    val __obj = js.Dynamic.literal()
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
    def setCallHierarchy(value: DynamicRegistration): Self = this.set("callHierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallHierarchy: Self = this.set("callHierarchy", js.undefined)
  }
}
