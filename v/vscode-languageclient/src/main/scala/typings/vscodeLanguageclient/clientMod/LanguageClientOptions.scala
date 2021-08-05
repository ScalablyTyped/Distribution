package typings.vscodeLanguageclient.clientMod

import typings.std.Error
import typings.vscode.mod.OutputChannel
import typings.vscode.mod.WorkspaceFolder
import typings.vscodeLanguageclient.anon.Code2Protocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageClientOptions extends StObject {
  
  var diagnosticCollectionName: js.UndefOr[String] = js.undefined
  
  var documentSelector: js.UndefOr[
    typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector | js.Array[String]
  ] = js.undefined
  
  var errorHandler: js.UndefOr[ErrorHandler] = js.undefined
  
  var initializationFailedHandler: js.UndefOr[InitializationFailedHandler] = js.undefined
  
  var initializationOptions: js.UndefOr[js.Any | js.Function0[js.Any]] = js.undefined
  
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
  
  var uriConverters: js.UndefOr[Code2Protocol] = js.undefined
  
  var workspaceFolder: js.UndefOr[WorkspaceFolder] = js.undefined
}
object LanguageClientOptions {
  
  inline def apply(): LanguageClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageClientOptions]
  }
  
  extension [Self <: LanguageClientOptions](x: Self) {
    
    inline def setDiagnosticCollectionName(value: String): Self = StObject.set(x, "diagnosticCollectionName", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticCollectionNameUndefined: Self = StObject.set(x, "diagnosticCollectionName", js.undefined)
    
    inline def setDocumentSelector(value: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector | js.Array[String]): Self = StObject.set(x, "documentSelector", value.asInstanceOf[js.Any])
    
    inline def setDocumentSelectorUndefined: Self = StObject.set(x, "documentSelector", js.undefined)
    
    inline def setDocumentSelectorVarargs(value: (typings.vscodeLanguageserverProtocol.protocolMod.DocumentFilter | String)*): Self = StObject.set(x, "documentSelector", js.Array(value :_*))
    
    inline def setErrorHandler(value: ErrorHandler): Self = StObject.set(x, "errorHandler", value.asInstanceOf[js.Any])
    
    inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
    
    inline def setInitializationFailedHandler(
      value: /* error */ typings.vscodeLanguageserverProtocol.mod.ResponseError[typings.vscodeLanguageserverProtocol.protocolMod.InitializeError] | Error | js.Any => Boolean
    ): Self = StObject.set(x, "initializationFailedHandler", js.Any.fromFunction1(value))
    
    inline def setInitializationFailedHandlerUndefined: Self = StObject.set(x, "initializationFailedHandler", js.undefined)
    
    inline def setInitializationOptions(value: js.Any | js.Function0[js.Any]): Self = StObject.set(x, "initializationOptions", value.asInstanceOf[js.Any])
    
    inline def setInitializationOptionsFunction0(value: () => js.Any): Self = StObject.set(x, "initializationOptions", js.Any.fromFunction0(value))
    
    inline def setInitializationOptionsUndefined: Self = StObject.set(x, "initializationOptions", js.undefined)
    
    inline def setMiddleware(value: Middleware): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    
    inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
    
    inline def setOutputChannel(value: OutputChannel): Self = StObject.set(x, "outputChannel", value.asInstanceOf[js.Any])
    
    inline def setOutputChannelName(value: String): Self = StObject.set(x, "outputChannelName", value.asInstanceOf[js.Any])
    
    inline def setOutputChannelNameUndefined: Self = StObject.set(x, "outputChannelName", js.undefined)
    
    inline def setOutputChannelUndefined: Self = StObject.set(x, "outputChannel", js.undefined)
    
    inline def setProgressOnInitialization(value: Boolean): Self = StObject.set(x, "progressOnInitialization", value.asInstanceOf[js.Any])
    
    inline def setProgressOnInitializationUndefined: Self = StObject.set(x, "progressOnInitialization", js.undefined)
    
    inline def setRevealOutputChannelOn(value: RevealOutputChannelOn): Self = StObject.set(x, "revealOutputChannelOn", value.asInstanceOf[js.Any])
    
    inline def setRevealOutputChannelOnUndefined: Self = StObject.set(x, "revealOutputChannelOn", js.undefined)
    
    inline def setStdioEncoding(value: String): Self = StObject.set(x, "stdioEncoding", value.asInstanceOf[js.Any])
    
    inline def setStdioEncodingUndefined: Self = StObject.set(x, "stdioEncoding", js.undefined)
    
    inline def setSynchronize(value: SynchronizeOptions): Self = StObject.set(x, "synchronize", value.asInstanceOf[js.Any])
    
    inline def setSynchronizeUndefined: Self = StObject.set(x, "synchronize", js.undefined)
    
    inline def setTraceOutputChannel(value: OutputChannel): Self = StObject.set(x, "traceOutputChannel", value.asInstanceOf[js.Any])
    
    inline def setTraceOutputChannelUndefined: Self = StObject.set(x, "traceOutputChannel", js.undefined)
    
    inline def setUriConverters(value: Code2Protocol): Self = StObject.set(x, "uriConverters", value.asInstanceOf[js.Any])
    
    inline def setUriConvertersUndefined: Self = StObject.set(x, "uriConverters", js.undefined)
    
    inline def setWorkspaceFolder(value: WorkspaceFolder): Self = StObject.set(x, "workspaceFolder", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceFolderUndefined: Self = StObject.set(x, "workspaceFolder", js.undefined)
  }
}
