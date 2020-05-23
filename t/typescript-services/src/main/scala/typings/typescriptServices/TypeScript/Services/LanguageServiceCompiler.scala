package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.AST
import typings.typescriptServices.TypeScript.Diagnostic
import typings.typescriptServices.TypeScript.Document
import typings.typescriptServices.TypeScript.EmitOutput
import typings.typescriptServices.TypeScript.IScriptSnapshot
import typings.typescriptServices.TypeScript.ImmutableCompilationSettings
import typings.typescriptServices.TypeScript.PullCallSymbolInfo
import typings.typescriptServices.TypeScript.PullDecl
import typings.typescriptServices.TypeScript.PullSymbolInfo
import typings.typescriptServices.TypeScript.PullVisibleSymbolsInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageServiceCompiler extends js.Object {
  var compiler: js.Any
  var host: js.Any
  var hostCache: js.Any
  var logger: js.Any
  def canEmitDeclarations(fileName: String): Boolean
  def cleanupSemanticCache(): Unit
  def compilationSettings(): ImmutableCompilationSettings
  def emit(fileName: String, resolvePath: js.Function1[/* path */ String, String]): EmitOutput
  def emitDeclarations(fileName: String, resolvePath: js.Function1[/* path */ String, String]): EmitOutput
  def fileNames(): js.Array[String]
  def getCachedHostFileName(fileName: String): String
  def getCachedTopLevelDeclaration(fileName: String): PullDecl
  def getCallInformationFromAST(ast: AST, document: Document): PullCallSymbolInfo
  def getCompilerOptionsDiagnostics(resolvePath: js.Function1[/* path */ String, String]): js.Array[Diagnostic]
  def getContextualMembersFromAST(ast: AST, document: Document): PullVisibleSymbolsInfo
  def getDeclForAST(ast: AST): PullDecl
  def getDocument(fileName: String): Document
  def getScriptSnapshot(fileName: String): IScriptSnapshot
  def getSemanticDiagnostics(fileName: String): js.Array[Diagnostic]
  def getSymbolInformationFromAST(ast: AST, document: Document): PullSymbolInfo
  def getSyntacticDiagnostics(fileName: String): js.Array[Diagnostic]
  def getVisibleDeclsFromAST(ast: AST, document: Document): js.Array[PullDecl]
  def getVisibleMemberSymbolsFromAST(ast: AST, document: Document): PullVisibleSymbolsInfo
  def pullGetDeclInformation(decl: PullDecl, ast: AST, document: Document): PullSymbolInfo
  /* private */ def synchronizeHostData(): js.Any
  /* private */ def synchronizeHostDataWorker(): js.Any
  def topLevelDeclaration(fileName: String): PullDecl
  /* private */ def tryUpdateFile(compiler: js.Any, fileName: js.Any): js.Any
}

object LanguageServiceCompiler {
  @scala.inline
  def apply(
    canEmitDeclarations: String => Boolean,
    cleanupSemanticCache: () => Unit,
    compilationSettings: () => ImmutableCompilationSettings,
    compiler: js.Any,
    emit: (String, js.Function1[/* path */ String, String]) => EmitOutput,
    emitDeclarations: (String, js.Function1[/* path */ String, String]) => EmitOutput,
    fileNames: () => js.Array[String],
    getCachedHostFileName: String => String,
    getCachedTopLevelDeclaration: String => PullDecl,
    getCallInformationFromAST: (AST, Document) => PullCallSymbolInfo,
    getCompilerOptionsDiagnostics: js.Function1[/* path */ String, String] => js.Array[Diagnostic],
    getContextualMembersFromAST: (AST, Document) => PullVisibleSymbolsInfo,
    getDeclForAST: AST => PullDecl,
    getDocument: String => Document,
    getScriptSnapshot: String => IScriptSnapshot,
    getSemanticDiagnostics: String => js.Array[Diagnostic],
    getSymbolInformationFromAST: (AST, Document) => PullSymbolInfo,
    getSyntacticDiagnostics: String => js.Array[Diagnostic],
    getVisibleDeclsFromAST: (AST, Document) => js.Array[PullDecl],
    getVisibleMemberSymbolsFromAST: (AST, Document) => PullVisibleSymbolsInfo,
    host: js.Any,
    hostCache: js.Any,
    logger: js.Any,
    pullGetDeclInformation: (PullDecl, AST, Document) => PullSymbolInfo,
    synchronizeHostData: () => js.Any,
    synchronizeHostDataWorker: () => js.Any,
    topLevelDeclaration: String => PullDecl,
    tryUpdateFile: (js.Any, js.Any) => js.Any
  ): LanguageServiceCompiler = {
    val __obj = js.Dynamic.literal(canEmitDeclarations = js.Any.fromFunction1(canEmitDeclarations), cleanupSemanticCache = js.Any.fromFunction0(cleanupSemanticCache), compilationSettings = js.Any.fromFunction0(compilationSettings), compiler = compiler.asInstanceOf[js.Any], emit = js.Any.fromFunction2(emit), emitDeclarations = js.Any.fromFunction2(emitDeclarations), fileNames = js.Any.fromFunction0(fileNames), getCachedHostFileName = js.Any.fromFunction1(getCachedHostFileName), getCachedTopLevelDeclaration = js.Any.fromFunction1(getCachedTopLevelDeclaration), getCallInformationFromAST = js.Any.fromFunction2(getCallInformationFromAST), getCompilerOptionsDiagnostics = js.Any.fromFunction1(getCompilerOptionsDiagnostics), getContextualMembersFromAST = js.Any.fromFunction2(getContextualMembersFromAST), getDeclForAST = js.Any.fromFunction1(getDeclForAST), getDocument = js.Any.fromFunction1(getDocument), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), getSemanticDiagnostics = js.Any.fromFunction1(getSemanticDiagnostics), getSymbolInformationFromAST = js.Any.fromFunction2(getSymbolInformationFromAST), getSyntacticDiagnostics = js.Any.fromFunction1(getSyntacticDiagnostics), getVisibleDeclsFromAST = js.Any.fromFunction2(getVisibleDeclsFromAST), getVisibleMemberSymbolsFromAST = js.Any.fromFunction2(getVisibleMemberSymbolsFromAST), host = host.asInstanceOf[js.Any], hostCache = hostCache.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], pullGetDeclInformation = js.Any.fromFunction3(pullGetDeclInformation), synchronizeHostData = js.Any.fromFunction0(synchronizeHostData), synchronizeHostDataWorker = js.Any.fromFunction0(synchronizeHostDataWorker), topLevelDeclaration = js.Any.fromFunction1(topLevelDeclaration), tryUpdateFile = js.Any.fromFunction2(tryUpdateFile))
    __obj.asInstanceOf[LanguageServiceCompiler]
  }
}

