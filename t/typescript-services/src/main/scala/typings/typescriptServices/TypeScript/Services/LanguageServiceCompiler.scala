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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageServiceCompiler extends StObject {
  
  def canEmitDeclarations(fileName: String): Boolean = js.native
  
  def cleanupSemanticCache(): Unit = js.native
  
  def compilationSettings(): ImmutableCompilationSettings = js.native
  
  var compiler: js.Any = js.native
  
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
  
  var host: js.Any = js.native
  
  var hostCache: js.Any = js.native
  
  var logger: js.Any = js.native
  
  def pullGetDeclInformation(decl: PullDecl, ast: AST, document: Document): PullSymbolInfo = js.native
  
  /* private */ def synchronizeHostData(): js.Any = js.native
  
  /* private */ def synchronizeHostDataWorker(): js.Any = js.native
  
  def topLevelDeclaration(fileName: String): PullDecl = js.native
  
  /* private */ def tryUpdateFile(compiler: js.Any, fileName: js.Any): js.Any = js.native
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
  
  @scala.inline
  implicit class LanguageServiceCompilerMutableBuilder[Self <: LanguageServiceCompiler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanEmitDeclarations(value: String => Boolean): Self = StObject.set(x, "canEmitDeclarations", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCleanupSemanticCache(value: () => Unit): Self = StObject.set(x, "cleanupSemanticCache", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompilationSettings(value: () => ImmutableCompilationSettings): Self = StObject.set(x, "compilationSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompiler(value: js.Any): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmit(value: (String, js.Function1[/* path */ String, String]) => EmitOutput): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEmitDeclarations(value: (String, js.Function1[/* path */ String, String]) => EmitOutput): Self = StObject.set(x, "emitDeclarations", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFileNames(value: () => js.Array[String]): Self = StObject.set(x, "fileNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCachedHostFileName(value: String => String): Self = StObject.set(x, "getCachedHostFileName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCachedTopLevelDeclaration(value: String => PullDecl): Self = StObject.set(x, "getCachedTopLevelDeclaration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCallInformationFromAST(value: (AST, Document) => PullCallSymbolInfo): Self = StObject.set(x, "getCallInformationFromAST", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetCompilerOptionsDiagnostics(value: js.Function1[/* path */ String, String] => js.Array[Diagnostic]): Self = StObject.set(x, "getCompilerOptionsDiagnostics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetContextualMembersFromAST(value: (AST, Document) => PullVisibleSymbolsInfo): Self = StObject.set(x, "getContextualMembersFromAST", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDeclForAST(value: AST => PullDecl): Self = StObject.set(x, "getDeclForAST", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDocument(value: String => Document): Self = StObject.set(x, "getDocument", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetScriptSnapshot(value: String => IScriptSnapshot): Self = StObject.set(x, "getScriptSnapshot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSemanticDiagnostics(value: String => js.Array[Diagnostic]): Self = StObject.set(x, "getSemanticDiagnostics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSymbolInformationFromAST(value: (AST, Document) => PullSymbolInfo): Self = StObject.set(x, "getSymbolInformationFromAST", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetSyntacticDiagnostics(value: String => js.Array[Diagnostic]): Self = StObject.set(x, "getSyntacticDiagnostics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVisibleDeclsFromAST(value: (AST, Document) => js.Array[PullDecl]): Self = StObject.set(x, "getVisibleDeclsFromAST", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetVisibleMemberSymbolsFromAST(value: (AST, Document) => PullVisibleSymbolsInfo): Self = StObject.set(x, "getVisibleMemberSymbolsFromAST", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHost(value: js.Any): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostCache(value: js.Any): Self = StObject.set(x, "hostCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogger(value: js.Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullGetDeclInformation(value: (PullDecl, AST, Document) => PullSymbolInfo): Self = StObject.set(x, "pullGetDeclInformation", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSynchronizeHostData(value: () => js.Any): Self = StObject.set(x, "synchronizeHostData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSynchronizeHostDataWorker(value: () => js.Any): Self = StObject.set(x, "synchronizeHostDataWorker", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTopLevelDeclaration(value: String => PullDecl): Self = StObject.set(x, "topLevelDeclaration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTryUpdateFile(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "tryUpdateFile", js.Any.fromFunction2(value))
  }
}
