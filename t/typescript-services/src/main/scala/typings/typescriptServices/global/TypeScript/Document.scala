package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IScriptSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Document")
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
}
object Document {
  
  /* static member */
  @JSGlobal("TypeScript.Document.create")
  @js.native
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
