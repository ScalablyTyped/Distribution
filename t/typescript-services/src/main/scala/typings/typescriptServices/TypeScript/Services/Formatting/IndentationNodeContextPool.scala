package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.SyntaxNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndentationNodeContextPool extends js.Object {
  var nodes: js.Any = js.native
  def getNode(
    parent: IndentationNodeContext,
    node: SyntaxNode,
    fullStart: Double,
    indentationLevel: Double,
    childIndentationLevelDelta: Double
  ): IndentationNodeContext = js.native
  def releaseNode(node: IndentationNodeContext): Unit = js.native
  def releaseNode(node: IndentationNodeContext, recursive: Boolean): Unit = js.native
}

