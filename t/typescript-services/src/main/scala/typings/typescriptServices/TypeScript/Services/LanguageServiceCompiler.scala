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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageServiceCompiler extends StObject {
  
  def canEmitDeclarations(fileName: String): Boolean
  
  def cleanupSemanticCache(): Unit
  
  def compilationSettings(): ImmutableCompilationSettings
  
  /* private */ var compiler: Any
  
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
  
  /* private */ var host: Any
  
  /* private */ var hostCache: Any
  
  /* private */ var logger: Any
  
  def pullGetDeclInformation(decl: PullDecl, ast: AST, document: Document): PullSymbolInfo
  
  /* private */ def synchronizeHostData(): Any
  
  /* private */ def synchronizeHostDataWorker(): Any
  
  def topLevelDeclaration(fileName: String): PullDecl
  
  /* private */ def tryUpdateFile(compiler: Any, fileName: Any): Any
}
object LanguageServiceCompiler {
  
  inline def apply(
    canEmitDeclarations: String => Boolean,
    cleanupSemanticCache: () => Unit,
    compilationSettings: () => ImmutableCompilationSettings,
    compiler: Any,
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
    host: Any,
    hostCache: Any,
    logger: Any,
    pullGetDeclInformation: (PullDecl, AST, Document) => PullSymbolInfo,
    synchronizeHostData: () => Any,
    synchronizeHostDataWorker: () => Any,
    topLevelDeclaration: String => PullDecl,
    tryUpdateFile: (Any, Any) => Any
  ): LanguageServiceCompiler = {
    val __obj = js.Dynamic.literal(canEmitDeclarations = js.Any.fromFunction1(canEmitDeclarations), cleanupSemanticCache = js.Any.fromFunction0(cleanupSemanticCache), compilationSettings = js.Any.fromFunction0(compilationSettings), compiler = compiler.asInstanceOf[js.Any], emit = js.Any.fromFunction2(emit), emitDeclarations = js.Any.fromFunction2(emitDeclarations), fileNames = js.Any.fromFunction0(fileNames), getCachedHostFileName = js.Any.fromFunction1(getCachedHostFileName), getCachedTopLevelDeclaration = js.Any.fromFunction1(getCachedTopLevelDeclaration), getCallInformationFromAST = js.Any.fromFunction2(getCallInformationFromAST), getCompilerOptionsDiagnostics = js.Any.fromFunction1(getCompilerOptionsDiagnostics), getContextualMembersFromAST = js.Any.fromFunction2(getContextualMembersFromAST), getDeclForAST = js.Any.fromFunction1(getDeclForAST), getDocument = js.Any.fromFunction1(getDocument), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), getSemanticDiagnostics = js.Any.fromFunction1(getSemanticDiagnostics), getSymbolInformationFromAST = js.Any.fromFunction2(getSymbolInformationFromAST), getSyntacticDiagnostics = js.Any.fromFunction1(getSyntacticDiagnostics), getVisibleDeclsFromAST = js.Any.fromFunction2(getVisibleDeclsFromAST), getVisibleMemberSymbolsFromAST = js.Any.fromFunction2(getVisibleMemberSymbolsFromAST), host = host.asInstanceOf[js.Any], hostCache = hostCache.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], pullGetDeclInformation = js.Any.fromFunction3(pullGetDeclInformation), synchronizeHostData = js.Any.fromFunction0(synchronizeHostData), synchronizeHostDataWorker = js.Any.fromFunction0(synchronizeHostDataWorker), topLevelDeclaration = js.Any.fromFunction1(topLevelDeclaration), tryUpdateFile = js.Any.fromFunction2(tryUpdateFile))
    __obj.asInstanceOf[LanguageServiceCompiler]
  }
  
  extension [Self <: LanguageServiceCompiler](x: Self) {
    
    inline def setCanEmitDeclarations(value: String => Boolean): Self = StObject.set(x, "canEmitDeclarations", js.Any.fromFunction1(value))
    
    inline def setCleanupSemanticCache(value: () => Unit): Self = StObject.set(x, "cleanupSemanticCache", js.Any.fromFunction0(value))
    
    inline def setCompilationSettings(value: () => ImmutableCompilationSettings): Self = StObject.set(x, "compilationSettings", js.Any.fromFunction0(value))
    
    inline def setCompiler(value: Any): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setEmit(value: (String, js.Function1[/* path */ String, String]) => EmitOutput): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
    
    inline def setEmitDeclarations(value: (String, js.Function1[/* path */ String, String]) => EmitOutput): Self = StObject.set(x, "emitDeclarations", js.Any.fromFunction2(value))
    
    inline def setFileNames(value: () => js.Array[String]): Self = StObject.set(x, "fileNames", js.Any.fromFunction0(value))
    
    inline def setGetCachedHostFileName(value: String => String): Self = StObject.set(x, "getCachedHostFileName", js.Any.fromFunction1(value))
    
    inline def setGetCachedTopLevelDeclaration(value: String => PullDecl): Self = StObject.set(x, "getCachedTopLevelDeclaration", js.Any.fromFunction1(value))
    
    inline def setGetCallInformationFromAST(value: (AST, Document) => PullCallSymbolInfo): Self = StObject.set(x, "getCallInformationFromAST", js.Any.fromFunction2(value))
    
    inline def setGetCompilerOptionsDiagnostics(value: js.Function1[/* path */ String, String] => js.Array[Diagnostic]): Self = StObject.set(x, "getCompilerOptionsDiagnostics", js.Any.fromFunction1(value))
    
    inline def setGetContextualMembersFromAST(value: (AST, Document) => PullVisibleSymbolsInfo): Self = StObject.set(x, "getContextualMembersFromAST", js.Any.fromFunction2(value))
    
    inline def setGetDeclForAST(value: AST => PullDecl): Self = StObject.set(x, "getDeclForAST", js.Any.fromFunction1(value))
    
    inline def setGetDocument(value: String => Document): Self = StObject.set(x, "getDocument", js.Any.fromFunction1(value))
    
    inline def setGetScriptSnapshot(value: String => IScriptSnapshot): Self = StObject.set(x, "getScriptSnapshot", js.Any.fromFunction1(value))
    
    inline def setGetSemanticDiagnostics(value: String => js.Array[Diagnostic]): Self = StObject.set(x, "getSemanticDiagnostics", js.Any.fromFunction1(value))
    
    inline def setGetSymbolInformationFromAST(value: (AST, Document) => PullSymbolInfo): Self = StObject.set(x, "getSymbolInformationFromAST", js.Any.fromFunction2(value))
    
    inline def setGetSyntacticDiagnostics(value: String => js.Array[Diagnostic]): Self = StObject.set(x, "getSyntacticDiagnostics", js.Any.fromFunction1(value))
    
    inline def setGetVisibleDeclsFromAST(value: (AST, Document) => js.Array[PullDecl]): Self = StObject.set(x, "getVisibleDeclsFromAST", js.Any.fromFunction2(value))
    
    inline def setGetVisibleMemberSymbolsFromAST(value: (AST, Document) => PullVisibleSymbolsInfo): Self = StObject.set(x, "getVisibleMemberSymbolsFromAST", js.Any.fromFunction2(value))
    
    inline def setHost(value: Any): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostCache(value: Any): Self = StObject.set(x, "hostCache", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setPullGetDeclInformation(value: (PullDecl, AST, Document) => PullSymbolInfo): Self = StObject.set(x, "pullGetDeclInformation", js.Any.fromFunction3(value))
    
    inline def setSynchronizeHostData(value: () => Any): Self = StObject.set(x, "synchronizeHostData", js.Any.fromFunction0(value))
    
    inline def setSynchronizeHostDataWorker(value: () => Any): Self = StObject.set(x, "synchronizeHostDataWorker", js.Any.fromFunction0(value))
    
    inline def setTopLevelDeclaration(value: String => PullDecl): Self = StObject.set(x, "topLevelDeclaration", js.Any.fromFunction1(value))
    
    inline def setTryUpdateFile(value: (Any, Any) => Any): Self = StObject.set(x, "tryUpdateFile", js.Any.fromFunction2(value))
  }
}
