package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Document")
@js.native
class Document protected ()
  extends typings.typescriptDashServices.TypeScriptNs.Document {
  def this(
    _compiler: typings.typescriptDashServices.TypeScriptNs.TypeScriptCompiler,
    _semanticInfoChain: typings.typescriptDashServices.TypeScriptNs.SemanticInfoChain,
    fileName: String,
    referencedFiles: js.Array[String],
    _scriptSnapshot: IScriptSnapshot,
    byteOrderMark: typings.typescriptDashServices.TypeScriptNs.ByteOrderMark,
    version: Double,
    isOpen: Boolean,
    _syntaxTree: typings.typescriptDashServices.TypeScriptNs.SyntaxTree,
    _topLevelDecl: typings.typescriptDashServices.TypeScriptNs.PullDecl
  ) = this()
}

/* static members */
@JSImport("typescript-services", "Document")
@js.native
object Document extends js.Object {
  def create(
    compiler: typings.typescriptDashServices.TypeScriptNs.TypeScriptCompiler,
    semanticInfoChain: typings.typescriptDashServices.TypeScriptNs.SemanticInfoChain,
    fileName: String,
    scriptSnapshot: IScriptSnapshot,
    byteOrderMark: typings.typescriptDashServices.TypeScriptNs.ByteOrderMark,
    version: Double,
    isOpen: Boolean,
    referencedFiles: js.Array[String]
  ): typings.typescriptDashServices.TypeScriptNs.Document = js.native
}

