package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressToken
import typings.vscodeLanguageserverProtocol.AnonName
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.messages
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.off
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.verbose
import typings.vscodeLanguageserverTypes.mod.DocumentUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InitializeParams extends WorkDoneProgressParams {
  /**
    * The capabilities provided by the client (editor or tool)
    */
  var capabilities: ClientCapabilities
  /**
    * Information about the client
    *
    * @since 3.15.0
    */
  var clientInfo: js.UndefOr[AnonName] = js.undefined
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
  var rootUri: DocumentUri | Null
  /**
    * The initial trace setting. If omitted trace is disabled ('off').
    */
  var trace: js.UndefOr[off | messages | verbose] = js.undefined
}

object _InitializeParams {
  @scala.inline
  def apply(
    capabilities: ClientCapabilities,
    clientInfo: AnonName = null,
    initializationOptions: js.Any = null,
    processId: Int | Double = null,
    rootPath: String = null,
    rootUri: DocumentUri = null,
    trace: off | messages | verbose = null,
    workDoneToken: ProgressToken = null
  ): _InitializeParams = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    if (clientInfo != null) __obj.updateDynamic("clientInfo")(clientInfo.asInstanceOf[js.Any])
    if (initializationOptions != null) __obj.updateDynamic("initializationOptions")(initializationOptions.asInstanceOf[js.Any])
    if (processId != null) __obj.updateDynamic("processId")(processId.asInstanceOf[js.Any])
    if (rootPath != null) __obj.updateDynamic("rootPath")(rootPath.asInstanceOf[js.Any])
    if (rootUri != null) __obj.updateDynamic("rootUri")(rootUri.asInstanceOf[js.Any])
    if (trace != null) __obj.updateDynamic("trace")(trace.asInstanceOf[js.Any])
    if (workDoneToken != null) __obj.updateDynamic("workDoneToken")(workDoneToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InitializeParams]
  }
}

