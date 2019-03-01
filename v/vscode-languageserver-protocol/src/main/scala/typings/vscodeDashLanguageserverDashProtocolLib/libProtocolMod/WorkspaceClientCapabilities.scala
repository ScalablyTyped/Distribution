package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceClientCapabilities extends js.Object {
  /**
    * The client supports applying batch edits
    * to the workspace by supporting the request
    * 'workspace/applyEdit'
    */
  var applyEdit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Capabilities specific to the `workspace/didChangeConfiguration` notification.
    */
  var didChangeConfiguration: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `workspace/didChangeWatchedFiles` notification.
    */
  var didChangeWatchedFiles: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `workspace/executeCommand` request.
    */
  var executeCommand: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `workspace/symbol` request.
    */
  var symbol: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationSymbolKind] = js.undefined
  /**
    * Capabilities specific to `WorkspaceEdit`s
    */
  var workspaceEdit: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DocumentChanges] = js.undefined
}

object WorkspaceClientCapabilities {
  @scala.inline
  def apply(
    applyEdit: js.UndefOr[scala.Boolean] = js.undefined,
    didChangeConfiguration: vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistration = null,
    didChangeWatchedFiles: vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistration = null,
    executeCommand: vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistration = null,
    symbol: vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationSymbolKind = null,
    workspaceEdit: vscodeDashLanguageserverDashProtocolLib.Anon_DocumentChanges = null
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

