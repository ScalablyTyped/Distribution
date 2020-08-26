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

@js.native
trait LanguageService extends ILanguageService {
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
  /* private */ def containErrors(diagnostics: js.Any): js.Any = js.native
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
  /* private */ def getCompletionEntriesForKeywords(keywords: js.Any, result: js.Any): js.Any = js.native
  /* private */ def getCompletionEntriesFromDecls(decls: js.Any, result: js.Any): js.Any = js.native
  /* private */ def getCompletionEntriesFromSymbols(symbolInfo: js.Any, result: js.Any): js.Any = js.native
  /* private */ def getFormattingManager(fileName: js.Any, options: js.Any): js.Any = js.native
  /* private */ def getFullNameOfSymbol(symbol: js.Any, enclosingScopeSymbol: js.Any): js.Any = js.native
  /* private */ def getImplementorsInFile(fileName: js.Any, symbol: js.Any): js.Any = js.native
  /* private */ def getModuleOrEnumKind(symbol: js.Any): js.Any = js.native
  def getOverrides(container: PullTypeSymbol, memberSym: PullSymbol): js.Array[PullTypeSymbol] = js.native
  /* private */ def getPossibleSymbolReferencePositions(fileName: js.Any, symbolName: js.Any): js.Any = js.native
  /* private */ def getReferencesInFile(fileName: js.Any, symbol: js.Any, containingASTOpt: js.Any): js.Any = js.native
  /* private */ def getResolvedCompletionEntryDetailsFromSymbol(symbol: js.Any, enclosingScopeSymbol: js.Any): js.Any = js.native
  /* private */ def getScriptElementKindModifiers(symbol: js.Any): js.Any = js.native
  /* private */ def getScriptElementKindModifiersFromDecl(decl: js.Any): js.Any = js.native
  /* private */ def getScriptElementKindModifiersFromFlags(flags: js.Any): js.Any = js.native
  /* private */ def getSingleNodeReferenceAtPosition(fileName: js.Any, position: js.Any): js.Any = js.native
  /* private */ def getSymbolInfoAtPosition(fileName: js.Any, pos: js.Any, requireName: js.Any): js.Any = js.native
  /* private */ def getSymbolScopeAST(symbol: js.Any, ast: js.Any): js.Any = js.native
  /* private */ def getTypeInfoEligiblePath(fileName: js.Any, position: js.Any, isConstructorValidPosition: js.Any): js.Any = js.native
  /* private */ def getTypeParameterSignatureFromPartiallyWrittenExpression(document: js.Any, position: js.Any, genericTypeArgumentListInfo: js.Any): js.Any = js.native
  /* private */ def hasAnyUpperCaseCharacter(s: js.Any): js.Any = js.native
  /* private */ def isContainerDeclaration(declaration: js.Any): js.Any = js.native
  /* private */ def isLetterOrDigit(char: js.Any): js.Any = js.native
  /* private */ def isWriteAccess(current: js.Any): js.Any = js.native
  /* private */ def mapPullElementKind(
    kind: js.Any,
    symbol: js.Any,
    useConstructorAsClass: js.Any,
    varIsFunction: js.Any,
    functionIsConstructor: js.Any
  ): js.Any = js.native
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

object LanguageService {
  @scala.inline
  def apply(
    _getHostFileName: js.Any => js.Any,
    _getHostSpecificDiagnosticWithFileName: js.Any => js.Any,
    _syntaxTreeCache: js.Any,
    activeCompletionSession: js.Any,
    addDeclaration: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    addDeclarations: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    cleanupSemanticCache: () => Unit,
    compiler: js.Any,
    containErrors: js.Any => js.Any,
    findSearchValueInPullDecl: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    formattingRulesProvider: js.Any,
    getAllSemanticDiagnostics: () => js.Any,
    getAllSyntacticDiagnostics: () => js.Any,
    getBraceMatchingAtPosition: (String, Double) => js.Array[TextSpan],
    getBreakpointStatementAtPosition: (String, Double) => SpanInfo,
    getCompilerOptionsDiagnostics: () => js.Array[Diagnostic],
    getCompletionEntriesForKeywords: (js.Any, js.Any) => js.Any,
    getCompletionEntriesFromDecls: (js.Any, js.Any) => js.Any,
    getCompletionEntriesFromSymbols: (js.Any, js.Any) => js.Any,
    getCompletionEntryDetails: (String, Double, String) => CompletionEntryDetails,
    getCompletionsAtPosition: (String, Double, Boolean) => CompletionInfo,
    getDefinitionAtPosition: (String, Double) => js.Array[DefinitionInfo],
    getEmitOutput: String => EmitOutput,
    getFormattingEditsAfterKeystroke: (String, Double, String, FormatCodeOptions) => js.Array[TextEdit],
    getFormattingEditsForDocument: (String, Double, Double, FormatCodeOptions) => js.Array[TextEdit],
    getFormattingEditsForRange: (String, Double, Double, FormatCodeOptions) => js.Array[TextEdit],
    getFormattingEditsOnPaste: (String, Double, Double, FormatCodeOptions) => js.Array[TextEdit],
    getFormattingManager: (js.Any, js.Any) => js.Any,
    getFullNameOfSymbol: (js.Any, js.Any) => js.Any,
    getImplementorsAtPosition: (String, Double) => js.Array[ReferenceEntry],
    getImplementorsInFile: (js.Any, js.Any) => js.Any,
    getIndentationAtPosition: (String, Double, EditorOptions) => Double,
    getModuleOrEnumKind: js.Any => js.Any,
    getNameOrDottedNameSpan: (String, Double, Double) => SpanInfo,
    getNavigateToItems: String => js.Array[NavigateToItem],
    getOccurrencesAtPosition: (String, Double) => js.Array[ReferenceEntry],
    getOutliningRegions: String => js.Array[TextSpan],
    getOverrides: (PullTypeSymbol, PullSymbol) => js.Array[PullTypeSymbol],
    getPossibleSymbolReferencePositions: (js.Any, js.Any) => js.Any,
    getReferencesAtPosition: (String, Double) => js.Array[ReferenceEntry],
    getReferencesInFile: (js.Any, js.Any, js.Any) => js.Any,
    getResolvedCompletionEntryDetailsFromSymbol: (js.Any, js.Any) => js.Any,
    getScriptElementKindModifiers: js.Any => js.Any,
    getScriptElementKindModifiersFromDecl: js.Any => js.Any,
    getScriptElementKindModifiersFromFlags: js.Any => js.Any,
    getScriptLexicalStructure: String => js.Array[NavigateToItem],
    getSemanticDiagnostics: String => js.Array[Diagnostic],
    getSignatureAtPosition: (String, Double) => SignatureInfo,
    getSingleNodeReferenceAtPosition: (js.Any, js.Any) => js.Any,
    getSymbolInfoAtPosition: (js.Any, js.Any, js.Any) => js.Any,
    getSymbolScopeAST: (js.Any, js.Any) => js.Any,
    getSyntacticDiagnostics: String => js.Array[Diagnostic],
    getSyntaxTree: String => SyntaxTree,
    getTypeAtPosition: (String, Double) => TypeInfo,
    getTypeInfoEligiblePath: (js.Any, js.Any, js.Any) => js.Any,
    getTypeParameterSignatureFromPartiallyWrittenExpression: (js.Any, js.Any, js.Any) => js.Any,
    hasAnyUpperCaseCharacter: js.Any => js.Any,
    host: ILanguageServiceHost,
    isContainerDeclaration: js.Any => js.Any,
    isLetterOrDigit: js.Any => js.Any,
    isWriteAccess: js.Any => js.Any,
    logger: js.Any,
    mapPullElementKind: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    refresh: () => Unit,
    shouldIncludeDeclarationInNavigationItems: js.Any => js.Any,
    tryAddConstructor: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    tryAddDefinition: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    tryAddSignatures: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    tryFindDeclFromPreviousCompilerVersion: js.Any => js.Any
  ): LanguageService = {
    val __obj = js.Dynamic.literal(_getHostFileName = js.Any.fromFunction1(_getHostFileName), _getHostSpecificDiagnosticWithFileName = js.Any.fromFunction1(_getHostSpecificDiagnosticWithFileName), _syntaxTreeCache = _syntaxTreeCache.asInstanceOf[js.Any], activeCompletionSession = activeCompletionSession.asInstanceOf[js.Any], addDeclaration = js.Any.fromFunction6(addDeclaration), addDeclarations = js.Any.fromFunction6(addDeclarations), cleanupSemanticCache = js.Any.fromFunction0(cleanupSemanticCache), compiler = compiler.asInstanceOf[js.Any], containErrors = js.Any.fromFunction1(containErrors), findSearchValueInPullDecl = js.Any.fromFunction6(findSearchValueInPullDecl), formattingRulesProvider = formattingRulesProvider.asInstanceOf[js.Any], getAllSemanticDiagnostics = js.Any.fromFunction0(getAllSemanticDiagnostics), getAllSyntacticDiagnostics = js.Any.fromFunction0(getAllSyntacticDiagnostics), getBraceMatchingAtPosition = js.Any.fromFunction2(getBraceMatchingAtPosition), getBreakpointStatementAtPosition = js.Any.fromFunction2(getBreakpointStatementAtPosition), getCompilerOptionsDiagnostics = js.Any.fromFunction0(getCompilerOptionsDiagnostics), getCompletionEntriesForKeywords = js.Any.fromFunction2(getCompletionEntriesForKeywords), getCompletionEntriesFromDecls = js.Any.fromFunction2(getCompletionEntriesFromDecls), getCompletionEntriesFromSymbols = js.Any.fromFunction2(getCompletionEntriesFromSymbols), getCompletionEntryDetails = js.Any.fromFunction3(getCompletionEntryDetails), getCompletionsAtPosition = js.Any.fromFunction3(getCompletionsAtPosition), getDefinitionAtPosition = js.Any.fromFunction2(getDefinitionAtPosition), getEmitOutput = js.Any.fromFunction1(getEmitOutput), getFormattingEditsAfterKeystroke = js.Any.fromFunction4(getFormattingEditsAfterKeystroke), getFormattingEditsForDocument = js.Any.fromFunction4(getFormattingEditsForDocument), getFormattingEditsForRange = js.Any.fromFunction4(getFormattingEditsForRange), getFormattingEditsOnPaste = js.Any.fromFunction4(getFormattingEditsOnPaste), getFormattingManager = js.Any.fromFunction2(getFormattingManager), getFullNameOfSymbol = js.Any.fromFunction2(getFullNameOfSymbol), getImplementorsAtPosition = js.Any.fromFunction2(getImplementorsAtPosition), getImplementorsInFile = js.Any.fromFunction2(getImplementorsInFile), getIndentationAtPosition = js.Any.fromFunction3(getIndentationAtPosition), getModuleOrEnumKind = js.Any.fromFunction1(getModuleOrEnumKind), getNameOrDottedNameSpan = js.Any.fromFunction3(getNameOrDottedNameSpan), getNavigateToItems = js.Any.fromFunction1(getNavigateToItems), getOccurrencesAtPosition = js.Any.fromFunction2(getOccurrencesAtPosition), getOutliningRegions = js.Any.fromFunction1(getOutliningRegions), getOverrides = js.Any.fromFunction2(getOverrides), getPossibleSymbolReferencePositions = js.Any.fromFunction2(getPossibleSymbolReferencePositions), getReferencesAtPosition = js.Any.fromFunction2(getReferencesAtPosition), getReferencesInFile = js.Any.fromFunction3(getReferencesInFile), getResolvedCompletionEntryDetailsFromSymbol = js.Any.fromFunction2(getResolvedCompletionEntryDetailsFromSymbol), getScriptElementKindModifiers = js.Any.fromFunction1(getScriptElementKindModifiers), getScriptElementKindModifiersFromDecl = js.Any.fromFunction1(getScriptElementKindModifiersFromDecl), getScriptElementKindModifiersFromFlags = js.Any.fromFunction1(getScriptElementKindModifiersFromFlags), getScriptLexicalStructure = js.Any.fromFunction1(getScriptLexicalStructure), getSemanticDiagnostics = js.Any.fromFunction1(getSemanticDiagnostics), getSignatureAtPosition = js.Any.fromFunction2(getSignatureAtPosition), getSingleNodeReferenceAtPosition = js.Any.fromFunction2(getSingleNodeReferenceAtPosition), getSymbolInfoAtPosition = js.Any.fromFunction3(getSymbolInfoAtPosition), getSymbolScopeAST = js.Any.fromFunction2(getSymbolScopeAST), getSyntacticDiagnostics = js.Any.fromFunction1(getSyntacticDiagnostics), getSyntaxTree = js.Any.fromFunction1(getSyntaxTree), getTypeAtPosition = js.Any.fromFunction2(getTypeAtPosition), getTypeInfoEligiblePath = js.Any.fromFunction3(getTypeInfoEligiblePath), getTypeParameterSignatureFromPartiallyWrittenExpression = js.Any.fromFunction3(getTypeParameterSignatureFromPartiallyWrittenExpression), hasAnyUpperCaseCharacter = js.Any.fromFunction1(hasAnyUpperCaseCharacter), host = host.asInstanceOf[js.Any], isContainerDeclaration = js.Any.fromFunction1(isContainerDeclaration), isLetterOrDigit = js.Any.fromFunction1(isLetterOrDigit), isWriteAccess = js.Any.fromFunction1(isWriteAccess), logger = logger.asInstanceOf[js.Any], mapPullElementKind = js.Any.fromFunction5(mapPullElementKind), refresh = js.Any.fromFunction0(refresh), shouldIncludeDeclarationInNavigationItems = js.Any.fromFunction1(shouldIncludeDeclarationInNavigationItems), tryAddConstructor = js.Any.fromFunction6(tryAddConstructor), tryAddDefinition = js.Any.fromFunction6(tryAddDefinition), tryAddSignatures = js.Any.fromFunction6(tryAddSignatures), tryFindDeclFromPreviousCompilerVersion = js.Any.fromFunction1(tryFindDeclFromPreviousCompilerVersion))
    __obj.asInstanceOf[LanguageService]
  }
  @scala.inline
  implicit class LanguageServiceOps[Self <: LanguageService] (val x: Self) extends AnyVal {
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
    def set_getHostFileName(value: js.Any => js.Any): Self = this.set("_getHostFileName", js.Any.fromFunction1(value))
    @scala.inline
    def set_getHostSpecificDiagnosticWithFileName(value: js.Any => js.Any): Self = this.set("_getHostSpecificDiagnosticWithFileName", js.Any.fromFunction1(value))
    @scala.inline
    def set_syntaxTreeCache(value: js.Any): Self = this.set("_syntaxTreeCache", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveCompletionSession(value: js.Any): Self = this.set("activeCompletionSession", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddDeclaration(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("addDeclaration", js.Any.fromFunction6(value))
    @scala.inline
    def setAddDeclarations(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("addDeclarations", js.Any.fromFunction6(value))
    @scala.inline
    def setCompiler(value: js.Any): Self = this.set("compiler", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainErrors(value: js.Any => js.Any): Self = this.set("containErrors", js.Any.fromFunction1(value))
    @scala.inline
    def setFindSearchValueInPullDecl(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("findSearchValueInPullDecl", js.Any.fromFunction6(value))
    @scala.inline
    def setFormattingRulesProvider(value: js.Any): Self = this.set("formattingRulesProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAllSemanticDiagnostics(value: () => js.Any): Self = this.set("getAllSemanticDiagnostics", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAllSyntacticDiagnostics(value: () => js.Any): Self = this.set("getAllSyntacticDiagnostics", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCompletionEntriesForKeywords(value: (js.Any, js.Any) => js.Any): Self = this.set("getCompletionEntriesForKeywords", js.Any.fromFunction2(value))
    @scala.inline
    def setGetCompletionEntriesFromDecls(value: (js.Any, js.Any) => js.Any): Self = this.set("getCompletionEntriesFromDecls", js.Any.fromFunction2(value))
    @scala.inline
    def setGetCompletionEntriesFromSymbols(value: (js.Any, js.Any) => js.Any): Self = this.set("getCompletionEntriesFromSymbols", js.Any.fromFunction2(value))
    @scala.inline
    def setGetFormattingManager(value: (js.Any, js.Any) => js.Any): Self = this.set("getFormattingManager", js.Any.fromFunction2(value))
    @scala.inline
    def setGetFullNameOfSymbol(value: (js.Any, js.Any) => js.Any): Self = this.set("getFullNameOfSymbol", js.Any.fromFunction2(value))
    @scala.inline
    def setGetImplementorsInFile(value: (js.Any, js.Any) => js.Any): Self = this.set("getImplementorsInFile", js.Any.fromFunction2(value))
    @scala.inline
    def setGetModuleOrEnumKind(value: js.Any => js.Any): Self = this.set("getModuleOrEnumKind", js.Any.fromFunction1(value))
    @scala.inline
    def setGetOverrides(value: (PullTypeSymbol, PullSymbol) => js.Array[PullTypeSymbol]): Self = this.set("getOverrides", js.Any.fromFunction2(value))
    @scala.inline
    def setGetPossibleSymbolReferencePositions(value: (js.Any, js.Any) => js.Any): Self = this.set("getPossibleSymbolReferencePositions", js.Any.fromFunction2(value))
    @scala.inline
    def setGetReferencesInFile(value: (js.Any, js.Any, js.Any) => js.Any): Self = this.set("getReferencesInFile", js.Any.fromFunction3(value))
    @scala.inline
    def setGetResolvedCompletionEntryDetailsFromSymbol(value: (js.Any, js.Any) => js.Any): Self = this.set("getResolvedCompletionEntryDetailsFromSymbol", js.Any.fromFunction2(value))
    @scala.inline
    def setGetScriptElementKindModifiers(value: js.Any => js.Any): Self = this.set("getScriptElementKindModifiers", js.Any.fromFunction1(value))
    @scala.inline
    def setGetScriptElementKindModifiersFromDecl(value: js.Any => js.Any): Self = this.set("getScriptElementKindModifiersFromDecl", js.Any.fromFunction1(value))
    @scala.inline
    def setGetScriptElementKindModifiersFromFlags(value: js.Any => js.Any): Self = this.set("getScriptElementKindModifiersFromFlags", js.Any.fromFunction1(value))
    @scala.inline
    def setGetSingleNodeReferenceAtPosition(value: (js.Any, js.Any) => js.Any): Self = this.set("getSingleNodeReferenceAtPosition", js.Any.fromFunction2(value))
    @scala.inline
    def setGetSymbolInfoAtPosition(value: (js.Any, js.Any, js.Any) => js.Any): Self = this.set("getSymbolInfoAtPosition", js.Any.fromFunction3(value))
    @scala.inline
    def setGetSymbolScopeAST(value: (js.Any, js.Any) => js.Any): Self = this.set("getSymbolScopeAST", js.Any.fromFunction2(value))
    @scala.inline
    def setGetTypeInfoEligiblePath(value: (js.Any, js.Any, js.Any) => js.Any): Self = this.set("getTypeInfoEligiblePath", js.Any.fromFunction3(value))
    @scala.inline
    def setGetTypeParameterSignatureFromPartiallyWrittenExpression(value: (js.Any, js.Any, js.Any) => js.Any): Self = this.set("getTypeParameterSignatureFromPartiallyWrittenExpression", js.Any.fromFunction3(value))
    @scala.inline
    def setHasAnyUpperCaseCharacter(value: js.Any => js.Any): Self = this.set("hasAnyUpperCaseCharacter", js.Any.fromFunction1(value))
    @scala.inline
    def setHost(value: ILanguageServiceHost): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsContainerDeclaration(value: js.Any => js.Any): Self = this.set("isContainerDeclaration", js.Any.fromFunction1(value))
    @scala.inline
    def setIsLetterOrDigit(value: js.Any => js.Any): Self = this.set("isLetterOrDigit", js.Any.fromFunction1(value))
    @scala.inline
    def setIsWriteAccess(value: js.Any => js.Any): Self = this.set("isWriteAccess", js.Any.fromFunction1(value))
    @scala.inline
    def setLogger(value: js.Any): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapPullElementKind(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("mapPullElementKind", js.Any.fromFunction5(value))
    @scala.inline
    def setShouldIncludeDeclarationInNavigationItems(value: js.Any => js.Any): Self = this.set("shouldIncludeDeclarationInNavigationItems", js.Any.fromFunction1(value))
    @scala.inline
    def setTryAddConstructor(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("tryAddConstructor", js.Any.fromFunction6(value))
    @scala.inline
    def setTryAddDefinition(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("tryAddDefinition", js.Any.fromFunction6(value))
    @scala.inline
    def setTryAddSignatures(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("tryAddSignatures", js.Any.fromFunction6(value))
    @scala.inline
    def setTryFindDeclFromPreviousCompilerVersion(value: js.Any => js.Any): Self = this.set("tryFindDeclFromPreviousCompilerVersion", js.Any.fromFunction1(value))
  }
  
}

