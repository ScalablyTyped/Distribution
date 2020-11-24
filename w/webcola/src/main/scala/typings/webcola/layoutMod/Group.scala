package typings.webcola.layoutMod

import typings.webcola.rectangleMod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group extends js.Object {
  
  var bounds: js.UndefOr[Rectangle] = js.native
  
  var groups: js.UndefOr[js.Array[Group]] = js.native
  
  var leaves: js.UndefOr[js.Array[Node]] = js.native
  
  var padding: Double = js.native
}
object Group {
  
  @scala.inline
  def apply(padding: Double): Group = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit class GroupOps[Self <: Group] (val x: Self) extends AnyVal {
    
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
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounds(value: Rectangle): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: Group*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[Group]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setLeavesVarargs(value: Node*): Self = this.set("leaves", js.Array(value :_*))
    
    @scala.inline
    def setLeaves(value: js.Array[Node]): Self = this.set("leaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaves: Self = this.set("leaves", js.undefined)
  }
}
