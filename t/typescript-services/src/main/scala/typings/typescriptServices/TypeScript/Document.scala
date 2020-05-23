package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  var _amdDependencies: js.Any
  var _astDeclMap: js.Any
  var _bloomFilter: js.Any
  var _compiler: js.Any
  var _declASTMap: js.Any
  var _diagnostics: js.Any
  var _externalModuleIndicatorSpan: js.Any
  var _lineMap: js.Any
  var _scriptSnapshot: js.Any
  var _semanticInfoChain: js.Any
  var _sourceUnit: js.Any
  var _syntaxTree: js.Any
  var _topLevelDecl: js.Any
  var byteOrderMark: ByteOrderMark
  var fileName: String
  var isOpen: Boolean
  var referencedFiles: js.Array[String]
  var version: Double
  def _getASTForDecl(decl: PullDecl): AST
  def _getDeclForAST(ast: AST): PullDecl
  def _setASTForDecl(decl: PullDecl, ast: AST): Unit
  def _setDeclForAST(ast: AST, decl: PullDecl): Unit
  def amdDependencies(): js.Array[String]
  def bloomFilter(): BloomFilter
  /* private */ def cacheSyntaxTreeInfo(syntaxTree: js.Any): js.Any
  def diagnostics(): js.Array[Diagnostic]
  def emitToOwnOutputFile(): Boolean
  def externalModuleIndicatorSpan(): TextSpan
  /* private */ def getAmdDependency(comment: js.Any): js.Any
  def getEnclosingDecl(ast: AST): PullDecl
  /* private */ def getImplicitImportSpan(sourceUnitLeadingTrivia: js.Any): js.Any
  /* private */ def getImplicitImportSpanWorker(trivia: js.Any, position: js.Any): js.Any
  /* private */ def getTopLevelImportOrExportSpan(node: js.Any): js.Any
  def invalidate(): Unit
  def isDeclareFile(): Boolean
  def isExternalModule(): Boolean
  def lineMap(): LineMap
  def sourceUnit(): SourceUnit
  def syntaxTree(): SyntaxTree
  def topLevelDecl(): PullDecl
  def update(
    scriptSnapshot: IScriptSnapshot,
    version: Double,
    isOpen: Boolean,
    textChangeRange: TextChangeRange
  ): Document
}

object Document {
  @scala.inline
  def apply(
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
}

