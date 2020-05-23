package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.Diagnostic
import typings.typescriptServices.TypeScript.EmitOutput
import typings.typescriptServices.TypeScript.Services.CompletionEntryDetails
import typings.typescriptServices.TypeScript.Services.ILanguageServiceHost
import typings.typescriptServices.TypeScript.SyntaxTree
import typings.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.LanguageService")
@js.native
class LanguageService protected ()
  extends typings.typescriptServices.TypeScript.Services.LanguageService {
  def this(host: ILanguageServiceHost) = this()
  /* CompleteClass */
  override def cleanupSemanticCache(): Unit = js.native
  /* CompleteClass */
  override def getBraceMatchingAtPosition(fileName: String, position: Double): js.Array[TextSpan] = js.native
  /* CompleteClass */
  override def getBreakpointStatementAtPosition(fileName: String, position: Double): typings.typescriptServices.TypeScript.Services.SpanInfo = js.native
  /* CompleteClass */
  override def getCompilerOptionsDiagnostics(): js.Array[Diagnostic] = js.native
  /* CompleteClass */
  override def getCompletionEntryDetails(fileName: String, position: Double, entryName: String): CompletionEntryDetails = js.native
  /* CompleteClass */
  override def getCompletionsAtPosition(fileName: String, position: Double, isMemberCompletion: Boolean): typings.typescriptServices.TypeScript.Services.CompletionInfo = js.native
  /* CompleteClass */
  override def getDefinitionAtPosition(fileName: String, position: Double): js.Array[typings.typescriptServices.TypeScript.Services.DefinitionInfo] = js.native
  /* CompleteClass */
  override def getEmitOutput(fileName: String): EmitOutput = js.native
  /* CompleteClass */
  override def getFormattingEditsAfterKeystroke(
    fileName: String,
    position: Double,
    key: String,
    options: typings.typescriptServices.TypeScript.Services.FormatCodeOptions
  ): js.Array[typings.typescriptServices.TypeScript.Services.TextEdit] = js.native
  /* CompleteClass */
  override def getFormattingEditsForDocument(
    fileName: String,
    minChar: Double,
    limChar: Double,
    options: typings.typescriptServices.TypeScript.Services.FormatCodeOptions
  ): js.Array[typings.typescriptServices.TypeScript.Services.TextEdit] = js.native
  /* CompleteClass */
  override def getFormattingEditsForRange(
    fileName: String,
    minChar: Double,
    limChar: Double,
    options: typings.typescriptServices.TypeScript.Services.FormatCodeOptions
  ): js.Array[typings.typescriptServices.TypeScript.Services.TextEdit] = js.native
  /* CompleteClass */
  override def getFormattingEditsOnPaste(
    fileName: String,
    minChar: Double,
    limChar: Double,
    options: typings.typescriptServices.TypeScript.Services.FormatCodeOptions
  ): js.Array[typings.typescriptServices.TypeScript.Services.TextEdit] = js.native
  /* CompleteClass */
  override def getImplementorsAtPosition(fileName: String, position: Double): js.Array[typings.typescriptServices.TypeScript.Services.ReferenceEntry] = js.native
  /* CompleteClass */
  override def getIndentationAtPosition(
    fileName: String,
    position: Double,
    options: typings.typescriptServices.TypeScript.Services.EditorOptions
  ): Double = js.native
  /* CompleteClass */
  override def getNameOrDottedNameSpan(fileName: String, startPos: Double, endPos: Double): typings.typescriptServices.TypeScript.Services.SpanInfo = js.native
  /* CompleteClass */
  override def getNavigateToItems(searchValue: String): js.Array[typings.typescriptServices.TypeScript.Services.NavigateToItem] = js.native
  /* CompleteClass */
  override def getOccurrencesAtPosition(fileName: String, position: Double): js.Array[typings.typescriptServices.TypeScript.Services.ReferenceEntry] = js.native
  /* CompleteClass */
  override def getOutliningRegions(fileName: String): js.Array[TextSpan] = js.native
  /* CompleteClass */
  override def getReferencesAtPosition(fileName: String, position: Double): js.Array[typings.typescriptServices.TypeScript.Services.ReferenceEntry] = js.native
  /* CompleteClass */
  override def getScriptLexicalStructure(fileName: String): js.Array[typings.typescriptServices.TypeScript.Services.NavigateToItem] = js.native
  /* CompleteClass */
  override def getSemanticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  /* CompleteClass */
  override def getSignatureAtPosition(fileName: String, position: Double): typings.typescriptServices.TypeScript.Services.SignatureInfo = js.native
  /* CompleteClass */
  override def getSyntacticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  /* CompleteClass */
  override def getSyntaxTree(fileName: String): SyntaxTree = js.native
  /* CompleteClass */
  override def getTypeAtPosition(fileName: String, position: Double): typings.typescriptServices.TypeScript.Services.TypeInfo = js.native
  /* CompleteClass */
  override def refresh(): Unit = js.native
}

