package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.FormattingOptions
import typings.typescriptDashServices.TypeScriptNs.ISyntaxNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxIndenter")
@js.native
class SyntaxIndenter protected ()
  extends typings.typescriptDashServices.TypeScriptNs.SyntaxIndenter {
  def this(indentFirstToken: Boolean, indentationAmount: Double, options: FormattingOptions) = this()
}

/* static members */
@JSImport("typescript-services", "SyntaxIndenter")
@js.native
object SyntaxIndenter extends js.Object {
  def indentNode(node: ISyntaxNode, indentFirstToken: Boolean, indentAmount: Double, options: FormattingOptions): typings.typescriptDashServices.TypeScriptNs.SyntaxNode = js.native
  def indentNodes(
    nodes: js.Array[typings.typescriptDashServices.TypeScriptNs.SyntaxNode],
    indentFirstToken: Boolean,
    indentAmount: Double,
    options: FormattingOptions
  ): js.Array[typings.typescriptDashServices.TypeScriptNs.SyntaxNode] = js.native
}

