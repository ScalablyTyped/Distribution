package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.Diagnostic
import typings.typescriptServices.TypeScript.EmitOutput
import typings.typescriptServices.TypeScript.PullSymbol
import typings.typescriptServices.TypeScript.PullTypeSymbol
import typings.typescriptServices.TypeScript.SyntaxTree
import typings.typescriptServices.TypeScript.TextSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageService
  extends StObject
     with ILanguageService {
  
  /* private */ def _getHostFileName(fileName: Any): Any
  
  /* private */ def _getHostSpecificDiagnosticWithFileName(diagnostic: Any): Any
  
  /* private */ var _syntaxTreeCache: Any
  
  /* private */ var activeCompletionSession: Any
  
  /* private */ def addDeclaration(
    symbolKind: Any,
    symbolName: Any,
    containerKind: Any,
    containerName: Any,
    declaration: Any,
    result: Any
  ): Any
  
  /* private */ def addDeclarations(
    symbolKind: Any,
    symbolName: Any,
    containerKind: Any,
    containerName: Any,
    declarations: Any,
    result: Any
  ): Any
  
  /* private */ var compiler: Any
  
  /* private */ def containErrors(diagnostics: Any): Any
  
  /* private */ def findSearchValueInPullDecl(
    fileName: Any,
    declarations: Any,
    results: Any,
    searchTerms: Any,
    parentName: Any,
    parentkindName: Any
  ): Any
  
  /* private */ var formattingRulesProvider: Any
  
  /* private */ def getAllSemanticDiagnostics(): Any
  
  /* private */ def getAllSyntacticDiagnostics(): Any
  
  /* private */ def getCompletionEntriesForKeywords(keywords: Any, result: Any): Any
  
  /* private */ def getCompletionEntriesFromDecls(decls: Any, result: Any): Any
  
  /* private */ def getCompletionEntriesFromSymbols(symbolInfo: Any, result: Any): Any
  
  /* private */ def getFormattingManager(fileName: Any, options: Any): Any
  
  /* private */ def getFullNameOfSymbol(symbol: Any, enclosingScopeSymbol: Any): Any
  
  /* private */ def getImplementorsInFile(fileName: Any, symbol: Any): Any
  
  /* private */ def getModuleOrEnumKind(symbol: Any): Any
  
  def getOverrides(container: PullTypeSymbol, memberSym: PullSymbol): js.Array[PullTypeSymbol]
  
  /* private */ def getPossibleSymbolReferencePositions(fileName: Any, symbolName: Any): Any
  
  /* private */ def getReferencesInFile(fileName: Any, symbol: Any, containingASTOpt: Any): Any
  
  /* private */ def getResolvedCompletionEntryDetailsFromSymbol(symbol: Any, enclosingScopeSymbol: Any): Any
  
  /* private */ def getScriptElementKindModifiers(symbol: Any): Any
  
  /* private */ def getScriptElementKindModifiersFromDecl(decl: Any): Any
  
  /* private */ def getScriptElementKindModifiersFromFlags(flags: Any): Any
  
  /* private */ def getSingleNodeReferenceAtPosition(fileName: Any, position: Any): Any
  
  /* private */ def getSymbolInfoAtPosition(fileName: Any, pos: Any, requireName: Any): Any
  
  /* private */ def getSymbolScopeAST(symbol: Any, ast: Any): Any
  
  /* private */ def getTypeInfoEligiblePath(fileName: Any, position: Any, isConstructorValidPosition: Any): Any
  
  /* private */ def getTypeParameterSignatureFromPartiallyWrittenExpression(document: Any, position: Any, genericTypeArgumentListInfo: Any): Any
  
  /* private */ def hasAnyUpperCaseCharacter(s: Any): Any
  
  var host: ILanguageServiceHost
  
  /* private */ def isContainerDeclaration(declaration: Any): Any
  
  /* private */ def isLetterOrDigit(char: Any): Any
  
  /* private */ def isWriteAccess(current: Any): Any
  
  /* private */ var logger: Any
  
  /* private */ def mapPullElementKind(kind: Any, symbol: Any, useConstructorAsClass: Any, varIsFunction: Any, functionIsConstructor: Any): Any
  
  /* private */ def shouldIncludeDeclarationInNavigationItems(declaration: Any): Any
  
  /* private */ def tryAddConstructor(
    symbolKind: Any,
    symbolName: Any,
    containerKind: Any,
    containerName: Any,
    declarations: Any,
    result: Any
  ): Any
  
  /* private */ def tryAddDefinition(
    symbolKind: Any,
    symbolName: Any,
    containerKind: Any,
    containerName: Any,
    declarations: Any,
    result: Any
  ): Any
  
  /* private */ def tryAddSignatures(
    symbolKind: Any,
    symbolName: Any,
    containerKind: Any,
    containerName: Any,
    declarations: Any,
    result: Any
  ): Any
  
  /* private */ def tryFindDeclFromPreviousCompilerVersion(invalidatedDecl: Any): Any
}
object LanguageService {
  
