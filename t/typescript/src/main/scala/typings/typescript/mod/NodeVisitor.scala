package typings.typescript.mod

import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A function that walks a node using the given visitor, lifting node arrays into single nodes,
  * returning an node which satisfies the test.
  *
  * - If the input node is undefined, then the output is undefined.
  * - If the visitor returns undefined, then the output is undefined.
  * - If the output node is not undefined, then it will satisfy the test function.
  * - In order to obtain a return type that is more specific than `Node`, a test
  *   function _must_ be provided, and that function must be a type predicate.
  *
  * For the canonical implementation of this type, @see {visitNode}.
  */
@js.native
trait NodeVisitor extends StObject {
  
  def apply[TIn /* <: js.UndefOr[Node] */, TVisited /* <: js.UndefOr[Node] */](node: TIn, visitor: Visitor[NonNullable[TIn], TVisited]): Node | (TIn & Unit) | (TVisited & Unit) = js.native
  def apply[TIn /* <: js.UndefOr[Node] */, TVisited /* <: js.UndefOr[Node] */](
    node: TIn,
    visitor: Visitor[NonNullable[TIn], TVisited],
    test: js.Function1[/* node */ Node, Boolean]
  ): Node | (TIn & Unit) | (TVisited & Unit) = js.native
  def apply[TIn /* <: js.UndefOr[Node] */, TVisited /* <: js.UndefOr[Node] */](
    node: TIn,
    visitor: Visitor[NonNullable[TIn], TVisited],
    test: js.Function1[/* node */ Node, Boolean],
    lift: js.Function1[/* node */ js.Array[Node], Node]
  ): Node | (TIn & Unit) | (TVisited & Unit) = js.native
  def apply[TIn /* <: js.UndefOr[Node] */, TVisited /* <: js.UndefOr[Node] */](
    node: TIn,
    visitor: Visitor[NonNullable[TIn], TVisited],
    test: Unit,
    lift: js.Function1[/* node */ js.Array[Node], Node]
  ): Node | (TIn & Unit) | (TVisited & Unit) = js.native
}
