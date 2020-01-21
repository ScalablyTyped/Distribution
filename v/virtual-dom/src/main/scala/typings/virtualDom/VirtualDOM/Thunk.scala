package typings.virtualDom.VirtualDOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thunk extends VTree {
  var `type`: String
   // 'Thunk'
  var vnode: VTree
  def render(previous: VTree): VTree
}

object Thunk {
  @scala.inline
  def apply(render: VTree => VTree, `type`: String, vnode: VTree): Thunk = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), vnode = vnode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thunk]
  }
}

