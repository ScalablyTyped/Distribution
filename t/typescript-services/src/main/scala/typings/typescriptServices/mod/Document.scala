package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Document")
@js.native
class Document protected ()
  extends typings.typescriptServices.TypeScript.Document {
  def this(
    _compiler: typings.typescriptServices.TypeScript.TypeScriptCompiler,
    _semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain,
    fileName: String,
    referencedFiles: js.Array[String],
    _scriptSnapshot: IScriptSnapshot,
    byteOrderMark: typings.typescriptServices.TypeScript.ByteOrderMark,
    version: Double,
    isOpen: Boolean,
    _syntaxTree: typings.typescriptServices.TypeScript.SyntaxTree,
    _topLevelDecl: typings.typescriptServices.TypeScript.PullDecl
  ) = this()
  /* CompleteClass */
  override var _amdDependencies: js.Any = js.native
  /* CompleteClass */
  override var _astDeclMap: js.Any = js.native
  /* CompleteClass */
  override var _bloomFilter: js.Any = js.native
  /* CompleteClass */
  override var _compiler: js.Any = js.native
  /* CompleteClass */
  override var _declASTMap: js.Any = js.native
  /* CompleteClass */
  override var _diagnostics: js.Any = js.native
  /* CompleteClass */
  override var _externalModuleIndicatorSpan: js.Any = js.native
  /* CompleteClass */
  override var _lineMap: js.Any = js.native
  /* CompleteClass */
  override var _scriptSnapshot: js.Any = js.native
  /* CompleteClass */
  override var _semanticInfoChain: js.Any = js.native
  /* CompleteClass */
  override var _sourceUnit: js.Any = js.native
  /* CompleteClass */
  override var _syntaxTree: js.Any = js.native
  /* CompleteClass */
  override var _topLevelDecl: js.Any = js.native
  /* CompleteClass */
  override var byteOrderMark: typings.typescriptServices.TypeScript.ByteOrderMark = js.native
  /* CompleteClass */
  override var fileName: String = js.native
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /* CompleteClass */
  override var referencedFiles: js.Array[String] = js.native
  /* CompleteClass */
  override var version: Double = js.native
  /* CompleteClass */
  override def _getASTForDecl(decl: typings.typescriptServices.TypeScript.PullDecl): typings.typescriptServices.TypeScript.AST = js.native
  /* CompleteClass */
  override def _getDeclForAST(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.PullDecl = js.native
  /* CompleteClass */
  override def _setASTForDecl(
    decl: typings.typescriptServices.TypeScript.PullDecl,
    ast: typings.typescriptServices.TypeScript.AST
  ): Unit = js.native
  /* CompleteClass */
  override def _setDeclForAST(
    ast: typings.typescriptServices.TypeScript.AST,
    decl: typings.typescriptServices.TypeScript.PullDecl
  ): Unit = js.native
  /* CompleteClass */
  override def amdDependencies(): js.Array[String] = js.native
  /* CompleteClass */
  override def bloomFilter(): typings.typescriptServices.TypeScript.BloomFilter = js.native
  /* CompleteClass */
  /* private */ override def cacheSyntaxTreeInfo(syntaxTree: js.Any): js.Any = js.native
  /* CompleteClass */
  override def diagnostics(): js.Array[typings.typescriptServices.TypeScript.Diagnostic] = js.native
  /* CompleteClass */
  override def emitToOwnOutputFile(): Boolean = js.native
  /* CompleteClass */
  override def externalModuleIndicatorSpan(): typings.typescriptServices.TypeScript.TextSpan = js.native
  /* CompleteClass */
  /* private */ override def getAmdDependency(comment: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getEnclosingDecl(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.PullDecl = js.native
  /* CompleteClass */
  /* private */ override def getImplicitImportSpan(sourceUnitLeadingTrivia: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def getImplicitImportSpanWorker(trivia: js.Any, position: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def getTopLevelImportOrExportSpan(node: js.Any): js.Any = js.native
  /* CompleteClass */
  override def invalidate(): Unit = js.native
  /* CompleteClass */
  override def isDeclareFile(): Boolean = js.native
  /* CompleteClass */
  override def isExternalModule(): Boolean = js.native
  /* CompleteClass */
  override def lineMap(): typings.typescriptServices.TypeScript.LineMap = js.native
  /* CompleteClass */
  override def sourceUnit(): typings.typescriptServices.TypeScript.SourceUnit = js.native
  /* CompleteClass */
  override def syntaxTree(): typings.typescriptServices.TypeScript.SyntaxTree = js.native
  /* CompleteClass */
  override def topLevelDecl(): typings.typescriptServices.TypeScript.PullDecl = js.native
  /* CompleteClass */
  override def update(
    scriptSnapshot: IScriptSnapshot,
    version: Double,
    isOpen: Boolean,
    textChangeRange: typings.typescriptServices.TypeScript.TextChangeRange
  ): typings.typescriptServices.TypeScript.Document = js.native
}

/* static members */
@JSImport("typescript-services", "Document")
@js.native
object Document extends js.Object {
  def create(
    compiler: typings.typescriptServices.TypeScript.TypeScriptCompiler,
    semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain,
    fileName: String,
    scriptSnapshot: IScriptSnapshot,
    byteOrderMark: typings.typescriptServices.TypeScript.ByteOrderMark,
    version: Double,
    isOpen: Boolean,
    referencedFiles: js.Array[String]
  ): typings.typescriptServices.TypeScript.Document = js.native
}

