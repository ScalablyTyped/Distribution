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
    cleanupSemanticCache: js.Function0[scala.Unit],
    dispose: js.Function1[js.Any, scala.Unit],
    getBraceMatchingAtPosition: js.Function2[java.lang.String, scala.Double, java.lang.String],
    getBreakpointStatementAtPosition: js.Function2[java.lang.String, scala.Double, java.lang.String],
    getCompilerOptionsDiagnostics: js.Function0[java.lang.String],
    getCompletionEntryDetails: js.Function3[java.lang.String, scala.Double, java.lang.String, java.lang.String],
    getCompletionsAtPosition: js.Function3[java.lang.String, scala.Double, scala.Boolean, java.lang.String],
    getDefinitionAtPosition: js.Function2[java.lang.String, scala.Double, java.lang.String],
    getEmitOutput: js.Function1[java.lang.String, java.lang.String],
    getFormattingEditsAfterKeystroke: js.Function4[java.lang.String, scala.Double, java.lang.String, java.lang.String, java.lang.String],
    getFormattingEditsForDocument: js.Function4[java.lang.String, scala.Double, scala.Double, java.lang.String, java.lang.String],
    getFormattingEditsForRange: js.Function4[java.lang.String, scala.Double, scala.Double, java.lang.String, java.lang.String],
    getFormattingEditsOnPaste: js.Function4[java.lang.String, scala.Double, scala.Double, java.lang.String, java.lang.String],
    getImplementorsAtPosition: js.Function2[java.lang.String, scala.Double, java.lang.String],
    getIndentationAtPosition: js.Function3[java.lang.String, scala.Double, java.lang.String, java.lang.String],
    getNameOrDottedNameSpan: js.Function3[java.lang.String, scala.Double, scala.Double, java.lang.String],
    getNavigateToItems: js.Function1[java.lang.String, java.lang.String],
    getOccurrencesAtPosition: js.Function2[java.lang.String, scala.Double, java.lang.String],
    getOutliningRegions: js.Function1[java.lang.String, java.lang.String],
    getReferencesAtPosition: js.Function2[java.lang.String, scala.Double, java.lang.String],
    getScriptLexicalStructure: js.Function1[java.lang.String, java.lang.String],
    getSemanticDiagnostics: js.Function1[java.lang.String, java.lang.String],
    getSignatureAtPosition: js.Function2[java.lang.String, scala.Double, java.lang.String],
    getSyntacticDiagnostics: js.Function1[java.lang.String, java.lang.String],
    getTypeAtPosition: js.Function2[java.lang.String, scala.Double, java.lang.String],
    languageService: ILanguageService,
    refresh: js.Function1[scala.Boolean, scala.Unit]
  ): ILanguageServiceShim = {
    val __obj = js.Dynamic.literal(cleanupSemanticCache = cleanupSemanticCache, dispose = dispose, getBraceMatchingAtPosition = getBraceMatchingAtPosition, getBreakpointStatementAtPosition = getBreakpointStatementAtPosition, getCompilerOptionsDiagnostics = getCompilerOptionsDiagnostics, getCompletionEntryDetails = getCompletionEntryDetails, getCompletionsAtPosition = getCompletionsAtPosition, getDefinitionAtPosition = getDefinitionAtPosition, getEmitOutput = getEmitOutput, getFormattingEditsAfterKeystroke = getFormattingEditsAfterKeystroke, getFormattingEditsForDocument = getFormattingEditsForDocument, getFormattingEditsForRange = getFormattingEditsForRange, getFormattingEditsOnPaste = getFormattingEditsOnPaste, getImplementorsAtPosition = getImplementorsAtPosition, getIndentationAtPosition = getIndentationAtPosition, getNameOrDottedNameSpan = getNameOrDottedNameSpan, getNavigateToItems = getNavigateToItems, getOccurrencesAtPosition = getOccurrencesAtPosition, getOutliningRegions = getOutliningRegions, getReferencesAtPosition = getReferencesAtPosition, getScriptLexicalStructure = getScriptLexicalStructure, getSemanticDiagnostics = getSemanticDiagnostics, getSignatureAtPosition = getSignatureAtPosition, getSyntacticDiagnostics = getSyntacticDiagnostics, getTypeAtPosition = getTypeAtPosition, languageService = languageService, refresh = refresh)
  
    __obj.asInstanceOf[ILanguageServiceShim]
  }
}

