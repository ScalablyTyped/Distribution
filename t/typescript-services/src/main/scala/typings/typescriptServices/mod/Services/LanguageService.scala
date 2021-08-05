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
class LanguageService protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.LanguageService {
  def this(host: ILanguageServiceHost) = this()
  
  /* private */ /* CompleteClass */
  override def _getHostFileName(fileName: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def _getHostSpecificDiagnosticWithFileName(diagnostic: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _syntaxTreeCache: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var activeCompletionSession: js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def addDeclaration(
    symbolKind: js.Any,
    symbolName: js.Any,
    containerKind: js.Any,
    containerName: js.Any,
    declaration: js.Any,
    result: js.Any
  ): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def addDeclarations(
    symbolKind: js.Any,
    symbolName: js.Any,
    containerKind: js.Any,
    containerName: js.Any,
    declarations: js.Any,
    result: js.Any
  ): js.Any = js.native
  
  /* CompleteClass */
  override def cleanupSemanticCache(): Unit = js.native
  
  /* private */ /* CompleteClass */
  var compiler: js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def containErrors(diagnostics: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def findSearchValueInPullDecl(
    fileName: js.Any,
    declarations: js.Any,
    results: js.Any,
    searchTerms: js.Any,
    parentName: js.Any,
    parentkindName: js.Any
  ): js.Any = js.native
  
  /* private */ /* CompleteClass */
  var formattingRulesProvider: js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def getAllSemanticDiagnostics(): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def getAllSyntacticDiagnostics(): js.Any = js.native
  
  /* CompleteClass */
  override def getBraceMatchingAtPosition(fileName: String, position: Double): js.Array[TextSpan] = js.native
  
  /* CompleteClass */
  override def getBreakpointStatementAtPosition(fileName: String, position: Double): typings.typescriptServices.TypeScript.Services.SpanInfo = js.native
  
  /* CompleteClass */
  override def getCompilerOptionsDiagnostics(): js.Array[Diagnostic] = js.native
  
  /* private */ /* CompleteClass */
  override def getCompletionEntriesForKeywords(keywords: js.Any, result: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def getCompletionEntriesFromDecls(decls: js.Any, result: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def getCompletionEntriesFromSymbols(symbolInfo: js.Any, result: js.Any): js.Any = js.native
  
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
  override def getFormattingManager(fileName: js.Any, options: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def getFullNameOfSymbol(symbol: js.Any, enclosingScopeSymbol: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def getImplementorsAtPosition(fileName: String, position: Double): js.Array[typings.typescriptServices.TypeScript.Services.ReferenceEntry] = js.native
  
  /* private */ /* CompleteClass */
  override def getImplementorsInFile(fileName: js.Any, symbol: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def getIndentationAtPosition(
    fileName: String,
    position: Double,
    options: typings.typescriptServices.TypeScript.Services.EditorOptions
  ): Double = js.native
  
  /* private */ /* CompleteClass */
  override def getModuleOrEnumKind(symbol: js.Any): js.Any = js.native
  
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
  override def getPossibleSymbolReferencePositions(fileName: js.Any, symbolName: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def getReferencesAtPosition(fileName: String, position: Double): js.Array[typings.typescriptServices.TypeScript.Services.ReferenceEntry] = js.native
  
  /* private */ /* CompleteClass */
  override def getReferencesInFile(fileName: js.Any, symbol: js.Any, containingASTOpt: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def getResolvedCompletionEntryDetailsFromSymbol(symbol: js.Any, enclosingScopeSymbol: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def getScriptElementKindModifiers(symbol: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def getScriptElementKindModifiersFromDecl(decl: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def getScriptElementKindModifiersFromFlags(flags: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def getScriptLexicalStructure(fileName: String): js.Array[typings.typescriptServices.TypeScript.Services.NavigateToItem] = js.native
  
  /* CompleteClass */
  override def getSemanticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  
  /* CompleteClass */
  override def getSignatureAtPosition(fileName: String, position: Double): typings.typescriptServices.TypeScript.Services.SignatureInfo = js.native
  
  /* private */ /* CompleteClass */
  override def getSingleNodeReferenceAtPosition(fileName: js.Any, position: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def getSymbolInfoAtPosition(fileName: js.Any, pos: js.Any, requireName: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def getSymbolScopeAST(symbol: js.Any, ast: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def getSyntacticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  
  /* CompleteClass */
  override def getSyntaxTree(fileName: String): SyntaxTree = js.native
  
  /* CompleteClass */
  override def getTypeAtPosition(fileName: String, position: Double): typings.typescriptServices.TypeScript.Services.TypeInfo = js.native
  
  /* private */ /* CompleteClass */
  override def getTypeInfoEligiblePath(fileName: js.Any, position: js.Any, isConstructorValidPosition: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def getTypeParameterSignatureFromPartiallyWrittenExpression(document: js.Any, position: js.Any, genericTypeArgumentListInfo: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def hasAnyUpperCaseCharacter(s: js.Any): js.Any = js.native
  
  /* CompleteClass */
  var host: ILanguageServiceHost = js.native
  
  /* private */ /* CompleteClass */
  override def isContainerDeclaration(declaration: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def isLetterOrDigit(char: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def isWriteAccess(current: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  var logger: js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def mapPullElementKind(
    kind: js.Any,
    symbol: js.Any,
    useConstructorAsClass: js.Any,
    varIsFunction: js.Any,
    functionIsConstructor: js.Any
  ): js.Any = js.native
  
  /* CompleteClass */
  override def refresh(): Unit = js.native
  
  /* private */ /* CompleteClass */
  override def shouldIncludeDeclarationInNavigationItems(declaration: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def tryAddConstructor(
    symbolKind: js.Any,
    symbolName: js.Any,
    containerKind: js.Any,
    containerName: js.Any,
    declarations: js.Any,
    result: js.Any
  ): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def tryAddDefinition(
    symbolKind: js.Any,
    symbolName: js.Any,
    containerKind: js.Any,
    containerName: js.Any,
    declarations: js.Any,
    result: js.Any
  ): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def tryAddSignatures(
    symbolKind: js.Any,
    symbolName: js.Any,
    containerKind: js.Any,
    containerName: js.Any,
    declarations: js.Any,
    result: js.Any
  ): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def tryFindDeclFromPreviousCompilerVersion(invalidatedDecl: js.Any): js.Any = js.native
}
