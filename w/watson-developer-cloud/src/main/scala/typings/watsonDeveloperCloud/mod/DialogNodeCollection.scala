package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An array of dialog nodes. */
trait DialogNodeCollection extends StObject {
  
  /** An array of objects describing the dialog nodes defined for the workspace. */
  var dialog_nodes: js.Array[DialogNode]
  
  /** The pagination data for the returned objects. */
  var pagination: Pagination
}
object DialogNodeCollection {
  
  @scala.inline
  def apply(dialog_nodes: js.Array[DialogNode], pagination: Pagination): DialogNodeCollection = {
    val __obj = js.Dynamic.literal(dialog_nodes = dialog_nodes.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodeCollection]
  }
  
  @scala.inline
  implicit class DialogNodeCollectionMutableBuilder[Self <: DialogNodeCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialog_nodes(value: js.Array[DialogNode]): Self = StObject.set(x, "dialog_nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialog_nodesVarargs(value: DialogNode*): Self = StObject.set(x, "dialog_nodes", js.Array(value :_*))
    
    @scala.inline
    def setPagination(value: Pagination): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
  }
}
