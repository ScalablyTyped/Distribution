package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashLanguageserverDashProtocol.Anon_DocumentChanges
import typings.vscodeDashLanguageserverDashProtocol.Anon_DynamicRegistration
import typings.vscodeDashLanguageserverDashProtocol.Anon_DynamicRegistrationSymbolKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceClientCapabilities extends js.Object {
  /**
    * The client supports applying batch edits
    * to the workspace by supporting the request
    * 'workspace/applyEdit'
    */
  var applyEdit: js.UndefOr[Boolean] = js.undefined
  /**
    * Capabilities specific to the `workspace/didChangeConfiguration` notification.
    */
  var didChangeConfiguration: js.UndefOr[Anon_DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `workspace/didChangeWatchedFiles` notification.
    */
  var didChangeWatchedFiles: js.UndefOr[Anon_DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `workspace/executeCommand` request.
    */
  var executeCommand: js.UndefOr[Anon_DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `workspace/symbol` request.
    */
  var symbol: js.UndefOr[Anon_DynamicRegistrationSymbolKind] = js.undefined
  /**
    * Capabilities specific to `WorkspaceEdit`s
    */
  var workspaceEdit: js.UndefOr[Anon_DocumentChanges] = js.undefined
}

object WorkspaceClientCapabilities {
  @scala.inline
  def apply(
    applyEdit: js.UndefOr[Boolean] = js.undefined,
    didChangeConfiguration: Anon_DynamicRegistration = null,
    didChangeWatchedFiles: Anon_DynamicRegistration = null,
    executeCommand: Anon_DynamicRegistration = null,
    symbol: Anon_DynamicRegistrationSymbolKind = null,
    workspaceEdit: Anon_DocumentChanges = null
  ): WorkspaceClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applyEdit)) __obj.updateDynamic("applyEdit")(applyEdit)
    if (didChangeConfiguration != null) __obj.updateDynamic("didChangeConfiguration")(didChangeConfiguration)
    if (didChangeWatchedFiles != null) __obj.updateDynamic("didChangeWatchedFiles")(didChangeWatchedFiles)
    if (executeCommand != null) __obj.updateDynamic("executeCommand")(executeCommand)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (workspaceEdit != null) __obj.updateDynamic("workspaceEdit")(workspaceEdit)
    __obj.asInstanceOf[WorkspaceClientCapabilities]
  }
}

