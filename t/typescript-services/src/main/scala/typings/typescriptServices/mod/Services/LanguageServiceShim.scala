package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.Services.ILanguageService
import typings.typescriptServices.TypeScript.Services.ILanguageServiceShimHost
import typings.typescriptServices.TypeScript.Services.IShimFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.LanguageServiceShim")
@js.native
class LanguageServiceShim protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.LanguageServiceShim {
  def this(factory: IShimFactory, host: ILanguageServiceShimHost, languageService: ILanguageService) = this()
  
  /* CompleteClass */
  /* private */ override def _navigateToItemsToString(items: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def cleanupSemanticCache(): Unit = js.native
  
  /* CompleteClass */
  override def dispose(dummy: js.Any): Unit = js.native
  
  /* CompleteClass */
  var factory: js.Any = js.native
  
  /* CompleteClass */
  override def forwardJSONCall(actionDescription: String, action: js.Function0[js.Any]): String = js.native
  
  /* CompleteClass */
  override def getBraceMatchingAtPosition(fileName: String, position: Double): String = js.native
  
  /* CompleteClass */
  override def getBreakpointStatementAtPosition(fileName: String, position: Double): String = js.native
  
  /* CompleteClass */
  override def getCompilerOptionsDiagnostics(): String = js.native
  
  /* CompleteClass */
  override def getCompletionEntryDetails(fileName: String, position: Double, entryName: String): String = js.native
  
  /* CompleteClass */
  override def getCompletionsAtPosition(fileName: String, position: Double, isMemberCompletion: Boolean): String = js.native
  
  /* CompleteClass */
  override def getDefinitionAtPosition(fileName: String, position: Double): String = js.native
  
  /* CompleteClass */
  override def getEmitOutput(fileName: String): String = js.native
  
  /* CompleteClass */
  override def getFormattingEditsAfterKeystroke(fileName: String, position: Double, key: String, options: String): String = js.native
  
  /* CompleteClass */
  override def getFormattingEditsForDocument(fileName: String, minChar: Double, limChar: Double, options: String): String = js.native
  
  /* CompleteClass */
  override def getFormattingEditsForRange(fileName: String, minChar: Double, limChar: Double, options: String): String = js.native
  
  /* CompleteClass */
  override def getFormattingEditsOnPaste(fileName: String, minChar: Double, limChar: Double, options: String): String = js.native
  
  /* CompleteClass */
  override def getImplementorsAtPosition(fileName: String, position: Double): String = js.native
  
  /* CompleteClass */
  override def getIndentationAtPosition(fileName: String, position: Double, options: String): String = js.native
  
  /* CompleteClass */
  override def getNameOrDottedNameSpan(fileName: String, startPos: Double, endPos: Double): String = js.native
  
  /* CompleteClass */
  override def getNavigateToItems(searchValue: String): String = js.native
  
  /* CompleteClass */
  override def getOccurrencesAtPosition(fileName: String, position: Double): String = js.native
  
  /* CompleteClass */
  override def getOutliningRegions(fileName: String): String = js.native
  
  /* CompleteClass */
  override def getReferencesAtPosition(fileName: String, position: Double): String = js.native
  
  /* CompleteClass */
  override def getScriptLexicalStructure(fileName: String): String = js.native
  
  /* CompleteClass */
  override def getSemanticDiagnostics(fileName: String): String = js.native
  
  /* CompleteClass */
  override def getSignatureAtPosition(fileName: String, position: Double): String = js.native
  
  /* CompleteClass */
  override def getSyntacticDiagnostics(fileName: String): String = js.native
  
  /* CompleteClass */
  override def getTypeAtPosition(fileName: String, position: Double): String = js.native
  
  /* CompleteClass */
  var host: js.Any = js.native
  
  /* CompleteClass */
  var languageService: ILanguageService = js.native
  
  /* CompleteClass */
  var logger: js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def realizeDiagnosticWithFileName(diagnostic: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def refresh(throwOnError: Boolean): Unit = js.native
}
object LanguageServiceShim {
  
  @JSImport("typescript-services", "Services.LanguageServiceShim")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def realizeDiagnostic(diagnostic: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("realizeDiagnostic")(diagnostic.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def realizeDiagnosticCategory(category: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("realizeDiagnosticCategory")(category.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
