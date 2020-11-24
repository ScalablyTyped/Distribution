package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.SyntaxNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndentationNodeContextPool extends js.Object {
  
  def getNode(
    parent: IndentationNodeContext,
    node: SyntaxNode,
    fullStart: Double,
    indentationLevel: Double,
    childIndentationLevelDelta: Double
  ): IndentationNodeContext = js.native
  
  var nodes: js.Any = js.native
  
  def releaseNode(node: IndentationNodeContext): Unit = js.native
  def releaseNode(node: IndentationNodeContext, recursive: Boolean): Unit = js.native
}
