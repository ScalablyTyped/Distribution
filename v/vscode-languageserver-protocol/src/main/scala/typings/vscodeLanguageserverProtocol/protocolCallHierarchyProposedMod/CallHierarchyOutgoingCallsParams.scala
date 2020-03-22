package typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod

import typings.vscodeJsonrpc.mod.ProgressToken
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallHierarchyOutgoingCallsParams
  extends WorkDoneProgressParams
     with PartialResultParams {
  var item: CallHierarchyItem
}

object CallHierarchyOutgoingCallsParams {
  @scala.inline
  def apply(
    item: CallHierarchyItem,
    partialResultToken: ProgressToken = null,
    workDoneToken: ProgressToken = null
  ): CallHierarchyOutgoingCallsParams = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (partialResultToken != null) __obj.updateDynamic("partialResultToken")(partialResultToken.asInstanceOf[js.Any])
    if (workDoneToken != null) __obj.updateDynamic("workDoneToken")(workDoneToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyOutgoingCallsParams]
  }
}

