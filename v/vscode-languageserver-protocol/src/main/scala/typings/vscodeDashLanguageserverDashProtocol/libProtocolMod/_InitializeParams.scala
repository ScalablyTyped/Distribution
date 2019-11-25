package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolStrings.messages
import typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolStrings.off
import typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InitializeParams extends js.Object {
  /**
    * The capabilities provided by the client (editor or tool)
    */
  var capabilities: ClientCapabilities
  /**
    * User provided initialization options.
    */
  var initializationOptions: js.UndefOr[js.Any] = js.undefined
  /**
    * The process Id of the parent process that started
    * the server.
    */
  var processId: Double | Null
  /**
    * The rootPath of the workspace. Is null
    * if no folder is open.
    *
    * @deprecated in favour of rootUri.
    */
  var rootPath: js.UndefOr[String | Null] = js.undefined
  /**
    * The rootUri of the workspace. Is null if no
    * folder is open. If both `rootPath` and `rootUri` are set
    * `rootUri` wins.
    *
    * @deprecated in favour of workspaceFolders.
    */
  var rootUri: String | Null
  /**
    * The initial trace setting. If omitted trace is disabled ('off').
    */
  var trace: js.UndefOr[off | messages | verbose] = js.undefined
}

object _InitializeParams {
  @scala.inline
  def apply(
    capabilities: ClientCapabilities,
    initializationOptions: js.Any = null,
    processId: Int | Double = null,
    rootPath: String = null,
    rootUri: String = null,
    trace: off | messages | verbose = null
  ): _InitializeParams = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    if (initializationOptions != null) __obj.updateDynamic("initializationOptions")(initializationOptions.asInstanceOf[js.Any])
    if (processId != null) __obj.updateDynamic("processId")(processId.asInstanceOf[js.Any])
    if (rootPath != null) __obj.updateDynamic("rootPath")(rootPath.asInstanceOf[js.Any])
    if (rootUri != null) __obj.updateDynamic("rootUri")(rootUri.asInstanceOf[js.Any])
    if (trace != null) __obj.updateDynamic("trace")(trace.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InitializeParams]
  }
}

