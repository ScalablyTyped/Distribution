package typings.vscodeLanguageserverProtocol.protocolMod

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
  var didChangeConfiguration: js.UndefOr[DidChangeConfigurationClientCapabilities] = js.undefined
  /**
    * Capabilities specific to the `workspace/didChangeWatchedFiles` notification.
    */
  var didChangeWatchedFiles: js.UndefOr[DidChangeWatchedFilesClientCapabilities] = js.undefined
  /**
    * Capabilities specific to the `workspace/executeCommand` request.
    */
  var executeCommand: js.UndefOr[ExecuteCommandClientCapabilities] = js.undefined
  /**
    * Capabilities specific to the `workspace/symbol` request.
    */
  var symbol: js.UndefOr[WorkspaceSymbolClientCapabilities] = js.undefined
  /**
    * Capabilities specific to `WorkspaceEdit`s
    */
  var workspaceEdit: js.UndefOr[WorkspaceEditClientCapabilities] = js.undefined
}

object WorkspaceClientCapabilities {
  @scala.inline
  def apply(
    applyEdit: js.UndefOr[Boolean] = js.undefined,
    didChangeConfiguration: DidChangeConfigurationClientCapabilities = null,
    didChangeWatchedFiles: DidChangeWatchedFilesClientCapabilities = null,
    executeCommand: ExecuteCommandClientCapabilities = null,
    symbol: WorkspaceSymbolClientCapabilities = null,
    workspaceEdit: WorkspaceEditClientCapabilities = null
  ): WorkspaceClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applyEdit)) __obj.updateDynamic("applyEdit")(applyEdit.get.asInstanceOf[js.Any])
    if (didChangeConfiguration != null) __obj.updateDynamic("didChangeConfiguration")(didChangeConfiguration.asInstanceOf[js.Any])
    if (didChangeWatchedFiles != null) __obj.updateDynamic("didChangeWatchedFiles")(didChangeWatchedFiles.asInstanceOf[js.Any])
    if (executeCommand != null) __obj.updateDynamic("executeCommand")(executeCommand.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (workspaceEdit != null) __obj.updateDynamic("workspaceEdit")(workspaceEdit.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceClientCapabilities]
  }
}

