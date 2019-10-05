package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SemanticInfoChain")
@js.native
class SemanticInfoChain protected () extends js.Object {
  def this(compiler: TypeScriptCompiler, logger: ILogger) = this()
  var _binder: js.Any = js.native
  var _fileNames: js.Any = js.native
  var _resolver: js.Any = js.native
  var _topLevelDecls: js.Any = js.native
  var anyTypeDecl: PullDecl = js.native
  var anyTypeSymbol: PullPrimitiveTypeSymbol = js.native
  var astAliasSymbolMap: js.Any = js.native
  var astCallResolutionDataMap: js.Any = js.native
  var astSymbolMap: js.Any = js.native
  var booleanTypeDecl: PullDecl = js.native
  var booleanTypeSymbol: PullPrimitiveTypeSymbol = js.native
  var compiler: js.Any = js.native
  var declCache: js.Any = js.native
  var declSignatureSymbolMap: js.Any = js.native
  var declSymbolMap: js.Any = js.native
  var documents: js.Any = js.native
  var emptyTypeSymbol: PullTypeSymbol = js.native
  var fileNameToDiagnostics: js.Any = js.native
  var fileNameToDocument: js.Any = js.native
  var logger: js.Any = js.native
  var nullTypeDecl: PullDecl = js.native
  var nullTypeSymbol: PullPrimitiveTypeSymbol = js.native
  var numberTypeDecl: PullDecl = js.native
  var numberTypeSymbol: PullPrimitiveTypeSymbol = js.native
  var stringTypeDecl: PullDecl = js.native
  var stringTypeSymbol: PullPrimitiveTypeSymbol = js.native
  var symbolCache: js.Any = js.native
  var undefinedTypeDecl: PullDecl = js.native
  var undefinedTypeSymbol: PullPrimitiveTypeSymbol = js.native
  var undefinedValueDecl: PullDecl = js.native
  var undefinedValueSymbol: PullSymbol = js.native
  var voidTypeDecl: PullDecl = js.native
  var voidTypeSymbol: PullPrimitiveTypeSymbol = js.native
  def addDiagnostic(diagnostic: Diagnostic): Unit = js.native
  def addDiagnosticFromAST(ast: AST, diagnosticKey: String): Unit = js.native
  def addDiagnosticFromAST(ast: AST, diagnosticKey: String, _arguments: js.Array[_]): Unit = js.native
  def addDiagnosticFromAST(ast: AST, diagnosticKey: String, _arguments: js.Array[_], additionalLocations: js.Array[Location]): Unit = js.native
  def addDocument(document: Document): Unit = js.native
  def addDuplicateIdentifierDiagnosticFromAST(ast: AST, identifier: String, additionalLocationAST: AST): Unit = js.native
  /* private */ def addPrimitiveTypeSymbol(decl: js.Any): js.Any = js.native
  /* private */ def addPrimitiveValueSymbol(decl: js.Any, `type`: js.Any): js.Any = js.native
  def addSyntheticIndexSignature(
    containingDecl: PullDecl,
    containingSymbol: PullTypeSymbol,
    ast: AST,
    indexParamName: String,
    indexParamType: PullTypeSymbol,
    returnType: PullTypeSymbol
  ): Unit = js.native
  /* private */ def bindPrimitiveSymbol[TSymbol /* <: PullSymbol */](decl: js.Any, newSymbol: js.Any): js.Any = js.native
  def cacheGlobalSymbol(symbol: PullSymbol, kind: PullElementKind): Unit = js.native
  def diagnosticFromAST(ast: AST, diagnosticKey: String): Diagnostic = js.native
  def diagnosticFromAST(ast: AST, diagnosticKey: String, _arguments: js.Array[_]): Diagnostic = js.native
  def diagnosticFromAST(ast: AST, diagnosticKey: String, _arguments: js.Array[_], additionalLocations: js.Array[Location]): Diagnostic = js.native
  def duplicateIdentifierDiagnosticFromAST(ast: AST, identifier: String, additionalLocationAST: AST): Diagnostic = js.native
  def fileNames(): js.Array[String] = js.native
  def findAmbientExternalModuleInGlobalContext(id: String): PullContainerSymbol = js.native
  def findDecls(declPath: js.Array[String], declKind: PullElementKind): js.Array[PullDecl] = js.native
  def findDeclsFromPath(declPath: js.Array[PullDecl], declKind: PullElementKind): js.Array[PullDecl] = js.native
  def findExternalModule(id: String): PullContainerSymbol = js.native
  def findSymbol(declPath: js.Array[String], declType: PullElementKind): PullSymbol = js.native
  def findTopLevelSymbol(name: String, kind: PullElementKind, doNotGoPastThisDecl: PullDecl): PullSymbol = js.native
  /* private */ def findTopLevelSymbolInDecl(topLevelDecl: js.Any, name: js.Any, kind: js.Any, doNotGoPastThisDecl: js.Any): js.Any = js.native
  def getASTForDecl(decl: PullDecl): AST = js.native
  def getAliasSymbolForAST(ast: AST): PullTypeAliasSymbol = js.native
  def getBinder(): PullSymbolBinder = js.native
  def getCallResolutionDataForAST(ast: AST): PullAdditionalCallResolutionData = js.native
  def getDeclForAST(ast: AST): PullDecl = js.native
  /* private */ def getDeclPathCacheID(declPath: js.Any, declKind: js.Any): js.Any = js.native
  def getDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  def getDocument(fileName: String): Document = js.native
  def getEnclosingDecl(ast: AST): PullDecl = js.native
  def getResolver(): PullTypeResolver = js.native
  def getSignatureSymbolForDecl(decl: PullDecl): PullSignatureSymbol = js.native
  def getSymbolForAST(ast: AST): PullSymbol = js.native
  def getSymbolForDecl(decl: PullDecl): PullSymbol = js.native
  def invalidate(): Unit = js.native
  def invalidate(oldSettings: ImmutableCompilationSettings): Unit = js.native
  def invalidate(oldSettings: ImmutableCompilationSettings, newSettings: ImmutableCompilationSettings): Unit = js.native
  def lineMap(fileName: String): LineMap = js.native
  def locationFromAST(ast: AST): Location = js.native
  def removeDocument(fileName: String): Unit = js.native
  /* private */ def resetGlobalSymbols(): js.Any = js.native
  def setASTForDecl(decl: PullDecl, ast: AST): Unit = js.native
  def setAliasSymbolForAST(ast: AST, symbol: PullTypeAliasSymbol): Unit = js.native
  def setCallResolutionDataForAST(ast: AST, callResolutionData: PullAdditionalCallResolutionData): Unit = js.native
  def setDeclForAST(ast: AST, decl: PullDecl): Unit = js.native
  def setSignatureSymbolForDecl(decl: PullDecl, signatureSymbol: PullSignatureSymbol): Unit = js.native
  def setSymbolForAST(ast: AST, symbol: PullSymbol): Unit = js.native
  def setSymbolForDecl(decl: PullDecl, symbol: PullSymbol): Unit = js.native
  /* private */ def settingsChangeAffectsSyntax(before: js.Any, after: js.Any): js.Any = js.native
  def topLevelDecl(fileName: String): PullDecl = js.native
  def topLevelDecls(): js.Array[PullDecl] = js.native
}

