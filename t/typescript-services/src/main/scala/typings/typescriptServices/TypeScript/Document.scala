package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Document")
@js.native
class Document protected () extends js.Object {
  def this(
    _compiler: TypeScriptCompiler,
    _semanticInfoChain: SemanticInfoChain,
    fileName: String,
    referencedFiles: js.Array[String],
    _scriptSnapshot: IScriptSnapshot,
    byteOrderMark: ByteOrderMark,
    version: Double,
    isOpen: Boolean,
    _syntaxTree: SyntaxTree,
    _topLevelDecl: PullDecl
  ) = this()
  var _amdDependencies: js.Any = js.native
  var _astDeclMap: js.Any = js.native
  var _bloomFilter: js.Any = js.native
  var _compiler: js.Any = js.native
  var _declASTMap: js.Any = js.native
  var _diagnostics: js.Any = js.native
  var _externalModuleIndicatorSpan: js.Any = js.native
  var _lineMap: js.Any = js.native
  var _scriptSnapshot: js.Any = js.native
  var _semanticInfoChain: js.Any = js.native
  var _sourceUnit: js.Any = js.native
  var _syntaxTree: js.Any = js.native
  var _topLevelDecl: js.Any = js.native
  var byteOrderMark: ByteOrderMark = js.native
  var fileName: String = js.native
  var isOpen: Boolean = js.native
  var referencedFiles: js.Array[String] = js.native
  var version: Double = js.native
  def _getASTForDecl(decl: PullDecl): AST = js.native
  def _getDeclForAST(ast: AST): PullDecl = js.native
  def _setASTForDecl(decl: PullDecl, ast: AST): Unit = js.native
  def _setDeclForAST(ast: AST, decl: PullDecl): Unit = js.native
  def amdDependencies(): js.Array[String] = js.native
  def bloomFilter(): BloomFilter = js.native
  /* private */ def cacheSyntaxTreeInfo(syntaxTree: js.Any): js.Any = js.native
  def diagnostics(): js.Array[Diagnostic] = js.native
  def emitToOwnOutputFile(): Boolean = js.native
  def externalModuleIndicatorSpan(): TextSpan = js.native
  /* private */ def getAmdDependency(comment: js.Any): js.Any = js.native
  def getEnclosingDecl(ast: AST): PullDecl = js.native
  /* private */ def getImplicitImportSpan(sourceUnitLeadingTrivia: js.Any): js.Any = js.native
  /* private */ def getImplicitImportSpanWorker(trivia: js.Any, position: js.Any): js.Any = js.native
  /* private */ def getTopLevelImportOrExportSpan(node: js.Any): js.Any = js.native
  def invalidate(): Unit = js.native
  def isDeclareFile(): Boolean = js.native
  def isExternalModule(): Boolean = js.native
  def lineMap(): LineMap = js.native
  def sourceUnit(): SourceUnit = js.native
  def syntaxTree(): SyntaxTree = js.native
  def topLevelDecl(): PullDecl = js.native
  def update(
    scriptSnapshot: IScriptSnapshot,
    version: Double,
    isOpen: Boolean,
    textChangeRange: TextChangeRange
  ): Document = js.native
}

/* static members */
@JSGlobal("TypeScript.Document")
@js.native
object Document extends js.Object {
  def create(
    compiler: TypeScriptCompiler,
    semanticInfoChain: SemanticInfoChain,
    fileName: String,
    scriptSnapshot: IScriptSnapshot,
    byteOrderMark: ByteOrderMark,
    version: Double,
    isOpen: Boolean,
    referencedFiles: js.Array[String]
  ): Document = js.native
}

