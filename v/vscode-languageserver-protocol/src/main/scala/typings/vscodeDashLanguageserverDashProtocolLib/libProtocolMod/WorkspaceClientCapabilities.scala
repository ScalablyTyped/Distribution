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
  var didChangeConfiguration: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationBoolean] = js.undefined
  /**
    * Capabilities specific to the `workspace/didChangeWatchedFiles` notification.
    */
  var didChangeWatchedFiles: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationBoolean] = js.undefined
  /**
    * Capabilities specific to the `workspace/executeCommand` request.
    */
  var executeCommand: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationBoolean] = js.undefined
  /**
    * Capabilities specific to the `workspace/symbol` request.
    */
  var symbol: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_DynamicRegistrationSymbolKind] = js.undefined
  /**
    * Capabilities specific to `WorkspaceEdit`s
    */
  var workspaceEdit: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.Anon_FailureHandling] = js.undefined
}

