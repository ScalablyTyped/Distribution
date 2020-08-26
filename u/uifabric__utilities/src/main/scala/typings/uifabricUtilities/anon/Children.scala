package typings.uifabricUtilities.anon

import typings.uifabricUtilities.ivirtualelementMod.IVirtualElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children extends js.Object {
  var children: js.Array[IVirtualElement] = js.native
  var parent: js.UndefOr[IVirtualElement] = js.native
}

object Children {
  @scala.inline
  def apply(children: js.Array[IVirtualElement]): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: IVirtualElement*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[IVirtualElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: IVirtualElement): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
  
}

