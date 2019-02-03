package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.LanguageServiceShim")
@js.native
class LanguageServiceShim protected ()
  extends ShimBase
     with ILanguageServiceShim {
  def this(factory: IShimFactory, host: ILanguageServiceShimHost, languageService: ILanguageService) = this()
  var host: js.Any = js.native
  /* CompleteClass */
  override var languageService: ILanguageService = js.native
  var logger: js.Any = js.native
  /* private */ def _navigateToItemsToString(items: js.Any): js.Any = js.native
  /* CompleteClass */
  override def cleanupSemanticCache(): scala.Unit = js.native
  /* CompleteClass */
  override def dispose(dummy: js.Any): scala.Unit = js.native
  def forwardJSONCall(actionDescription: java.lang.String, action: js.Function0[_]): java.lang.String = js.native
  /* CompleteClass */
  override def getBraceMatchingAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def getBreakpointStatementAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def getCompilerOptionsDiagnostics(): java.lang.String = js.native
  /* CompleteClass */
  override def getCompletionEntryDetails(fileName: java.lang.String, position: scala.Double, entryName: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getCompletionsAtPosition(fileName: java.lang.String, position: scala.Double, isMemberCompletion: scala.Boolean): java.lang.String = js.native
  /* CompleteClass */
  override def getDefinitionAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def getEmitOutput(fileName: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getFormattingEditsAfterKeystroke(
    fileName: java.lang.String,
    position: scala.Double,
    key: java.lang.String,
    options: java.lang.String
  ): java.lang.String = js.native
  /* CompleteClass */
  override def getFormattingEditsForDocument(
    fileName: java.lang.String,
    minChar: scala.Double,
    limChar: scala.Double,
    options: java.lang.String
  ): java.lang.String = js.native
  /* CompleteClass */
  override def getFormattingEditsForRange(
    fileName: java.lang.String,
    minChar: scala.Double,
    limChar: scala.Double,
    options: java.lang.String
  ): java.lang.String = js.native
  /* CompleteClass */
  override def getFormattingEditsOnPaste(
    fileName: java.lang.String,
    minChar: scala.Double,
    limChar: scala.Double,
    options: java.lang.String
  ): java.lang.String = js.native
  /* CompleteClass */
  override def getImplementorsAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def getIndentationAtPosition(fileName: java.lang.String, position: scala.Double, options: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getNameOrDottedNameSpan(fileName: java.lang.String, startPos: scala.Double, endPos: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def getNavigateToItems(searchValue: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getOccurrencesAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def getOutliningRegions(fileName: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getReferencesAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def getScriptLexicalStructure(fileName: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getSemanticDiagnostics(fileName: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getSignatureAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def getSyntacticDiagnostics(fileName: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getTypeAtPosition(fileName: java.lang.String, position: scala.Double): java.lang.String = js.native
  /* private */ def realizeDiagnosticWithFileName(diagnostic: js.Any): js.Any = js.native
  /* CompleteClass */
  override def refresh(throwOnError: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSGlobal("TypeScript.Services.LanguageServiceShim")
@js.native
object LanguageServiceShim extends js.Object {
  /* private */ def realizeDiagnostic(diagnostic: js.Any): js.Any = js.native
  /* private */ def realizeDiagnosticCategory(category: js.Any): js.Any = js.native
}

