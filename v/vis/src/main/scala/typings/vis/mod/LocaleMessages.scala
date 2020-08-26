package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleMessages extends js.Object {
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
  implicit class LocaleMessagesOps[Self <: LocaleMessages] (val x: Self) extends AnyVal {
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
    def setAddDescription(value: String): Self = this.set("addDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddEdge(value: String): Self = this.set("addEdge", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddNode(value: String): Self = this.set("addNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setBack(value: String): Self = this.set("back", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateEdgeError(value: String): Self = this.set("createEdgeError", value.asInstanceOf[js.Any])
    @scala.inline
    def setDel(value: String): Self = this.set("del", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteClusterError(value: String): Self = this.set("deleteClusterError", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdgeDescription(value: String): Self = this.set("edgeDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdit(value: String): Self = this.set("edit", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditClusterError(value: String): Self = this.set("editClusterError", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditEdge(value: String): Self = this.set("editEdge", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditEdgeDescription(value: String): Self = this.set("editEdgeDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditNode(value: String): Self = this.set("editNode", value.asInstanceOf[js.Any])
  }
  
}

