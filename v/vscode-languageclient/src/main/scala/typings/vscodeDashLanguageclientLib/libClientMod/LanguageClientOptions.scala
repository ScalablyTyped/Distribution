package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageClientOptions extends js.Object {
  var diagnosticCollectionName: js.UndefOr[java.lang.String] = js.undefined
  var documentSelector: js.UndefOr[
    vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DocumentSelector | js.Array[java.lang.String]
  ] = js.undefined
  var errorHandler: js.UndefOr[ErrorHandler] = js.undefined
  var initializationFailedHandler: js.UndefOr[InitializationFailedHandler] = js.undefined
  var initializationOptions: js.UndefOr[js.Any | js.Function0[_]] = js.undefined
  var middleware: js.UndefOr[Middleware] = js.undefined
  var outputChannel: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OutputChannel */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OutputChannel */ js.Any
  ] = js.undefined
  var outputChannelName: js.UndefOr[java.lang.String] = js.undefined
  var revealOutputChannelOn: js.UndefOr[RevealOutputChannelOn] = js.undefined
  /**
    * The encoding use to read stdout and stderr. Defaults
    * to 'utf8' if ommitted.
    */
  var stdioEncoding: js.UndefOr[java.lang.String] = js.undefined
  var synchronize: js.UndefOr[SynchronizeOptions] = js.undefined
  var uriConverters: js.UndefOr[vscodeDashLanguageclientLib.Anon_Code2Protocol] = js.undefined
  var workspaceFolder: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VWorkspaceFolder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VWorkspaceFolder */ js.Any
  ] = js.undefined
}

object LanguageClientOptions {
  @scala.inline
  def apply(
    diagnosticCollectionName: java.lang.String = null,
    documentSelector: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DocumentSelector | js.Array[java.lang.String] = null,
    errorHandler: ErrorHandler = null,
    initializationFailedHandler: InitializationFailedHandler = null,
    initializationOptions: js.Any | js.Function0[_] = null,
    middleware: Middleware = null,
    outputChannel: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OutputChannel */ js.Any = null,
    outputChannelName: java.lang.String = null,
    revealOutputChannelOn: RevealOutputChannelOn = null,
    stdioEncoding: java.lang.String = null,
    synchronize: SynchronizeOptions = null,
    uriConverters: vscodeDashLanguageclientLib.Anon_Code2Protocol = null,
    workspaceFolder: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VWorkspaceFolder */ js.Any = null
  ): LanguageClientOptions = {
    val __obj = js.Dynamic.literal()
    if (diagnosticCollectionName != null) __obj.updateDynamic("diagnosticCollectionName")(diagnosticCollectionName)
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(errorHandler)
    if (initializationFailedHandler != null) __obj.updateDynamic("initializationFailedHandler")(initializationFailedHandler)
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

