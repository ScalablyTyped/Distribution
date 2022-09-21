package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.Diagnostic
import typings.typescriptServices.TypeScript.EmitOutput
import typings.typescriptServices.TypeScript.PullSymbol
import typings.typescriptServices.TypeScript.PullTypeSymbol
import typings.typescriptServices.TypeScript.Services.CompletionEntryDetails
import typings.typescriptServices.TypeScript.Services.ILanguageServiceHost
import typings.typescriptServices.TypeScript.SyntaxTree
import typings.typescriptServices.TypeScript.TextSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.LanguageService")
@js.native
open class LanguageService protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.LanguageService {
  def this(host: ILanguageServiceHost) = this()
  
  /* private */ /* CompleteClass */
  override def _getHostFileName(fileName: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def _getHostSpecificDiagnosticWithFileName(diagnostic: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  var _syntaxTreeCache: Any = js.native
  
  /* private */ /* CompleteClass */
  var activeCompletionSession: Any = js.native
  
  /* private */ /* CompleteClass */
  override def addDeclaration(
    symbolKind: Any,
    symbolName: Any,
    containerKind: Any,
    containerName: Any,
    declaration: Any,
    result: Any
  ): Any = js.native
  
  /* private */ /* CompleteClass */
  override def addDeclarations(
    symbolKind: Any,
    symbolName: Any,
    containerKind: Any,
    containerName: Any,
    declarations: Any,
    result: Any
  ): Any = js.native
  
  /* CompleteClass */
  override def cleanupSemanticCache(): Unit = js.native
  
  /* private */ /* CompleteClass */
  var compiler: Any = js.native
  
  /* private */ /* CompleteClass */
  override def containErrors(diagnostics: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def findSearchValueInPullDecl(
    fileName: Any,
    declarations: Any,
    results: Any,
    searchTerms: Any,
    parentName: Any,
    parentkindName: Any
  ): Any = js.native
  
  /* private */ /* CompleteClass */
  var formattingRulesProvider: Any = js.native
  
  /* private */ /* CompleteClass */
  override def getAllSemanticDiagnostics(): Any = js.native
  
  /* private */ /* CompleteClass */
  override def getAllSyntacticDiagnostics(): Any = js.native
  
  /* CompleteClass */
  override def getBraceMatchingAtPosition(fileName: String, position: Double): js.Array[TextSpan] = js.native
  
  /* CompleteClass */
  override def getBreakpointStatementAtPosition(fileName: String, position: Double): typings.typescriptServices.TypeScript.Services.SpanInfo = js.native
  
  /* CompleteClass */
  override def getCompilerOptionsDiagnostics(): js.Array[Diagnostic] = js.native
  
  /* private */ /* CompleteClass */
  override def getCompletionEntriesForKeywords(keywords: Any, result: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def getCompletionEntriesFromDecls(decls: Any, result: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def getCompletionEntriesFromSymbols(symbolInfo: Any, result: Any): Any = js.native
  
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
  
  /* private */ /* CompleteClass */
  override def getFormattingManager(fileName: Any, options: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def getFullNameOfSymbol(symbol: Any, enclosingScopeSymbol: Any): Any = js.native
  
  /* CompleteClass */
  override def getImplementorsAtPosition(fileName: String, position: Double): js.Array[typings.typescriptServices.TypeScript.Services.ReferenceEntry] = js.native
  
  /* private */ /* CompleteClass */
  override def getImplementorsInFile(fileName: Any, symbol: Any): Any = js.native
  
  /* CompleteClass */
  override def getIndentationAtPosition(
    fileName: String,
    position: Double,
    options: typings.typescriptServices.TypeScript.Services.EditorOptions
  ): Double = js.native
  
  /* private */ /* CompleteClass */
  override def getModuleOrEnumKind(symbol: Any): Any = js.native
  
  /* CompleteClass */
  override def getNameOrDottedNameSpan(fileName: String, startPos: Double, endPos: Double): typings.typescriptServices.TypeScript.Services.SpanInfo = js.native
  
  /* CompleteClass */
  override def getNavigateToItems(searchValue: String): js.Array[typings.typescriptServices.TypeScript.Services.NavigateToItem] = js.native
  
  /* CompleteClass */
  override def getOccurrencesAtPosition(fileName: String, position: Double): js.Array[typings.typescriptServices.TypeScript.Services.ReferenceEntry] = js.native
  
  /* CompleteClass */
  override def getOutliningRegions(fileName: String): js.Array[TextSpan] = js.native
  
  /* CompleteClass */
  override def getOverrides(container: PullTypeSymbol, memberSym: PullSymbol): js.Array[PullTypeSymbol] = js.native
  
  /* private */ /* CompleteClass */
  override def getPossibleSymbolReferencePositions(fileName: Any, symbolName: Any): Any = js.native
  
  /* CompleteClass */
  override def getReferencesAtPosition(fileName: String, position: Double): js.Array[typings.typescriptServices.TypeScript.Services.ReferenceEntry] = js.native
  
  /* private */ /* CompleteClass */
  override def getReferencesInFile(fileName: Any, symbol: Any, containingASTOpt: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def getResolvedCompletionEntryDetailsFromSymbol(symbol: Any, enclosingScopeSymbol: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def getScriptElementKindModifiers(symbol: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def getScriptElementKindModifiersFromDecl(decl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def getScriptElementKindModifiersFromFlags(flags: Any): Any = js.native
  
  /* CompleteClass */
  override def getScriptLexicalStructure(fileName: String): js.Array[typings.typescriptServices.TypeScript.Services.NavigateToItem] = js.native
  
  /* CompleteClass */
  override def getSemanticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  
  /* CompleteClass */
  override def getSignatureAtPosition(fileName: String, position: Double): typings.typescriptServices.TypeScript.Services.SignatureInfo = js.native
  
  /* private */ /* CompleteClass */
  override def getSingleNodeReferenceAtPosition(fileName: Any, position: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def getSymbolInfoAtPosition(fileName: Any, pos: Any, requireName: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def getSymbolScopeAST(symbol: Any, ast: Any): Any = js.native
  
  /* CompleteClass */
  override def getSyntacticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  
  /* CompleteClass */
  override def getSyntaxTree(fileName: String): SyntaxTree = js.native
  
  /* CompleteClass */
  override def getTypeAtPosition(fileName: String, position: Double): typings.typescriptServices.TypeScript.Services.TypeInfo = js.native
  
  /* private */ /* CompleteClass */
  override def getTypeInfoEligiblePath(fileName: Any, position: Any, isConstructorValidPosition: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def getTypeParameterSignatureFromPartiallyWrittenExpression(document: Any, position: Any, genericTypeArgumentListInfo: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def hasAnyUpperCaseCharacter(s: Any): Any = js.native
  
  /* CompleteClass */
  var host: ILanguageServiceHost = js.native
  
  /* private */ /* CompleteClass */
  override def isContainerDeclaration(declaration: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def isLetterOrDigit(char: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def isWriteAccess(current: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  var logger: Any = js.native
  
  /* private */ /* CompleteClass */
  override def mapPullElementKind(kind: Any, symbol: Any, useConstructorAsClass: Any, varIsFunction: Any, functionIsConstructor: Any): Any = js.native
  
  /* CompleteClass */
  override def refresh(): Unit = js.native
  
  /* private */ /* CompleteClass */
  override def shouldIncludeDeclarationInNavigationItems(declaration: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def tryAddConstructor(
    symbolKind: Any,
    symbolName: Any,
    containerKind: Any,
    containerName: Any,
    declarations: Any,
    result: Any
  ): Any = js.native
  
  /* private */ /* CompleteClass */
  override def tryAddDefinition(
    symbolKind: Any,
    symbolName: Any,
    containerKind: Any,
    containerName: Any,
    declarations: Any,
    result: Any
  ): Any = js.native
  
  /* private */ /* CompleteClass */
  override def tryAddSignatures(
    symbolKind: Any,
    symbolName: Any,
    containerKind: Any,
    containerName: Any,
    declarations: Any,
    result: Any
  ): Any = js.native
  
  /* private */ /* CompleteClass */
  override def tryFindDeclFromPreviousCompilerVersion(invalidatedDecl: Any): Any = js.native
}
