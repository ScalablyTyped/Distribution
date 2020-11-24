package typings.superfine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VNode[TTagName /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */] extends js.Object {
  
  val name: TTagName = js.native
}
object VNode {
  
  @scala.inline
  def apply[TTagName /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */](name: TTagName): VNode[TTagName] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode[TTagName]]
  }
  
  @scala.inline
  implicit class VNodeOps[Self <: VNode[_], TTagName /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */] (val x: Self with VNode[TTagName]) extends AnyVal {
    
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
    def setName(value: TTagName): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
