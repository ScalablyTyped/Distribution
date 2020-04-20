package typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod

import typings.vscodeLanguageserverTypes.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallHierarchyIncomingCall extends js.Object {
  /**
    * The item that makes the call.
    */
  var from: CallHierarchyItem
  /**
    * The range at which at which the calls appears. This is relative to the caller
    * denoted by [`this.from`](#CallHierarchyIncomingCall.from).
    */
  var fromRanges: js.Array[Range]
}

object CallHierarchyIncomingCall {
  @scala.inline
  def apply(from: CallHierarchyItem, fromRanges: js.Array[Range]): CallHierarchyIncomingCall = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], fromRanges = fromRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyIncomingCall]
  }
}

