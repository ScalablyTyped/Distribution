package typings
package virtualDashDomLib.VirtualDOMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thunk extends VTree {
  var `type`: java.lang.String
   // 'Thunk'
  var vnode: VTree
  def render(previous: VTree): VTree
}

object Thunk {
  @scala.inline
  def apply(render: VTree => VTree, `type`: java.lang.String, vnode: VTree): Thunk = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), vnode = vnode)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Thunk]
  }
}

