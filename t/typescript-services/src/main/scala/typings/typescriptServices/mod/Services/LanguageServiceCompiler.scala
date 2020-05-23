package typings.typescriptServices.mod.Services

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
import typings.typescriptServices.TypeScript.Services.ILanguageServiceHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.LanguageServiceCompiler")
@js.native
class LanguageServiceCompiler protected ()
  extends typings.typescriptServices.TypeScript.Services.LanguageServiceCompiler {
  def this(host: ILanguageServiceHost) = this()
  /* CompleteClass */
  override var compiler: js.Any = js.native
  /* CompleteClass */
  override var host: js.Any = js.native
  /* CompleteClass */
  override var hostCache: js.Any = js.native
  /* CompleteClass */
  override var logger: js.Any = js.native
  /* CompleteClass */
  override def canEmitDeclarations(fileName: String): Boolean = js.native
  /* CompleteClass */
  override def cleanupSemanticCache(): Unit = js.native
  /* CompleteClass */
  override def compilationSettings(): ImmutableCompilationSettings = js.native
  /* CompleteClass */
  override def emit(fileName: String, resolvePath: js.Function1[/* path */ String, String]): EmitOutput = js.native
  /* CompleteClass */
  override def emitDeclarations(fileName: String, resolvePath: js.Function1[/* path */ String, String]): EmitOutput = js.native
  /* CompleteClass */
  override def fileNames(): js.Array[String] = js.native
  /* CompleteClass */
  override def getCachedHostFileName(fileName: String): String = js.native
  /* CompleteClass */
  override def getCachedTopLevelDeclaration(fileName: String): PullDecl = js.native
  /* CompleteClass */
  override def getCallInformationFromAST(ast: AST, document: Document): PullCallSymbolInfo = js.native
  /* CompleteClass */
  override def getCompilerOptionsDiagnostics(resolvePath: js.Function1[/* path */ String, String]): js.Array[Diagnostic] = js.native
  /* CompleteClass */
  override def getContextualMembersFromAST(ast: AST, document: Document): PullVisibleSymbolsInfo = js.native
  /* CompleteClass */
  override def getDeclForAST(ast: AST): PullDecl = js.native
  /* CompleteClass */
  override def getDocument(fileName: String): Document = js.native
  /* CompleteClass */
  override def getScriptSnapshot(fileName: String): IScriptSnapshot = js.native
  /* CompleteClass */
  override def getSemanticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  /* CompleteClass */
  override def getSymbolInformationFromAST(ast: AST, document: Document): PullSymbolInfo = js.native
  /* CompleteClass */
  override def getSyntacticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  /* CompleteClass */
  override def getVisibleDeclsFromAST(ast: AST, document: Document): js.Array[PullDecl] = js.native
  /* CompleteClass */
  override def getVisibleMemberSymbolsFromAST(ast: AST, document: Document): PullVisibleSymbolsInfo = js.native
  /* CompleteClass */
  override def pullGetDeclInformation(decl: PullDecl, ast: AST, document: Document): PullSymbolInfo = js.native
  /* CompleteClass */
  /* private */ override def synchronizeHostData(): js.Any = js.native
  /* CompleteClass */
  /* private */ override def synchronizeHostDataWorker(): js.Any = js.native
  /* CompleteClass */
  override def topLevelDeclaration(fileName: String): PullDecl = js.native
  /* CompleteClass */
  /* private */ override def tryUpdateFile(compiler: js.Any, fileName: js.Any): js.Any = js.native
}

