package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "forEachChild")
@js.native
object forEachChild extends js.Object {
  def apply[T](node: Node, cbNode: js.Function1[/* node */ Node, js.UndefOr[T]]): js.UndefOr[T] = js.native
  def apply[T](
    node: Node,
    cbNode: js.Function1[/* node */ Node, js.UndefOr[T]],
    cbNodes: js.Function1[/* nodes */ NodeArray[Node], js.UndefOr[T]]
  ): js.UndefOr[T] = js.native
}

