package typings.when.When

import typings.when.whenStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectedDescriptor
  extends Descriptor[js.Any]
     with Snapshot[js.Any] {
  
  var reason: js.Any = js.native
  
  var state: rejected = js.native
}
object RejectedDescriptor {
  
  @scala.inline
  def apply(reason: js.Any, state: rejected): RejectedDescriptor = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectedDescriptor]
  }
  
  @scala.inline
  implicit class RejectedDescriptorOps[Self <: RejectedDescriptor] (val x: Self) extends AnyVal {
    
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
    def setReason(value: js.Any): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: rejected): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
