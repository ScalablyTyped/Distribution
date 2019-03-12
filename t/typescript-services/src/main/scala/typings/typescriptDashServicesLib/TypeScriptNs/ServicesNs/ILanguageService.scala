package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageService extends js.Object {
  def cleanupSemanticCache(): scala.Unit
  def getBraceMatchingAtPosition(fileName: java.lang.String, position: scala.Double): js.Array[typescriptDashServicesLib.TypeScriptNs.TextSpan]
  def getBreakpointStatementAtPosition(fileName: java.lang.String, position: scala.Double): SpanInfo
  def getCompilerOptionsDiagnostics(): js.Array[typescriptDashServicesLib.TypeScriptNs.Diagnostic]
  def getCompletionEntryDetails(fileName: java.lang.String, position: scala.Double, entryName: java.lang.String): CompletionEntryDetails
  def getCompletionsAtPosition(fileName: java.lang.String, position: scala.Double, isMemberCompletion: scala.Boolean): CompletionInfo
  def getDefinitionAtPosition(fileName: java.lang.String, position: scala.Double): js.Array[DefinitionInfo]
  def getEmitOutput(fileName: java.lang.String): typescriptDashServicesLib.TypeScriptNs.EmitOutput
  def getFormattingEditsAfterKeystroke(
    fileName: java.lang.String,
    position: scala.Double,
    key: java.lang.String,
    options: FormatCodeOptions
  ): js.Array[TextEdit]
  def getFormattingEditsForDocument(
    fileName: java.lang.String,
    minChar: scala.Double,
    limChar: scala.Double,
    options: FormatCodeOptions
  ): js.Array[TextEdit]
  def getFormattingEditsForRange(
    fileName: java.lang.String,
    minChar: scala.Double,
    limChar: scala.Double,
    options: FormatCodeOptions
  ): js.Array[TextEdit]
  def getFormattingEditsOnPaste(
    fileName: java.lang.String,
    minChar: scala.Double,
    limChar: scala.Double,
    options: FormatCodeOptions
  ): js.Array[TextEdit]
  def getImplementorsAtPosition(fileName: java.lang.String, position: scala.Double): js.Array[ReferenceEntry]
  def getIndentationAtPosition(fileName: java.lang.String, position: scala.Double, options: EditorOptions): scala.Double
  def getNameOrDottedNameSpan(fileName: java.lang.String, startPos: scala.Double, endPos: scala.Double): SpanInfo
  def getNavigateToItems(searchValue: java.lang.String): js.Array[NavigateToItem]
  def getOccurrencesAtPosition(fileName: java.lang.String, position: scala.Double): js.Array[ReferenceEntry]
  def getOutliningRegions(fileName: java.lang.String): js.Array[typescriptDashServicesLib.TypeScriptNs.TextSpan]
  def getReferencesAtPosition(fileName: java.lang.String, position: scala.Double): js.Array[ReferenceEntry]
  def getScriptLexicalStructure(fileName: java.lang.String): js.Array[NavigateToItem]
  def getSemanticDiagnostics(fileName: java.lang.String): js.Array[typescriptDashServicesLib.TypeScriptNs.Diagnostic]
  def getSignatureAtPosition(fileName: java.lang.String, position: scala.Double): SignatureInfo
  def getSyntacticDiagnostics(fileName: java.lang.String): js.Array[typescriptDashServicesLib.TypeScriptNs.Diagnostic]
  def getSyntaxTree(fileName: java.lang.String): typescriptDashServicesLib.TypeScriptNs.SyntaxTree
  def getTypeAtPosition(fileName: java.lang.String, position: scala.Double): TypeInfo
  def refresh(): scala.Unit
}

