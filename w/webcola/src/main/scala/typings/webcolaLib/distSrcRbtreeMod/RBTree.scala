package typings
package webcolaLib.distSrcRbtreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/rbtree", "RBTree")
@js.native
class RBTree[T] protected () extends TreeBase {
  def this(comparator: js.Function2[/* a */ T, /* b */ T, scala.Double]) = this()
  def insert(data: js.Any): scala.Boolean = js.native
  def remove(data: js.Any): scala.Boolean = js.native
}

@JSImport("webcola/dist/src/rbtree", "RBTree")
@js.native
object RBTree extends js.Object {
  def double_rotate(root: js.Any, dir: js.Any): js.Any = js.native
  def is_red(node: js.Any): js.Any = js.native
  def single_rotate(root: js.Any, dir: js.Any): js.Any = js.native
}

