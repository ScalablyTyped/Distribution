package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallHierarchy extends js.Object {
  /**
    * Capabilities specific to the `textDocument/callHierarchy`.
    *
    * @since 3.16.0 - Proposed state
    */
  var callHierarchy: js.UndefOr[DynamicRegistration] = js.undefined
}

object CallHierarchy {
  @scala.inline
  def apply(callHierarchy: DynamicRegistration = null): CallHierarchy = {
    val __obj = js.Dynamic.literal()
    if (callHierarchy != null) __obj.updateDynamic("callHierarchy")(callHierarchy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchy]
  }
}

