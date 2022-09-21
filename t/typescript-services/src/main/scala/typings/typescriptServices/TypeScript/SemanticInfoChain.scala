package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticInfoChain extends StObject {
  
  /* private */ var _binder: Any = js.native
  
  /* private */ var _fileNames: Any = js.native
  
  /* private */ var _resolver: Any = js.native
  
  /* private */ var _topLevelDecls: Any = js.native
  
  def addDiagnostic(diagnostic: Diagnostic): Unit = js.native
  
  def addDiagnosticFromAST(ast: AST, diagnosticKey: String): Unit = js.native
  def addDiagnosticFromAST(ast: AST, diagnosticKey: String, _arguments: js.Array[Any]): Unit = js.native
  def addDiagnosticFromAST(
    ast: AST,
    diagnosticKey: String,
    _arguments: js.Array[Any],
    additionalLocations: js.Array[Location]
  ): Unit = js.native
  def addDiagnosticFromAST(ast: AST, diagnosticKey: String, _arguments: Unit, additionalLocations: js.Array[Location]): Unit = js.native
  
  def addDocument(document: Document): Unit = js.native
  
  def addDuplicateIdentifierDiagnosticFromAST(ast: AST, identifier: String, additionalLocationAST: AST): Unit = js.native
  
  /* private */ def addPrimitiveTypeSymbol(decl: Any): Any = js.native
  
  /* private */ def addPrimitiveValueSymbol(decl: Any, `type`: Any): Any = js.native
  
  def addSyntheticIndexSignature(
    containingDecl: PullDecl,
    containingSymbol: PullTypeSymbol,
    ast: AST,
    indexParamName: String,
    indexParamType: PullTypeSymbol,
    returnType: PullTypeSymbol
  ): Unit = js.native
  
  var anyTypeDecl: PullDecl = js.native
  
  var anyTypeSymbol: PullPrimitiveTypeSymbol = js.native
  
  /* private */ var astAliasSymbolMap: Any = js.native
  
  /* private */ var astCallResolutionDataMap: Any = js.native
  
  /* private */ var astSymbolMap: Any = js.native
  
  /* private */ def bindPrimitiveSymbol[TSymbol /* <: PullSymbol */](decl: Any, newSymbol: Any): Any = js.native
  
  var booleanTypeDecl: PullDecl = js.native
  
  var booleanTypeSymbol: PullPrimitiveTypeSymbol = js.native
  
  def cacheGlobalSymbol(symbol: PullSymbol, kind: PullElementKind): Unit = js.native
  
  /* private */ var compiler: Any = js.native
  
  /* private */ var declCache: Any = js.native
  
  /* private */ var declSignatureSymbolMap: Any = js.native
  
  /* private */ var declSymbolMap: Any = js.native
  
  def diagnosticFromAST(ast: AST, diagnosticKey: String): Diagnostic = js.native
  def diagnosticFromAST(ast: AST, diagnosticKey: String, _arguments: js.Array[Any]): Diagnostic = js.native
  def diagnosticFromAST(
    ast: AST,
    diagnosticKey: String,
    _arguments: js.Array[Any],
    additionalLocations: js.Array[Location]
  ): Diagnostic = js.native
  def diagnosticFromAST(ast: AST, diagnosticKey: String, _arguments: Unit, additionalLocations: js.Array[Location]): Diagnostic = js.native
  
  /* private */ var documents: Any = js.native
  
  def duplicateIdentifierDiagnosticFromAST(ast: AST, identifier: String, additionalLocationAST: AST): Diagnostic = js.native
  
  var emptyTypeSymbol: PullTypeSymbol = js.native
  
  /* private */ var fileNameToDiagnostics: Any = js.native
  
  /* private */ var fileNameToDocument: Any = js.native
  
  def fileNames(): js.Array[String] = js.native
  
  def findAmbientExternalModuleInGlobalContext(id: String): PullContainerSymbol = js.native
  
  def findDecls(declPath: js.Array[String], declKind: PullElementKind): js.Array[PullDecl] = js.native
  
  def findDeclsFromPath(declPath: js.Array[PullDecl], declKind: PullElementKind): js.Array[PullDecl] = js.native
  
  def findExternalModule(id: String): PullContainerSymbol = js.native
  
  def findSymbol(declPath: js.Array[String], declType: PullElementKind): PullSymbol = js.native
  
  def findTopLevelSymbol(name: String, kind: PullElementKind, doNotGoPastThisDecl: PullDecl): PullSymbol = js.native
  
  /* private */ def findTopLevelSymbolInDecl(topLevelDecl: Any, name: Any, kind: Any, doNotGoPastThisDecl: Any): Any = js.native
  
  def getASTForDecl(decl: PullDecl): AST = js.native
  
  def getAliasSymbolForAST(ast: AST): PullTypeAliasSymbol = js.native
  
  def getBinder(): PullSymbolBinder = js.native
  
  def getCallResolutionDataForAST(ast: AST): PullAdditionalCallResolutionData = js.native
  
  def getDeclForAST(ast: AST): PullDecl = js.native
  
  /* private */ def getDeclPathCacheID(declPath: Any, declKind: Any): Any = js.native
  
  def getDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  
  def getDocument(fileName: String): Document = js.native
  
  def getEnclosingDecl(ast: AST): PullDecl = js.native
  
  def getResolver(): PullTypeResolver = js.native
  
  def getSignatureSymbolForDecl(decl: PullDecl): PullSignatureSymbol = js.native
  
  def getSymbolForAST(ast: AST): PullSymbol = js.native
  
  def getSymbolForDecl(decl: PullDecl): PullSymbol = js.native
  
  def invalidate(): Unit = js.native
  def invalidate(oldSettings: Unit, newSettings: ImmutableCompilationSettings): Unit = js.native
  def invalidate(oldSettings: ImmutableCompilationSettings): Unit = js.native
  def invalidate(oldSettings: ImmutableCompilationSettings, newSettings: ImmutableCompilationSettings): Unit = js.native
  
  def lineMap(fileName: String): LineMap = js.native
  
  def locationFromAST(ast: AST): Location = js.native
  
  /* private */ var logger: Any = js.native
  
  var nullTypeDecl: PullDecl = js.native
  
  var nullTypeSymbol: PullPrimitiveTypeSymbol = js.native
  
  var numberTypeDecl: PullDecl = js.native
  
  var numberTypeSymbol: PullPrimitiveTypeSymbol = js.native
  
  def removeDocument(fileName: String): Unit = js.native
  
  /* private */ def resetGlobalSymbols(): Any = js.native
  
  def setASTForDecl(decl: PullDecl, ast: AST): Unit = js.native
  
  def setAliasSymbolForAST(ast: AST, symbol: PullTypeAliasSymbol): Unit = js.native
  
  def setCallResolutionDataForAST(ast: AST, callResolutionData: PullAdditionalCallResolutionData): Unit = js.native
  
  def setDeclForAST(ast: AST, decl: PullDecl): Unit = js.native
  
  def setSignatureSymbolForDecl(decl: PullDecl, signatureSymbol: PullSignatureSymbol): Unit = js.native
  
  def setSymbolForAST(ast: AST, symbol: PullSymbol): Unit = js.native
  
  def setSymbolForDecl(decl: PullDecl, symbol: PullSymbol): Unit = js.native
  
  /* private */ def settingsChangeAffectsSyntax(before: Any, after: Any): Any = js.native
  
  var stringTypeDecl: PullDecl = js.native
  
  var stringTypeSymbol: PullPrimitiveTypeSymbol = js.native
  
  /* private */ var symbolCache: Any = js.native
  
  def topLevelDecl(fileName: String): PullDecl = js.native
  
  def topLevelDecls(): js.Array[PullDecl] = js.native
  
  var undefinedTypeDecl: PullDecl = js.native
  
  var undefinedTypeSymbol: PullPrimitiveTypeSymbol = js.native
  
  var undefinedValueDecl: PullDecl = js.native
  
  var undefinedValueSymbol: PullSymbol = js.native
  
  var voidTypeDecl: PullDecl = js.native
  
  var voidTypeSymbol: PullPrimitiveTypeSymbol = js.native
}
