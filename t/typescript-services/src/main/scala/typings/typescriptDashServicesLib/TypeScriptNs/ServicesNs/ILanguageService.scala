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
    cleanupSemanticCache: js.Function0[scala.Unit],
    getBraceMatchingAtPosition: js.Function2[
      java.lang.String, 
      scala.Double, 
      js.Array[typescriptDashServicesLib.TypeScriptNs.TextSpan]
    ],
    getBreakpointStatementAtPosition: js.Function2[java.lang.String, scala.Double, SpanInfo],
    getCompilerOptionsDiagnostics: js.Function0[js.Array[typescriptDashServicesLib.TypeScriptNs.Diagnostic]],
    getCompletionEntryDetails: js.Function3[java.lang.String, scala.Double, java.lang.String, CompletionEntryDetails],
    getCompletionsAtPosition: js.Function3[java.lang.String, scala.Double, scala.Boolean, CompletionInfo],
    getDefinitionAtPosition: js.Function2[java.lang.String, scala.Double, js.Array[DefinitionInfo]],
    getEmitOutput: js.Function1[java.lang.String, typescriptDashServicesLib.TypeScriptNs.EmitOutput],
    getFormattingEditsAfterKeystroke: js.Function4[java.lang.String, scala.Double, java.lang.String, FormatCodeOptions, js.Array[TextEdit]],
    getFormattingEditsForDocument: js.Function4[java.lang.String, scala.Double, scala.Double, FormatCodeOptions, js.Array[TextEdit]],
    getFormattingEditsForRange: js.Function4[java.lang.String, scala.Double, scala.Double, FormatCodeOptions, js.Array[TextEdit]],
    getFormattingEditsOnPaste: js.Function4[java.lang.String, scala.Double, scala.Double, FormatCodeOptions, js.Array[TextEdit]],
    getImplementorsAtPosition: js.Function2[java.lang.String, scala.Double, js.Array[ReferenceEntry]],
    getIndentationAtPosition: js.Function3[java.lang.String, scala.Double, EditorOptions, scala.Double],
    getNameOrDottedNameSpan: js.Function3[java.lang.String, scala.Double, scala.Double, SpanInfo],
    getNavigateToItems: js.Function1[java.lang.String, js.Array[NavigateToItem]],
    getOccurrencesAtPosition: js.Function2[java.lang.String, scala.Double, js.Array[ReferenceEntry]],
    getOutliningRegions: js.Function1[java.lang.String, js.Array[typescriptDashServicesLib.TypeScriptNs.TextSpan]],
    getReferencesAtPosition: js.Function2[java.lang.String, scala.Double, js.Array[ReferenceEntry]],
    getScriptLexicalStructure: js.Function1[java.lang.String, js.Array[NavigateToItem]],
    getSemanticDiagnostics: js.Function1[java.lang.String, js.Array[typescriptDashServicesLib.TypeScriptNs.Diagnostic]],
    getSignatureAtPosition: js.Function2[java.lang.String, scala.Double, SignatureInfo],
    getSyntacticDiagnostics: js.Function1[java.lang.String, js.Array[typescriptDashServicesLib.TypeScriptNs.Diagnostic]],
    getSyntaxTree: js.Function1[java.lang.String, typescriptDashServicesLib.TypeScriptNs.SyntaxTree],
    getTypeAtPosition: js.Function2[java.lang.String, scala.Double, TypeInfo],
    refresh: js.Function0[scala.Unit]
  ): ILanguageService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cleanupSemanticCache")(cleanupSemanticCache)
    __obj.updateDynamic("getBraceMatchingAtPosition")(getBraceMatchingAtPosition)
    __obj.updateDynamic("getBreakpointStatementAtPosition")(getBreakpointStatementAtPosition)
    __obj.updateDynamic("getCompilerOptionsDiagnostics")(getCompilerOptionsDiagnostics)
    __obj.updateDynamic("getCompletionEntryDetails")(getCompletionEntryDetails)
    __obj.updateDynamic("getCompletionsAtPosition")(getCompletionsAtPosition)
    __obj.updateDynamic("getDefinitionAtPosition")(getDefinitionAtPosition)
    __obj.updateDynamic("getEmitOutput")(getEmitOutput)
    __obj.updateDynamic("getFormattingEditsAfterKeystroke")(getFormattingEditsAfterKeystroke)
    __obj.updateDynamic("getFormattingEditsForDocument")(getFormattingEditsForDocument)
    __obj.updateDynamic("getFormattingEditsForRange")(getFormattingEditsForRange)
    __obj.updateDynamic("getFormattingEditsOnPaste")(getFormattingEditsOnPaste)
    __obj.updateDynamic("getImplementorsAtPosition")(getImplementorsAtPosition)
    __obj.updateDynamic("getIndentationAtPosition")(getIndentationAtPosition)
    __obj.updateDynamic("getNameOrDottedNameSpan")(getNameOrDottedNameSpan)
    __obj.updateDynamic("getNavigateToItems")(getNavigateToItems)
    __obj.updateDynamic("getOccurrencesAtPosition")(getOccurrencesAtPosition)
    __obj.updateDynamic("getOutliningRegions")(getOutliningRegions)
    __obj.updateDynamic("getReferencesAtPosition")(getReferencesAtPosition)
    __obj.updateDynamic("getScriptLexicalStructure")(getScriptLexicalStructure)
    __obj.updateDynamic("getSemanticDiagnostics")(getSemanticDiagnostics)
    __obj.updateDynamic("getSignatureAtPosition")(getSignatureAtPosition)
    __obj.updateDynamic("getSyntacticDiagnostics")(getSyntacticDiagnostics)
    __obj.updateDynamic("getSyntaxTree")(getSyntaxTree)
    __obj.updateDynamic("getTypeAtPosition")(getTypeAtPosition)
    __obj.updateDynamic("refresh")(refresh)
    __obj.asInstanceOf[ILanguageService]
  }
}

