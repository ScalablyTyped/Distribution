package typings.winrt.Windows.Storage.Pickers.Provider

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileOpenPickerUI extends js.Object {
  var allowedFileTypes: IVectorView[String] = js.native
  var onclosing: js.Any = js.native
  var onfileremoved: js.Any = js.native
  var selectionMode: FileSelectionMode = js.native
  var settingsIdentifier: String = js.native
  var title: String = js.native
  def addFile(id: String, file: IStorageFile): AddFileResult = js.native
  def canAddFile(file: IStorageFile): Boolean = js.native
  def containsFile(id: String): Boolean = js.native
  def removeFile(id: String): Unit = js.native
}

object IFileOpenPickerUI {
  @scala.inline
  def apply(
    addFile: (String, IStorageFile) => AddFileResult,
    allowedFileTypes: IVectorView[String],
    canAddFile: IStorageFile => Boolean,
    containsFile: String => Boolean,
    onclosing: js.Any,
    onfileremoved: js.Any,
    removeFile: String => Unit,
    selectionMode: FileSelectionMode,
    settingsIdentifier: String,
    title: String
  ): IFileOpenPickerUI = {
    val __obj = js.Dynamic.literal(addFile = js.Any.fromFunction2(addFile), allowedFileTypes = allowedFileTypes.asInstanceOf[js.Any], canAddFile = js.Any.fromFunction1(canAddFile), containsFile = js.Any.fromFunction1(containsFile), onclosing = onclosing.asInstanceOf[js.Any], onfileremoved = onfileremoved.asInstanceOf[js.Any], removeFile = js.Any.fromFunction1(removeFile), selectionMode = selectionMode.asInstanceOf[js.Any], settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileOpenPickerUI]
  }
  @scala.inline
  implicit class IFileOpenPickerUIOps[Self <: IFileOpenPickerUI] (val x: Self) extends AnyVal {
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
    def setAddFile(value: (String, IStorageFile) => AddFileResult): Self = this.set("addFile", js.Any.fromFunction2(value))
    @scala.inline
    def setAllowedFileTypes(value: IVectorView[String]): Self = this.set("allowedFileTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanAddFile(value: IStorageFile => Boolean): Self = this.set("canAddFile", js.Any.fromFunction1(value))
    @scala.inline
    def setContainsFile(value: String => Boolean): Self = this.set("containsFile", js.Any.fromFunction1(value))
    @scala.inline
    def setOnclosing(value: js.Any): Self = this.set("onclosing", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnfileremoved(value: js.Any): Self = this.set("onfileremoved", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveFile(value: String => Unit): Self = this.set("removeFile", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectionMode(value: FileSelectionMode): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettingsIdentifier(value: String): Self = this.set("settingsIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

