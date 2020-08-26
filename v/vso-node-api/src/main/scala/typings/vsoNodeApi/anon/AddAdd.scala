package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddAdd extends js.Object {
  var addAdd: scala.Double = js.native
  var addRename: scala.Double = js.native
  var deleteEdit: scala.Double = js.native
  var deleteRename: scala.Double = js.native
  var directoryChild: scala.Double = js.native
  var directoryFile: scala.Double = js.native
  var editDelete: scala.Double = js.native
  var editEdit: scala.Double = js.native
  var fileDirectory: scala.Double = js.native
  var none: scala.Double = js.native
  var rename1to2: scala.Double = js.native
  var rename2to1: scala.Double = js.native
  var renameAdd: scala.Double = js.native
  var renameDelete: scala.Double = js.native
  var renameRename: scala.Double = js.native
}

object AddAdd {
  @scala.inline
  def apply(
    addAdd: scala.Double,
    addRename: scala.Double,
    deleteEdit: scala.Double,
    deleteRename: scala.Double,
    directoryChild: scala.Double,
    directoryFile: scala.Double,
    editDelete: scala.Double,
    editEdit: scala.Double,
    fileDirectory: scala.Double,
    none: scala.Double,
    rename1to2: scala.Double,
    rename2to1: scala.Double,
    renameAdd: scala.Double,
    renameDelete: scala.Double,
    renameRename: scala.Double
  ): AddAdd = {
    val __obj = js.Dynamic.literal(addAdd = addAdd.asInstanceOf[js.Any], addRename = addRename.asInstanceOf[js.Any], deleteEdit = deleteEdit.asInstanceOf[js.Any], deleteRename = deleteRename.asInstanceOf[js.Any], directoryChild = directoryChild.asInstanceOf[js.Any], directoryFile = directoryFile.asInstanceOf[js.Any], editDelete = editDelete.asInstanceOf[js.Any], editEdit = editEdit.asInstanceOf[js.Any], fileDirectory = fileDirectory.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], rename1to2 = rename1to2.asInstanceOf[js.Any], rename2to1 = rename2to1.asInstanceOf[js.Any], renameAdd = renameAdd.asInstanceOf[js.Any], renameDelete = renameDelete.asInstanceOf[js.Any], renameRename = renameRename.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAdd]
  }
  @scala.inline
  implicit class AddAddOps[Self <: AddAdd] (val x: Self) extends AnyVal {
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
    def setAddAdd(value: scala.Double): Self = this.set("addAdd", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddRename(value: scala.Double): Self = this.set("addRename", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteEdit(value: scala.Double): Self = this.set("deleteEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteRename(value: scala.Double): Self = this.set("deleteRename", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectoryChild(value: scala.Double): Self = this.set("directoryChild", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectoryFile(value: scala.Double): Self = this.set("directoryFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditDelete(value: scala.Double): Self = this.set("editDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditEdit(value: scala.Double): Self = this.set("editEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileDirectory(value: scala.Double): Self = this.set("fileDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setRename1to2(value: scala.Double): Self = this.set("rename1to2", value.asInstanceOf[js.Any])
    @scala.inline
    def setRename2to1(value: scala.Double): Self = this.set("rename2to1", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenameAdd(value: scala.Double): Self = this.set("renameAdd", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenameDelete(value: scala.Double): Self = this.set("renameDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenameRename(value: scala.Double): Self = this.set("renameRename", value.asInstanceOf[js.Any])
  }
  
}

