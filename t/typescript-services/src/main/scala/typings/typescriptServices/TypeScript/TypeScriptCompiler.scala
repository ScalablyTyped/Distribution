package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeScriptCompiler extends StObject {
  
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
  
  /* private */ var _settings: Any = js.native
  
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
  
  /* private */ def emitDocumentDeclarationsWorker(document: Any, emitOptions: Any, declarationEmitter: Any): Any = js.native
  
  /* private */ def emitDocumentWorker(document: Any, emitOptions: Any, emitter: Any): Any = js.native
  
  /* private */ def extractResolutionContextForVariable(
    inContextuallyTypedAssignment: Any,
    propagateContextualTypes: Any,
    resolver: Any,
    resolutionContext: Any,
    enclosingDecl: Any,
    assigningAST: Any,
    init: Any
  ): Any = js.native
  
  /* private */ def extractResolutionContextFromAST(resolver: Any, ast: Any, document: Any, propagateContextualTypes: Any): Any = js.native
  
  def fileNames(): js.Array[String] = js.native
  
  /* private */ def getASTPath(ast: Any): Any = js.native
  
  def getCompilerOptionsDiagnostics(resolvePath: js.Function1[/* path */ String, String]): js.Array[Diagnostic] = js.native
  
  def getDeclForAST(ast: AST): PullDecl = js.native
  
  def getDocument(fileName: String): Document = js.native
  
  def getSemanticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  
  /* private */ def getSourceUnit(fileName: Any): Any = js.native
  
  def getSymbolOfDeclaration(decl: PullDecl): PullSymbol = js.native
  
  def getSyntacticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  
  /* private */ def getSyntaxTree(fileName: Any): Any = js.native
  
  var logger: ILogger = js.native
  
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
  
  /* private */ var semanticInfoChain: Any = js.native
  
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
  
  /* private */ def writeByteOrderMarkForDocument(document: Any): Any = js.native
}
