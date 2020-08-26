package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.anon.Name
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.messages
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.off
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.verbose
import typings.vscodeLanguageserverTypes.mod.DocumentUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _InitializeParams extends WorkDoneProgressParams {
  /**
    * The capabilities provided by the client (editor or tool)
    */
  var capabilities: ClientCapabilities = js.native
  /**
    * Information about the client
    *
    * @since 3.15.0
    */
  var clientInfo: js.UndefOr[Name] = js.native
  /**
    * User provided initialization options.
    */
  var initializationOptions: js.UndefOr[js.Any] = js.native
  /**
    * The process Id of the parent process that started
    * the server.
    */
  var processId: Double | Null = js.native
  /**
    * The rootPath of the workspace. Is null
    * if no folder is open.
    *
    * @deprecated in favour of rootUri.
    */
  var rootPath: js.UndefOr[String | Null] = js.native
  /**
    * The rootUri of the workspace. Is null if no
    * folder is open. If both `rootPath` and `rootUri` are set
    * `rootUri` wins.
    *
    * @deprecated in favour of workspaceFolders.
    */
  var rootUri: DocumentUri | Null = js.native
  /**
    * The initial trace setting. If omitted trace is disabled ('off').
    */
  var trace: js.UndefOr[off | messages | verbose] = js.native
}

object _InitializeParams {
  @scala.inline
  def apply(capabilities: ClientCapabilities): _InitializeParams = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InitializeParams]
  }
  @scala.inline
  implicit class _InitializeParamsOps[Self <: _InitializeParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCapabilities(value: ClientCapabilities): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientInfo(value: Name): Self = this.set("clientInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientInfo: Self = this.set("clientInfo", js.undefined)
    @scala.inline
    def setInitializationOptions(value: js.Any): Self = this.set("initializationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitializationOptions: Self = this.set("initializationOptions", js.undefined)
    @scala.inline
    def setProcessId(value: Double): Self = this.set("processId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessIdNull: Self = this.set("processId", null)
    @scala.inline
    def setRootPath(value: String): Self = this.set("rootPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootPath: Self = this.set("rootPath", js.undefined)
    @scala.inline
    def setRootPathNull: Self = this.set("rootPath", null)
    @scala.inline
    def setRootUri(value: DocumentUri): Self = this.set("rootUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootUriNull: Self = this.set("rootUri", null)
    @scala.inline
    def setTrace(value: off | messages | verbose): Self = this.set("trace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrace: Self = this.set("trace", js.undefined)
  }
  
}

