package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Node
import typings.typescript.mod.NodeArray
import typings.typescript.mod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.visitNodes")
@js.native
object visitNodes extends js.Object {
  def apply[T /* <: Node */](nodes: js.UndefOr[scala.Nothing], visitor: Visitor): js.UndefOr[NodeArray[T]] = js.native
  def apply[T /* <: Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    test: js.UndefOr[scala.Nothing],
    start: js.UndefOr[scala.Nothing],
    count: Double
  ): js.UndefOr[NodeArray[T]] = js.native
  def apply[T /* <: Node */](nodes: js.UndefOr[scala.Nothing], visitor: Visitor, test: js.UndefOr[scala.Nothing], start: Double): js.UndefOr[NodeArray[T]] = js.native
  def apply[T /* <: Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    test: js.UndefOr[scala.Nothing],
    start: Double,
    count: Double
  ): js.UndefOr[NodeArray[T]] = js.native
  def apply[T /* <: Node */](nodes: js.UndefOr[scala.Nothing], visitor: Visitor, test: js.Function1[/* node */ Node, Boolean]): js.UndefOr[NodeArray[T]] = js.native
  def apply[T /* <: Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, Boolean],
    start: js.UndefOr[scala.Nothing],
    count: Double
  ): js.UndefOr[NodeArray[T]] = js.native
  def apply[T /* <: Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, Boolean],
    start: Double
  ): js.UndefOr[NodeArray[T]] = js.native
  def apply[T /* <: Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, Boolean],
    start: Double,
    count: Double
  ): js.UndefOr[NodeArray[T]] = js.native
  /**
    * Visits a NodeArray using the supplied visitor, possibly returning a new NodeArray in its place.
    *
    * @param nodes The NodeArray to visit.
    * @param visitor The callback used to visit a Node.
    * @param test A node test to execute for each node.
    * @param start An optional value indicating the starting offset at which to start visiting.
    * @param count An optional value indicating the maximum number of nodes to visit.
    */
  def apply[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor): js.UndefOr[NodeArray[T]] = js.native
  def apply[T /* <: Node */](
    nodes: NodeArray[T],
    visitor: Visitor,
    test: js.UndefOr[scala.Nothing],
    start: js.UndefOr[scala.Nothing],
    count: Double
  ): js.UndefOr[NodeArray[T]] = js.native
  def apply[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor, test: js.UndefOr[scala.Nothing], start: Double): js.UndefOr[NodeArray[T]] = js.native
  def apply[T /* <: Node */](
    nodes: NodeArray[T],
    visitor: Visitor,
    test: js.UndefOr[scala.Nothing],
    start: Double,
    count: Double
  ): js.UndefOr[NodeArray[T]] = js.native
  def apply[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor, test: js.Function1[/* node */ Node, Boolean]): js.UndefOr[NodeArray[T]] = js.native
  def apply[T /* <: Node */](
    nodes: NodeArray[T],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, Boolean],
    start: js.UndefOr[scala.Nothing],
    count: Double
  ): js.UndefOr[NodeArray[T]] = js.native
  def apply[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor, test: js.Function1[/* node */ Node, Boolean], start: Double): js.UndefOr[NodeArray[T]] = js.native
  def apply[T /* <: Node */](
    nodes: NodeArray[T],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, Boolean],
    start: Double,
    count: Double
  ): js.UndefOr[NodeArray[T]] = js.native
}

