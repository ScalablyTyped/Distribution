package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.PullSymbol
import typings.typescriptServices.TypeScript.PullTypeSymbol
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

