package typings.three.webXRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRInputSourceChangeEvent extends js.Object {
  
  var added: js.Array[XRInputSource] = js.native
  
  var removed: js.Array[XRInputSource] = js.native
  
  var session: XRSession = js.native
}
object XRInputSourceChangeEvent {
  
  @scala.inline
  def apply(added: js.Array[XRInputSource], removed: js.Array[XRInputSource], session: XRSession): XRInputSourceChangeEvent = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRInputSourceChangeEvent]
  }
  
  @scala.inline
  implicit class XRInputSourceChangeEventOps[Self <: XRInputSourceChangeEvent] (val x: Self) extends AnyVal {
    
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
    def setAddedVarargs(value: XRInputSource*): Self = this.set("added", js.Array(value :_*))
    
    @scala.inline
    def setAdded(value: js.Array[XRInputSource]): Self = this.set("added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedVarargs(value: XRInputSource*): Self = this.set("removed", js.Array(value :_*))
    
    @scala.inline
    def setRemoved(value: js.Array[XRInputSource]): Self = this.set("removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: XRSession): Self = this.set("session", value.asInstanceOf[js.Any])
  }
}