object ILanguageService {
  @scala.inline
  def apply(
    cleanupSemanticCache: () => scala.Unit,
    getBraceMatchingAtPosition: (java.lang.String, scala.Double) => js.Array[typescriptDashServicesLib.TypeScriptNs.TextSpan],
    getBreakpointStatementAtPosition: (java.lang.String, scala.Double) => SpanInfo,
    getCompilerOptionsDiagnostics: () => js.Array[typescriptDashServicesLib.TypeScriptNs.Diagnostic],
    getCompletionEntryDetails: (java.lang.String, scala.Double, java.lang.String) => CompletionEntryDetails,
    getCompletionsAtPosition: (java.lang.String, scala.Double, scala.Boolean) => CompletionInfo,
    getDefinitionAtPosition: (java.lang.String, scala.Double) => js.Array[DefinitionInfo],
    getEmitOutput: java.lang.String => typescriptDashServicesLib.TypeScriptNs.EmitOutput,
    getFormattingEditsAfterKeystroke: (java.lang.String, scala.Double, java.lang.String, FormatCodeOptions) => js.Array[TextEdit],
    getFormattingEditsForDocument: (java.lang.String, scala.Double, scala.Double, FormatCodeOptions) => js.Array[TextEdit],
    getFormattingEditsForRange: (java.lang.String, scala.Double, scala.Double, FormatCodeOptions) => js.Array[TextEdit],
    getFormattingEditsOnPaste: (java.lang.String, scala.Double, scala.Double, FormatCodeOptions) => js.Array[TextEdit],
    getImplementorsAtPosition: (java.lang.String, scala.Double) => js.Array[ReferenceEntry],
    getIndentationAtPosition: (java.lang.String, scala.Double, EditorOptions) => scala.Double,
    getNameOrDottedNameSpan: (java.lang.String, scala.Double, scala.Double) => SpanInfo,
    getNavigateToItems: java.lang.String => js.Array[NavigateToItem],
    getOccurrencesAtPosition: (java.lang.String, scala.Double) => js.Array[ReferenceEntry],
    getOutliningRegions: java.lang.String => js.Array[typescriptDashServicesLib.TypeScriptNs.TextSpan],
    getReferencesAtPosition: (java.lang.String, scala.Double) => js.Array[ReferenceEntry],
    getScriptLexicalStructure: java.lang.String => js.Array[NavigateToItem],
    getSemanticDiagnostics: java.lang.String => js.Array[typescriptDashServicesLib.TypeScriptNs.Diagnostic],
    getSignatureAtPosition: (java.lang.String, scala.Double) => SignatureInfo,
    getSyntacticDiagnostics: java.lang.String => js.Array[typescriptDashServicesLib.TypeScriptNs.Diagnostic],
    getSyntaxTree: java.lang.String => typescriptDashServicesLib.TypeScriptNs.SyntaxTree,
    getTypeAtPosition: (java.lang.String, scala.Double) => TypeInfo,
    refresh: () => scala.Unit
  ): ILanguageService = {
    val __obj = js.Dynamic.literal(cleanupSemanticCache = js.Any.fromFunction0(cleanupSemanticCache), getBraceMatchingAtPosition = js.Any.fromFunction2(getBraceMatchingAtPosition), getBreakpointStatementAtPosition = js.Any.fromFunction2(getBreakpointStatementAtPosition), getCompilerOptionsDiagnostics = js.Any.fromFunction0(getCompilerOptionsDiagnostics), getCompletionEntryDetails = js.Any.fromFunction3(getCompletionEntryDetails), getCompletionsAtPosition = js.Any.fromFunction3(getCompletionsAtPosition), getDefinitionAtPosition = js.Any.fromFunction2(getDefinitionAtPosition), getEmitOutput = js.Any.fromFunction1(getEmitOutput), getFormattingEditsAfterKeystroke = js.Any.fromFunction4(getFormattingEditsAfterKeystroke), getFormattingEditsForDocument = js.Any.fromFunction4(getFormattingEditsForDocument), getFormattingEditsForRange = js.Any.fromFunction4(getFormattingEditsForRange), getFormattingEditsOnPaste = js.Any.fromFunction4(getFormattingEditsOnPaste), getImplementorsAtPosition = js.Any.fromFunction2(getImplementorsAtPosition), getIndentationAtPosition = js.Any.fromFunction3(getIndentationAtPosition), getNameOrDottedNameSpan = js.Any.fromFunction3(getNameOrDottedNameSpan), getNavigateToItems = js.Any.fromFunction1(getNavigateToItems), getOccurrencesAtPosition = js.Any.fromFunction2(getOccurrencesAtPosition), getOutliningRegions = js.Any.fromFunction1(getOutliningRegions), getReferencesAtPosition = js.Any.fromFunction2(getReferencesAtPosition), getScriptLexicalStructure = js.Any.fromFunction1(getScriptLexicalStructure), getSemanticDiagnostics = js.Any.fromFunction1(getSemanticDiagnostics), getSignatureAtPosition = js.Any.fromFunction2(getSignatureAtPosition), getSyntacticDiagnostics = js.Any.fromFunction1(getSyntacticDiagnostics), getSyntaxTree = js.Any.fromFunction1(getSyntaxTree), getTypeAtPosition = js.Any.fromFunction2(getTypeAtPosition), refresh = js.Any.fromFunction0(refresh))
  
    __obj.asInstanceOf[ILanguageService]
  }
}

