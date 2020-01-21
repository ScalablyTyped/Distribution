package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.Diagnostic
import typings.typescriptServices.TypeScript.EmitOutput
import typings.typescriptServices.TypeScript.PullSymbol
import typings.typescriptServices.TypeScript.PullTypeSymbol
import typings.typescriptServices.TypeScript.SyntaxTree
import typings.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.LanguageService")
@js.native
class LanguageService protected () extends ILanguageService {
  def this(host: ILanguageServiceHost) = this()
  var _syntaxTreeCache: js.Any = js.native
  var activeCompletionSession: js.Any = js.native
  var compiler: js.Any = js.native
  var formattingRulesProvider: js.Any = js.native
  var host: ILanguageServiceHost = js.native
  var logger: js.Any = js.native
  /* private */ def _getHostFileName(fileName: js.Any): js.Any = js.native
  /* private */ def _getHostSpecificDiagnosticWithFileName(diagnostic: js.Any): js.Any = js.native
  /* private */ def addDeclaration(
    symbolKind: js.Any,
    symbolName: js.Any,
    containerKind: js.Any,
    containerName: js.Any,
    declaration: js.Any,
    result: js.Any
  ): js.Any = js.native
  /* private */ def addDeclarations(
    symbolKind: js.Any,
    symbolName: js.Any,
    containerKind: js.Any,
    containerName: js.Any,
    declarations: js.Any,
    result: js.Any
  ): js.Any = js.native
  /* CompleteClass */
  override def cleanupSemanticCache(): Unit = js.native
  /* private */ def containErrors(diagnostics: js.Any): js.Any = js.native
  /* private */ def findSearchValueInPullDecl(fileName: js.Any, declarations: js.Any, results: js.Any, searchTerms: js.Any): js.Any = js.native
  /* private */ def findSearchValueInPullDecl(fileName: js.Any, declarations: js.Any, results: js.Any, searchTerms: js.Any, parentName: js.Any): js.Any = js.native
  /* private */ def findSearchValueInPullDecl(
    fileName: js.Any,
    declarations: js.Any,
    results: js.Any,
    searchTerms: js.Any,
    parentName: js.Any,
    parentkindName: js.Any
  ): js.Any = js.native
  /* private */ def getAllSemanticDiagnostics(): js.Any = js.native
  /* private */ def getAllSyntacticDiagnostics(): js.Any = js.native
  /* CompleteClass */
  override def getBraceMatchingAtPosition(fileName: String, position: Double): js.Array[TextSpan] = js.native
  /* CompleteClass */
  override def getBreakpointStatementAtPosition(fileName: String, position: Double): SpanInfo = js.native
  /* CompleteClass */
  override def getCompilerOptionsDiagnostics(): js.Array[Diagnostic] = js.native
  /* private */ def getCompletionEntriesForKeywords(keywords: js.Any, result: js.Any): js.Any = js.native
  /* private */ def getCompletionEntriesFromDecls(decls: js.Any, result: js.Any): js.Any = js.native
  /* private */ def getCompletionEntriesFromSymbols(symbolInfo: js.Any, result: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getCompletionEntryDetails(fileName: String, position: Double, entryName: String): CompletionEntryDetails = js.native
  /* CompleteClass */
  override def getCompletionsAtPosition(fileName: String, position: Double, isMemberCompletion: Boolean): CompletionInfo = js.native
  /* CompleteClass */
  override def getDefinitionAtPosition(fileName: String, position: Double): js.Array[DefinitionInfo] = js.native
  /* CompleteClass */
  override def getEmitOutput(fileName: String): EmitOutput = js.native
  /* CompleteClass */
  override def getFormattingEditsAfterKeystroke(fileName: String, position: Double, key: String, options: FormatCodeOptions): js.Array[TextEdit] = js.native
  /* CompleteClass */
  override def getFormattingEditsForDocument(fileName: String, minChar: Double, limChar: Double, options: FormatCodeOptions): js.Array[TextEdit] = js.native
  /* CompleteClass */
  override def getFormattingEditsForRange(fileName: String, minChar: Double, limChar: Double, options: FormatCodeOptions): js.Array[TextEdit] = js.native
  /* CompleteClass */
  override def getFormattingEditsOnPaste(fileName: String, minChar: Double, limChar: Double, options: FormatCodeOptions): js.Array[TextEdit] = js.native
  /* private */ def getFormattingManager(fileName: js.Any, options: js.Any): js.Any = js.native
  /* private */ def getFullNameOfSymbol(symbol: js.Any, enclosingScopeSymbol: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getImplementorsAtPosition(fileName: String, position: Double): js.Array[ReferenceEntry] = js.native
  /* private */ def getImplementorsInFile(fileName: js.Any, symbol: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getIndentationAtPosition(fileName: String, position: Double, options: EditorOptions): Double = js.native
  /* private */ def getModuleOrEnumKind(symbol: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getNameOrDottedNameSpan(fileName: String, startPos: Double, endPos: Double): SpanInfo = js.native
  /* CompleteClass */
  override def getNavigateToItems(searchValue: String): js.Array[NavigateToItem] = js.native
  /* CompleteClass */
  override def getOccurrencesAtPosition(fileName: String, position: Double): js.Array[ReferenceEntry] = js.native
  /* CompleteClass */
  override def getOutliningRegions(fileName: String): js.Array[TextSpan] = js.native
  def getOverrides(container: PullTypeSymbol, memberSym: PullSymbol): js.Array[PullTypeSymbol] = js.native
  /* private */ def getPossibleSymbolReferencePositions(fileName: js.Any, symbolName: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getReferencesAtPosition(fileName: String, position: Double): js.Array[ReferenceEntry] = js.native
  /* private */ def getReferencesInFile(fileName: js.Any, symbol: js.Any, containingASTOpt: js.Any): js.Any = js.native
  /* private */ def getResolvedCompletionEntryDetailsFromSymbol(symbol: js.Any, enclosingScopeSymbol: js.Any): js.Any = js.native
  /* private */ def getScriptElementKindModifiers(symbol: js.Any): js.Any = js.native
  /* private */ def getScriptElementKindModifiersFromDecl(decl: js.Any): js.Any = js.native
  /* private */ def getScriptElementKindModifiersFromFlags(flags: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getScriptLexicalStructure(fileName: String): js.Array[NavigateToItem] = js.native
  /* CompleteClass */
  override def getSemanticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  /* CompleteClass */
  override def getSignatureAtPosition(fileName: String, position: Double): SignatureInfo = js.native
  /* private */ def getSingleNodeReferenceAtPosition(fileName: js.Any, position: js.Any): js.Any = js.native
  /* private */ def getSymbolInfoAtPosition(fileName: js.Any, pos: js.Any, requireName: js.Any): js.Any = js.native
  /* private */ def getSymbolScopeAST(symbol: js.Any, ast: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getSyntacticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  /* CompleteClass */
  override def getSyntaxTree(fileName: String): SyntaxTree = js.native
  /* CompleteClass */
  override def getTypeAtPosition(fileName: String, position: Double): TypeInfo = js.native
  /* private */ def getTypeInfoEligiblePath(fileName: js.Any, position: js.Any, isConstructorValidPosition: js.Any): js.Any = js.native
  /* private */ def getTypeParameterSignatureFromPartiallyWrittenExpression(document: js.Any, position: js.Any, genericTypeArgumentListInfo: js.Any): js.Any = js.native
  /* private */ def hasAnyUpperCaseCharacter(s: js.Any): js.Any = js.native
  /* private */ def isContainerDeclaration(declaration: js.Any): js.Any = js.native
  /* private */ def isLetterOrDigit(char: js.Any): js.Any = js.native
  /* private */ def isWriteAccess(current: js.Any): js.Any = js.native
  /* private */ def mapPullElementKind(kind: js.Any): js.Any = js.native
  /* private */ def mapPullElementKind(kind: js.Any, symbol: js.Any): js.Any = js.native
  /* private */ def mapPullElementKind(kind: js.Any, symbol: js.Any, useConstructorAsClass: js.Any): js.Any = js.native
  /* private */ def mapPullElementKind(kind: js.Any, symbol: js.Any, useConstructorAsClass: js.Any, varIsFunction: js.Any): js.Any = js.native
  /* private */ def mapPullElementKind(
    kind: js.Any,
    symbol: js.Any,
    useConstructorAsClass: js.Any,
    varIsFunction: js.Any,
    functionIsConstructor: js.Any
  ): js.Any = js.native
  /* CompleteClass */
  override def refresh(): Unit = js.native
  /* private */ def shouldIncludeDeclarationInNavigationItems(declaration: js.Any): js.Any = js.native
  /* private */ def tryAddConstructor(
    symbolKind: js.Any,
    symbolName: js.Any,
    containerKind: js.Any,
    containerName: js.Any,
    declarations: js.Any,
    result: js.Any
  ): js.Any = js.native
  /* private */ def tryAddDefinition(
    symbolKind: js.Any,
    symbolName: js.Any,
    containerKind: js.Any,
    containerName: js.Any,
    declarations: js.Any,
    result: js.Any
  ): js.Any = js.native
  /* private */ def tryAddSignatures(
    symbolKind: js.Any,
    symbolName: js.Any,
    containerKind: js.Any,
    containerName: js.Any,
    declarations: js.Any,
    result: js.Any
  ): js.Any = js.native
  /* private */ def tryFindDeclFromPreviousCompilerVersion(invalidatedDecl: js.Any): js.Any = js.native
}

