package typings.typescript.anon

import typings.typescript.mod.Node
import typings.typescript.mod.NodeArray
import typings.typescript.mod.Visitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](nodes: TInArray, visitor: Visitor[TIn, js.UndefOr[Node]]): NodeArray[Node] | (TInArray & Unit) = js.native
  def apply[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](
    nodes: TInArray,
    visitor: Visitor[TIn, js.UndefOr[Node]],
    test: js.Function1[/* node */ Node, Boolean]
  ): NodeArray[Node] | (TInArray & Unit) = js.native
  def apply[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](
    nodes: TInArray,
    visitor: Visitor[TIn, js.UndefOr[Node]],
    test: js.Function1[/* node */ Node, Boolean],
    start: Double
  ): NodeArray[Node] | (TInArray & Unit) = js.native
  def apply[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](
    nodes: TInArray,
    visitor: Visitor[TIn, js.UndefOr[Node]],
    test: js.Function1[/* node */ Node, Boolean],
    start: Double,
    count: Double
  ): NodeArray[Node] | (TInArray & Unit) = js.native
  def apply[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](
    nodes: TInArray,
    visitor: Visitor[TIn, js.UndefOr[Node]],
    test: js.Function1[/* node */ Node, Boolean],
    start: Unit,
    count: Double
  ): NodeArray[Node] | (TInArray & Unit) = js.native
  def apply[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](nodes: TInArray, visitor: Visitor[TIn, js.UndefOr[Node]], test: Unit, start: Double): NodeArray[Node] | (TInArray & Unit) = js.native
  def apply[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](nodes: TInArray, visitor: Visitor[TIn, js.UndefOr[Node]], test: Unit, start: Double, count: Double): NodeArray[Node] | (TInArray & Unit) = js.native
  def apply[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](nodes: TInArray, visitor: Visitor[TIn, js.UndefOr[Node]], test: Unit, start: Unit, count: Double): NodeArray[Node] | (TInArray & Unit) = js.native
}
