package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.DeclarationEmitter")
@js.native
class DeclarationEmitter protected ()
  extends typings.typescriptServices.TypeScript.DeclarationEmitter {
  def this(
    emittingFileName: String,
    document: typings.typescriptServices.TypeScript.Document,
    compiler: typings.typescriptServices.TypeScript.TypeScriptCompiler,
    emitOptions: typings.typescriptServices.TypeScript.EmitOptions,
    semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.DeclarationEmitter")
@js.native
object DeclarationEmitter extends js.Object {
  def getEnclosingContainer(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.AST = js.native
}

