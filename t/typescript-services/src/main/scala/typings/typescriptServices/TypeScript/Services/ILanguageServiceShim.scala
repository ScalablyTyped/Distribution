package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILanguageServiceShim extends IShim {
  
  def cleanupSemanticCache(): Unit = js.native
  
  def getBraceMatchingAtPosition(fileName: String, position: Double): String = js.native
  
  def getBreakpointStatementAtPosition(fileName: String, position: Double): String = js.native
  
  def getCompilerOptionsDiagnostics(): String = js.native
  
  def getCompletionEntryDetails(fileName: String, position: Double, entryName: String): String = js.native
  
  def getCompletionsAtPosition(fileName: String, position: Double, isMemberCompletion: Boolean): String = js.native
  
  def getDefinitionAtPosition(fileName: String, position: Double): String = js.native
  
  def getEmitOutput(fileName: String): String = js.native
  
  def getFormattingEditsAfterKeystroke(fileName: String, position: Double, key: String, options: String): String = js.native
  
  def getFormattingEditsForDocument(fileName: String, minChar: Double, limChar: Double, options: String): String = js.native
  
  def getFormattingEditsForRange(fileName: String, minChar: Double, limChar: Double, options: String): String = js.native
  
  def getFormattingEditsOnPaste(fileName: String, minChar: Double, limChar: Double, options: String): String = js.native
  
  def getImplementorsAtPosition(fileName: String, position: Double): String = js.native
  
  def getIndentationAtPosition(fileName: String, position: Double, options: String): String = js.native
  
  def getNameOrDottedNameSpan(fileName: String, startPos: Double, endPos: Double): String = js.native
  
  def getNavigateToItems(searchValue: String): String = js.native
  
  def getOccurrencesAtPosition(fileName: String, position: Double): String = js.native
  
  def getOutliningRegions(fileName: String): String = js.native
  
  def getReferencesAtPosition(fileName: String, position: Double): String = js.native
  
  def getScriptLexicalStructure(fileName: String): String = js.native
  
  def getSemanticDiagnostics(fileName: String): String = js.native
  
  def getSignatureAtPosition(fileName: String, position: Double): String = js.native
  
  def getSyntacticDiagnostics(fileName: String): String = js.native
  
  def getTypeAtPosition(fileName: String, position: Double): String = js.native
  
  var languageService: ILanguageService = js.native
  
  def refresh(throwOnError: Boolean): Unit = js.native
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
    val __obj = js.Dynamic.literal(cleanupSemanticCache = js.Any.fromFunction0(cleanupSemanticCache), dispose = js.Any.fromFunction1(dispose), getBraceMatchingAtPosition = js.Any.fromFunction2(getBraceMatchingAtPosition), getBreakpointStatementAtPosition = js.Any.fromFunction2(getBreakpointStatementAtPosition), getCompilerOptionsDiagnostics = js.Any.fromFunction0(getCompilerOptionsDiagnostics), getCompletionEntryDetails = js.Any.fromFunction3(getCompletionEntryDetails), getCompletionsAtPosition = js.Any.fromFunction3(getCompletionsAtPosition), getDefinitionAtPosition = js.Any.fromFunction2(getDefinitionAtPosition), getEmitOutput = js.Any.fromFunction1(getEmitOutput), getFormattingEditsAfterKeystroke = js.Any.fromFunction4(getFormattingEditsAfterKeystroke), getFormattingEditsForDocument = js.Any.fromFunction4(getFormattingEditsForDocument), getFormattingEditsForRange = js.Any.fromFunction4(getFormattingEditsForRange), getFormattingEditsOnPaste = js.Any.fromFunction4(getFormattingEditsOnPaste), getImplementorsAtPosition = js.Any.fromFunction2(getImplementorsAtPosition), getIndentationAtPosition = js.Any.fromFunction3(getIndentationAtPosition), getNameOrDottedNameSpan = js.Any.fromFunction3(getNameOrDottedNameSpan), getNavigateToItems = js.Any.fromFunction1(getNavigateToItems), getOccurrencesAtPosition = js.Any.fromFunction2(getOccurrencesAtPosition), getOutliningRegions = js.Any.fromFunction1(getOutliningRegions), getReferencesAtPosition = js.Any.fromFunction2(getReferencesAtPosition), getScriptLexicalStructure = js.Any.fromFunction1(getScriptLexicalStructure), getSemanticDiagnostics = js.Any.fromFunction1(getSemanticDiagnostics), getSignatureAtPosition = js.Any.fromFunction2(getSignatureAtPosition), getSyntacticDiagnostics = js.Any.fromFunction1(getSyntacticDiagnostics), getTypeAtPosition = js.Any.fromFunction2(getTypeAtPosition), languageService = languageService.asInstanceOf[js.Any], refresh = js.Any.fromFunction1(refresh))
    __obj.asInstanceOf[ILanguageServiceShim]
  }
  
  @scala.inline
  implicit class ILanguageServiceShimOps[Self <: ILanguageServiceShim] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCleanupSemanticCache(value: () => Unit): Self = this.set("cleanupSemanticCache", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBraceMatchingAtPosition(value: (String, Double) => String): Self = this.set("getBraceMatchingAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetBreakpointStatementAtPosition(value: (String, Double) => String): Self = this.set("getBreakpointStatementAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetCompilerOptionsDiagnostics(value: () => String): Self = this.set("getCompilerOptionsDiagnostics", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCompletionEntryDetails(value: (String, Double, String) => String): Self = this.set("getCompletionEntryDetails", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetCompletionsAtPosition(value: (String, Double, Boolean) => String): Self = this.set("getCompletionsAtPosition", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetDefinitionAtPosition(value: (String, Double) => String): Self = this.set("getDefinitionAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetEmitOutput(value: String => String): Self = this.set("getEmitOutput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFormattingEditsAfterKeystroke(value: (String, Double, String, String) => String): Self = this.set("getFormattingEditsAfterKeystroke", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetFormattingEditsForDocument(value: (String, Double, Double, String) => String): Self = this.set("getFormattingEditsForDocument", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetFormattingEditsForRange(value: (String, Double, Double, String) => String): Self = this.set("getFormattingEditsForRange", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetFormattingEditsOnPaste(value: (String, Double, Double, String) => String): Self = this.set("getFormattingEditsOnPaste", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetImplementorsAtPosition(value: (String, Double) => String): Self = this.set("getImplementorsAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetIndentationAtPosition(value: (String, Double, String) => String): Self = this.set("getIndentationAtPosition", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetNameOrDottedNameSpan(value: (String, Double, Double) => String): Self = this.set("getNameOrDottedNameSpan", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetNavigateToItems(value: String => String): Self = this.set("getNavigateToItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOccurrencesAtPosition(value: (String, Double) => String): Self = this.set("getOccurrencesAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetOutliningRegions(value: String => String): Self = this.set("getOutliningRegions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetReferencesAtPosition(value: (String, Double) => String): Self = this.set("getReferencesAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetScriptLexicalStructure(value: String => String): Self = this.set("getScriptLexicalStructure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSemanticDiagnostics(value: String => String): Self = this.set("getSemanticDiagnostics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSignatureAtPosition(value: (String, Double) => String): Self = this.set("getSignatureAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetSyntacticDiagnostics(value: String => String): Self = this.set("getSyntacticDiagnostics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTypeAtPosition(value: (String, Double) => String): Self = this.set("getTypeAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLanguageService(value: ILanguageService): Self = this.set("languageService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: Boolean => Unit): Self = this.set("refresh", js.Any.fromFunction1(value))
  }
}
