package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceSymbolParams
  extends WorkDoneProgressParams
     with PartialResultParams {
  /**
    * A query string to filter symbols by. Clients may send an empty
    * string here to request all symbols.
    */
  var query: String
}

object WorkspaceSymbolParams {
  @scala.inline
  def apply(query: String, partialResultToken: ProgressToken = null, workDoneToken: ProgressToken = null): WorkspaceSymbolParams = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (partialResultToken != null) __obj.updateDynamic("partialResultToken")(partialResultToken.asInstanceOf[js.Any])
    if (workDoneToken != null) __obj.updateDynamic("workDoneToken")(workDoneToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceSymbolParams]
  }
}

