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
  def apply(render: js.Function1[VTree, VTree], `type`: java.lang.String, vnode: VTree): Thunk = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("render")(render)
    __obj.updateDynamic("vnode")(vnode)
    __obj.asInstanceOf[Thunk]
  }
}

