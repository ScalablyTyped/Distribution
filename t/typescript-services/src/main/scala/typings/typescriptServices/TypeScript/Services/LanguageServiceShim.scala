package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageServiceShim
  extends StObject
     with ShimBase
     with ILanguageServiceShim {
  
  /* private */ def _navigateToItemsToString(items: Any): Any
  
  def forwardJSONCall(actionDescription: String, action: js.Function0[Any]): String
  
  /* private */ var host: Any
  
  /* private */ var logger: Any
  
  /* private */ def realizeDiagnosticWithFileName(diagnostic: Any): Any
}
object LanguageServiceShim {
  
  inline def apply(
    _navigateToItemsToString: Any => Any,
    cleanupSemanticCache: () => Unit,
    dispose: Any => Unit,
    factory: Any,
    forwardJSONCall: (String, js.Function0[Any]) => String,
    getBraceMatchingAtPosition: (String, Double) => String,
    getBreakpointStatementAtPosition: (String, Double) => String,
    getCompilerOptionsDiagnostics: () => String,
    getCompletionEntryDetails: (String, Double, String) => String,
    getCompletionsAtPosition: (String, Double, Boolean) => String,
    getDefinitionAtPosition: (String, Double) => String,
    getEmitOutput: String => String,
    getFormattingEditsAfterKeystroke: (String, Double, String, String) => String,
    getFormattingEditsForDocument: (String, Double, Double, String) => String,
    getFormattingEditsForRange: (String, Double, Double, String) => String,
    getFormattingEditsOnPaste: (String, Double, Double, String) => String,
    getImplementorsAtPosition: (String, Double) => String,
    getIndentationAtPosition: (String, Double, String) => String,
    getNameOrDottedNameSpan: (String, Double, Double) => String,
    getNavigateToItems: String => String,
    getOccurrencesAtPosition: (String, Double) => String,
    getOutliningRegions: String => String,
    getReferencesAtPosition: (String, Double) => String,
    getScriptLexicalStructure: String => String,
    getSemanticDiagnostics: String => String,
    getSignatureAtPosition: (String, Double) => String,
    getSyntacticDiagnostics: String => String,
    getTypeAtPosition: (String, Double) => String,
    host: Any,
    languageService: ILanguageService,
    logger: Any,
    realizeDiagnosticWithFileName: Any => Any,
    refresh: Boolean => Unit
  ): LanguageServiceShim = {
    val __obj = js.Dynamic.literal(_navigateToItemsToString = js.Any.fromFunction1(_navigateToItemsToString), cleanupSemanticCache = js.Any.fromFunction0(cleanupSemanticCache), dispose = js.Any.fromFunction1(dispose), factory = factory.asInstanceOf[js.Any], forwardJSONCall = js.Any.fromFunction2(forwardJSONCall), getBraceMatchingAtPosition = js.Any.fromFunction2(getBraceMatchingAtPosition), getBreakpointStatementAtPosition = js.Any.fromFunction2(getBreakpointStatementAtPosition), getCompilerOptionsDiagnostics = js.Any.fromFunction0(getCompilerOptionsDiagnostics), getCompletionEntryDetails = js.Any.fromFunction3(getCompletionEntryDetails), getCompletionsAtPosition = js.Any.fromFunction3(getCompletionsAtPosition), getDefinitionAtPosition = js.Any.fromFunction2(getDefinitionAtPosition), getEmitOutput = js.Any.fromFunction1(getEmitOutput), getFormattingEditsAfterKeystroke = js.Any.fromFunction4(getFormattingEditsAfterKeystroke), getFormattingEditsForDocument = js.Any.fromFunction4(getFormattingEditsForDocument), getFormattingEditsForRange = js.Any.fromFunction4(getFormattingEditsForRange), getFormattingEditsOnPaste = js.Any.fromFunction4(getFormattingEditsOnPaste), getImplementorsAtPosition = js.Any.fromFunction2(getImplementorsAtPosition), getIndentationAtPosition = js.Any.fromFunction3(getIndentationAtPosition), getNameOrDottedNameSpan = js.Any.fromFunction3(getNameOrDottedNameSpan), getNavigateToItems = js.Any.fromFunction1(getNavigateToItems), getOccurrencesAtPosition = js.Any.fromFunction2(getOccurrencesAtPosition), getOutliningRegions = js.Any.fromFunction1(getOutliningRegions), getReferencesAtPosition = js.Any.fromFunction2(getReferencesAtPosition), getScriptLexicalStructure = js.Any.fromFunction1(getScriptLexicalStructure), getSemanticDiagnostics = js.Any.fromFunction1(getSemanticDiagnostics), getSignatureAtPosition = js.Any.fromFunction2(getSignatureAtPosition), getSyntacticDiagnostics = js.Any.fromFunction1(getSyntacticDiagnostics), getTypeAtPosition = js.Any.fromFunction2(getTypeAtPosition), host = host.asInstanceOf[js.Any], languageService = languageService.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], realizeDiagnosticWithFileName = js.Any.fromFunction1(realizeDiagnosticWithFileName), refresh = js.Any.fromFunction1(refresh))
    __obj.asInstanceOf[LanguageServiceShim]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LanguageServiceShim] (val x: Self) extends AnyVal {
    
    inline def setForwardJSONCall(value: (String, js.Function0[Any]) => String): Self = StObject.set(x, "forwardJSONCall", js.Any.fromFunction2(value))
    
    inline def setHost(value: Any): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setRealizeDiagnosticWithFileName(value: Any => Any): Self = StObject.set(x, "realizeDiagnosticWithFileName", js.Any.fromFunction1(value))
    
    inline def set_navigateToItemsToString(value: Any => Any): Self = StObject.set(x, "_navigateToItemsToString", js.Any.fromFunction1(value))
  }
}
