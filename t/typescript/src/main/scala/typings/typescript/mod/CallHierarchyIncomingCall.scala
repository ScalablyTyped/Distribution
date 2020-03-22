package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallHierarchyIncomingCall extends js.Object {
  var from: CallHierarchyItem
  var fromSpans: js.Array[TextSpan]
}

object CallHierarchyIncomingCall {
  @scala.inline
  def apply(from: CallHierarchyItem, fromSpans: js.Array[TextSpan]): CallHierarchyIncomingCall = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], fromSpans = fromSpans.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CallHierarchyIncomingCall]
  }
}

