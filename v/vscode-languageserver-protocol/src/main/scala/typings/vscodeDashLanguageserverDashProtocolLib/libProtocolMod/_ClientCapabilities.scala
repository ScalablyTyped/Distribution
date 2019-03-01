package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ClientCapabilities extends js.Object {
  /**
    * Experimental client capabilities.
    */
  var experimental: js.UndefOr[js.Any] = js.undefined
  /**
    * Text document specific client capabilities.
    */
  var textDocument: js.UndefOr[TextDocumentClientCapabilities] = js.undefined
  /**
    * Workspace specific client capabilities.
    */
  var workspace: js.UndefOr[WorkspaceClientCapabilities] = js.undefined
}

object _ClientCapabilities {
  @scala.inline
  def apply(
    experimental: js.Any = null,
    textDocument: TextDocumentClientCapabilities = null,
    workspace: WorkspaceClientCapabilities = null
  ): _ClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (experimental != null) __obj.updateDynamic("experimental")(experimental)
    if (textDocument != null) __obj.updateDynamic("textDocument")(textDocument)
    if (workspace != null) __obj.updateDynamic("workspace")(workspace)
    __obj.asInstanceOf[_ClientCapabilities]
  }
}

