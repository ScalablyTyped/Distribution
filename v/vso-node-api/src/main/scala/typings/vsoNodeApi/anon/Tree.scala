package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tree extends js.Object {
  
  var none: scala.Double = js.native
  
  var tree: scala.Double = js.native
  
  var workItem: scala.Double = js.native
  
  var workItemLink: scala.Double = js.native
  
  var workItemTypeExtension: scala.Double = js.native
}
object Tree {
  
  @scala.inline
  def apply(
    none: scala.Double,
    tree: scala.Double,
    workItem: scala.Double,
    workItemLink: scala.Double,
    workItemTypeExtension: scala.Double
  ): Tree = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], workItem = workItem.asInstanceOf[js.Any], workItemLink = workItemLink.asInstanceOf[js.Any], workItemTypeExtension = workItemTypeExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tree]
  }
  
  @scala.inline
  implicit class TreeOps[Self <: Tree] (val x: Self) extends AnyVal {
    
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
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree(value: scala.Double): Self = this.set("tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItem(value: scala.Double): Self = this.set("workItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemLink(value: scala.Double): Self = this.set("workItemLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemTypeExtension(value: scala.Double): Self = this.set("workItemTypeExtension", value.asInstanceOf[js.Any])
  }
}
