package typings.typescriptCollections.multiRootTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlatTreeNode extends js.Object {
  
  var childrenCount: Double = js.native
  
  var hasParent: Boolean = js.native
  
  var id: String = js.native
  
  var level: Double = js.native
}
object FlatTreeNode {
  
  @scala.inline
  def apply(childrenCount: Double, hasParent: Boolean, id: String, level: Double): FlatTreeNode = {
    val __obj = js.Dynamic.literal(childrenCount = childrenCount.asInstanceOf[js.Any], hasParent = hasParent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlatTreeNode]
  }
  
  @scala.inline
  implicit class FlatTreeNodeOps[Self <: FlatTreeNode] (val x: Self) extends AnyVal {
    
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
    def setChildrenCount(value: Double): Self = this.set("childrenCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasParent(value: Boolean): Self = this.set("hasParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
  }
}
