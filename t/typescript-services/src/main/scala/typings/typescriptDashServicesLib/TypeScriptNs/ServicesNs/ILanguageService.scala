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

