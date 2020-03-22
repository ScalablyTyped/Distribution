package typings.typedoc.mod.TypeScript

import typings.typescript.FnCall
import typings.typescript.mod.NodeArray
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.TransformationContext
import typings.typescript.mod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.visitParameterList")
@js.native
object visitParameterList extends js.Object {
  def apply(nodes: js.UndefOr[scala.Nothing], visitor: Visitor, context: TransformationContext): NodeArray[ParameterDeclaration] = js.native
  def apply(
    nodes: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: FnCall
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
    nodesVisitor: FnCall
  ): NodeArray[ParameterDeclaration] = js.native
}

