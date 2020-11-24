package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeVisitor extends js.Object {
  
  def apply[T /* <: Node */](): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](nodes: T): T = js.native
  def apply[T /* <: Node */](
    nodes: T,
    visitor: js.UndefOr[scala.Nothing],
    test: js.UndefOr[scala.Nothing],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): T = js.native
  def apply[T /* <: Node */](nodes: T, visitor: js.UndefOr[scala.Nothing], test: js.Function1[/* node */ Node, Boolean]): T = js.native
  def apply[T /* <: Node */](
    nodes: T,
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ Node, Boolean],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): T = js.native
  def apply[T /* <: Node */](nodes: T, visitor: Visitor): T = js.native
  def apply[T /* <: Node */](
    nodes: T,
    visitor: Visitor,
    test: js.UndefOr[scala.Nothing],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): T = js.native
  def apply[T /* <: Node */](nodes: T, visitor: Visitor, test: js.Function1[/* node */ Node, Boolean]): T = js.native
  def apply[T /* <: Node */](
    nodes: T,
    visitor: Visitor,
    test: js.Function1[/* node */ Node, Boolean],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): T = js.native
  def apply[T /* <: Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: js.UndefOr[scala.Nothing],
    test: js.UndefOr[scala.Nothing],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ Node, Boolean]
  ): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ Node, Boolean],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](nodes: js.UndefOr[scala.Nothing], visitor: Visitor): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    test: js.UndefOr[scala.Nothing],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](nodes: js.UndefOr[scala.Nothing], visitor: Visitor, test: js.Function1[/* node */ Node, Boolean]): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, Boolean],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): js.UndefOr[T] = js.native
}
