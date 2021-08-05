package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  /* private */ var _amdDependencies: js.Any
  
  /* private */ var _astDeclMap: js.Any
  
  /* private */ var _bloomFilter: js.Any
  
  /* private */ var _compiler: js.Any
  
  /* private */ var _declASTMap: js.Any
  
  /* private */ var _diagnostics: js.Any
  
  /* private */ var _externalModuleIndicatorSpan: js.Any
  
  def _getASTForDecl(decl: PullDecl): AST
  
  def _getDeclForAST(ast: AST): PullDecl
  
  /* private */ var _lineMap: js.Any
  
  /* private */ var _scriptSnapshot: js.Any
  
  /* private */ var _semanticInfoChain: js.Any
  
  def _setASTForDecl(decl: PullDecl, ast: AST): Unit
  
  def _setDeclForAST(ast: AST, decl: PullDecl): Unit
  
  /* private */ var _sourceUnit: js.Any
  
  /* private */ var _syntaxTree: js.Any
  
  /* private */ var _topLevelDecl: js.Any
  
  def amdDependencies(): js.Array[String]
  
  def bloomFilter(): BloomFilter
  
  var byteOrderMark: ByteOrderMark
  
  /* private */ def cacheSyntaxTreeInfo(syntaxTree: js.Any): js.Any
  
  def diagnostics(): js.Array[Diagnostic]
  
  def emitToOwnOutputFile(): Boolean
  
  def externalModuleIndicatorSpan(): TextSpan
  
  var fileName: String
  
  /* private */ def getAmdDependency(comment: js.Any): js.Any
  
  def getEnclosingDecl(ast: AST): PullDecl
  
  /* private */ def getImplicitImportSpan(sourceUnitLeadingTrivia: js.Any): js.Any
  
  /* private */ def getImplicitImportSpanWorker(trivia: js.Any, position: js.Any): js.Any
  
  /* private */ def getTopLevelImportOrExportSpan(node: js.Any): js.Any
  
  def invalidate(): Unit
  
  def isDeclareFile(): Boolean
  
  def isExternalModule(): Boolean
  
  var isOpen: Boolean
  
  def lineMap(): LineMap
  
  var referencedFiles: js.Array[String]
  
  def sourceUnit(): SourceUnit
  
  def syntaxTree(): SyntaxTree
  
  def topLevelDecl(): PullDecl
  
  def update(
    scriptSnapshot: IScriptSnapshot,
    version: Double,
    isOpen: Boolean,
    textChangeRange: TextChangeRange
  ): Document
  
  var version: Double
}
object Document {
  
