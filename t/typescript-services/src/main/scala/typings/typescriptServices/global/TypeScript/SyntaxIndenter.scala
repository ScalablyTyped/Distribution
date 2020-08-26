package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.FormattingOptions
import typings.typescriptServices.TypeScript.ISyntaxNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SyntaxIndenter")
@js.native
class SyntaxIndenter protected ()
  extends typings.typescriptServices.TypeScript.SyntaxIndenter {
  def this(indentFirstToken: Boolean, indentationAmount: Double, options: FormattingOptions) = this()
}

/* static members */
@JSGlobal("TypeScript.SyntaxIndenter")
@js.native
object SyntaxIndenter extends js.Object {
  def indentNode(node: ISyntaxNode, indentFirstToken: Boolean, indentAmount: Double, options: FormattingOptions): typings.typescriptServices.TypeScript.SyntaxNode = js.native
  def indentNodes(
    nodes: js.Array[typings.typescriptServices.TypeScript.SyntaxNode],
    indentFirstToken: Boolean,
    indentAmount: Double,
    options: FormattingOptions
  ): js.Array[typings.typescriptServices.TypeScript.SyntaxNode] = js.native
}

