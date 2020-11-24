package typings.typedoc.mod.TypeScript

import typings.typescript.mod.NodeArray
import typings.typescript.mod.NodesVisitor
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.TransformationContext
import typings.typescript.mod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.visitParameterList")
@js.native
object visitParameterList extends js.Object {
  
  def apply(nodes: js.UndefOr[scala.Nothing], visitor: Visitor, context: TransformationContext): js.UndefOr[NodeArray[ParameterDeclaration]] = js.native
  def apply(
    nodes: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: NodesVisitor
  ): js.UndefOr[NodeArray[ParameterDeclaration]] = js.native
  def apply(nodes: NodeArray[ParameterDeclaration], visitor: Visitor, context: TransformationContext): js.UndefOr[NodeArray[ParameterDeclaration]] = js.native
  def apply(
    nodes: NodeArray[ParameterDeclaration],
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: NodesVisitor
  ): js.UndefOr[NodeArray[ParameterDeclaration]] = js.native
}
