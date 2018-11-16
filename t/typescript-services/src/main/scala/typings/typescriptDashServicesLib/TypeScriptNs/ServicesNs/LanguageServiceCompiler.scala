package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

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
  def canEmitDeclarations(fileName: java.lang.String): scala.Boolean = js.native
  def cleanupSemanticCache(): scala.Unit = js.native
  def compilationSettings(): typescriptDashServicesLib.TypeScriptNs.ImmutableCompilationSettings = js.native
  def emit(
    fileName: java.lang.String,
    resolvePath: js.Function1[/* path */ java.lang.String, java.lang.String]
  ): typescriptDashServicesLib.TypeScriptNs.EmitOutput = js.native
  def emitDeclarations(
    fileName: java.lang.String,
    resolvePath: js.Function1[/* path */ java.lang.String, java.lang.String]
  ): typescriptDashServicesLib.TypeScriptNs.EmitOutput = js.native
  def fileNames(): js.Array[java.lang.String] = js.native
  def getCachedHostFileName(fileName: java.lang.String): java.lang.String = js.native
  def getCachedTopLevelDeclaration(fileName: java.lang.String): typescriptDashServicesLib.TypeScriptNs.PullDecl = js.native
  def getCallInformationFromAST(
    ast: typescriptDashServicesLib.TypeScriptNs.AST,
    document: typescriptDashServicesLib.TypeScriptNs.Document
  ): typescriptDashServicesLib.TypeScriptNs.PullCallSymbolInfo = js.native
  def getCompilerOptionsDiagnostics(resolvePath: js.Function1[/* path */ java.lang.String, java.lang.String]): js.Array[typescriptDashServicesLib.TypeScriptNs.Diagnostic] = js.native
  def getContextualMembersFromAST(
    ast: typescriptDashServicesLib.TypeScriptNs.AST,
    document: typescriptDashServicesLib.TypeScriptNs.Document
  ): typescriptDashServicesLib.TypeScriptNs.PullVisibleSymbolsInfo = js.native
  def getDeclForAST(ast: typescriptDashServicesLib.TypeScriptNs.AST): typescriptDashServicesLib.TypeScriptNs.PullDecl = js.native
  def getDocument(fileName: java.lang.String): typescriptDashServicesLib.TypeScriptNs.Document = js.native
  def getScriptSnapshot(fileName: java.lang.String): typescriptDashServicesLib.TypeScriptNs.IScriptSnapshot = js.native
  def getSemanticDiagnostics(fileName: java.lang.String): js.Array[typescriptDashServicesLib.TypeScriptNs.Diagnostic] = js.native
  def getSymbolInformationFromAST(
    ast: typescriptDashServicesLib.TypeScriptNs.AST,
    document: typescriptDashServicesLib.TypeScriptNs.Document
  ): typescriptDashServicesLib.TypeScriptNs.PullSymbolInfo = js.native
  def getSyntacticDiagnostics(fileName: java.lang.String): js.Array[typescriptDashServicesLib.TypeScriptNs.Diagnostic] = js.native
  def getVisibleDeclsFromAST(
    ast: typescriptDashServicesLib.TypeScriptNs.AST,
    document: typescriptDashServicesLib.TypeScriptNs.Document
  ): js.Array[typescriptDashServicesLib.TypeScriptNs.PullDecl] = js.native
  def getVisibleMemberSymbolsFromAST(
    ast: typescriptDashServicesLib.TypeScriptNs.AST,
    document: typescriptDashServicesLib.TypeScriptNs.Document
  ): typescriptDashServicesLib.TypeScriptNs.PullVisibleSymbolsInfo = js.native
  def pullGetDeclInformation(
    decl: typescriptDashServicesLib.TypeScriptNs.PullDecl,
    ast: typescriptDashServicesLib.TypeScriptNs.AST,
    document: typescriptDashServicesLib.TypeScriptNs.Document
  ): typescriptDashServicesLib.TypeScriptNs.PullSymbolInfo = js.native
  /* private */ def synchronizeHostData(): js.Any = js.native
  /* private */ def synchronizeHostDataWorker(): js.Any = js.native
  def topLevelDeclaration(fileName: java.lang.String): typescriptDashServicesLib.TypeScriptNs.PullDecl = js.native
  /* private */ def tryUpdateFile(compiler: js.Any, fileName: js.Any): js.Any = js.native
}

