package typings.vscodeLanguageclient.clientMod

import typings.std.Error
import typings.vscode.mod.OutputChannel
import typings.vscode.mod.WorkspaceFolder
import typings.vscodeLanguageclient.AnonCode2Protocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageClientOptions extends js.Object {
  var diagnosticCollectionName: js.UndefOr[String] = js.undefined
  var documentSelector: js.UndefOr[
    typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector | js.Array[String]
  ] = js.undefined
  var errorHandler: js.UndefOr[ErrorHandler] = js.undefined
  var initializationFailedHandler: js.UndefOr[InitializationFailedHandler] = js.undefined
  var initializationOptions: js.UndefOr[js.Any | js.Function0[_]] = js.undefined
  var middleware: js.UndefOr[Middleware] = js.undefined
  var outputChannel: js.UndefOr[OutputChannel] = js.undefined
  var outputChannelName: js.UndefOr[String] = js.undefined
  var progressOnInitialization: js.UndefOr[Boolean] = js.undefined
  var revealOutputChannelOn: js.UndefOr[RevealOutputChannelOn] = js.undefined
  /**
    * The encoding use to read stdout and stderr. Defaults
    * to 'utf8' if ommitted.
    */
  var stdioEncoding: js.UndefOr[String] = js.undefined
  var synchronize: js.UndefOr[SynchronizeOptions] = js.undefined
  var traceOutputChannel: js.UndefOr[OutputChannel] = js.undefined
  var uriConverters: js.UndefOr[AnonCode2Protocol] = js.undefined
  var workspaceFolder: js.UndefOr[WorkspaceFolder] = js.undefined
}

object LanguageClientOptions {
  @scala.inline
  def apply(
    diagnosticCollectionName: String = null,
    documentSelector: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector | js.Array[String] = null,
    errorHandler: ErrorHandler = null,
    initializationFailedHandler: /* error */ typings.vscodeLanguageserverProtocol.mod.ResponseError[typings.vscodeLanguageserverProtocol.protocolMod.InitializeError] | Error | js.Any => Boolean = null,
    initializationOptions: js.Any | js.Function0[_] = null,
    middleware: Middleware = null,
    outputChannel: OutputChannel = null,
    outputChannelName: String = null,
    progressOnInitialization: js.UndefOr[Boolean] = js.undefined,
    revealOutputChannelOn: RevealOutputChannelOn = null,
    stdioEncoding: String = null,
    synchronize: SynchronizeOptions = null,
    traceOutputChannel: OutputChannel = null,
    uriConverters: AnonCode2Protocol = null,
    workspaceFolder: WorkspaceFolder = null
  ): LanguageClientOptions = {
    val __obj = js.Dynamic.literal()
    if (diagnosticCollectionName != null) __obj.updateDynamic("diagnosticCollectionName")(diagnosticCollectionName.asInstanceOf[js.Any])
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(errorHandler.asInstanceOf[js.Any])
    if (initializationFailedHandler != null) __obj.updateDynamic("initializationFailedHandler")(js.Any.fromFunction1(initializationFailedHandler))
    if (initializationOptions != null) __obj.updateDynamic("initializationOptions")(initializationOptions.asInstanceOf[js.Any])
    if (middleware != null) __obj.updateDynamic("middleware")(middleware.asInstanceOf[js.Any])
    if (outputChannel != null) __obj.updateDynamic("outputChannel")(outputChannel.asInstanceOf[js.Any])
    if (outputChannelName != null) __obj.updateDynamic("outputChannelName")(outputChannelName.asInstanceOf[js.Any])
    if (!js.isUndefined(progressOnInitialization)) __obj.updateDynamic("progressOnInitialization")(progressOnInitialization.asInstanceOf[js.Any])
    if (revealOutputChannelOn != null) __obj.updateDynamic("revealOutputChannelOn")(revealOutputChannelOn.asInstanceOf[js.Any])
    if (stdioEncoding != null) __obj.updateDynamic("stdioEncoding")(stdioEncoding.asInstanceOf[js.Any])
    if (synchronize != null) __obj.updateDynamic("synchronize")(synchronize.asInstanceOf[js.Any])
    if (traceOutputChannel != null) __obj.updateDynamic("traceOutputChannel")(traceOutputChannel.asInstanceOf[js.Any])
    if (uriConverters != null) __obj.updateDynamic("uriConverters")(uriConverters.asInstanceOf[js.Any])
    if (workspaceFolder != null) __obj.updateDynamic("workspaceFolder")(workspaceFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageClientOptions]
  }
}

