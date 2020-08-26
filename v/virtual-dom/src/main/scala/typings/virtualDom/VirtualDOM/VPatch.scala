package typings.virtualDom.VirtualDOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// enum VPatch {
//   NONE = 0,
//   VTEXT = 1,
//   VNODE = 2,
//   WIDGET = 3,
//   PROPS = 4,
//   ORDER = 5,
//   INSERT = 6,
//   REMOVE = 7,
//   THUNK = 8
// }
@js.native
trait VPatch extends js.Object {
  var patch: js.Any = js.native
  /**
    type is set to 'VirtualPatch' on the prototype, but overridden in the
    constructor with a number.
    */
  var `type`: Double = js.native
  var vNode: VNode = js.native
  var version: String = js.native
}

object VPatch {
  @scala.inline
  def apply(patch: js.Any, `type`: Double, vNode: VNode, version: String): VPatch = {
    val __obj = js.Dynamic.literal(patch = patch.asInstanceOf[js.Any], vNode = vNode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VPatch]
  }
  @scala.inline
  implicit class VPatchOps[Self <: VPatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPatch(value: js.Any): Self = this.set("patch", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVNode(value: VNode): Self = this.set("vNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

