package typings.wicgNativeFileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePickerOptions extends js.Object {
  var excludeAcceptAllOption: js.UndefOr[Boolean] = js.native
  var types: js.UndefOr[js.Array[FilePickerAcceptType]] = js.native
}

object FilePickerOptions {
  @scala.inline
  def apply(): FilePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePickerOptions]
  }
  @scala.inline
  implicit class FilePickerOptionsOps[Self <: FilePickerOptions] (val x: Self) extends AnyVal {
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
    def setExcludeAcceptAllOption(value: Boolean): Self = this.set("excludeAcceptAllOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeAcceptAllOption: Self = this.set("excludeAcceptAllOption", js.undefined)
    @scala.inline
    def setTypesVarargs(value: FilePickerAcceptType*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[FilePickerAcceptType]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
  
}

