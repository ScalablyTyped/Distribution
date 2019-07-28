package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PositionedNode")
@js.native
class PositionedNode protected () extends PositionedNodeOrToken {
  def this(parent: PositionedElement, node: SyntaxNode, fullStart: Double) = this()
  def node(): SyntaxNode = js.native
}

