package typings.wicgNativeFileSystem.anon

import typings.wicgNativeFileSystem.ChooseFileSystemEntriesOptionsAccepts
import typings.wicgNativeFileSystem.wicgNativeFileSystemStrings.`save-file`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined wicg-native-file-system.ChooseFileSystemEntriesFileOptions & {  type :'save-file'} */
@js.native
trait ChooseFileSystemEntriesFiExcludeAcceptAllOption extends js.Object {
  var accepts: js.UndefOr[js.Array[ChooseFileSystemEntriesOptionsAccepts]] = js.native
  var excludeAcceptAllOption: js.UndefOr[Boolean] = js.native
  var `type`: `save-file` = js.native
}

object ChooseFileSystemEntriesFiExcludeAcceptAllOption {
  @scala.inline
  def apply(`type`: `save-file`): ChooseFileSystemEntriesFiExcludeAcceptAllOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseFileSystemEntriesFiExcludeAcceptAllOption]
  }
  @scala.inline
  implicit class ChooseFileSystemEntriesFiExcludeAcceptAllOptionOps[Self <: ChooseFileSystemEntriesFiExcludeAcceptAllOption] (val x: Self) extends AnyVal {
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
    def setType(value: `save-file`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcceptsVarargs(value: ChooseFileSystemEntriesOptionsAccepts*): Self = this.set("accepts", js.Array(value :_*))
    @scala.inline
    def setAccepts(value: js.Array[ChooseFileSystemEntriesOptionsAccepts]): Self = this.set("accepts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccepts: Self = this.set("accepts", js.undefined)
    @scala.inline
    def setExcludeAcceptAllOption(value: Boolean): Self = this.set("excludeAcceptAllOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeAcceptAllOption: Self = this.set("excludeAcceptAllOption", js.undefined)
  }
  
}