  inline def apply(
    _getHostFileName: Any => Any,
    _getHostSpecificDiagnosticWithFileName: Any => Any,
    _syntaxTreeCache: Any,
    activeCompletionSession: Any,
    addDeclaration: (Any, Any, Any, Any, Any, Any) => Any,
    addDeclarations: (Any, Any, Any, Any, Any, Any) => Any,
    cleanupSemanticCache: () => Unit,
    compiler: Any,
    containErrors: Any => Any,
    findSearchValueInPullDecl: (Any, Any, Any, Any, Any, Any) => Any,
    formattingRulesProvider: Any,
    getAllSemanticDiagnostics: () => Any,
    getAllSyntacticDiagnostics: () => Any,
    getBraceMatchingAtPosition: (String, Double) => js.Array[TextSpan],
    getBreakpointStatementAtPosition: (String, Double) => SpanInfo,
    getCompilerOptionsDiagnostics: () => js.Array[Diagnostic],
    getCompletionEntriesForKeywords: (Any, Any) => Any,
    getCompletionEntriesFromDecls: (Any, Any) => Any,
    getCompletionEntriesFromSymbols: (Any, Any) => Any,
    getCompletionEntryDetails: (String, Double, String) => CompletionEntryDetails,
    getCompletionsAtPosition: (String, Double, Boolean) => CompletionInfo,
    getDefinitionAtPosition: (String, Double) => js.Array[DefinitionInfo],
    getEmitOutput: String => EmitOutput,
    getFormattingEditsAfterKeystroke: (String, Double, String, FormatCodeOptions) => js.Array[TextEdit],
    getFormattingEditsForDocument: (String, Double, Double, FormatCodeOptions) => js.Array[TextEdit],
    getFormattingEditsForRange: (String, Double, Double, FormatCodeOptions) => js.Array[TextEdit],
    getFormattingEditsOnPaste: (String, Double, Double, FormatCodeOptions) => js.Array[TextEdit],
    getFormattingManager: (Any, Any) => Any,
    getFullNameOfSymbol: (Any, Any) => Any,
    getImplementorsAtPosition: (String, Double) => js.Array[ReferenceEntry],
    getImplementorsInFile: (Any, Any) => Any,
    getIndentationAtPosition: (String, Double, EditorOptions) => Double,
    getModuleOrEnumKind: Any => Any,
    getNameOrDottedNameSpan: (String, Double, Double) => SpanInfo,
    getNavigateToItems: String => js.Array[NavigateToItem],
    getOccurrencesAtPosition: (String, Double) => js.Array[ReferenceEntry],
    getOutliningRegions: String => js.Array[TextSpan],
    getOverrides: (PullTypeSymbol, PullSymbol) => js.Array[PullTypeSymbol],
    getPossibleSymbolReferencePositions: (Any, Any) => Any,
    getReferencesAtPosition: (String, Double) => js.Array[ReferenceEntry],
    getReferencesInFile: (Any, Any, Any) => Any,
    getResolvedCompletionEntryDetailsFromSymbol: (Any, Any) => Any,
    getScriptElementKindModifiers: Any => Any,
    getScriptElementKindModifiersFromDecl: Any => Any,
    getScriptElementKindModifiersFromFlags: Any => Any,
    getScriptLexicalStructure: String => js.Array[NavigateToItem],
    getSemanticDiagnostics: String => js.Array[Diagnostic],
    getSignatureAtPosition: (String, Double) => SignatureInfo,
    getSingleNodeReferenceAtPosition: (Any, Any) => Any,
    getSymbolInfoAtPosition: (Any, Any, Any) => Any,
    getSymbolScopeAST: (Any, Any) => Any,
    getSyntacticDiagnostics: String => js.Array[Diagnostic],
    getSyntaxTree: String => SyntaxTree,
    getTypeAtPosition: (String, Double) => TypeInfo,
    getTypeInfoEligiblePath: (Any, Any, Any) => Any,
    getTypeParameterSignatureFromPartiallyWrittenExpression: (Any, Any, Any) => Any,
    hasAnyUpperCaseCharacter: Any => Any,
    host: ILanguageServiceHost,
    isContainerDeclaration: Any => Any,
    isLetterOrDigit: Any => Any,
    isWriteAccess: Any => Any,
    logger: Any,
    mapPullElementKind: (Any, Any, Any, Any, Any) => Any,
    refresh: () => Unit,
    shouldIncludeDeclarationInNavigationItems: Any => Any,
    tryAddConstructor: (Any, Any, Any, Any, Any, Any) => Any,
    tryAddDefinition: (Any, Any, Any, Any, Any, Any) => Any,
    tryAddSignatures: (Any, Any, Any, Any, Any, Any) => Any,
    tryFindDeclFromPreviousCompilerVersion: Any => Any
  ): LanguageService = {
    val __obj = js.Dynamic.literal(_getHostFileName = js.Any.fromFunction1(_getHostFileName), _getHostSpecificDiagnosticWithFileName = js.Any.fromFunction1(_getHostSpecificDiagnosticWithFileName), _syntaxTreeCache = _syntaxTreeCache.asInstanceOf[js.Any], activeCompletionSession = activeCompletionSession.asInstanceOf[js.Any], addDeclaration = js.Any.fromFunction6(addDeclaration), addDeclarations = js.Any.fromFunction6(addDeclarations), cleanupSemanticCache = js.Any.fromFunction0(cleanupSemanticCache), compiler = compiler.asInstanceOf[js.Any], containErrors = js.Any.fromFunction1(containErrors), findSearchValueInPullDecl = js.Any.fromFunction6(findSearchValueInPullDecl), formattingRulesProvider = formattingRulesProvider.asInstanceOf[js.Any], getAllSemanticDiagnostics = js.Any.fromFunction0(getAllSemanticDiagnostics), getAllSyntacticDiagnostics = js.Any.fromFunction0(getAllSyntacticDiagnostics), getBraceMatchingAtPosition = js.Any.fromFunction2(getBraceMatchingAtPosition), getBreakpointStatementAtPosition = js.Any.fromFunction2(getBreakpointStatementAtPosition), getCompilerOptionsDiagnostics = js.Any.fromFunction0(getCompilerOptionsDiagnostics), getCompletionEntriesForKeywords = js.Any.fromFunction2(getCompletionEntriesForKeywords), getCompletionEntriesFromDecls = js.Any.fromFunction2(getCompletionEntriesFromDecls), getCompletionEntriesFromSymbols = js.Any.fromFunction2(getCompletionEntriesFromSymbols), getCompletionEntryDetails = js.Any.fromFunction3(getCompletionEntryDetails), getCompletionsAtPosition = js.Any.fromFunction3(getCompletionsAtPosition), getDefinitionAtPosition = js.Any.fromFunction2(getDefinitionAtPosition), getEmitOutput = js.Any.fromFunction1(getEmitOutput), getFormattingEditsAfterKeystroke = js.Any.fromFunction4(getFormattingEditsAfterKeystroke), getFormattingEditsForDocument = js.Any.fromFunction4(getFormattingEditsForDocument), getFormattingEditsForRange = js.Any.fromFunction4(getFormattingEditsForRange), getFormattingEditsOnPaste = js.Any.fromFunction4(getFormattingEditsOnPaste), getFormattingManager = js.Any.fromFunction2(getFormattingManager), getFullNameOfSymbol = js.Any.fromFunction2(getFullNameOfSymbol), getImplementorsAtPosition = js.Any.fromFunction2(getImplementorsAtPosition), getImplementorsInFile = js.Any.fromFunction2(getImplementorsInFile), getIndentationAtPosition = js.Any.fromFunction3(getIndentationAtPosition), getModuleOrEnumKind = js.Any.fromFunction1(getModuleOrEnumKind), getNameOrDottedNameSpan = js.Any.fromFunction3(getNameOrDottedNameSpan), getNavigateToItems = js.Any.fromFunction1(getNavigateToItems), getOccurrencesAtPosition = js.Any.fromFunction2(getOccurrencesAtPosition), getOutliningRegions = js.Any.fromFunction1(getOutliningRegions), getOverrides = js.Any.fromFunction2(getOverrides), getPossibleSymbolReferencePositions = js.Any.fromFunction2(getPossibleSymbolReferencePositions), getReferencesAtPosition = js.Any.fromFunction2(getReferencesAtPosition), getReferencesInFile = js.Any.fromFunction3(getReferencesInFile), getResolvedCompletionEntryDetailsFromSymbol = js.Any.fromFunction2(getResolvedCompletionEntryDetailsFromSymbol), getScriptElementKindModifiers = js.Any.fromFunction1(getScriptElementKindModifiers), getScriptElementKindModifiersFromDecl = js.Any.fromFunction1(getScriptElementKindModifiersFromDecl), getScriptElementKindModifiersFromFlags = js.Any.fromFunction1(getScriptElementKindModifiersFromFlags), getScriptLexicalStructure = js.Any.fromFunction1(getScriptLexicalStructure), getSemanticDiagnostics = js.Any.fromFunction1(getSemanticDiagnostics), getSignatureAtPosition = js.Any.fromFunction2(getSignatureAtPosition), getSingleNodeReferenceAtPosition = js.Any.fromFunction2(getSingleNodeReferenceAtPosition), getSymbolInfoAtPosition = js.Any.fromFunction3(getSymbolInfoAtPosition), getSymbolScopeAST = js.Any.fromFunction2(getSymbolScopeAST), getSyntacticDiagnostics = js.Any.fromFunction1(getSyntacticDiagnostics), getSyntaxTree = js.Any.fromFunction1(getSyntaxTree), getTypeAtPosition = js.Any.fromFunction2(getTypeAtPosition), getTypeInfoEligiblePath = js.Any.fromFunction3(getTypeInfoEligiblePath), getTypeParameterSignatureFromPartiallyWrittenExpression = js.Any.fromFunction3(getTypeParameterSignatureFromPartiallyWrittenExpression), hasAnyUpperCaseCharacter = js.Any.fromFunction1(hasAnyUpperCaseCharacter), host = host.asInstanceOf[js.Any], isContainerDeclaration = js.Any.fromFunction1(isContainerDeclaration), isLetterOrDigit = js.Any.fromFunction1(isLetterOrDigit), isWriteAccess = js.Any.fromFunction1(isWriteAccess), logger = logger.asInstanceOf[js.Any], mapPullElementKind = js.Any.fromFunction5(mapPullElementKind), refresh = js.Any.fromFunction0(refresh), shouldIncludeDeclarationInNavigationItems = js.Any.fromFunction1(shouldIncludeDeclarationInNavigationItems), tryAddConstructor = js.Any.fromFunction6(tryAddConstructor), tryAddDefinition = js.Any.fromFunction6(tryAddDefinition), tryAddSignatures = js.Any.fromFunction6(tryAddSignatures), tryFindDeclFromPreviousCompilerVersion = js.Any.fromFunction1(tryFindDeclFromPreviousCompilerVersion))
    __obj.asInstanceOf[LanguageService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LanguageService] (val x: Self) extends AnyVal {
    
    inline def setActiveCompletionSession(value: Any): Self = StObject.set(x, "activeCompletionSession", value.asInstanceOf[js.Any])
    
    inline def setAddDeclaration(value: (Any, Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "addDeclaration", js.Any.fromFunction6(value))
    
    inline def setAddDeclarations(value: (Any, Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "addDeclarations", js.Any.fromFunction6(value))
    
    inline def setCompiler(value: Any): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setContainErrors(value: Any => Any): Self = StObject.set(x, "containErrors", js.Any.fromFunction1(value))
    
    inline def setFindSearchValueInPullDecl(value: (Any, Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "findSearchValueInPullDecl", js.Any.fromFunction6(value))
    
    inline def setFormattingRulesProvider(value: Any): Self = StObject.set(x, "formattingRulesProvider", value.asInstanceOf[js.Any])
    
    inline def setGetAllSemanticDiagnostics(value: () => Any): Self = StObject.set(x, "getAllSemanticDiagnostics", js.Any.fromFunction0(value))
    
    inline def setGetAllSyntacticDiagnostics(value: () => Any): Self = StObject.set(x, "getAllSyntacticDiagnostics", js.Any.fromFunction0(value))
    
    inline def setGetCompletionEntriesForKeywords(value: (Any, Any) => Any): Self = StObject.set(x, "getCompletionEntriesForKeywords", js.Any.fromFunction2(value))
    
    inline def setGetCompletionEntriesFromDecls(value: (Any, Any) => Any): Self = StObject.set(x, "getCompletionEntriesFromDecls", js.Any.fromFunction2(value))
    
    inline def setGetCompletionEntriesFromSymbols(value: (Any, Any) => Any): Self = StObject.set(x, "getCompletionEntriesFromSymbols", js.Any.fromFunction2(value))
    
    inline def setGetFormattingManager(value: (Any, Any) => Any): Self = StObject.set(x, "getFormattingManager", js.Any.fromFunction2(value))
    
    inline def setGetFullNameOfSymbol(value: (Any, Any) => Any): Self = StObject.set(x, "getFullNameOfSymbol", js.Any.fromFunction2(value))
    
    inline def setGetImplementorsInFile(value: (Any, Any) => Any): Self = StObject.set(x, "getImplementorsInFile", js.Any.fromFunction2(value))
    
    inline def setGetModuleOrEnumKind(value: Any => Any): Self = StObject.set(x, "getModuleOrEnumKind", js.Any.fromFunction1(value))
    
    inline def setGetOverrides(value: (PullTypeSymbol, PullSymbol) => js.Array[PullTypeSymbol]): Self = StObject.set(x, "getOverrides", js.Any.fromFunction2(value))
    
    inline def setGetPossibleSymbolReferencePositions(value: (Any, Any) => Any): Self = StObject.set(x, "getPossibleSymbolReferencePositions", js.Any.fromFunction2(value))
    
    inline def setGetReferencesInFile(value: (Any, Any, Any) => Any): Self = StObject.set(x, "getReferencesInFile", js.Any.fromFunction3(value))
    
    inline def setGetResolvedCompletionEntryDetailsFromSymbol(value: (Any, Any) => Any): Self = StObject.set(x, "getResolvedCompletionEntryDetailsFromSymbol", js.Any.fromFunction2(value))
    
    inline def setGetScriptElementKindModifiers(value: Any => Any): Self = StObject.set(x, "getScriptElementKindModifiers", js.Any.fromFunction1(value))
    
    inline def setGetScriptElementKindModifiersFromDecl(value: Any => Any): Self = StObject.set(x, "getScriptElementKindModifiersFromDecl", js.Any.fromFunction1(value))
    
    inline def setGetScriptElementKindModifiersFromFlags(value: Any => Any): Self = StObject.set(x, "getScriptElementKindModifiersFromFlags", js.Any.fromFunction1(value))
    
    inline def setGetSingleNodeReferenceAtPosition(value: (Any, Any) => Any): Self = StObject.set(x, "getSingleNodeReferenceAtPosition", js.Any.fromFunction2(value))
    
    inline def setGetSymbolInfoAtPosition(value: (Any, Any, Any) => Any): Self = StObject.set(x, "getSymbolInfoAtPosition", js.Any.fromFunction3(value))
    
    inline def setGetSymbolScopeAST(value: (Any, Any) => Any): Self = StObject.set(x, "getSymbolScopeAST", js.Any.fromFunction2(value))
    
    inline def setGetTypeInfoEligiblePath(value: (Any, Any, Any) => Any): Self = StObject.set(x, "getTypeInfoEligiblePath", js.Any.fromFunction3(value))
    
    inline def setGetTypeParameterSignatureFromPartiallyWrittenExpression(value: (Any, Any, Any) => Any): Self = StObject.set(x, "getTypeParameterSignatureFromPartiallyWrittenExpression", js.Any.fromFunction3(value))
    
    inline def setHasAnyUpperCaseCharacter(value: Any => Any): Self = StObject.set(x, "hasAnyUpperCaseCharacter", js.Any.fromFunction1(value))
    
    inline def setHost(value: ILanguageServiceHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setIsContainerDeclaration(value: Any => Any): Self = StObject.set(x, "isContainerDeclaration", js.Any.fromFunction1(value))
    
    inline def setIsLetterOrDigit(value: Any => Any): Self = StObject.set(x, "isLetterOrDigit", js.Any.fromFunction1(value))
    
    inline def setIsWriteAccess(value: Any => Any): Self = StObject.set(x, "isWriteAccess", js.Any.fromFunction1(value))
    
    inline def setLogger(value: Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setMapPullElementKind(value: (Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "mapPullElementKind", js.Any.fromFunction5(value))
    
    inline def setShouldIncludeDeclarationInNavigationItems(value: Any => Any): Self = StObject.set(x, "shouldIncludeDeclarationInNavigationItems", js.Any.fromFunction1(value))
    
    inline def setTryAddConstructor(value: (Any, Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "tryAddConstructor", js.Any.fromFunction6(value))
    
    inline def setTryAddDefinition(value: (Any, Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "tryAddDefinition", js.Any.fromFunction6(value))
    
    inline def setTryAddSignatures(value: (Any, Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "tryAddSignatures", js.Any.fromFunction6(value))
    
    inline def setTryFindDeclFromPreviousCompilerVersion(value: Any => Any): Self = StObject.set(x, "tryFindDeclFromPreviousCompilerVersion", js.Any.fromFunction1(value))
    
    inline def set_getHostFileName(value: Any => Any): Self = StObject.set(x, "_getHostFileName", js.Any.fromFunction1(value))
    
    inline def set_getHostSpecificDiagnosticWithFileName(value: Any => Any): Self = StObject.set(x, "_getHostSpecificDiagnosticWithFileName", js.Any.fromFunction1(value))
    
    inline def set_syntaxTreeCache(value: Any): Self = StObject.set(x, "_syntaxTreeCache", value.asInstanceOf[js.Any])
  }
}
