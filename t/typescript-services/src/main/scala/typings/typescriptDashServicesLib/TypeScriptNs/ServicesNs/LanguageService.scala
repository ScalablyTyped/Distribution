package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

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
  override def cleanupSemanticCache(): scala.Unit = js.native
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
  override def getBraceMatchingAtPosition(fileName: java.lang.String, position: scala.Double): js.Array[typescriptDashServicesLib.TypeScriptNs.TextSpan] = js.native
  /* CompleteClass */
  override def getBreakpointStatementAtPosition(fileName: java.lang.String, position: scala.Double): SpanInfo = js.native
  /* CompleteClass */
  override def getCompilerOptionsDiagnostics(): js.Array[typescriptDashServicesLib.TypeScriptNs.Diagnostic] = js.native
  /* private */ def getCompletionEntriesForKeywords(keywords: js.Any, result: js.Any): js.Any = js.native
  /* private */ def getCompletionEntriesFromDecls(decls: js.Any, result: js.Any): js.Any = js.native
  /* private */ def getCompletionEntriesFromSymbols(symbolInfo: js.Any, result: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getCompletionEntryDetails(fileName: java.lang.String, position: scala.Double, entryName: java.lang.String): CompletionEntryDetails = js.native
  /* CompleteClass */
  override def getCompletionsAtPosition(fileName: java.lang.String, position: scala.Double, isMemberCompletion: scala.Boolean): CompletionInfo = js.native
  /* CompleteClass */
  override def getDefinitionAtPosition(fileName: java.lang.String, position: scala.Double): js.Array[DefinitionInfo] = js.native
  /* CompleteClass */
  override def getEmitOutput(fileName: java.lang.String): typescriptDashServicesLib.TypeScriptNs.EmitOutput = js.native
  /* CompleteClass */
  override def getFormattingEditsAfterKeystroke(
    fileName: java.lang.String,
    position: scala.Double,
    key: java.lang.String,
    options: FormatCodeOptions
  ): js.Array[TextEdit] = js.native
  /* CompleteClass */
  override def getFormattingEditsForDocument(
    fileName: java.lang.String,
    minChar: scala.Double,
    limChar: scala.Double,
    options: FormatCodeOptions
  ): js.Array[TextEdit] = js.native
  /* CompleteClass */
  override def getFormattingEditsForRange(
    fileName: java.lang.String,
    minChar: scala.Double,
    limChar: scala.Double,
    options: FormatCodeOptions
  ): js.Array[TextEdit] = js.native
  /* CompleteClass */
  override def getFormattingEditsOnPaste(
    fileName: java.lang.String,
    minChar: scala.Double,
    limChar: scala.Double,
    options: FormatCodeOptions
  ): js.Array[TextEdit] = js.native
  /* private */ def getFormattingManager(fileName: js.Any, options: js.Any): js.Any = js.native
  /* private */ def getFullNameOfSymbol(symbol: js.Any, enclosingScopeSymbol: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getImplementorsAtPosition(fileName: java.lang.String, position: scala.Double): js.Array[ReferenceEntry] = js.native
  /* private */ def getImplementorsInFile(fileName: js.Any, symbol: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getIndentationAtPosition(fileName: java.lang.String, position: scala.Double, options: EditorOptions): scala.Double = js.native
  /* private */ def getModuleOrEnumKind(symbol: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getNameOrDottedNameSpan(fileName: java.lang.String, startPos: scala.Double, endPos: scala.Double): SpanInfo = js.native
  /* CompleteClass */
  override def getNavigateToItems(searchValue: java.lang.String): js.Array[NavigateToItem] = js.native
  /* CompleteClass */
  override def getOccurrencesAtPosition(fileName: java.lang.String, position: scala.Double): js.Array[ReferenceEntry] = js.native
  /* CompleteClass */
  override def getOutliningRegions(fileName: java.lang.String): js.Array[typescriptDashServicesLib.TypeScriptNs.TextSpan] = js.native
  def getOverrides(
    container: typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol,
    memberSym: typescriptDashServicesLib.TypeScriptNs.PullSymbol
  ): js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol] = js.native
  /* private */ def getPossibleSymbolReferencePositions(fileName: js.Any, symbolName: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getReferencesAtPosition(fileName: java.lang.String, position: scala.Double): js.Array[ReferenceEntry] = js.native
  /* private */ def getReferencesInFile(fileName: js.Any, symbol: js.Any, containingASTOpt: js.Any): js.Any = js.native
  /* private */ def getResolvedCompletionEntryDetailsFromSymbol(symbol: js.Any, enclosingScopeSymbol: js.Any): js.Any = js.native
  /* private */ def getScriptElementKindModifiers(symbol: js.Any): js.Any = js.native
  /* private */ def getScriptElementKindModifiersFromDecl(decl: js.Any): js.Any = js.native
  /* private */ def getScriptElementKindModifiersFromFlags(flags: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getScriptLexicalStructure(fileName: java.lang.String): js.Array[NavigateToItem] = js.native
  /* CompleteClass */
  override def getSemanticDiagnostics(fileName: java.lang.String): js.Array[typescriptDashServicesLib.TypeScriptNs.Diagnostic] = js.native
  /* CompleteClass */
  override def getSignatureAtPosition(fileName: java.lang.String, position: scala.Double): SignatureInfo = js.native
  /* private */ def getSingleNodeReferenceAtPosition(fileName: js.Any, position: js.Any): js.Any = js.native
  /* private */ def getSymbolInfoAtPosition(fileName: js.Any, pos: js.Any, requireName: js.Any): js.Any = js.native
  /* private */ def getSymbolScopeAST(symbol: js.Any, ast: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getSyntacticDiagnostics(fileName: java.lang.String): js.Array[typescriptDashServicesLib.TypeScriptNs.Diagnostic] = js.native
  /* CompleteClass */
  override def getSyntaxTree(fileName: java.lang.String): typescriptDashServicesLib.TypeScriptNs.SyntaxTree = js.native
  /* CompleteClass */
  override def getTypeAtPosition(fileName: java.lang.String, position: scala.Double): TypeInfo = js.native
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
  override def refresh(): scala.Unit = js.native
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

