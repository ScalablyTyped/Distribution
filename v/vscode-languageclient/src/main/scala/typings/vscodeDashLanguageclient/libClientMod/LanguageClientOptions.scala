package typings.vscodeDashLanguageclient.libClientMod

import typings.std.Error
import typings.vscode.vscodeMod.OutputChannel
import typings.vscode.vscodeMod.WorkspaceFolder
import typings.vscodeDashLanguageclient.Anon_Code2Protocol
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DocumentSelector
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.InitializeError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageClientOptions extends js.Object {
  var diagnosticCollectionName: js.UndefOr[String] = js.undefined
  var documentSelector: js.UndefOr[DocumentSelector | js.Array[String]] = js.undefined
  var errorHandler: js.UndefOr[ErrorHandler] = js.undefined
  var initializationFailedHandler: js.UndefOr[InitializationFailedHandler] = js.undefined
  var initializationOptions: js.UndefOr[js.Any | js.Function0[_]] = js.undefined
  var middleware: js.UndefOr[Middleware] = js.undefined
  var outputChannel: js.UndefOr[OutputChannel] = js.undefined
  var outputChannelName: js.UndefOr[String] = js.undefined
  var revealOutputChannelOn: js.UndefOr[RevealOutputChannelOn] = js.undefined
  /**
    * The encoding use to read stdout and stderr. Defaults
    * to 'utf8' if ommitted.
    */
  var stdioEncoding: js.UndefOr[String] = js.undefined
  var synchronize: js.UndefOr[SynchronizeOptions] = js.undefined
  var uriConverters: js.UndefOr[Anon_Code2Protocol] = js.undefined
  var workspaceFolder: js.UndefOr[WorkspaceFolder] = js.undefined
}

object LanguageClientOptions {
  @scala.inline
  def apply(
    diagnosticCollectionName: String = null,
    documentSelector: DocumentSelector | js.Array[String] = null,
    errorHandler: ErrorHandler = null,
    initializationFailedHandler: /* error */ typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.ResponseError[InitializeError] | Error | js.Any => Boolean = null,
    initializationOptions: js.Any | js.Function0[_] = null,
    middleware: Middleware = null,
    outputChannel: OutputChannel = null,
    outputChannelName: String = null,
    revealOutputChannelOn: RevealOutputChannelOn = null,
    stdioEncoding: String = null,
    synchronize: SynchronizeOptions = null,
    uriConverters: Anon_Code2Protocol = null,
    workspaceFolder: WorkspaceFolder = null
  ): LanguageClientOptions = {
    val __obj = js.Dynamic.literal()
    if (diagnosticCollectionName != null) __obj.updateDynamic("diagnosticCollectionName")(diagnosticCollectionName)
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(errorHandler)
    if (initializationFailedHandler != null) __obj.updateDynamic("initializationFailedHandler")(js.Any.fromFunction1(initializationFailedHandler))
    if (initializationOptions != null) __obj.updateDynamic("initializationOptions")(initializationOptions.asInstanceOf[js.Any])
    if (middleware != null) __obj.updateDynamic("middleware")(middleware)
    if (outputChannel != null) __obj.updateDynamic("outputChannel")(outputChannel)
    if (outputChannelName != null) __obj.updateDynamic("outputChannelName")(outputChannelName)
    if (revealOutputChannelOn != null) __obj.updateDynamic("revealOutputChannelOn")(revealOutputChannelOn)
    if (stdioEncoding != null) __obj.updateDynamic("stdioEncoding")(stdioEncoding)
    if (synchronize != null) __obj.updateDynamic("synchronize")(synchronize)
    if (uriConverters != null) __obj.updateDynamic("uriConverters")(uriConverters)
    if (workspaceFolder != null) __obj.updateDynamic("workspaceFolder")(workspaceFolder)
    __obj.asInstanceOf[LanguageClientOptions]
  }
}

