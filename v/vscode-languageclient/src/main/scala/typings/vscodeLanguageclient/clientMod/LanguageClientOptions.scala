package typings.vscodeLanguageclient.clientMod

import typings.std.Error
import typings.vscode.mod.OutputChannel
import typings.vscode.mod.WorkspaceFolder
import typings.vscodeLanguageclient.anon.Code2Protocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageClientOptions extends js.Object {
  var diagnosticCollectionName: js.UndefOr[String] = js.native
  var documentSelector: js.UndefOr[
    typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector | js.Array[String]
  ] = js.native
  var errorHandler: js.UndefOr[ErrorHandler] = js.native
  var initializationFailedHandler: js.UndefOr[InitializationFailedHandler] = js.native
  var initializationOptions: js.UndefOr[js.Any | js.Function0[_]] = js.native
  var middleware: js.UndefOr[Middleware] = js.native
  var outputChannel: js.UndefOr[OutputChannel] = js.native
  var outputChannelName: js.UndefOr[String] = js.native
  var progressOnInitialization: js.UndefOr[Boolean] = js.native
  var revealOutputChannelOn: js.UndefOr[RevealOutputChannelOn] = js.native
  /**
    * The encoding use to read stdout and stderr. Defaults
    * to 'utf8' if ommitted.
    */
  var stdioEncoding: js.UndefOr[String] = js.native
  var synchronize: js.UndefOr[SynchronizeOptions] = js.native
  var traceOutputChannel: js.UndefOr[OutputChannel] = js.native
  var uriConverters: js.UndefOr[Code2Protocol] = js.native
  var workspaceFolder: js.UndefOr[WorkspaceFolder] = js.native
}

object LanguageClientOptions {
  @scala.inline
  def apply(): LanguageClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageClientOptions]
  }
  @scala.inline
  implicit class LanguageClientOptionsOps[Self <: LanguageClientOptions] (val x: Self) extends AnyVal {
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
    def setDiagnosticCollectionName(value: String): Self = this.set("diagnosticCollectionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnosticCollectionName: Self = this.set("diagnosticCollectionName", js.undefined)
    @scala.inline
    def setDocumentSelectorVarargs(value: (typings.vscodeLanguageserverProtocol.protocolMod.DocumentFilter | String)*): Self = this.set("documentSelector", js.Array(value :_*))
    @scala.inline
    def setDocumentSelector(value: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector | js.Array[String]): Self = this.set("documentSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentSelector: Self = this.set("documentSelector", js.undefined)
    @scala.inline
    def setErrorHandler(value: ErrorHandler): Self = this.set("errorHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    @scala.inline
    def setInitializationFailedHandler(
      value: /* error */ typings.vscodeLanguageserverProtocol.mod.ResponseError[typings.vscodeLanguageserverProtocol.protocolMod.InitializeError] | Error | js.Any => Boolean
    ): Self = this.set("initializationFailedHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInitializationFailedHandler: Self = this.set("initializationFailedHandler", js.undefined)
    @scala.inline
    def setInitializationOptionsFunction0(value: () => _): Self = this.set("initializationOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setInitializationOptions(value: js.Any | js.Function0[_]): Self = this.set("initializationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitializationOptions: Self = this.set("initializationOptions", js.undefined)
    @scala.inline
    def setMiddleware(value: Middleware): Self = this.set("middleware", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiddleware: Self = this.set("middleware", js.undefined)
    @scala.inline
    def setOutputChannel(value: OutputChannel): Self = this.set("outputChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputChannel: Self = this.set("outputChannel", js.undefined)
    @scala.inline
    def setOutputChannelName(value: String): Self = this.set("outputChannelName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputChannelName: Self = this.set("outputChannelName", js.undefined)
    @scala.inline
    def setProgressOnInitialization(value: Boolean): Self = this.set("progressOnInitialization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressOnInitialization: Self = this.set("progressOnInitialization", js.undefined)
    @scala.inline
    def setRevealOutputChannelOn(value: RevealOutputChannelOn): Self = this.set("revealOutputChannelOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevealOutputChannelOn: Self = this.set("revealOutputChannelOn", js.undefined)
    @scala.inline
    def setStdioEncoding(value: String): Self = this.set("stdioEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdioEncoding: Self = this.set("stdioEncoding", js.undefined)
    @scala.inline
    def setSynchronize(value: SynchronizeOptions): Self = this.set("synchronize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSynchronize: Self = this.set("synchronize", js.undefined)
    @scala.inline
    def setTraceOutputChannel(value: OutputChannel): Self = this.set("traceOutputChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraceOutputChannel: Self = this.set("traceOutputChannel", js.undefined)
    @scala.inline
    def setUriConverters(value: Code2Protocol): Self = this.set("uriConverters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUriConverters: Self = this.set("uriConverters", js.undefined)
    @scala.inline
    def setWorkspaceFolder(value: WorkspaceFolder): Self = this.set("workspaceFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspaceFolder: Self = this.set("workspaceFolder", js.undefined)
  }
  
}

