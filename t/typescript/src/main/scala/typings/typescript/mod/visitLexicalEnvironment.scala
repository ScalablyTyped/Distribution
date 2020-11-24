package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "visitLexicalEnvironment")
@js.native
object visitLexicalEnvironment extends js.Object {
  
  /**
    * Starts a new lexical environment and visits a statement list, ending the lexical environment
    * and merging hoisted declarations upon completion.
    */
  def apply(statements: NodeArray[Statement], visitor: Visitor, context: TransformationContext): NodeArray[Statement] = js.native
  def apply(
    statements: NodeArray[Statement],
    visitor: Visitor,
    context: TransformationContext,
    start: js.UndefOr[scala.Nothing],
    ensureUseStrict: js.UndefOr[scala.Nothing],
    nodesVisitor: NodesVisitor
  ): NodeArray[Statement] = js.native
  def apply(
    statements: NodeArray[Statement],
    visitor: Visitor,
    context: TransformationContext,
    start: js.UndefOr[scala.Nothing],
    ensureUseStrict: Boolean
  ): NodeArray[Statement] = js.native
  def apply(
    statements: NodeArray[Statement],
    visitor: Visitor,
    context: TransformationContext,
    start: js.UndefOr[scala.Nothing],
    ensureUseStrict: Boolean,
    nodesVisitor: NodesVisitor
  ): NodeArray[Statement] = js.native
  def apply(statements: NodeArray[Statement], visitor: Visitor, context: TransformationContext, start: Double): NodeArray[Statement] = js.native
  def apply(
    statements: NodeArray[Statement],
    visitor: Visitor,
    context: TransformationContext,
    start: Double,
    ensureUseStrict: js.UndefOr[scala.Nothing],
    nodesVisitor: NodesVisitor
  ): NodeArray[Statement] = js.native
  def apply(
    statements: NodeArray[Statement],
    visitor: Visitor,
    context: TransformationContext,
    start: Double,
    ensureUseStrict: Boolean
  ): NodeArray[Statement] = js.native
  def apply(
    statements: NodeArray[Statement],
    visitor: Visitor,
    context: TransformationContext,
    start: Double,
    ensureUseStrict: Boolean,
    nodesVisitor: NodesVisitor
  ): NodeArray[Statement] = js.native
}
