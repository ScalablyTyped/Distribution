package typings.stylableCore.selectorUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core/cjs/selector-utils", "traverseNode")
@js.native
object traverseNode extends js.Object {
  
  def apply(node: SelectorAstNode, visitor: Visitor): Boolean | Unit = js.native
  def apply(
    node: SelectorAstNode,
    visitor: Visitor,
    index: js.UndefOr[scala.Nothing],
    nodes: js.Array[SelectorAstNode]
  ): Boolean | Unit = js.native
  def apply(node: SelectorAstNode, visitor: Visitor, index: Double): Boolean | Unit = js.native
  def apply(node: SelectorAstNode, visitor: Visitor, index: Double, nodes: js.Array[SelectorAstNode]): Boolean | Unit = js.native
}
