package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallHierarchyOutgoingCall extends js.Object {
  var fromSpans: js.Array[TextSpan]
  var to: CallHierarchyItem
}

object CallHierarchyOutgoingCall {
  @scala.inline
  def apply(fromSpans: js.Array[TextSpan], to: CallHierarchyItem): CallHierarchyOutgoingCall = {
    val __obj = js.Dynamic.literal(fromSpans = fromSpans.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyOutgoingCall]
  }
}

