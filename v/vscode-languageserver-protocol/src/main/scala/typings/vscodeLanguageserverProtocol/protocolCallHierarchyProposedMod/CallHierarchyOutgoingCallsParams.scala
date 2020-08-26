package typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod

import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallHierarchyOutgoingCallsParams
  extends WorkDoneProgressParams
     with PartialResultParams {
  var item: CallHierarchyItem = js.native
}

object CallHierarchyOutgoingCallsParams {
  @scala.inline
  def apply(item: CallHierarchyItem): CallHierarchyOutgoingCallsParams = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyOutgoingCallsParams]
  }
  @scala.inline
  implicit class CallHierarchyOutgoingCallsParamsOps[Self <: CallHierarchyOutgoingCallsParams] (val x: Self) extends AnyVal {
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
    def setItem(value: CallHierarchyItem): Self = this.set("item", value.asInstanceOf[js.Any])
  }
  
}

