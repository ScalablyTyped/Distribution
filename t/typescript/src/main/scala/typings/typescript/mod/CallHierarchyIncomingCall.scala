package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallHierarchyIncomingCall extends js.Object {
  var from: CallHierarchyItem = js.native
  var fromSpans: js.Array[TextSpan] = js.native
}

object CallHierarchyIncomingCall {
  @scala.inline
  def apply(from: CallHierarchyItem, fromSpans: js.Array[TextSpan]): CallHierarchyIncomingCall = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], fromSpans = fromSpans.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyIncomingCall]
  }
  @scala.inline
  implicit class CallHierarchyIncomingCallOps[Self <: CallHierarchyIncomingCall] (val x: Self) extends AnyVal {
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
    def setFrom(value: CallHierarchyItem): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromSpansVarargs(value: TextSpan*): Self = this.set("fromSpans", js.Array(value :_*))
    @scala.inline
    def setFromSpans(value: js.Array[TextSpan]): Self = this.set("fromSpans", value.asInstanceOf[js.Any])
  }
  
}

