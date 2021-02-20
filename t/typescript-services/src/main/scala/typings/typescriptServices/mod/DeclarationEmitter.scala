package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "DeclarationEmitter")
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
object DeclarationEmitter {
  
  /* static member */
  @JSImport("typescript-services", "DeclarationEmitter.getEnclosingContainer")
  @js.native
  def getEnclosingContainer(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.AST = js.native
}
