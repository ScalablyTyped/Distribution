package typings.vscodeLanguageserver.callHierarchyProposedMod

import typings.vscodeLanguageserver.anon.OnIncomingCalls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallHierarchy extends js.Object {
  var callHierarchy: OnIncomingCalls
}

object CallHierarchy {
  @scala.inline
  def apply(callHierarchy: OnIncomingCalls): CallHierarchy = {
    val __obj = js.Dynamic.literal(callHierarchy = callHierarchy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchy]
  }
}

