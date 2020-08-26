package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceClientCapabilities extends js.Object {
  /**
    * The client supports applying batch edits
    * to the workspace by supporting the request
    * 'workspace/applyEdit'
    */
  var applyEdit: js.UndefOr[Boolean] = js.native
  /**
    * Capabilities specific to the `workspace/didChangeConfiguration` notification.
    */
  var didChangeConfiguration: js.UndefOr[DidChangeConfigurationClientCapabilities] = js.native
  /**
    * Capabilities specific to the `workspace/didChangeWatchedFiles` notification.
    */
  var didChangeWatchedFiles: js.UndefOr[DidChangeWatchedFilesClientCapabilities] = js.native
  /**
    * Capabilities specific to the `workspace/executeCommand` request.
    */
  var executeCommand: js.UndefOr[ExecuteCommandClientCapabilities] = js.native
  /**
    * Capabilities specific to the `workspace/symbol` request.
    */
  var symbol: js.UndefOr[WorkspaceSymbolClientCapabilities] = js.native
  /**
    * Capabilities specific to `WorkspaceEdit`s
    */
  var workspaceEdit: js.UndefOr[WorkspaceEditClientCapabilities] = js.native
}

object WorkspaceClientCapabilities {
  @scala.inline
  def apply(): WorkspaceClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceClientCapabilities]
  }
  @scala.inline
  implicit class WorkspaceClientCapabilitiesOps[Self <: WorkspaceClientCapabilities] (val x: Self) extends AnyVal {
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
    def setApplyEdit(value: Boolean): Self = this.set("applyEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyEdit: Self = this.set("applyEdit", js.undefined)
    @scala.inline
    def setDidChangeConfiguration(value: DidChangeConfigurationClientCapabilities): Self = this.set("didChangeConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDidChangeConfiguration: Self = this.set("didChangeConfiguration", js.undefined)
    @scala.inline
    def setDidChangeWatchedFiles(value: DidChangeWatchedFilesClientCapabilities): Self = this.set("didChangeWatchedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDidChangeWatchedFiles: Self = this.set("didChangeWatchedFiles", js.undefined)
    @scala.inline
    def setExecuteCommand(value: ExecuteCommandClientCapabilities): Self = this.set("executeCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecuteCommand: Self = this.set("executeCommand", js.undefined)
    @scala.inline
    def setSymbol(value: WorkspaceSymbolClientCapabilities): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    @scala.inline
    def setWorkspaceEdit(value: WorkspaceEditClientCapabilities): Self = this.set("workspaceEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspaceEdit: Self = this.set("workspaceEdit", js.undefined)
  }
  
}

