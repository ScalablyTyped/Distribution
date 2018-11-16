package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Document")
@js.native
class Document protected ()
  extends typescriptDashServicesLib.TypeScriptNs.Document {
  def this(_compiler: typescriptDashServicesLib.TypeScriptNs.TypeScriptCompiler, _semanticInfoChain: typescriptDashServicesLib.TypeScriptNs.SemanticInfoChain, fileName: java.lang.String, referencedFiles: js.Array[java.lang.String], _scriptSnapshot: typescriptDashServicesLib.TypeScriptNs.IScriptSnapshot, byteOrderMark: typescriptDashServicesLib.TypeScriptNs.ByteOrderMark, version: scala.Double, isOpen: scala.Boolean, _syntaxTree: typescriptDashServicesLib.TypeScriptNs.SyntaxTree, _topLevelDecl: typescriptDashServicesLib.TypeScriptNs.PullDecl) = this()
}

@JSImport("typescript-services", "Document")
@js.native
object Document extends js.Object {
  def create(
    compiler: typescriptDashServicesLib.TypeScriptNs.TypeScriptCompiler,
    semanticInfoChain: typescriptDashServicesLib.TypeScriptNs.SemanticInfoChain,
    fileName: java.lang.String,
    scriptSnapshot: typescriptDashServicesLib.TypeScriptNs.IScriptSnapshot,
    byteOrderMark: typescriptDashServicesLib.TypeScriptNs.ByteOrderMark,
    version: scala.Double,
    isOpen: scala.Boolean,
    referencedFiles: js.Array[java.lang.String]
  ): typescriptDashServicesLib.TypeScriptNs.Document = js.native
}

