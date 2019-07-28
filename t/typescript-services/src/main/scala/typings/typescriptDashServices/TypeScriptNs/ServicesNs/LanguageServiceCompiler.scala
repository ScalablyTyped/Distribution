package typings.typescriptDashServices.TypeScriptNs.ServicesNs

import typings.typescriptDashServices.TypeScriptNs.AST
import typings.typescriptDashServices.TypeScriptNs.Diagnostic
import typings.typescriptDashServices.TypeScriptNs.Document
import typings.typescriptDashServices.TypeScriptNs.EmitOutput
import typings.typescriptDashServices.TypeScriptNs.IScriptSnapshot
import typings.typescriptDashServices.TypeScriptNs.ImmutableCompilationSettings
import typings.typescriptDashServices.TypeScriptNs.PullCallSymbolInfo
import typings.typescriptDashServices.TypeScriptNs.PullDecl
import typings.typescriptDashServices.TypeScriptNs.PullSymbolInfo
import typings.typescriptDashServices.TypeScriptNs.PullVisibleSymbolsInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.LanguageServiceCompiler")
@js.native
class LanguageServiceCompiler protected () extends js.Object {
  def this(host: ILanguageServiceHost) = this()
  var compiler: js.Any = js.native
  var host: js.Any = js.native
  var hostCache: js.Any = js.native
  var logger: js.Any = js.native
  def canEmitDeclarations(fileName: String): Boolean = js.native
  def cleanupSemanticCache(): Unit = js.native
  def compilationSettings(): ImmutableCompilationSettings = js.native
  def emit(fileName: String, resolvePath: js.Function1[/* path */ String, String]): EmitOutput = js.native
  def emitDeclarations(fileName: String, resolvePath: js.Function1[/* path */ String, String]): EmitOutput = js.native
  def fileNames(): js.Array[String] = js.native
  def getCachedHostFileName(fileName: String): String = js.native
  def getCachedTopLevelDeclaration(fileName: String): PullDecl = js.native
  def getCallInformationFromAST(ast: AST, document: Document): PullCallSymbolInfo = js.native
  def getCompilerOptionsDiagnostics(resolvePath: js.Function1[/* path */ String, String]): js.Array[Diagnostic] = js.native
  def getContextualMembersFromAST(ast: AST, document: Document): PullVisibleSymbolsInfo = js.native
  def getDeclForAST(ast: AST): PullDecl = js.native
  def getDocument(fileName: String): Document = js.native
  def getScriptSnapshot(fileName: String): IScriptSnapshot = js.native
  def getSemanticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  def getSymbolInformationFromAST(ast: AST, document: Document): PullSymbolInfo = js.native
  def getSyntacticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  def getVisibleDeclsFromAST(ast: AST, document: Document): js.Array[PullDecl] = js.native
  def getVisibleMemberSymbolsFromAST(ast: AST, document: Document): PullVisibleSymbolsInfo = js.native
  def pullGetDeclInformation(decl: PullDecl, ast: AST, document: Document): PullSymbolInfo = js.native
  /* private */ def synchronizeHostData(): js.Any = js.native
  /* private */ def synchronizeHostDataWorker(): js.Any = js.native
  def topLevelDeclaration(fileName: String): PullDecl = js.native
  /* private */ def tryUpdateFile(compiler: js.Any, fileName: js.Any): js.Any = js.native
}

