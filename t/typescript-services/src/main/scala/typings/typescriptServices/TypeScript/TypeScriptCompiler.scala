package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TypeScriptCompiler")
@js.native
class TypeScriptCompiler () extends js.Object {
  def this(logger: ILogger) = this()
  def this(logger: ILogger, _settings: ImmutableCompilationSettings) = this()
  var _settings: js.Any = js.native
  var logger: ILogger = js.native
  var semanticInfoChain: js.Any = js.native
  def _emitDocument(
    document: Document,
    emitOptions: EmitOptions,
    onSingleFileEmitComplete: js.Function1[/* files */ js.Array[OutputFile], Unit],
    sharedEmitter: Emitter
  ): Emitter = js.native
  def _emitDocumentDeclarations(
    document: Document,
    emitOptions: EmitOptions,
    onSingleFileEmitComplete: js.Function1[/* files */ OutputFile, Unit],
    sharedEmitter: DeclarationEmitter
  ): DeclarationEmitter = js.native
  def _shouldEmit(document: Document): Boolean = js.native
  def _shouldEmitDeclarations(document: Document): Boolean = js.native
  def addFile(
    fileName: String,
    scriptSnapshot: IScriptSnapshot,
    byteOrderMark: ByteOrderMark,
    version: Double,
    isOpen: Boolean
  ): Unit = js.native
  def addFile(
    fileName: String,
    scriptSnapshot: IScriptSnapshot,
    byteOrderMark: ByteOrderMark,
    version: Double,
    isOpen: Boolean,
    referencedFiles: js.Array[String]
  ): Unit = js.native
  def canEmitDeclarations(fileName: String): Boolean = js.native
  def cleanupSemanticCache(): Unit = js.native
  def compilationSettings(): ImmutableCompilationSettings = js.native
  def compile(resolvePath: js.Function1[/* path */ String, String]): Iterator[CompileResult] = js.native
  def compile(resolvePath: js.Function1[/* path */ String, String], continueOnDiagnostics: Boolean): Iterator[CompileResult] = js.native
  def emit(fileName: String, resolvePath: js.Function1[/* path */ String, String]): EmitOutput = js.native
  def emitAll(resolvePath: js.Function1[/* path */ String, String]): EmitOutput = js.native
  def emitAllDeclarations(resolvePath: js.Function1[/* path */ String, String]): EmitOutput = js.native
  def emitDeclarations(fileName: String, resolvePath: js.Function1[/* path */ String, String]): EmitOutput = js.native
  /* private */ def emitDocumentDeclarationsWorker(document: js.Any, emitOptions: js.Any): js.Any = js.native
  /* private */ def emitDocumentDeclarationsWorker(document: js.Any, emitOptions: js.Any, declarationEmitter: js.Any): js.Any = js.native
  /* private */ def emitDocumentWorker(document: js.Any, emitOptions: js.Any): js.Any = js.native
  /* private */ def emitDocumentWorker(document: js.Any, emitOptions: js.Any, emitter: js.Any): js.Any = js.native
  /* private */ def extractResolutionContextForVariable(
    inContextuallyTypedAssignment: js.Any,
    propagateContextualTypes: js.Any,
    resolver: js.Any,
    resolutionContext: js.Any,
    enclosingDecl: js.Any,
    assigningAST: js.Any,
    init: js.Any
  ): js.Any = js.native
  /* private */ def extractResolutionContextFromAST(resolver: js.Any, ast: js.Any, document: js.Any, propagateContextualTypes: js.Any): js.Any = js.native
  def fileNames(): js.Array[String] = js.native
  /* private */ def getASTPath(ast: js.Any): js.Any = js.native
  def getCompilerOptionsDiagnostics(resolvePath: js.Function1[/* path */ String, String]): js.Array[Diagnostic] = js.native
  def getDeclForAST(ast: AST): PullDecl = js.native
  def getDocument(fileName: String): Document = js.native
  def getSemanticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  /* private */ def getSourceUnit(fileName: js.Any): js.Any = js.native
  def getSymbolOfDeclaration(decl: PullDecl): PullSymbol = js.native
  def getSyntacticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  /* private */ def getSyntaxTree(fileName: js.Any): js.Any = js.native
  def mapOutputFileName(
    document: Document,
    emitOptions: EmitOptions,
    extensionChanger: js.Function2[/* fname */ String, /* wholeFileNameReplaced */ Boolean, String]
  ): String = js.native
  def pullGetCallInformationFromAST(ast: AST, document: Document): PullCallSymbolInfo = js.native
  def pullGetContextualMembersFromAST(ast: AST, document: Document): PullVisibleSymbolsInfo = js.native
  def pullGetDeclInformation(decl: PullDecl, ast: AST, document: Document): PullSymbolInfo = js.native
  def pullGetSymbolInformationFromAST(ast: AST, document: Document): PullSymbolInfo = js.native
  def pullGetVisibleDeclsFromAST(ast: AST, document: Document): js.Array[PullDecl] = js.native
  def pullGetVisibleMemberSymbolsFromAST(ast: AST, document: Document): PullVisibleSymbolsInfo = js.native
  def removeFile(fileName: String): Unit = js.native
  def resolveAllFiles(): Unit = js.native
  def setCompilationSettings(newSettings: ImmutableCompilationSettings): Unit = js.native
  def topLevelDecl(fileName: String): PullDecl = js.native
  def topLevelDeclaration(fileName: String): PullDecl = js.native
  def updateFile(
    fileName: String,
    scriptSnapshot: IScriptSnapshot,
    version: Double,
    isOpen: Boolean,
    textChangeRange: TextChangeRange
  ): Unit = js.native
  /* private */ def writeByteOrderMarkForDocument(document: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("TypeScript.TypeScriptCompiler")
@js.native
object TypeScriptCompiler extends js.Object {
  def getFullDiagnosticText(diagnostic: Diagnostic, resolvePath: js.Function1[/* path */ String, String]): String = js.native
  /* private */ def getLocationText(location: js.Any, resolvePath: js.Any): js.Any = js.native
  def mapToDTSFileName(fileName: String, wholeFileNameReplaced: Boolean): String = js.native
  def mapToFileNameExtension(extension: String, fileName: String, wholeFileNameReplaced: Boolean): String = js.native
  def mapToJSFileName(fileName: String, wholeFileNameReplaced: Boolean): String = js.native
}

