package typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod

import typings.vscodeLanguageserverTypes.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallHierarchyOutgoingCall extends js.Object {
  /**
    * The range at which this item is called. This is the range relative to the caller, e.g the item
    * passed to [`provideCallHierarchyOutgoingCalls`](#CallHierarchyItemProvider.provideCallHierarchyOutgoingCalls)
    * and not [`this.to`](#CallHierarchyOutgoingCall.to).
    */
  var fromRanges: js.Array[Range]
  /**
    * The item that is called.
    */
  var to: CallHierarchyItem
}

object CallHierarchyOutgoingCall {
  @scala.inline
  def apply(fromRanges: js.Array[Range], to: CallHierarchyItem): CallHierarchyOutgoingCall = {
    val __obj = js.Dynamic.literal(fromRanges = fromRanges.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyOutgoingCall]
  }
}

