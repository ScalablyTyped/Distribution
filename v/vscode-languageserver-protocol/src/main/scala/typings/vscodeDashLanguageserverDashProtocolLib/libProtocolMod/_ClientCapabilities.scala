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

