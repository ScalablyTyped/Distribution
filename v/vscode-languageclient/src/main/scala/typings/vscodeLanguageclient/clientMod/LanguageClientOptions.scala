package typings.vscodeLanguageclient.clientMod

import typings.std.Error
import typings.vscode.mod.OutputChannel
import typings.vscode.mod.WorkspaceFolder
import typings.vscodeLanguageclient.anon.Code2Protocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageClientOptions extends StObject {
  
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
  implicit class LanguageClientOptionsMutableBuilder[Self <: LanguageClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiagnosticCollectionName(value: String): Self = StObject.set(x, "diagnosticCollectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticCollectionNameUndefined: Self = StObject.set(x, "diagnosticCollectionName", js.undefined)
    
    @scala.inline
    def setDocumentSelector(value: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector | js.Array[String]): Self = StObject.set(x, "documentSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentSelectorUndefined: Self = StObject.set(x, "documentSelector", js.undefined)
    
    @scala.inline
    def setDocumentSelectorVarargs(value: (typings.vscodeLanguageserverProtocol.protocolMod.DocumentFilter | String)*): Self = StObject.set(x, "documentSelector", js.Array(value :_*))
    
    @scala.inline
    def setErrorHandler(value: ErrorHandler): Self = StObject.set(x, "errorHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
    
    @scala.inline
    def setInitializationFailedHandler(
      value: /* error */ typings.vscodeLanguageserverProtocol.mod.ResponseError[typings.vscodeLanguageserverProtocol.protocolMod.InitializeError] | Error | js.Any => Boolean
    ): Self = StObject.set(x, "initializationFailedHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitializationFailedHandlerUndefined: Self = StObject.set(x, "initializationFailedHandler", js.undefined)
    
    @scala.inline
    def setInitializationOptions(value: js.Any | js.Function0[_]): Self = StObject.set(x, "initializationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializationOptionsFunction0(value: () => _): Self = StObject.set(x, "initializationOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitializationOptionsUndefined: Self = StObject.set(x, "initializationOptions", js.undefined)
    
    @scala.inline
    def setMiddleware(value: Middleware): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
    
    @scala.inline
    def setOutputChannel(value: OutputChannel): Self = StObject.set(x, "outputChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputChannelName(value: String): Self = StObject.set(x, "outputChannelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputChannelNameUndefined: Self = StObject.set(x, "outputChannelName", js.undefined)
    
    @scala.inline
    def setOutputChannelUndefined: Self = StObject.set(x, "outputChannel", js.undefined)
    
    @scala.inline
    def setProgressOnInitialization(value: Boolean): Self = StObject.set(x, "progressOnInitialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressOnInitializationUndefined: Self = StObject.set(x, "progressOnInitialization", js.undefined)
    
    @scala.inline
    def setRevealOutputChannelOn(value: RevealOutputChannelOn): Self = StObject.set(x, "revealOutputChannelOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevealOutputChannelOnUndefined: Self = StObject.set(x, "revealOutputChannelOn", js.undefined)
    
    @scala.inline
    def setStdioEncoding(value: String): Self = StObject.set(x, "stdioEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdioEncodingUndefined: Self = StObject.set(x, "stdioEncoding", js.undefined)
    
    @scala.inline
    def setSynchronize(value: SynchronizeOptions): Self = StObject.set(x, "synchronize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynchronizeUndefined: Self = StObject.set(x, "synchronize", js.undefined)
    
    @scala.inline
    def setTraceOutputChannel(value: OutputChannel): Self = StObject.set(x, "traceOutputChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceOutputChannelUndefined: Self = StObject.set(x, "traceOutputChannel", js.undefined)
    
    @scala.inline
    def setUriConverters(value: Code2Protocol): Self = StObject.set(x, "uriConverters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriConvertersUndefined: Self = StObject.set(x, "uriConverters", js.undefined)
    
    @scala.inline
    def setWorkspaceFolder(value: WorkspaceFolder): Self = StObject.set(x, "workspaceFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceFolderUndefined: Self = StObject.set(x, "workspaceFolder", js.undefined)
  }
}
