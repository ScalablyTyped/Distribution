package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageServiceShim extends IShim {
  var languageService: ILanguageService
  def cleanupSemanticCache(): scala.Unit
  def getBraceMatchingAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String
  def getBreakpointStatementAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String
  def getCompilerOptionsDiagnostics(): java.lang.String
  def getCompletionEntryDetails(fileName: java.lang.String, position: scala.Double, entryName: java.lang.String): java.lang.String
  def getCompletionsAtPosition(fileName: java.lang.String, position: scala.Double, isMemberCompletion: scala.Boolean): java.lang.String
  def getDefinitionAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String
  def getEmitOutput(fileName: java.lang.String): java.lang.String
  def getFormattingEditsAfterKeystroke(
    fileName: java.lang.String,
    position: scala.Double,
    key: java.lang.String,
    options: java.lang.String
  ): java.lang.String
  def getFormattingEditsForDocument(
    fileName: java.lang.String,
    minChar: scala.Double,
    limChar: scala.Double,
    options: java.lang.String
  ): java.lang.String
  def getFormattingEditsForRange(
    fileName: java.lang.String,
    minChar: scala.Double,
    limChar: scala.Double,
    options: java.lang.String
  ): java.lang.String
  def getFormattingEditsOnPaste(
    fileName: java.lang.String,
    minChar: scala.Double,
    limChar: scala.Double,
    options: java.lang.String
  ): java.lang.String
  def getImplementorsAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String
  def getIndentationAtPosition(fileName: java.lang.String, position: scala.Double, options: java.lang.String): java.lang.String
  def getNameOrDottedNameSpan(fileName: java.lang.String, startPos: scala.Double, endPos: scala.Double): java.lang.String
  def getNavigateToItems(searchValue: java.lang.String): java.lang.String
  def getOccurrencesAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String
  def getOutliningRegions(fileName: java.lang.String): java.lang.String
  def getReferencesAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String
  def getScriptLexicalStructure(fileName: java.lang.String): java.lang.String
  def getSemanticDiagnostics(fileName: java.lang.String): java.lang.String
  def getSignatureAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String
  def getSyntacticDiagnostics(fileName: java.lang.String): java.lang.String
  def getTypeAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String
  def refresh(throwOnError: scala.Boolean): scala.Unit
}

object ILanguageServiceShim {
  @scala.inline
  def apply(
    cleanupSemanticCache: () => scala.Unit,
    dispose: js.Any => scala.Unit,
    getBraceMatchingAtPosition: (java.lang.String, scala.Double) => java.lang.String,
    getBreakpointStatementAtPosition: (java.lang.String, scala.Double) => java.lang.String,
    getCompilerOptionsDiagnostics: () => java.lang.String,
    getCompletionEntryDetails: (java.lang.String, scala.Double, java.lang.String) => java.lang.String,
    getCompletionsAtPosition: (java.lang.String, scala.Double, scala.Boolean) => java.lang.String,
    getDefinitionAtPosition: (java.lang.String, scala.Double) => java.lang.String,
    getEmitOutput: java.lang.String => java.lang.String,
    getFormattingEditsAfterKeystroke: (java.lang.String, scala.Double, java.lang.String, java.lang.String) => java.lang.String,
    getFormattingEditsForDocument: (java.lang.String, scala.Double, scala.Double, java.lang.String) => java.lang.String,
    getFormattingEditsForRange: (java.lang.String, scala.Double, scala.Double, java.lang.String) => java.lang.String,
    getFormattingEditsOnPaste: (java.lang.String, scala.Double, scala.Double, java.lang.String) => java.lang.String,
    getImplementorsAtPosition: (java.lang.String, scala.Double) => java.lang.String,
    getIndentationAtPosition: (java.lang.String, scala.Double, java.lang.String) => java.lang.String,
    getNameOrDottedNameSpan: (java.lang.String, scala.Double, scala.Double) => java.lang.String,
    getNavigateToItems: java.lang.String => java.lang.String,
    getOccurrencesAtPosition: (java.lang.String, scala.Double) => java.lang.String,
    getOutliningRegions: java.lang.String => java.lang.String,
    getReferencesAtPosition: (java.lang.String, scala.Double) => java.lang.String,
    getScriptLexicalStructure: java.lang.String => java.lang.String,
    getSemanticDiagnostics: java.lang.String => java.lang.String,
    getSignatureAtPosition: (java.lang.String, scala.Double) => java.lang.String,
    getSyntacticDiagnostics: java.lang.String => java.lang.String,
    getTypeAtPosition: (java.lang.String, scala.Double) => java.lang.String,
    languageService: ILanguageService,
    refresh: scala.Boolean => scala.Unit
  ): ILanguageServiceShim = {
    val __obj = js.Dynamic.literal(cleanupSemanticCache = js.Any.fromFunction0(cleanupSemanticCache), dispose = js.Any.fromFunction1(dispose), getBraceMatchingAtPosition = js.Any.fromFunction2(getBraceMatchingAtPosition), getBreakpointStatementAtPosition = js.Any.fromFunction2(getBreakpointStatementAtPosition), getCompilerOptionsDiagnostics = js.Any.fromFunction0(getCompilerOptionsDiagnostics), getCompletionEntryDetails = js.Any.fromFunction3(getCompletionEntryDetails), getCompletionsAtPosition = js.Any.fromFunction3(getCompletionsAtPosition), getDefinitionAtPosition = js.Any.fromFunction2(getDefinitionAtPosition), getEmitOutput = js.Any.fromFunction1(getEmitOutput), getFormattingEditsAfterKeystroke = js.Any.fromFunction4(getFormattingEditsAfterKeystroke), getFormattingEditsForDocument = js.Any.fromFunction4(getFormattingEditsForDocument), getFormattingEditsForRange = js.Any.fromFunction4(getFormattingEditsForRange), getFormattingEditsOnPaste = js.Any.fromFunction4(getFormattingEditsOnPaste), getImplementorsAtPosition = js.Any.fromFunction2(getImplementorsAtPosition), getIndentationAtPosition = js.Any.fromFunction3(getIndentationAtPosition), getNameOrDottedNameSpan = js.Any.fromFunction3(getNameOrDottedNameSpan), getNavigateToItems = js.Any.fromFunction1(getNavigateToItems), getOccurrencesAtPosition = js.Any.fromFunction2(getOccurrencesAtPosition), getOutliningRegions = js.Any.fromFunction1(getOutliningRegions), getReferencesAtPosition = js.Any.fromFunction2(getReferencesAtPosition), getScriptLexicalStructure = js.Any.fromFunction1(getScriptLexicalStructure), getSemanticDiagnostics = js.Any.fromFunction1(getSemanticDiagnostics), getSignatureAtPosition = js.Any.fromFunction2(getSignatureAtPosition), getSyntacticDiagnostics = js.Any.fromFunction1(getSyntacticDiagnostics), getTypeAtPosition = js.Any.fromFunction2(getTypeAtPosition), languageService = languageService, refresh = js.Any.fromFunction1(refresh))
  
    __obj.asInstanceOf[ILanguageServiceShim]
  }
}

