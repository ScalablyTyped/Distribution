package typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod

import typings.vscodeLanguageserverTypes.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallHierarchyIncomingCall extends js.Object {
  /**
    * The item that makes the call.
    */
  var from: CallHierarchyItem = js.native
  /**
    * The range at which at which the calls appears. This is relative to the caller
    * denoted by [`this.from`](#CallHierarchyIncomingCall.from).
    */
  var fromRanges: js.Array[Range] = js.native
}

object CallHierarchyIncomingCall {
  @scala.inline
  def apply(from: CallHierarchyItem, fromRanges: js.Array[Range]): CallHierarchyIncomingCall = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], fromRanges = fromRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyIncomingCall]
  }
  @scala.inline
  implicit class CallHierarchyIncomingCallOps[Self <: CallHierarchyIncomingCall] (val x: Self) extends AnyVal {
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
    def setFrom(value: CallHierarchyItem): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromRangesVarargs(value: Range*): Self = this.set("fromRanges", js.Array(value :_*))
    @scala.inline
    def setFromRanges(value: js.Array[Range]): Self = this.set("fromRanges", value.asInstanceOf[js.Any])
  }
  
}

