package typings.typescript

import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.NodeArray
import typings.typescript.typescriptMod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Count extends js.Object {
  def apply[T /* <: Node */](nodes: js.UndefOr[scala.Nothing], visitor: Visitor): js.UndefOr[NodeArray[T]] = js.native
  def apply[T /* <: Node */](nodes: js.UndefOr[scala.Nothing], visitor: Visitor, test: js.Function1[/* node */ Node, Boolean]): js.UndefOr[NodeArray[T]] = js.native
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
  def apply[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor): js.UndefOr[NodeArray[T]] = js.native
  def apply[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor, test: js.Function1[/* node */ Node, Boolean]): js.UndefOr[NodeArray[T]] = js.native
  def apply[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor, test: js.Function1[/* node */ Node, Boolean], start: Double): js.UndefOr[NodeArray[T]] = js.native
  def apply[T /* <: Node */](
    nodes: NodeArray[T],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, Boolean],
    start: Double,
    count: Double
  ): js.UndefOr[NodeArray[T]] = js.native
}

