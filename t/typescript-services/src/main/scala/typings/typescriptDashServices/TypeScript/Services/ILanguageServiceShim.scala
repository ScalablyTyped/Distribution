package typings.typescriptDashServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageServiceShim extends IShim {
  var languageService: ILanguageService
  def cleanupSemanticCache(): Unit
  def getBraceMatchingAtPosition(fileName: String, position: Double): String
  def getBreakpointStatementAtPosition(fileName: String, position: Double): String
  def getCompilerOptionsDiagnostics(): String
  def getCompletionEntryDetails(fileName: String, position: Double, entryName: String): String
  def getCompletionsAtPosition(fileName: String, position: Double, isMemberCompletion: Boolean): String
  def getDefinitionAtPosition(fileName: String, position: Double): String
  def getEmitOutput(fileName: String): String
  def getFormattingEditsAfterKeystroke(fileName: String, position: Double, key: String, options: String): String
  def getFormattingEditsForDocument(fileName: String, minChar: Double, limChar: Double, options: String): String
  def getFormattingEditsForRange(fileName: String, minChar: Double, limChar: Double, options: String): String
  def getFormattingEditsOnPaste(fileName: String, minChar: Double, limChar: Double, options: String): String
  def getImplementorsAtPosition(fileName: String, position: Double): String
  def getIndentationAtPosition(fileName: String, position: Double, options: String): String
  def getNameOrDottedNameSpan(fileName: String, startPos: Double, endPos: Double): String
  def getNavigateToItems(searchValue: String): String
  def getOccurrencesAtPosition(fileName: String, position: Double): String
  def getOutliningRegions(fileName: String): String
  def getReferencesAtPosition(fileName: String, position: Double): String
  def getScriptLexicalStructure(fileName: String): String
  def getSemanticDiagnostics(fileName: String): String
  def getSignatureAtPosition(fileName: String, position: Double): String
  def getSyntacticDiagnostics(fileName: String): String
  def getTypeAtPosition(fileName: String, position: Double): String
  def refresh(throwOnError: Boolean): Unit
}

object ILanguageServiceShim {
  @scala.inline
  def apply(
    cleanupSemanticCache: () => Unit,
    dispose: js.Any => Unit,
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
    languageService: ILanguageService,
    refresh: Boolean => Unit
  ): ILanguageServiceShim = {
    val __obj = js.Dynamic.literal(cleanupSemanticCache = js.Any.fromFunction0(cleanupSemanticCache), dispose = js.Any.fromFunction1(dispose), getBraceMatchingAtPosition = js.Any.fromFunction2(getBraceMatchingAtPosition), getBreakpointStatementAtPosition = js.Any.fromFunction2(getBreakpointStatementAtPosition), getCompilerOptionsDiagnostics = js.Any.fromFunction0(getCompilerOptionsDiagnostics), getCompletionEntryDetails = js.Any.fromFunction3(getCompletionEntryDetails), getCompletionsAtPosition = js.Any.fromFunction3(getCompletionsAtPosition), getDefinitionAtPosition = js.Any.fromFunction2(getDefinitionAtPosition), getEmitOutput = js.Any.fromFunction1(getEmitOutput), getFormattingEditsAfterKeystroke = js.Any.fromFunction4(getFormattingEditsAfterKeystroke), getFormattingEditsForDocument = js.Any.fromFunction4(getFormattingEditsForDocument), getFormattingEditsForRange = js.Any.fromFunction4(getFormattingEditsForRange), getFormattingEditsOnPaste = js.Any.fromFunction4(getFormattingEditsOnPaste), getImplementorsAtPosition = js.Any.fromFunction2(getImplementorsAtPosition), getIndentationAtPosition = js.Any.fromFunction3(getIndentationAtPosition), getNameOrDottedNameSpan = js.Any.fromFunction3(getNameOrDottedNameSpan), getNavigateToItems = js.Any.fromFunction1(getNavigateToItems), getOccurrencesAtPosition = js.Any.fromFunction2(getOccurrencesAtPosition), getOutliningRegions = js.Any.fromFunction1(getOutliningRegions), getReferencesAtPosition = js.Any.fromFunction2(getReferencesAtPosition), getScriptLexicalStructure = js.Any.fromFunction1(getScriptLexicalStructure), getSemanticDiagnostics = js.Any.fromFunction1(getSemanticDiagnostics), getSignatureAtPosition = js.Any.fromFunction2(getSignatureAtPosition), getSyntacticDiagnostics = js.Any.fromFunction1(getSyntacticDiagnostics), getTypeAtPosition = js.Any.fromFunction2(getTypeAtPosition), languageService = languageService, refresh = js.Any.fromFunction1(refresh))
  
    __obj.asInstanceOf[ILanguageServiceShim]
  }
}

