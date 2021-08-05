package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocaleMessages extends StObject {
  
  var addDescription: String
  
  var addEdge: String
  
  var addNode: String
  
  var back: String
  
  var createEdgeError: String
  
  var del: String
  
  var deleteClusterError: String
  
  var edgeDescription: String
  
  var edit: String
  
  var editClusterError: String
  
  var editEdge: String
  
  var editEdgeDescription: String
  
  var editNode: String
}
object LocaleMessages {
  
  inline def apply(
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
  
  extension [Self <: LocaleMessages](x: Self) {
    
    inline def setAddDescription(value: String): Self = StObject.set(x, "addDescription", value.asInstanceOf[js.Any])
    
    inline def setAddEdge(value: String): Self = StObject.set(x, "addEdge", value.asInstanceOf[js.Any])
    
    inline def setAddNode(value: String): Self = StObject.set(x, "addNode", value.asInstanceOf[js.Any])
    
    inline def setBack(value: String): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
    
    inline def setCreateEdgeError(value: String): Self = StObject.set(x, "createEdgeError", value.asInstanceOf[js.Any])
    
    inline def setDel(value: String): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
    
    inline def setDeleteClusterError(value: String): Self = StObject.set(x, "deleteClusterError", value.asInstanceOf[js.Any])
    
    inline def setEdgeDescription(value: String): Self = StObject.set(x, "edgeDescription", value.asInstanceOf[js.Any])
    
    inline def setEdit(value: String): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setEditClusterError(value: String): Self = StObject.set(x, "editClusterError", value.asInstanceOf[js.Any])
    
    inline def setEditEdge(value: String): Self = StObject.set(x, "editEdge", value.asInstanceOf[js.Any])
    
    inline def setEditEdgeDescription(value: String): Self = StObject.set(x, "editEdgeDescription", value.asInstanceOf[js.Any])
    
    inline def setEditNode(value: String): Self = StObject.set(x, "editNode", value.asInstanceOf[js.Any])
  }
}
