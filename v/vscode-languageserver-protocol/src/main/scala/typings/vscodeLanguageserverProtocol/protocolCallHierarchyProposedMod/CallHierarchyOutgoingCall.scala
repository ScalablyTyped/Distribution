package typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod

import typings.vscodeLanguageserverTypes.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallHierarchyOutgoingCall extends js.Object {
  
  /**
    * The range at which this item is called. This is the range relative to the caller, e.g the item
    * passed to [`provideCallHierarchyOutgoingCalls`](#CallHierarchyItemProvider.provideCallHierarchyOutgoingCalls)
    * and not [`this.to`](#CallHierarchyOutgoingCall.to).
    */
  var fromRanges: js.Array[Range] = js.native
  
  /**
    * The item that is called.
    */
  var to: CallHierarchyItem = js.native
}
object CallHierarchyOutgoingCall {
  
  @scala.inline
  def apply(fromRanges: js.Array[Range], to: CallHierarchyItem): CallHierarchyOutgoingCall = {
    val __obj = js.Dynamic.literal(fromRanges = fromRanges.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyOutgoingCall]
  }
  
  @scala.inline
  implicit class CallHierarchyOutgoingCallOps[Self <: CallHierarchyOutgoingCall] (val x: Self) extends AnyVal {
    
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
    def setFromRangesVarargs(value: Range*): Self = this.set("fromRanges", js.Array(value :_*))
    
    @scala.inline
    def setFromRanges(value: js.Array[Range]): Self = this.set("fromRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: CallHierarchyItem): Self = this.set("to", value.asInstanceOf[js.Any])
  }
}
