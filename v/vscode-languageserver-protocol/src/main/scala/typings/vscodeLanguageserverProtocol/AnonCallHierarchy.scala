package typings.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallHierarchy extends js.Object {
  /**
    * Capabilities specific to the `textDocument/callHierarchy`.
    *
    * @since 3.16.0 - Proposed state
    */
  var callHierarchy: js.UndefOr[AnonDynamicRegistration] = js.undefined
}

object AnonCallHierarchy {
  @scala.inline
  def apply(callHierarchy: AnonDynamicRegistration = null): AnonCallHierarchy = {
    val __obj = js.Dynamic.literal()
    if (callHierarchy != null) __obj.updateDynamic("callHierarchy")(callHierarchy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCallHierarchy]
  }
}

