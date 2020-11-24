package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallHierarchyOutgoingCall extends js.Object {
  
  var fromSpans: js.Array[TextSpan] = js.native
  
  var to: CallHierarchyItem = js.native
}
object CallHierarchyOutgoingCall {
  
  @scala.inline
  def apply(fromSpans: js.Array[TextSpan], to: CallHierarchyItem): CallHierarchyOutgoingCall = {
    val __obj = js.Dynamic.literal(fromSpans = fromSpans.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyOutgoingCall]
  }
  
  @scala.inline
  implicit class CallHierarchyOutgoingCallOps[Self <: CallHierarchyOutgoingCall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFromSpansVarargs(value: TextSpan*): Self = this.set("fromSpans", js.Array(value :_*))
    
    @scala.inline
    def setFromSpans(value: js.Array[TextSpan]): Self = this.set("fromSpans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: CallHierarchyItem): Self = this.set("to", value.asInstanceOf[js.Any])
  }
}
