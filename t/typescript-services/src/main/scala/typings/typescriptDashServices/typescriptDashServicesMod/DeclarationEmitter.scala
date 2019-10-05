package typings.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "DeclarationEmitter")
@js.native
class DeclarationEmitter protected ()
  extends typings.typescriptDashServices.TypeScript.DeclarationEmitter {
  def this(
    emittingFileName: String,
    document: typings.typescriptDashServices.TypeScript.Document,
    compiler: typings.typescriptDashServices.TypeScript.TypeScriptCompiler,
    emitOptions: typings.typescriptDashServices.TypeScript.EmitOptions,
    semanticInfoChain: typings.typescriptDashServices.TypeScript.SemanticInfoChain
  ) = this()
}

/* static members */
@JSImport("typescript-services", "DeclarationEmitter")
@js.native
object DeclarationEmitter extends js.Object {
  def getEnclosingContainer(ast: typings.typescriptDashServices.TypeScript.AST): typings.typescriptDashServices.TypeScript.AST = js.native
}

