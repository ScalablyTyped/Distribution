package typings.webcola.webcolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "RBTree")
@js.native
class RBTree[T] protected ()
  extends typings.webcola.distSrcRbtreeMod.RBTree[T] {
  def this(comparator: js.Function2[/* a */ T, /* b */ T, Double]) = this()
}

/* static members */
@JSImport("webcola", "RBTree")
@js.native
object RBTree extends js.Object {
  def double_rotate(root: js.Any, dir: js.Any): js.Any = js.native
  def is_red(node: js.Any): js.Any = js.native
  def single_rotate(root: js.Any, dir: js.Any): js.Any = js.native
}

