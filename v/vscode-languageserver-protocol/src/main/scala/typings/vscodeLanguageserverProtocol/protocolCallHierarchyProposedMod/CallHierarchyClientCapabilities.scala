package typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod

import typings.vscodeLanguageserverProtocol.anon.CallHierarchy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallHierarchyClientCapabilities extends js.Object {
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[CallHierarchy] = js.undefined
}

object CallHierarchyClientCapabilities {
  @scala.inline
  def apply(textDocument: CallHierarchy = null): CallHierarchyClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (textDocument != null) __obj.updateDynamic("textDocument")(textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyClientCapabilities]
  }
}

