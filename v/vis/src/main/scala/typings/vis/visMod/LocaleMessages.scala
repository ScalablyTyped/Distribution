package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleMessages extends js.Object {
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
    val __obj = js.Dynamic.literal(addDescription = addDescription, addEdge = addEdge, addNode = addNode, back = back, createEdgeError = createEdgeError, del = del, deleteClusterError = deleteClusterError, edgeDescription = edgeDescription, edit = edit, editClusterError = editClusterError, editEdge = editEdge, editEdgeDescription = editEdgeDescription, editNode = editNode)
  
    __obj.asInstanceOf[LocaleMessages]
  }
}

