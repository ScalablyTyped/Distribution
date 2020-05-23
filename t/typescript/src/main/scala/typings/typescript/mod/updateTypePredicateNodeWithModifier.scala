package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateTypePredicateNodeWithModifier")
@js.native
object updateTypePredicateNodeWithModifier extends js.Object {
  def apply(node: TypePredicateNode, assertsModifier: js.UndefOr[AssertsToken], parameterName: Identifier): TypePredicateNode = js.native
  def apply(
    node: TypePredicateNode,
    assertsModifier: js.UndefOr[AssertsToken],
    parameterName: Identifier,
    `type`: TypeNode
  ): TypePredicateNode = js.native
  def apply(node: TypePredicateNode, assertsModifier: js.UndefOr[AssertsToken], parameterName: ThisTypeNode): TypePredicateNode = js.native
  def apply(
    node: TypePredicateNode,
    assertsModifier: js.UndefOr[AssertsToken],
    parameterName: ThisTypeNode,
    `type`: TypeNode
  ): TypePredicateNode = js.native
}

