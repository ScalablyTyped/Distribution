package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ByteOrderMark
import typings.typescriptDashServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Document")
@js.native
class Document protected ()
  extends typings.typescriptDashServices.TypeScript.Document {
  def this(
    _compiler: typings.typescriptDashServices.TypeScript.TypeScriptCompiler,
    _semanticInfoChain: typings.typescriptDashServices.TypeScript.SemanticInfoChain,
    fileName: String,
    referencedFiles: js.Array[String],
    _scriptSnapshot: IScriptSnapshot,
    byteOrderMark: ByteOrderMark,
    version: Double,
    isOpen: Boolean,
    _syntaxTree: typings.typescriptDashServices.TypeScript.SyntaxTree,
    _topLevelDecl: typings.typescriptDashServices.TypeScript.PullDecl
  ) = this()
}

/* static members */
@JSImport("typescript-services", "Document")
@js.native
object Document extends js.Object {
  def create(
    compiler: typings.typescriptDashServices.TypeScript.TypeScriptCompiler,
    semanticInfoChain: typings.typescriptDashServices.TypeScript.SemanticInfoChain,
    fileName: String,
    scriptSnapshot: IScriptSnapshot,
    byteOrderMark: ByteOrderMark,
    version: Double,
    isOpen: Boolean,
    referencedFiles: js.Array[String]
  ): typings.typescriptDashServices.TypeScript.Document = js.native
}

