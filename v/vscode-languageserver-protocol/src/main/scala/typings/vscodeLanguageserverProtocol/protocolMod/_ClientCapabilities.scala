package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ClientCapabilities extends js.Object {
  /**
    * Experimental client capabilities.
    */
  var experimental: js.UndefOr[js.Object] = js.undefined
  /**
    * Text document specific client capabilities.
    */
  var textDocument: js.UndefOr[TextDocumentClientCapabilities] = js.undefined
  /**
    * Window specific client capabilities.
    */
  var window: js.UndefOr[js.Object] = js.undefined
  /**
    * Workspace specific client capabilities.
    */
  var workspace: js.UndefOr[WorkspaceClientCapabilities] = js.undefined
}

object _ClientCapabilities {
  @scala.inline
  def apply(
    experimental: js.Object = null,
    textDocument: TextDocumentClientCapabilities = null,
    window: js.Object = null,
    workspace: WorkspaceClientCapabilities = null
  ): _ClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (experimental != null) __obj.updateDynamic("experimental")(experimental.asInstanceOf[js.Any])
    if (textDocument != null) __obj.updateDynamic("textDocument")(textDocument.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    if (workspace != null) __obj.updateDynamic("workspace")(workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ClientCapabilities]
  }
}

