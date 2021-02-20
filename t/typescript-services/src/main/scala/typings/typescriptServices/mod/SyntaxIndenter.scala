package typings.typescriptServices.mod

import typings.typescriptServices.FormattingOptions
import typings.typescriptServices.TypeScript.ISyntaxNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "SyntaxIndenter")
@js.native
class SyntaxIndenter protected ()
  extends typings.typescriptServices.TypeScript.SyntaxIndenter {
  def this(indentFirstToken: Boolean, indentationAmount: Double, options: FormattingOptions) = this()
}
object SyntaxIndenter {
  
  /* static member */
  @JSImport("typescript-services", "SyntaxIndenter.indentNode")
  @js.native
  def indentNode(node: ISyntaxNode, indentFirstToken: Boolean, indentAmount: Double, options: FormattingOptions): typings.typescriptServices.TypeScript.SyntaxNode = js.native
  
  /* static member */
  @JSImport("typescript-services", "SyntaxIndenter.indentNodes")
  @js.native
  def indentNodes(
    nodes: js.Array[typings.typescriptServices.TypeScript.SyntaxNode],
    indentFirstToken: Boolean,
    indentAmount: Double,
    options: FormattingOptions
  ): js.Array[typings.typescriptServices.TypeScript.SyntaxNode] = js.native
}
