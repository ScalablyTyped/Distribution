package typings.vscodeLanguageclient.libCommonClientMod

import typings.vscode.mod.OutputChannel
import typings.vscodeLanguageclient.anon.CancellationStrategy
import typings.vscodeLanguageclient.anon.Code2Protocol
import typings.vscodeLanguageclient.anon.IsTrusted
import typings.vscodeLanguageclient.libCommonConfigurationMod.ConfigurationOptions
import typings.vscodeLanguageclient.libCommonDiagnosticMod.DiagnosticPullOptions
import typings.vscodeLanguageclient.libCommonNotebookMod.NotebookDocumentOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentFilter
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSelector
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.InitializeError
import typings.vscodeLanguageserverProtocol.mod.ResponseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageClientOptions
  extends StObject
     with NotebookDocumentOptions
     with DiagnosticPullOptions
     with ConfigurationOptions {
  
  var connectionOptions: js.UndefOr[CancellationStrategy] = js.undefined
  
  var diagnosticCollectionName: js.UndefOr[String] = js.undefined
  
  var documentSelector: js.UndefOr[DocumentSelector | js.Array[String]] = js.undefined
  
  var errorHandler: js.UndefOr[ErrorHandler] = js.undefined
  
  var initializationFailedHandler: js.UndefOr[InitializationFailedHandler] = js.undefined
  
  var initializationOptions: js.UndefOr[Any | js.Function0[Any]] = js.undefined
  
  var markdown: js.UndefOr[IsTrusted] = js.undefined
  
  var middleware: js.UndefOr[Middleware] = js.undefined
  
  var outputChannel: js.UndefOr[OutputChannel] = js.undefined
  
  var outputChannelName: js.UndefOr[String] = js.undefined
  
  var progressOnInitialization: js.UndefOr[Boolean] = js.undefined
  
  var revealOutputChannelOn: js.UndefOr[RevealOutputChannelOn] = js.undefined
  
  /**
    * The encoding use to read stdout and stderr. Defaults
    * to 'utf8' if omitted.
    */
  var stdioEncoding: js.UndefOr[String] = js.undefined
  
  var traceOutputChannel: js.UndefOr[OutputChannel] = js.undefined
  
  var uriConverters: js.UndefOr[Code2Protocol] = js.undefined
}
object LanguageClientOptions {
  
  inline def apply(): LanguageClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageClientOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LanguageClientOptions] (val x: Self) extends AnyVal {
    
    inline def setConnectionOptions(value: CancellationStrategy): Self = StObject.set(x, "connectionOptions", value.asInstanceOf[js.Any])
    
    inline def setConnectionOptionsUndefined: Self = StObject.set(x, "connectionOptions", js.undefined)
    
    inline def setDiagnosticCollectionName(value: String): Self = StObject.set(x, "diagnosticCollectionName", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticCollectionNameUndefined: Self = StObject.set(x, "diagnosticCollectionName", js.undefined)
    
    inline def setDocumentSelector(value: DocumentSelector | js.Array[String]): Self = StObject.set(x, "documentSelector", value.asInstanceOf[js.Any])
    
    inline def setDocumentSelectorUndefined: Self = StObject.set(x, "documentSelector", js.undefined)
    
    inline def setDocumentSelectorVarargs(value: (DocumentFilter | String)*): Self = StObject.set(x, "documentSelector", js.Array(value*))
    
    inline def setErrorHandler(value: ErrorHandler): Self = StObject.set(x, "errorHandler", value.asInstanceOf[js.Any])
    
    inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
    
    inline def setInitializationFailedHandler(value: /* error */ ResponseError[InitializeError] | js.Error | Any => Boolean): Self = StObject.set(x, "initializationFailedHandler", js.Any.fromFunction1(value))
    
    inline def setInitializationFailedHandlerUndefined: Self = StObject.set(x, "initializationFailedHandler", js.undefined)
    
    inline def setInitializationOptions(value: Any | js.Function0[Any]): Self = StObject.set(x, "initializationOptions", value.asInstanceOf[js.Any])
    
    inline def setInitializationOptionsFunction0(value: () => Any): Self = StObject.set(x, "initializationOptions", js.Any.fromFunction0(value))
    
    inline def setInitializationOptionsUndefined: Self = StObject.set(x, "initializationOptions", js.undefined)
    
    inline def setMarkdown(value: IsTrusted): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
    
    inline def setMarkdownUndefined: Self = StObject.set(x, "markdown", js.undefined)
    
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
    
    inline def setTraceOutputChannel(value: OutputChannel): Self = StObject.set(x, "traceOutputChannel", value.asInstanceOf[js.Any])
    
    inline def setTraceOutputChannelUndefined: Self = StObject.set(x, "traceOutputChannel", js.undefined)
    
    inline def setUriConverters(value: Code2Protocol): Self = StObject.set(x, "uriConverters", value.asInstanceOf[js.Any])
    
    inline def setUriConvertersUndefined: Self = StObject.set(x, "uriConverters", js.undefined)
  }
}
