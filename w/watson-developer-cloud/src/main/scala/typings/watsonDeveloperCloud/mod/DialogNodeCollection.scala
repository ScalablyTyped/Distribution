package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An array of dialog nodes. */
@js.native
trait DialogNodeCollection extends js.Object {
  
  /** An array of objects describing the dialog nodes defined for the workspace. */
  var dialog_nodes: js.Array[DialogNode] = js.native
  
  /** The pagination data for the returned objects. */
  var pagination: Pagination = js.native
}
object DialogNodeCollection {
  
  @scala.inline
  def apply(dialog_nodes: js.Array[DialogNode], pagination: Pagination): DialogNodeCollection = {
    val __obj = js.Dynamic.literal(dialog_nodes = dialog_nodes.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodeCollection]
  }
  
  @scala.inline
  implicit class DialogNodeCollectionOps[Self <: DialogNodeCollection] (val x: Self) extends AnyVal {
    
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
    def setDialog_nodesVarargs(value: DialogNode*): Self = this.set("dialog_nodes", js.Array(value :_*))
    
    @scala.inline
    def setDialog_nodes(value: js.Array[DialogNode]): Self = this.set("dialog_nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagination(value: Pagination): Self = this.set("pagination", value.asInstanceOf[js.Any])
  }
}