  inline def apply(
    _amdDependencies: js.Any,
    _astDeclMap: js.Any,
    _bloomFilter: js.Any,
    _compiler: js.Any,
    _declASTMap: js.Any,
    _diagnostics: js.Any,
    _externalModuleIndicatorSpan: js.Any,
    _getASTForDecl: PullDecl => AST,
    _getDeclForAST: AST => PullDecl,
    _lineMap: js.Any,
    _scriptSnapshot: js.Any,
    _semanticInfoChain: js.Any,
    _setASTForDecl: (PullDecl, AST) => Unit,
    _setDeclForAST: (AST, PullDecl) => Unit,
    _sourceUnit: js.Any,
    _syntaxTree: js.Any,
    _topLevelDecl: js.Any,
    amdDependencies: () => js.Array[String],
    bloomFilter: () => BloomFilter,
    byteOrderMark: ByteOrderMark,
    cacheSyntaxTreeInfo: js.Any => js.Any,
    diagnostics: () => js.Array[Diagnostic],
    emitToOwnOutputFile: () => Boolean,
    externalModuleIndicatorSpan: () => TextSpan,
    fileName: String,
    getAmdDependency: js.Any => js.Any,
    getEnclosingDecl: AST => PullDecl,
    getImplicitImportSpan: js.Any => js.Any,
    getImplicitImportSpanWorker: (js.Any, js.Any) => js.Any,
    getTopLevelImportOrExportSpan: js.Any => js.Any,
    invalidate: () => Unit,
    isDeclareFile: () => Boolean,
    isExternalModule: () => Boolean,
    isOpen: Boolean,
    lineMap: () => LineMap,
    referencedFiles: js.Array[String],
    sourceUnit: () => SourceUnit,
    syntaxTree: () => SyntaxTree,
    topLevelDecl: () => PullDecl,
    update: (IScriptSnapshot, Double, Boolean, TextChangeRange) => Document,
    version: Double
  ): Document = {
    val __obj = js.Dynamic.literal(_amdDependencies = _amdDependencies.asInstanceOf[js.Any], _astDeclMap = _astDeclMap.asInstanceOf[js.Any], _bloomFilter = _bloomFilter.asInstanceOf[js.Any], _compiler = _compiler.asInstanceOf[js.Any], _declASTMap = _declASTMap.asInstanceOf[js.Any], _diagnostics = _diagnostics.asInstanceOf[js.Any], _externalModuleIndicatorSpan = _externalModuleIndicatorSpan.asInstanceOf[js.Any], _getASTForDecl = js.Any.fromFunction1(_getASTForDecl), _getDeclForAST = js.Any.fromFunction1(_getDeclForAST), _lineMap = _lineMap.asInstanceOf[js.Any], _scriptSnapshot = _scriptSnapshot.asInstanceOf[js.Any], _semanticInfoChain = _semanticInfoChain.asInstanceOf[js.Any], _setASTForDecl = js.Any.fromFunction2(_setASTForDecl), _setDeclForAST = js.Any.fromFunction2(_setDeclForAST), _sourceUnit = _sourceUnit.asInstanceOf[js.Any], _syntaxTree = _syntaxTree.asInstanceOf[js.Any], _topLevelDecl = _topLevelDecl.asInstanceOf[js.Any], amdDependencies = js.Any.fromFunction0(amdDependencies), bloomFilter = js.Any.fromFunction0(bloomFilter), byteOrderMark = byteOrderMark.asInstanceOf[js.Any], cacheSyntaxTreeInfo = js.Any.fromFunction1(cacheSyntaxTreeInfo), diagnostics = js.Any.fromFunction0(diagnostics), emitToOwnOutputFile = js.Any.fromFunction0(emitToOwnOutputFile), externalModuleIndicatorSpan = js.Any.fromFunction0(externalModuleIndicatorSpan), fileName = fileName.asInstanceOf[js.Any], getAmdDependency = js.Any.fromFunction1(getAmdDependency), getEnclosingDecl = js.Any.fromFunction1(getEnclosingDecl), getImplicitImportSpan = js.Any.fromFunction1(getImplicitImportSpan), getImplicitImportSpanWorker = js.Any.fromFunction2(getImplicitImportSpanWorker), getTopLevelImportOrExportSpan = js.Any.fromFunction1(getTopLevelImportOrExportSpan), invalidate = js.Any.fromFunction0(invalidate), isDeclareFile = js.Any.fromFunction0(isDeclareFile), isExternalModule = js.Any.fromFunction0(isExternalModule), isOpen = isOpen.asInstanceOf[js.Any], lineMap = js.Any.fromFunction0(lineMap), referencedFiles = referencedFiles.asInstanceOf[js.Any], sourceUnit = js.Any.fromFunction0(sourceUnit), syntaxTree = js.Any.fromFunction0(syntaxTree), topLevelDecl = js.Any.fromFunction0(topLevelDecl), update = js.Any.fromFunction4(update), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  
  extension [Self <: Document](x: Self) {
    
    inline def setAmdDependencies(value: () => js.Array[String]): Self = StObject.set(x, "amdDependencies", js.Any.fromFunction0(value))
    
    inline def setBloomFilter(value: () => BloomFilter): Self = StObject.set(x, "bloomFilter", js.Any.fromFunction0(value))
    
    inline def setByteOrderMark(value: ByteOrderMark): Self = StObject.set(x, "byteOrderMark", value.asInstanceOf[js.Any])
    
    inline def setCacheSyntaxTreeInfo(value: js.Any => js.Any): Self = StObject.set(x, "cacheSyntaxTreeInfo", js.Any.fromFunction1(value))
    
    inline def setDiagnostics(value: () => js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", js.Any.fromFunction0(value))
    
    inline def setEmitToOwnOutputFile(value: () => Boolean): Self = StObject.set(x, "emitToOwnOutputFile", js.Any.fromFunction0(value))
    
    inline def setExternalModuleIndicatorSpan(value: () => TextSpan): Self = StObject.set(x, "externalModuleIndicatorSpan", js.Any.fromFunction0(value))
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setGetAmdDependency(value: js.Any => js.Any): Self = StObject.set(x, "getAmdDependency", js.Any.fromFunction1(value))
    
    inline def setGetEnclosingDecl(value: AST => PullDecl): Self = StObject.set(x, "getEnclosingDecl", js.Any.fromFunction1(value))
    
    inline def setGetImplicitImportSpan(value: js.Any => js.Any): Self = StObject.set(x, "getImplicitImportSpan", js.Any.fromFunction1(value))
    
    inline def setGetImplicitImportSpanWorker(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "getImplicitImportSpanWorker", js.Any.fromFunction2(value))
    
    inline def setGetTopLevelImportOrExportSpan(value: js.Any => js.Any): Self = StObject.set(x, "getTopLevelImportOrExportSpan", js.Any.fromFunction1(value))
    
    inline def setInvalidate(value: () => Unit): Self = StObject.set(x, "invalidate", js.Any.fromFunction0(value))
    
    inline def setIsDeclareFile(value: () => Boolean): Self = StObject.set(x, "isDeclareFile", js.Any.fromFunction0(value))
    
    inline def setIsExternalModule(value: () => Boolean): Self = StObject.set(x, "isExternalModule", js.Any.fromFunction0(value))
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setLineMap(value: () => LineMap): Self = StObject.set(x, "lineMap", js.Any.fromFunction0(value))
    
    inline def setReferencedFiles(value: js.Array[String]): Self = StObject.set(x, "referencedFiles", value.asInstanceOf[js.Any])
    
    inline def setReferencedFilesVarargs(value: String*): Self = StObject.set(x, "referencedFiles", js.Array(value :_*))
    
    inline def setSourceUnit(value: () => SourceUnit): Self = StObject.set(x, "sourceUnit", js.Any.fromFunction0(value))
    
    inline def setSyntaxTree(value: () => SyntaxTree): Self = StObject.set(x, "syntaxTree", js.Any.fromFunction0(value))
    
    inline def setTopLevelDecl(value: () => PullDecl): Self = StObject.set(x, "topLevelDecl", js.Any.fromFunction0(value))
    
    inline def setUpdate(value: (IScriptSnapshot, Double, Boolean, TextChangeRange) => Document): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def set_amdDependencies(value: js.Any): Self = StObject.set(x, "_amdDependencies", value.asInstanceOf[js.Any])
    
    inline def set_astDeclMap(value: js.Any): Self = StObject.set(x, "_astDeclMap", value.asInstanceOf[js.Any])
    
    inline def set_bloomFilter(value: js.Any): Self = StObject.set(x, "_bloomFilter", value.asInstanceOf[js.Any])
    
    inline def set_compiler(value: js.Any): Self = StObject.set(x, "_compiler", value.asInstanceOf[js.Any])
    
    inline def set_declASTMap(value: js.Any): Self = StObject.set(x, "_declASTMap", value.asInstanceOf[js.Any])
    
    inline def set_diagnostics(value: js.Any): Self = StObject.set(x, "_diagnostics", value.asInstanceOf[js.Any])
    
    inline def set_externalModuleIndicatorSpan(value: js.Any): Self = StObject.set(x, "_externalModuleIndicatorSpan", value.asInstanceOf[js.Any])
    
    inline def set_getASTForDecl(value: PullDecl => AST): Self = StObject.set(x, "_getASTForDecl", js.Any.fromFunction1(value))
    
    inline def set_getDeclForAST(value: AST => PullDecl): Self = StObject.set(x, "_getDeclForAST", js.Any.fromFunction1(value))
    
    inline def set_lineMap(value: js.Any): Self = StObject.set(x, "_lineMap", value.asInstanceOf[js.Any])
    
    inline def set_scriptSnapshot(value: js.Any): Self = StObject.set(x, "_scriptSnapshot", value.asInstanceOf[js.Any])
    
    inline def set_semanticInfoChain(value: js.Any): Self = StObject.set(x, "_semanticInfoChain", value.asInstanceOf[js.Any])
    
    inline def set_setASTForDecl(value: (PullDecl, AST) => Unit): Self = StObject.set(x, "_setASTForDecl", js.Any.fromFunction2(value))
    
    inline def set_setDeclForAST(value: (AST, PullDecl) => Unit): Self = StObject.set(x, "_setDeclForAST", js.Any.fromFunction2(value))
    
    inline def set_sourceUnit(value: js.Any): Self = StObject.set(x, "_sourceUnit", value.asInstanceOf[js.Any])
    
    inline def set_syntaxTree(value: js.Any): Self = StObject.set(x, "_syntaxTree", value.asInstanceOf[js.Any])
    
    inline def set_topLevelDecl(value: js.Any): Self = StObject.set(x, "_topLevelDecl", value.asInstanceOf[js.Any])
  }
}
