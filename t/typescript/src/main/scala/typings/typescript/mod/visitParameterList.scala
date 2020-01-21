package typings.typescript.mod

import typings.typescript.FnCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "visitParameterList")
@js.native
object visitParameterList extends js.Object {
  def apply(nodes: js.UndefOr[scala.Nothing], visitor: Visitor, context: TransformationContext): NodeArray[ParameterDeclaration] = js.native
  def apply(
    nodes: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: FnCount
  ): NodeArray[ParameterDeclaration] = js.native
  /**
    * Starts a new lexical environment and visits a parameter list, suspending the lexical
    * environment upon completion.
    */
  def apply(nodes: NodeArray[ParameterDeclaration], visitor: Visitor, context: TransformationContext): NodeArray[ParameterDeclaration] = js.native
  def apply(
    nodes: NodeArray[ParameterDeclaration],
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: FnCount
  ): NodeArray[ParameterDeclaration] = js.native
}

