package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocaleMessages extends StObject {
  
  var addDescription: String = js.native
  
  var addEdge: String = js.native
  
  var addNode: String = js.native
  
  var back: String = js.native
  
  var createEdgeError: String = js.native
  
  var del: String = js.native
  
  var deleteClusterError: String = js.native
  
  var edgeDescription: String = js.native
  
  var edit: String = js.native
  
  var editClusterError: String = js.native
  
  var editEdge: String = js.native
  
  var editEdgeDescription: String = js.native
  
  var editNode: String = js.native
}
object LocaleMessages {
  
  @scala.inline
  def apply(
    addDescription: String,
    addEdge: String,
    addNode: String,
    back: String,
    createEdgeError: String,
    del: String,
    deleteClusterError: String,
    edgeDescription: String,
    edit: String,
    editClusterError: String,
    editEdge: String,
    editEdgeDescription: String,
    editNode: String
  ): LocaleMessages = {
    val __obj = js.Dynamic.literal(addDescription = addDescription.asInstanceOf[js.Any], addEdge = addEdge.asInstanceOf[js.Any], addNode = addNode.asInstanceOf[js.Any], back = back.asInstanceOf[js.Any], createEdgeError = createEdgeError.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], deleteClusterError = deleteClusterError.asInstanceOf[js.Any], edgeDescription = edgeDescription.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], editClusterError = editClusterError.asInstanceOf[js.Any], editEdge = editEdge.asInstanceOf[js.Any], editEdgeDescription = editEdgeDescription.asInstanceOf[js.Any], editNode = editNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleMessages]
  }
  
  @scala.inline
  implicit class LocaleMessagesMutableBuilder[Self <: LocaleMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddDescription(value: String): Self = StObject.set(x, "addDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddEdge(value: String): Self = StObject.set(x, "addEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddNode(value: String): Self = StObject.set(x, "addNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBack(value: String): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateEdgeError(value: String): Self = StObject.set(x, "createEdgeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDel(value: String): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteClusterError(value: String): Self = StObject.set(x, "deleteClusterError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeDescription(value: String): Self = StObject.set(x, "edgeDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdit(value: String): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditClusterError(value: String): Self = StObject.set(x, "editClusterError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditEdge(value: String): Self = StObject.set(x, "editEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditEdgeDescription(value: String): Self = StObject.set(x, "editEdgeDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditNode(value: String): Self = StObject.set(x, "editNode", value.asInstanceOf[js.Any])
  }
}
